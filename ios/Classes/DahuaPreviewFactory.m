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
        _view.autoresizingMask = UIViewAutoresizingFlexibleWidth | UIViewAutoresizingFlexibleHeight;
        _view.contentMode = UIViewContentModeScaleAspectFit;
        _view.clipsToBounds = YES;

        NSDictionary* dict = (NSDictionary*)args;
        NSString* ip = dict[@"ip"];
        NSNumber* port = dict[@"port"];
        NSString* user = dict[@"user"];
        NSString* pass = dict[@"pass"];
    NSNumber* channel = dict[@"channel"] ?: @(0);
    NSNumber* streamType = dict[@"streamType"] ?: @(0); // 0=Main,1=Extra1,2=Extra2

    NSLog(@"[DahuaPreview] Connecting to %@:%@ with user %@, channel=%@, streamType=%@", ip, port, user, channel, streamType);
        
        // SDK уже инициализирован через DahuaSdkPlugin, не нужно вызывать снова
        // dh_init(); 
        
        // Ждём, пока Flutter разместит view и установит правильный frame
        dispatch_async(dispatch_get_main_queue(), ^{
            self->_login = dh_login(ip.UTF8String, port.intValue, user.UTF8String, pass.UTF8String);
            if (self->_login) {
                NSLog(@"[DahuaPreview] Login successful (handle=%lld), waiting for layout...", self->_login);

                // Даём Flutter время показать view (frame установится после layoutSubviews)
                dispatch_after(dispatch_time(DISPATCH_TIME_NOW, (int64_t)(0.3 * NSEC_PER_SEC)), dispatch_get_main_queue(), ^{
                    NSLog(@"[DahuaPreview] View frame after layout: %@", NSStringFromCGRect(self->_view.frame));
                    
                    // Запускаем воспроизведение после того, как view имеет размер
                    self->_real = dh_start_realplay2(self->_login, channel.intValue, streamType.intValue, self->_view);
                    if (self->_real) {
                        NSLog(@"[DahuaPreview] RealPlay started successfully (handle=%lld)", self->_real);
                    } else {
                        NSLog(@"[DahuaPreview] RealPlay failed to start");
                    }
                });
            } else {
                NSLog(@"[DahuaPreview] Login failed");
            }
        });
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
