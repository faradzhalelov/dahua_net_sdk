import 'package:plugin_platform_interface/plugin_platform_interface.dart';

import 'dahua_sdk_method_channel.dart';

abstract class DahuaSdkPlatform extends PlatformInterface {
  /// Constructs a DahuaSdkPlatform.
  DahuaSdkPlatform() : super(token: _token);

  static final Object _token = Object();

  static DahuaSdkPlatform _instance = MethodChannelDahuaSdk();

  /// The default instance of [DahuaSdkPlatform] to use.
  ///
  /// Defaults to [MethodChannelDahuaSdk].
  static DahuaSdkPlatform get instance => _instance;

  /// Platform-specific implementations should set this with their own
  /// platform-specific class that extends [DahuaSdkPlatform] when
  /// they register themselves.
  static set instance(DahuaSdkPlatform instance) {
    PlatformInterface.verifyToken(instance, _token);
    _instance = instance;
  }

  Future<String?> getPlatformVersion() {
    throw UnimplementedError('platformVersion() has not been implemented.');
  }
}
