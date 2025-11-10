import 'package:flutter/material.dart';
import 'package:dahua_sdk/dahua_sdk.dart';
import '../models/camera_config.dart';
import 'wifi_config_view.dart';

/// Navigator widget that handles login for WiFi configuration
class WifiConfigNavigator extends StatefulWidget {
  final CameraConfig config;

  const WifiConfigNavigator({super.key, required this.config});

  @override
  State<WifiConfigNavigator> createState() => _WifiConfigNavigatorState();
}

class _WifiConfigNavigatorState extends State<WifiConfigNavigator> {
  int? _loginHandle;
  bool _isLoading = true;
  String? _errorMessage;

  @override
  void initState() {
    super.initState();
    _performLogin();
  }

  Future<void> _performLogin() async {
    setState(() {
      _isLoading = true;
      _errorMessage = null;
    });

    try {
      final handle = await DahuaSdk.login(
        ip: widget.config.ip,
        port: widget.config.port,
        user: widget.config.username,
        pass: widget.config.password,
      );

      if (handle > 0) {
        setState(() {
          _loginHandle = handle;
          _isLoading = false;
        });
      } else {
        setState(() {
          _errorMessage =
              'Login failed: Invalid credentials or connection error';
          _isLoading = false;
        });
      }
    } catch (e) {
      setState(() {
        _errorMessage = 'Login failed: $e';
        _isLoading = false;
      });
    }
  }

  @override
  void dispose() {
    if (_loginHandle != null && _loginHandle! > 0) {
      DahuaSdk.logout(_loginHandle!);
    }
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    if (_isLoading) {
      return Scaffold(
        appBar: AppBar(title: const Text('Connecting...')),
        body: const Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              CircularProgressIndicator(),
              SizedBox(height: 16),
              Text('Logging in to device...'),
            ],
          ),
        ),
      );
    }

    if (_errorMessage != null || _loginHandle == null) {
      return Scaffold(
        appBar: AppBar(title: const Text('Connection Error')),
        body: Center(
          child: Padding(
            padding: const EdgeInsets.all(24),
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                const Icon(Icons.error_outline, size: 64, color: Colors.red),
                const SizedBox(height: 16),
                Text(
                  _errorMessage ?? 'Failed to connect to device',
                  textAlign: TextAlign.center,
                  style: Theme.of(context).textTheme.bodyLarge,
                ),
                const SizedBox(height: 24),
                ElevatedButton.icon(
                  onPressed: () => Navigator.of(context).pop(),
                  icon: const Icon(Icons.arrow_back),
                  label: const Text('Go Back'),
                ),
              ],
            ),
          ),
        ),
      );
    }

    return WifiConfigView(loginHandle: _loginHandle!);
  }
}
