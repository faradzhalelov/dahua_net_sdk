import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/foundation.dart';
import 'dart:io';
import 'dart:async';

import 'dahua_sdk_platform_interface.dart';

class DahuaSdk {
  static const _ch = MethodChannel('dahua_sdk');
  static bool _handlerInstalled = false;
  static final StreamController<String> _logStreamController =
      StreamController<String>.broadcast();
  static Stream<String> get logs => _logStreamController.stream;

  Future<String?> getPlatformVersion() {
    return DahuaSdkPlatform.instance.getPlatformVersion();
  }

  static Future<void> init() async {
    if (!_handlerInstalled) {
      _ch.setMethodCallHandler((MethodCall call) async {
        if (call.method == 'debugLog') {
          final args = (call.arguments as Map?) ?? const {};
          final msg = args['message']?.toString() ?? '';
          if (msg.isNotEmpty) {
            debugPrint(msg);
            _logStreamController.add(msg);
          }
        }
      });
      _handlerInstalled = true;
    }
    await _ch.invokeMethod('init');
  }

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

class DahuaPreview extends StatefulWidget {
  final String ip;
  final int port;
  final String user;
  final String pass;
  final int channel; // 0-based channel index
  final int streamType; // 0=Main, 1=Extra1, 2=Extra2

  const DahuaPreview({
    super.key,
    required this.ip,
    required this.port,
    required this.user,
    required this.pass,
    this.channel = 0,
    this.streamType = 0,
  });

  @override
  State<DahuaPreview> createState() => _DahuaPreviewState();
}

class _DahuaPreviewState extends State<DahuaPreview> {
  bool _isCreated = false;

  @override
  Widget build(BuildContext context) {
    // Support both iOS and Android
    final Widget platformView;

    if (Platform.isIOS) {
      platformView = UiKitView(
        viewType: 'dahua_sdk/preview',
        creationParams: {
          'ip': widget.ip,
          'port': widget.port,
          'user': widget.user,
          'pass': widget.pass,
          'channel': widget.channel,
          'streamType': widget.streamType,
        },
        creationParamsCodec: const StandardMessageCodec(),
        onPlatformViewCreated: (id) {
          setState(() {
            _isCreated = true;
          });
          debugPrint('DahuaPreview (iOS) created with id: $id');
        },
      );
    } else if (Platform.isAndroid) {
      platformView = AndroidView(
        viewType: 'dahua_sdk/preview',
        creationParams: {
          'ip': widget.ip,
          'port': widget.port,
          'user': widget.user,
          'pass': widget.pass,
          'channel': widget.channel,
          'streamType': widget.streamType,
        },
        creationParamsCodec: const StandardMessageCodec(),
        onPlatformViewCreated: (id) {
          setState(() {
            _isCreated = true;
          });
          debugPrint('DahuaPreview (Android) created with id: $id');
        },
      );
    } else {
      return const Center(child: Text('Platform not supported'));
    }

    return Stack(
      children: [
        platformView,
        if (!_isCreated)
          Container(
            color: Colors.black,
            child: Center(
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  CircularProgressIndicator(color: Colors.white),
                  SizedBox(height: 16),
                  Text(
                    'Initializing video stream...',
                    style: TextStyle(color: Colors.white),
                  ),
                ],
              ),
            ),
          ),
      ],
    );
  }
}
