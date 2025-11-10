#import "DahuaSdkPlugin.h"
#import "DahuaNetSDKBridge.h"
#import "DahuaPreviewFactory.h"

@implementation DahuaSdkPlugin
static FlutterMethodChannel* s_channel = nil;
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  FlutterMethodChannel* channel = [FlutterMethodChannel
      methodChannelWithName:@"dahua_sdk"
            binaryMessenger:[registrar messenger]];
  DahuaSdkPlugin* instance = [[DahuaSdkPlugin alloc] init];
  [registrar addMethodCallDelegate:instance channel:channel];
  s_channel = channel;

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
  } else if ([@"getPlatformVersion" isEqualToString:call.method]) {
    result([@"iOS " stringByAppendingString:[[UIDevice currentDevice] systemVersion]]);
  } else {
    result(FlutterMethodNotImplemented);
  }
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
