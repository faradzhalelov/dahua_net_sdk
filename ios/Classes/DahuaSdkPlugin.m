#import "DahuaSdkPlugin.h"
#import "DahuaNetSDKBridge.h"
#import "DahuaPreviewFactory.h"

@implementation DahuaSdkPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  FlutterMethodChannel* channel = [FlutterMethodChannel
      methodChannelWithName:@"dahua_sdk"
            binaryMessenger:[registrar messenger]];
  DahuaSdkPlugin* instance = [[DahuaSdkPlugin alloc] init];
  [registrar addMethodCallDelegate:instance channel:channel];

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
  } else if ([@"ptz" isEqualToString:call.method]) {
    NSDictionary* args = call.arguments;
    NSNumber* handle = args[@"handle"]; // при необходимости передавайте login/real
    NSNumber* cmd = args[@"cmd"];
    NSNumber* speed = args[@"speed"];
    NSNumber* start = args[@"start"];
    BOOL ok = dh_ptz_control((DHHandle)handle.longLongValue, cmd.intValue, speed.intValue, start.boolValue);
    result(@(ok));
  } else if ([@"getPlatformVersion" isEqualToString:call.method]) {
    result([@"iOS " stringByAppendingString:[[UIDevice currentDevice] systemVersion]]);
  } else {
    result(FlutterMethodNotImplemented);
  }
}

@end
