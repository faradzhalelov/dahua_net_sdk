import 'package:flutter/material.dart';
import 'package:dahua_sdk/dahua_sdk.dart';

class WifiConfigView extends StatefulWidget {
  final int loginHandle;

  const WifiConfigView({super.key, required this.loginHandle});

  @override
  State<WifiConfigView> createState() => _WifiConfigViewState();
}

class _WifiConfigViewState extends State<WifiConfigView> {
  final _formKey = GlobalKey<FormState>();
  final _ssidController = TextEditingController();
  final _passwordController = TextEditingController();

  WlanAuthMode _authMode = WlanAuthMode.wpa2Psk;
  WlanEncryptionAlg _encryptionAlg = WlanEncryptionAlg.aes;
  bool _enabled = true;
  bool _connectEnabled = true;
  bool _isLoading = false;
  String? _statusMessage;

  @override
  void initState() {
    super.initState();
    _loadCurrentConfig();
  }

  @override
  void dispose() {
    _ssidController.dispose();
    _passwordController.dispose();
    super.dispose();
  }

  Future<void> _loadCurrentConfig() async {
    setState(() {
      _isLoading = true;
      _statusMessage = 'Loading current WiFi configuration...';
    });

    try {
      final config = await DahuaSdk.getWlanConfig(widget.loginHandle);
      if (config != null && mounted) {
        setState(() {
          _ssidController.text = config.ssid;
          _passwordController.text = config.password;
          _authMode = WlanAuthMode.values.firstWhere(
            (e) => e.value == config.authMode,
            orElse: () => WlanAuthMode.wpa2Psk,
          );
          _encryptionAlg = WlanEncryptionAlg.values.firstWhere(
            (e) => e.value == config.encryptionAlg,
            orElse: () => WlanEncryptionAlg.aes,
          );
          _enabled = config.enabled;
          _connectEnabled = config.connectEnabled;
          _statusMessage = 'Configuration loaded successfully';
          _isLoading = false;
        });
      } else if (mounted) {
        setState(() {
          _statusMessage = 'Failed to load configuration';
          _isLoading = false;
        });
      }
    } catch (e) {
      if (mounted) {
        setState(() {
          _statusMessage = 'Error: $e';
          _isLoading = false;
        });
      }
    }
  }

  Future<void> _saveConfig() async {
    if (!_formKey.currentState!.validate()) return;

    setState(() {
      _isLoading = true;
      _statusMessage = 'Saving WiFi configuration...';
    });

    try {
      final config = WlanConfig(
        ssid: _ssidController.text,
        password: _passwordController.text,
        authMode: _authMode.value,
        encryptionAlg: _encryptionAlg.value,
        encryption: _calculateEncryption(),
        enabled: _enabled,
        connectEnabled: _connectEnabled,
      );

      final success = await DahuaSdk.setWlanConfig(widget.loginHandle, config);

      if (mounted) {
        setState(() {
          _isLoading = false;
          _statusMessage = success
              ? 'Configuration saved successfully!'
              : 'Failed to save configuration';
        });

        if (success) {
          ScaffoldMessenger.of(context).showSnackBar(
            const SnackBar(
              content: Text('WiFi configuration updated successfully'),
              backgroundColor: Colors.green,
            ),
          );
        }
      }
    } catch (e) {
      if (mounted) {
        setState(() {
          _statusMessage = 'Error: $e';
          _isLoading = false;
        });
      }
    }
  }

  int _calculateEncryption() {
    // Simplified encryption calculation based on common combinations
    final authValue = _authMode.value;
    final encrValue = _encryptionAlg.value;

    if (authValue == 5 && encrValue == 6) return 11; // WPA2-PSK-AES
    if (authValue == 5 && encrValue == 5) return 7; // WPA2-PSK-TKIP
    if (authValue == 3 && encrValue == 6) return 9; // WPA-PSK-AES
    if (authValue == 3 && encrValue == 5) return 5; // WPA-PSK-TKIP
    if (authValue == 0 && encrValue == 4) return 2; // WEP-OPEN
    if (authValue == 0 && encrValue == 0) return 1; // OPEN-NONE

    return 11; // Default to WPA2-PSK-AES
  }

