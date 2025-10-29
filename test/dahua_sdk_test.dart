import 'package:flutter_test/flutter_test.dart';
import 'package:dahua_sdk/dahua_sdk.dart';
import 'package:dahua_sdk/dahua_sdk_platform_interface.dart';
import 'package:dahua_sdk/dahua_sdk_method_channel.dart';
import 'package:plugin_platform_interface/plugin_platform_interface.dart';

class MockDahuaSdkPlatform
    with MockPlatformInterfaceMixin
    implements DahuaSdkPlatform {

  @override
  Future<String?> getPlatformVersion() => Future.value('42');
}

void main() {
  final DahuaSdkPlatform initialPlatform = DahuaSdkPlatform.instance;

  test('$MethodChannelDahuaSdk is the default instance', () {
    expect(initialPlatform, isInstanceOf<MethodChannelDahuaSdk>());
  });

  test('getPlatformVersion', () async {
    DahuaSdk dahuaSdkPlugin = DahuaSdk();
    MockDahuaSdkPlatform fakePlatform = MockDahuaSdkPlatform();
    DahuaSdkPlatform.instance = fakePlatform;

    expect(await dahuaSdkPlugin.getPlatformVersion(), '42');
  });
}
