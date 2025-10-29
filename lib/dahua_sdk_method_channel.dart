import 'package:flutter/foundation.dart';
import 'package:flutter/services.dart';

import 'dahua_sdk_platform_interface.dart';

/// An implementation of [DahuaSdkPlatform] that uses method channels.
class MethodChannelDahuaSdk extends DahuaSdkPlatform {
  /// The method channel used to interact with the native platform.
  @visibleForTesting
  final methodChannel = const MethodChannel('dahua_sdk');

  @override
  Future<String?> getPlatformVersion() async {
    final version = await methodChannel.invokeMethod<String>('getPlatformVersion');
    return version;
  }
}
