#import "DahuaSdkPlugin.h"
#import "DahuaNetSDKBridge.h"
#import "DahuaPreviewFactory.h"

@implementation DahuaSdkPlugin
static FlutterMethodChannel* s_channel = nil;
static FlutterEventSink s_deviceSearchEventSink = nil;
static DHHandle s_currentSearchHandle = 0;

+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  FlutterMethodChannel* channel = [FlutterMethodChannel
      methodChannelWithName:@"dahua_sdk"
            binaryMessenger:[registrar messenger]];
  DahuaSdkPlugin* instance = [[DahuaSdkPlugin alloc] init];
  [registrar addMethodCallDelegate:instance channel:channel];
  s_channel = channel;

  // Event channel for device search results
  FlutterEventChannel* eventChannel = [FlutterEventChannel
      eventChannelWithName:@"dahua_sdk/device_search"
           binaryMessenger:[registrar messenger]];
  [eventChannel setStreamHandler:instance];

  DahuaPreviewFactory* factory = [[DahuaPreviewFactory alloc] initWithMessenger:[registrar messenger]];
  [registrar registerViewFactory:factory withId:@"dahua_sdk/preview"];
}

- (void)handleMethodCall:(FlutterMethodCall*)call result:(FlutterResult)result {
  if ([@"init" isEqualToString:call.method]) {
    dh_init();
    result(nil);
  } else if ([@"cleanup" isEqualToString:call.method]) {
    dh_cleanup();
    result(nil);
  } else if ([@"login" isEqualToString:call.method]) {
    NSDictionary* args = call.arguments;
    NSString* ip = args[@"ip"];
    NSNumber* port = args[@"port"];
    NSString* user = args[@"user"];
    NSString* pass = args[@"pass"];
    DHHandle handle = dh_login([ip UTF8String], [port intValue], [user UTF8String], [pass UTF8String]);
    result(@(handle));
  } else if ([@"logout" isEqualToString:call.method]) {
    NSDictionary* args = call.arguments;
    NSNumber* handle = args[@"handle"];
    dh_logout((DHHandle)[handle longLongValue]);
    result(nil);
  } else if ([@"ptz" isEqualToString:call.method]) {
    NSDictionary* args = call.arguments;
    NSNumber* handle = args[@"handle"]; // при необходимости передавайте login/real
    NSNumber* cmd = args[@"cmd"];
    NSNumber* speed = args[@"speed"];
    NSNumber* start = args[@"start"];
    BOOL ok = dh_ptz_control((DHHandle)handle.longLongValue, cmd.intValue, speed.intValue, start.boolValue);
    result(@(ok));
  } else if ([@"getWlanConfig" isEqualToString:call.method]) {
    NSDictionary* args = call.arguments;
    NSNumber* handle = args[@"handle"];
    DHWlanConfig config;
    memset(&config, 0, sizeof(config));
    BOOL ok = dh_get_wlan_config((DHHandle)handle.longLongValue, &config);
    if (ok) {
      result(@{
        @"ssid": [NSString stringWithUTF8String:config.ssid],
        @"password": [NSString stringWithUTF8String:config.password],
        @"authMode": @(config.authMode),
        @"encryptionAlg": @(config.encryptionAlg),
        @"encryption": @(config.encryption),
        @"enabled": @(config.enabled),
        @"connectEnabled": @(config.connectEnabled),
      });
    } else {
      result([FlutterError errorWithCode:@"GET_WLAN_FAILED"
                                 message:@"Failed to get WLAN configuration"
                                 details:nil]);
    }
  } else if ([@"setWlanConfig" isEqualToString:call.method]) {
    NSDictionary* args = call.arguments;
    NSNumber* handle = args[@"handle"];
    DHWlanConfig config;
    memset(&config, 0, sizeof(config));
    
    NSString* ssid = args[@"ssid"];
    NSString* password = args[@"password"];
    strncpy(config.ssid, [ssid UTF8String], sizeof(config.ssid) - 1);
    strncpy(config.password, [password UTF8String], sizeof(config.password) - 1);
    config.authMode = [args[@"authMode"] intValue];
    config.encryptionAlg = [args[@"encryptionAlg"] intValue];
    config.encryption = [args[@"encryption"] intValue];
    config.enabled = [args[@"enabled"] boolValue];
    config.connectEnabled = [args[@"connectEnabled"] boolValue];
    
    BOOL ok = dh_set_wlan_config((DHHandle)handle.longLongValue, &config);
    result(@(ok));
  } else if ([@"scanWlanDevices" isEqualToString:call.method]) {
    NSDictionary* args = call.arguments;
    NSNumber* handle = args[@"handle"];
    
    // Allocate array for up to 128 devices (max supported by SDK)
    DHWlanDevice* devices = (DHWlanDevice*)malloc(sizeof(DHWlanDevice) * 128);
    memset(devices, 0, sizeof(DHWlanDevice) * 128);
    
    int count = dh_scan_wlan_devices((DHHandle)handle.longLongValue, devices, 128);
    
    if (count > 0) {
      NSMutableArray* deviceList = [NSMutableArray arrayWithCapacity:count];
      for (int i = 0; i < count; i++) {
        [deviceList addObject:@{
          @"ssid": [NSString stringWithUTF8String:devices[i].ssid],
          @"authMode": @(devices[i].authMode),
          @"encryptionAlg": @(devices[i].encryptionAlg),
          @"signalLevel": @(devices[i].signalLevel),
        }];
      }
      free(devices);
      result(deviceList);
    } else {
      free(devices);
      result([FlutterError errorWithCode:@"SCAN_FAILED"
                                 message:@"Failed to scan WiFi devices"
                                 details:nil]);
    }
  } else if ([@"getDevWifiList" isEqualToString:call.method]) {
    NSDictionary* args = call.arguments;
    NSString* deviceIp = args[@"deviceIp"];
    NSNumber* devicePort = args[@"devicePort"];
    
    if (!deviceIp || deviceIp.length == 0) {
      result([FlutterError errorWithCode:@"INVALID_ARGUMENT"
                                 message:@"Device IP is required"
                                 details:nil]);
      return;
    }
    
    int port = devicePort ? [devicePort intValue] : 37777;
    
    // Allocate array for up to 128 devices (max supported by SDK)
    DHWlanDevice* devices = (DHWlanDevice*)malloc(sizeof(DHWlanDevice) * 128);
    memset(devices, 0, sizeof(DHWlanDevice) * 128);
    
    int count = dh_get_dev_wifi_list([deviceIp UTF8String], port, devices, 128);
    
    if (count > 0) {
      NSMutableArray* deviceList = [NSMutableArray arrayWithCapacity:count];
      for (int i = 0; i < count; i++) {
        [deviceList addObject:@{
          @"ssid": [NSString stringWithUTF8String:devices[i].ssid],
          @"authMode": @(devices[i].authMode),
          @"encryptionAlg": @(devices[i].encryptionAlg),
          @"signalLevel": @(devices[i].signalLevel),
        }];
      }
      free(devices);
      result(deviceList);
    } else {
      free(devices);
      result(@[]); // Return empty array instead of error
    }
  } else if ([@"searchDeviceBySerial" isEqualToString:call.method]) {
    NSDictionary* args = call.arguments;
    NSString* serialNo = args[@"serialNo"];
    
    // Start search if not already running
    if (s_currentSearchHandle == 0) {
      result([FlutterError errorWithCode:@"NO_LISTENER"
                                 message:@"Device search event channel not listening"
                                 details:nil]);
    } else {
      result(@YES);
    }
  } else if ([@"stopDeviceSearch" isEqualToString:call.method]) {
    if (s_currentSearchHandle != 0) {
      dh_stop_search_devices(s_currentSearchHandle);
      s_currentSearchHandle = 0;
    }
    result(nil);
  } else if ([@"startSmartConfig" isEqualToString:call.method]) {
    NSDictionary* args = call.arguments;
    NSString* serialNumber = args[@"serialNumber"];
    NSString* ssid = args[@"ssid"];
    NSString* password = args[@"password"];
    
    if (!serialNumber || !ssid) {
      result([FlutterError errorWithCode:@"INVALID_ARGUMENT"
                                 message:@"Serial number and SSID are required"
                                 details:nil]);
      return;
    }
    
    int ret = dh_start_smart_config([serialNumber UTF8String], [ssid UTF8String], password ? [password UTF8String] : "");
    result(@(ret == 0));
  } else if ([@"stopSmartConfig" isEqualToString:call.method]) {
    int ret = dh_stop_smart_config();
    result(@(ret == 0));
  } else if ([@"configDeviceWifi" isEqualToString:call.method]) {
    NSDictionary* args = call.arguments;
    NSString* serialNumber = args[@"serialNumber"];
    NSString* ssid = args[@"ssid"];
    NSString* password = args[@"password"];
    NSNumber* timeout = args[@"timeout"];
    
    if (!serialNumber || !ssid) {
      result([FlutterError errorWithCode:@"INVALID_ARGUMENT"
                                 message:@"Serial number and SSID are required"
                                 details:nil]);
      return;
    }
    
    int timeoutSeconds = timeout ? [timeout intValue] : 60;
    int ret = dh_config_device_wifi([serialNumber UTF8String], [ssid UTF8String], password ? [password UTF8String] : "", timeoutSeconds);
    result(@(ret == 0));
  } else if ([@"initDeviceAccount" isEqualToString:call.method]) {
    NSDictionary* args = call.arguments;
    NSDictionary* deviceInfo = args[@"deviceInfo"];
    NSString* username = args[@"username"];
    NSString* password = args[@"password"];
    NSString* phoneOrEmail = args[@"phoneOrEmail"];
    NSNumber* useIPNum = args[@"useIP"];
    
    if (!deviceInfo || !username || !password) {
      result([FlutterError errorWithCode:@"INVALID_ARGUMENT"
                                 message:@"Device info, username and password are required"
                                 details:nil]);
      return;
    }
    
    bool useIP = useIPNum ? [useIPNum boolValue] : true;
    bool success = dh_init_device_account(deviceInfo, [username UTF8String], [password UTF8String], 
                                          phoneOrEmail ? [phoneOrEmail UTF8String] : NULL, useIP);
    result(@(success));
  } else if ([@"modifyDevicePassword" isEqualToString:call.method]) {
    NSDictionary* args = call.arguments;
    NSNumber* loginHandleNum = args[@"loginHandle"];
    NSString* username = args[@"username"];
    NSString* oldPassword = args[@"oldPassword"];
    NSString* newPassword = args[@"newPassword"];
    
    if (!loginHandleNum || !username || !oldPassword || !newPassword) {
      result([FlutterError errorWithCode:@"INVALID_ARGUMENT"
                                 message:@"loginHandle, username, oldPassword and newPassword are required"
                                 details:nil]);
      return;
    }
    
    DHHandle loginHandle = (DHHandle)[loginHandleNum longLongValue];
    bool success = dh_modify_device_password(loginHandle, [username UTF8String], 
                                             [oldPassword UTF8String], [newPassword UTF8String]);
    result(@(success));
  } else if ([@"getPlatformVersion" isEqualToString:call.method]) {
    result([@"iOS " stringByAppendingString:[[UIDevice currentDevice] systemVersion]]);
  } else {
    result(FlutterMethodNotImplemented);
  }
}