  String _getEncryptionDescription() {
    final encryption = _calculateEncryption();
    switch (encryption) {
      case 0:
        return 'WPA-NONE';
      case 1:
        return 'OPEN';
      case 2:
        return 'WEP-OPEN';
      case 3:
        return 'WEP-SHARED';
      case 4:
        return 'WPA-TKIP';
      case 5:
        return 'WPA-PSK-TKIP';
      case 6:
        return 'WPA2-TKIP';
      case 7:
        return 'WPA2-PSK-TKIP';
      case 8:
        return 'WPA-AES';
      case 9:
        return 'WPA-PSK-AES';
      case 10:
        return 'WPA2-AES';
      case 11:
        return 'WPA2-PSK-AES';
      default:
        return 'Unknown';
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('WiFi Configuration'),
        backgroundColor: Theme.of(context).colorScheme.inversePrimary,
      ),
      body: _isLoading
          ? Center(
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  const CircularProgressIndicator(),
                  const SizedBox(height: 16),
                  Text(_statusMessage ?? 'Loading...'),
                ],
              ),
            )
          : SingleChildScrollView(
              padding: const EdgeInsets.all(16),
              child: Form(
                key: _formKey,
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.stretch,
                  children: [
                    if (_statusMessage != null)
                      Card(
                        color: _statusMessage!.contains('success')
                            ? Colors.green.shade50
                            : Colors.orange.shade50,
                        child: Padding(
                          padding: const EdgeInsets.all(12),
                          child: Text(_statusMessage!),
                        ),
                      ),
                    const SizedBox(height: 16),
                    TextFormField(
                      controller: _ssidController,
                      decoration: const InputDecoration(
                        labelText: 'WiFi SSID',
                        border: OutlineInputBorder(),
                        prefixIcon: Icon(Icons.wifi),
                      ),
                      validator: (value) {
                        if (value == null || value.isEmpty) {
                          return 'Please enter SSID';
                        }
                        return null;
                      },
                    ),
                    const SizedBox(height: 16),
                    TextFormField(
                      controller: _passwordController,
                      decoration: const InputDecoration(
                        labelText: 'Password',
                        border: OutlineInputBorder(),
                        prefixIcon: Icon(Icons.lock),
                      ),
                      obscureText: true,
                      validator: (value) {
                        if (value == null || value.isEmpty) {
                          return 'Please enter password';
                        }
                        return null;
                      },
                    ),
                    const SizedBox(height: 24),
                    const Text(
                      'Security Settings',
                      style: TextStyle(
                        fontSize: 18,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                    const SizedBox(height: 12),
                    DropdownButtonFormField<WlanAuthMode>(
                      value: _authMode,
                      decoration: const InputDecoration(
                        labelText: 'Authentication Mode',
                        border: OutlineInputBorder(),
                      ),
                      items: WlanAuthMode.values.map((mode) {
                        return DropdownMenuItem(
                          value: mode,
                          child: Text(mode.name.toUpperCase()),
                        );
                      }).toList(),
                      onChanged: (value) {
                        if (value != null) {
                          setState(() => _authMode = value);
                        }
                      },
                    ),
                    const SizedBox(height: 16),
                    DropdownButtonFormField<WlanEncryptionAlg>(
                      value: _encryptionAlg,
                      decoration: const InputDecoration(
                        labelText: 'Encryption Algorithm',
                        border: OutlineInputBorder(),
                      ),
                      items: WlanEncryptionAlg.values.map((alg) {
                        return DropdownMenuItem(
                          value: alg,
                          child: Text(alg.name.toUpperCase()),
                        );
                      }).toList(),
                      onChanged: (value) {
                        if (value != null) {
                          setState(() => _encryptionAlg = value);
                        }
                      },
                    ),
                    const SizedBox(height: 16),
                    Card(
                      color: Colors.blue.shade50,
                      child: Padding(
                        padding: const EdgeInsets.all(12),
                        child: Column(
                          crossAxisAlignment: CrossAxisAlignment.start,
                          children: [
                            const Text(
                              'Calculated Encryption Mode:',
                              style: TextStyle(fontWeight: FontWeight.bold),
                            ),
                            const SizedBox(height: 4),
                            Text(
                              _getEncryptionDescription(),
                              style: const TextStyle(fontSize: 16),
                            ),
                          ],
                        ),
                      ),
                    ),
                    const SizedBox(height: 24),
                    SwitchListTile(
                      title: const Text('WiFi Enabled'),
                      value: _enabled,
                      onChanged: (value) => setState(() => _enabled = value),
                    ),
                    SwitchListTile(
                      title: const Text('Auto Connect'),
                      value: _connectEnabled,
                      onChanged: (value) =>
                          setState(() => _connectEnabled = value),
                    ),
                    const SizedBox(height: 24),
                    Row(
                      children: [
                        Expanded(
                          child: ElevatedButton.icon(
                            onPressed: _isLoading ? null : _loadCurrentConfig,
                            icon: const Icon(Icons.refresh),
                            label: const Text('Reload'),
                            style: ElevatedButton.styleFrom(
                              padding: const EdgeInsets.all(16),
                            ),
                          ),
                        ),
                        const SizedBox(width: 12),
                        Expanded(
                          flex: 2,
                          child: ElevatedButton.icon(
                            onPressed: _isLoading ? null : _saveConfig,
                            icon: const Icon(Icons.save),
                            label: const Text('Save Configuration'),
                            style: ElevatedButton.styleFrom(
                              padding: const EdgeInsets.all(16),
                              backgroundColor: Theme.of(
                                context,
                              ).colorScheme.primary,
                              foregroundColor: Colors.white,
                            ),
                          ),
                        ),
                      ],
                    ),
                    const SizedBox(height: 16),
                    const Card(
                      child: Padding(
                        padding: EdgeInsets.all(12),
                        child: Column(
                          crossAxisAlignment: CrossAxisAlignment.start,
                          children: [
                            Text(
                              'Common Configurations:',
                              style: TextStyle(fontWeight: FontWeight.bold),
                            ),
                            SizedBox(height: 8),
                            Text('• WPA2-PSK + AES (Recommended)'),
                            Text('• WPA-PSK + TKIP (Legacy)'),
                            Text('• OPEN + NONE (Unsecured)'),
                          ],
                        ),
                      ),
                    ),
                  ],
                ),
              ),
            ),
    );
  }
}
