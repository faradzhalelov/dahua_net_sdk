#import "DahuaPreviewFactory.h"
#import "DahuaNetSDKBridge.h"

@interface DahuaPreview : NSObject<FlutterPlatformView>
@property(nonatomic, strong) UIView *view;
@property(nonatomic, assign) DHHandle login;
@property(nonatomic, assign) DHHandle real;
@end

@implementation DahuaPreview
- (instancetype)initWithFrame:(CGRect)frame
               viewIdentifier:(int64_t)viewId
                    arguments:(id)args
              binaryMessenger:(NSObject<FlutterBinaryMessenger>*)messenger {
    if (self = [super init]) {
        _view = [[UIView alloc] initWithFrame:frame];
        _view.backgroundColor = [UIColor blackColor];

        NSDictionary* dict = (NSDictionary*)args;
        NSString* ip = dict[@"ip"];
        NSNumber* port = dict[@"port"];
        NSString* user = dict[@"user"];
        NSString* pass = dict[@"pass"];

        dh_init();
        _login = dh_login(ip.UTF8String, port.intValue, user.UTF8String, pass.UTF8String);
        if (_login) {
            _real = dh_start_realplay(_login, _view);
        }
    }
    return self;
}

- (UIView*)view { return _view; }

- (void)dealloc {
    if (_real) dh_stop_realplay(_real);
    if (_login) dh_logout(_login);
}
@end

@implementation DahuaPreviewFactory {
  NSObject<FlutterBinaryMessenger>* _messenger;
}
- (instancetype)initWithMessenger:(NSObject<FlutterBinaryMessenger>*)messenger {
  if (self = [super init]) { _messenger = messenger; }
  return self;
}
- (NSObject<FlutterMessageCodec>*)createArgsCodec { return [FlutterStandardMessageCodec sharedInstance]; }
- (NSObject<FlutterPlatformView>*)createWithFrame:(CGRect)frame viewIdentifier:(int64_t)viewId arguments:(id)args {
  return [[DahuaPreview alloc] initWithFrame:frame viewIdentifier:viewId arguments:args binaryMessenger:_messenger];
}
@end