// MARK: - FlutterStreamHandler

// Device search callback - sends results to Dart stream
static void DeviceSearchStreamCallback(const DHDeviceInfo* deviceInfo, void* userData) {
  if (!deviceInfo || !s_deviceSearchEventSink) return;
  
  NSDictionary* deviceDict = @{
    @"serialNo": [NSString stringWithUTF8String:deviceInfo->serialNo],
    @"ip": [NSString stringWithUTF8String:deviceInfo->ip],
    @"mac": [NSString stringWithUTF8String:deviceInfo->mac],
    @"port": @(deviceInfo->port),
    @"initialized": @(deviceInfo->initialized),
    @"ipVersion": @(deviceInfo->ipVersion),
    @"deviceType": [NSString stringWithUTF8String:deviceInfo->deviceType],
  };
  
  // Send to Flutter on main thread
  dispatch_async(dispatch_get_main_queue(), ^{
    if (s_deviceSearchEventSink) {
      s_deviceSearchEventSink(deviceDict);
    }
  });
}

- (FlutterError*)onListenWithArguments:(id)arguments eventSink:(FlutterEventSink)events {
  s_deviceSearchEventSink = events;
  
  // Start device search with callback
  if (s_currentSearchHandle == 0) {
    s_currentSearchHandle = dh_start_search_devices(DeviceSearchStreamCallback, NULL);
    if (s_currentSearchHandle == 0) {
      s_deviceSearchEventSink = nil;
      return [FlutterError errorWithCode:@"SEARCH_START_FAILED"
                                 message:@"Failed to start device search"
                                 details:nil];
    }
  }
  
  return nil;
}

- (FlutterError*)onCancelWithArguments:(id)arguments {
  if (s_currentSearchHandle != 0) {
    dh_stop_search_devices(s_currentSearchHandle);
    s_currentSearchHandle = 0;
  }
  s_deviceSearchEventSink = nil;
  return nil;
}

// MARK: - Native -> Dart logging
+ (void)emitLog:(NSString*)message {
  if (!message.length) return;
  void (^send)(void) = ^{
    if (s_channel) {
      [s_channel invokeMethod:@"debugLog" arguments:@{ @"message": message }];
    }
  };
  if ([NSThread isMainThread]) {
    send();
  } else {
    dispatch_async(dispatch_get_main_queue(), send);
  }
}

@end
