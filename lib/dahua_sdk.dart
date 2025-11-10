import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/foundation.dart';
import 'dart:io';
import 'dart:async';

import 'dahua_sdk_platform_interface.dart';

/// WiFi authentication mode
enum WlanAuthMode {
  open(0),
  shared(1),
  wpa(2),
  wpaPsk(3),
  wpa2(4),
  wpa2Psk(5),
  wpaNone(6),
  wpaPskWpa2Psk(7),
  wpaWpa2(8),
  wpaWpaPsk(9),
  wpa2Wpa2Psk(10),
  all(11);

  final int value;
  const WlanAuthMode(this.value);
}

/// WiFi encryption algorithm
enum WlanEncryptionAlg {
  none(0),
  wep(4),
  tkip(5),
  aes(6),
  tkipAes(7);

  final int value;
  const WlanEncryptionAlg(this.value);
}

/// WiFi configuration model
class WlanConfig {
  final String ssid;
  final String password;
  final int authMode;
  final int encryptionAlg;
  final int encryption;
  final bool enabled;
  final bool connectEnabled;

  WlanConfig({
    required this.ssid,
    required this.password,
    this.authMode = 5, // WPA2-PSK by default
    this.encryptionAlg = 6, // AES by default
    this.encryption = 11, // WPA2-PSK-AES by default
    this.enabled = true,
    this.connectEnabled = true,
  });

  Map<String, dynamic> toMap() {
    return {
      'ssid': ssid,
      'password': password,
      'authMode': authMode,
      'encryptionAlg': encryptionAlg,
      'encryption': encryption,
      'enabled': enabled,
      'connectEnabled': connectEnabled,
    };
  }

  factory WlanConfig.fromMap(Map<String, dynamic> map) {
    return WlanConfig(
      ssid: map['ssid'] as String,
      password: map['password'] as String,
      authMode: map['authMode'] as int,
      encryptionAlg: map['encryptionAlg'] as int,
      encryption: map['encryption'] as int,
      enabled: map['enabled'] as bool,
      connectEnabled: map['connectEnabled'] as bool,
    );
  }

  WlanConfig copyWith({
    String? ssid,
    String? password,
    int? authMode,
    int? encryptionAlg,
    int? encryption,
    bool? enabled,
    bool? connectEnabled,
  }) {
    return WlanConfig(
      ssid: ssid ?? this.ssid,
      password: password ?? this.password,
      authMode: authMode ?? this.authMode,
      encryptionAlg: encryptionAlg ?? this.encryptionAlg,
      encryption: encryption ?? this.encryption,
      enabled: enabled ?? this.enabled,
      connectEnabled: connectEnabled ?? this.connectEnabled,
    );
  }
}

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

  /// Login to device and return handle for further operations
  /// Returns handle (> 0) on success, 0 on failure
  static Future<int> login({
    required String ip,
    required int port,
    required String user,
    required String pass,
  }) async {
    final handle = await _ch.invokeMethod('login', {
      'ip': ip,
      'port': port,
      'user': user,
      'pass': pass,
    });
    return (handle is int) ? handle : 0;
  }

  /// Logout from device
  static Future<void> logout(int handle) async {
    await _ch.invokeMethod('logout', {'handle': handle});
  }

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

  /// Get WiFi configuration from device
  /// [handle] - login handle from device login
  static Future<WlanConfig?> getWlanConfig(int handle) async {
    try {
      final result = await _ch.invokeMethod('getWlanConfig', {
        'handle': handle,
      });
      if (result is Map) {
        return WlanConfig.fromMap(Map<String, dynamic>.from(result));
      }
      return null;
    } catch (e) {
      debugPrint('[DahuaSdk] getWlanConfig error: $e');
      return null;
    }
  }

  /// Set WiFi configuration to device
  /// [handle] - login handle from device login
  /// [config] - WiFi configuration to apply
  static Future<bool> setWlanConfig(int handle, WlanConfig config) async {
    try {
      final ok = await _ch.invokeMethod('setWlanConfig', {
        'handle': handle,
        ...config.toMap(),
      });
      return ok == true;
    } catch (e) {
      debugPrint('[DahuaSdk] setWlanConfig error: $e');
      return false;
    }
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
