import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'dart:io';

import 'dahua_sdk_platform_interface.dart';

class DahuaSdk {
  static const _ch = MethodChannel('dahua_sdk');

  Future<String?> getPlatformVersion() {
    return DahuaSdkPlatform.instance.getPlatformVersion();
  }

  static Future<void> init() => _ch.invokeMethod('init');
  static Future<void> cleanup() => _ch.invokeMethod('cleanup');

  static Future<bool> ptz({
    required int handle,
    required int cmd,
    int speed = 5,
    required bool start,
  }) async {
    final ok = await _ch.invokeMethod('ptz', {
      'handle': handle,
      'cmd': cmd,
      'speed': speed,
      'start': start,
    });
    return ok == true;
  }
}

class DahuaPreview extends StatelessWidget {
  final String ip;
  final int port;
  final String user;
  final String pass;

  const DahuaPreview({
    super.key,
    required this.ip,
    required this.port,
    required this.user,
    required this.pass,
  });

  @override
  Widget build(BuildContext context) {
    if (!Platform.isIOS) {
      return const Center(child: Text('iOS only'));
    }
    return UiKitView(
      viewType: 'dahua_sdk/preview',
      creationParams: {'ip': ip, 'port': port, 'user': user, 'pass': pass},
      creationParamsCodec: const StandardMessageCodec(),
    );
  }
}
