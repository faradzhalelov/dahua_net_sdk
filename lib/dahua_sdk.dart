
import 'dahua_sdk_platform_interface.dart';

class DahuaSdk {
  Future<String?> getPlatformVersion() {
    return DahuaSdkPlatform.instance.getPlatformVersion();
  }
}
