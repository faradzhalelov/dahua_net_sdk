#import <Flutter/Flutter.h>

@interface DahuaSdkPlugin : NSObject<FlutterPlugin>
/// Emit a debug log message from native to Dart (flutter run console).
+ (void)emitLog:(NSString*)message;
@end
