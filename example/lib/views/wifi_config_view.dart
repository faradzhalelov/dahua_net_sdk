import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:dahua_sdk/dahua_sdk.dart';

class WifiConfigView extends StatefulWidget {
  final int loginHandle;
  final WlanDevice? prefilledDevice;

  const WifiConfigView({
    super.key,
    required this.loginHandle,
    this.prefilledDevice,
  });

  @override
  State<WifiConfigView> createState() => _WifiConfigViewState();
}

class _WifiConfigViewState extends State<WifiConfigView> {
  static const _maxPasswordLength = 63;
  final _formKey = GlobalKey<FormState>();
  late TextEditingController _ssidController;
  late TextEditingController _passwordController;

  WlanAuthMode _authMode = WlanAuthMode.wpa2Psk;
  WlanEncryptionAlg _encryptionAlg = WlanEncryptionAlg.aes;
  bool _enabled = true;
  bool _connectEnabled = true;
  bool _isLoading = false;
  bool _isScanning = false;
  String? _statusMessage;
  List<WlanDevice> _availableNetworks = [];

  @override
  void initState() {
    super.initState();

    // Initialize controllers fresh
    _ssidController = TextEditingController();
    _passwordController = TextEditingController();

    if (widget.prefilledDevice != null) {
      _prefillFromDevice(widget.prefilledDevice!);
    }
  }

  void _prefillFromDevice(WlanDevice device) {
    // Only prefill SSID. Do NOT auto-fill passwords from device responses.
    _ssidController.text = device.ssid;

    setState(() {
      _statusMessage = 'Configure WiFi: ${device.ssid}';
    });

    // Always clear password field (do not set any device-provided password)
    _safeSetPassword('');
  }

  // Safe method to set password that prevents text input crashes
  void _safeSetPassword(String password) {
    // Never programmatically set a non-empty password to avoid corrupt input
    // coming from native code. We only allow clearing the password field here.
    if (password.isNotEmpty) {
      debugPrint('Ignoring device-provided password; require manual entry');
    }

    // Clear the controller to reset any internal state safely.
    if (mounted) {
      _passwordController.clear();
    }
  }

  // Password sanitization helper removed: we no longer auto-fill device
  // passwords to avoid platform input crashes. Passwords must be entered
  // manually by the user.

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
          _isLoading = false;
        });

        // Do NOT auto-fill password from device. Only populate SSID and flags.
        _safeSetPassword('');

        if (mounted) {
          setState(() {
            _statusMessage = 'Configuration loaded (enter password manually)';
          });
        }
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

  Future<void> _scanWifiNetworks() async {
    setState(() {
      _isScanning = true;
      _statusMessage = 'Сканирование WiFi сетей...';
      _availableNetworks.clear();
    });

    try {
      final devices = await DahuaSdk.scanWlanDevices(widget.loginHandle);

      if (mounted) {
        setState(() {
          _isScanning = false;
          _availableNetworks = devices;
          if (devices.isEmpty) {
            _statusMessage = 'WiFi сети не найдены';
          } else {
            _statusMessage =
                'Найдено ${devices.length} WiFi сетей. Выберите из списка ниже.';
          }
        });
      }
    } catch (e) {
      if (mounted) {
        setState(() {
          _isScanning = false;
          _statusMessage = 'Ошибка сканирования: $e';
        });
      }
    }
  }

  void _selectNetwork(WlanDevice device) {
    // CRITICAL FIX: Recreate controllers completely to break any corrupted state
    // This is the most aggressive fix to prevent text input sync issues

    // Store old controllers for disposal
    final oldSsidController = _ssidController;
    final oldPasswordController = _passwordController;

    // Create brand new controllers
    _ssidController = TextEditingController(text: device.ssid);
    _passwordController = TextEditingController();

    // Update UI
    setState(() {
      _statusMessage = 'Выбрана сеть: ${device.ssid}. Введите пароль.';
    });

    // Dispose old controllers after a frame
    Future.delayed(const Duration(milliseconds: 1), () {
      oldSsidController.dispose();
      oldPasswordController.dispose();
    });
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

  Color _getSignalColor(int signalLevel) {
    if (signalLevel >= 80) return Colors.green;
    if (signalLevel >= 60) return Colors.lightGreen;
    if (signalLevel >= 40) return Colors.orange;
    if (signalLevel >= 20) return Colors.deepOrange;
    return Colors.red;
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
                    // Инструкция
                    Card(
                      color: Colors.blue.shade50,
                      child: Padding(
                        padding: const EdgeInsets.all(12),
                        child: Column(
                          crossAxisAlignment: CrossAxisAlignment.start,
                          children: [
                            Row(
                              children: [
                                Icon(
                                  Icons.info_outline,
                                  color: Colors.blue.shade700,
                                ),
                                const SizedBox(width: 8),
                                Text(
                                  'Изменение WiFi сети камеры',
                                  style: TextStyle(
                                    fontWeight: FontWeight.bold,
                                    color: Colors.blue.shade700,
                                  ),
                                ),
                              ],
                            ),
                            const SizedBox(height: 8),
                            const Text(
                              '1. Нажмите "Сканировать доступные WiFi сети" для поиска\n'
                              '2. Выберите нужную сеть из списка (или введите SSID вручную)\n'
                              '3. Введите пароль от новой WiFi сети\n'
                              '4. Нажмите "Save Configuration"\n'
                              '5. Камера перезагрузится и подключится к новой сети\n'
                              '6. Найдите камеру через "Device Search" и обновите IP',
                              style: TextStyle(fontSize: 12),
                            ),
                          ],
                        ),
                      ),
                    ),
                    const SizedBox(height: 16),
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

                    // Кнопка сканирования WiFi
                    ElevatedButton.icon(
                      onPressed: (_isLoading || _isScanning)
                          ? null
                          : _scanWifiNetworks,
                      icon: _isScanning
                          ? const SizedBox(
                              width: 20,
                              height: 20,
                              child: CircularProgressIndicator(strokeWidth: 2),
                            )
                          : const Icon(Icons.wifi_find),
                      label: Text(
                        _isScanning
                            ? 'Сканирование...'
                            : 'Сканировать доступные WiFi сети',
                      ),
                      style: ElevatedButton.styleFrom(
                        padding: const EdgeInsets.all(12),
                        backgroundColor: Colors.teal,
                        foregroundColor: Colors.white,
                      ),
                    ),
                    const SizedBox(height: 16),

                    // Список найденных сетей
                    if (_availableNetworks.isNotEmpty) ...[
                      Card(
                        color: Colors.green.shade50,
                        child: Padding(
                          padding: const EdgeInsets.all(12),
                          child: Column(
                            crossAxisAlignment: CrossAxisAlignment.start,
                            children: [
                              Text(
                                'Найдено сетей: ${_availableNetworks.length}',
                                style: TextStyle(
                                  fontWeight: FontWeight.bold,
                                  color: Colors.green.shade900,
                                ),
                              ),
                              const SizedBox(height: 8),
                              const Text(
                                'Нажмите на сеть, чтобы выбрать её',
                                style: TextStyle(fontSize: 12),
                              ),
                            ],
                          ),
                        ),
                      ),
                      const SizedBox(height: 8),
                      ...List.generate(_availableNetworks.length, (index) {
                        final device = _availableNetworks[index];
                        return Card(
                          margin: const EdgeInsets.only(bottom: 8),
                          child: ListTile(
                            leading: Icon(
                              Icons.signal_wifi_4_bar,
                              color: _getSignalColor(device.signalLevel),
                            ),
                            title: Text(
                              device.ssid,
                              style: const TextStyle(
                                fontWeight: FontWeight.bold,
                              ),
                            ),
                            subtitle: Text(
                              'Уровень сигнала: ${device.signalLevel}% • ${device.authMode == 0 ? 'Открытая' : 'Защищенная'}',
                              style: const TextStyle(fontSize: 12),
                            ),
                            trailing: Icon(
                              device.authMode == 0
                                  ? Icons.lock_open
                                  : Icons.lock,
                              color: device.authMode == 0
                                  ? Colors.orange
                                  : Colors.green,
                            ),
                            onTap: () => _selectNetwork(device),
                          ),
                        );
                      }),
                      const SizedBox(height: 16),
                    ],

                    TextFormField(
                      controller: _ssidController,
                      decoration: const InputDecoration(
                        labelText: 'WiFi SSID',
                        border: OutlineInputBorder(),
                        prefixIcon: Icon(Icons.wifi),
                      ),
                      enableIMEPersonalizedLearning: false,
                      validator: (value) {
                        if (value == null || value.isEmpty) {
                          return 'Please enter SSID';
                        }
                        return null;
                      },
                    ),
                    const SizedBox(height: 16),

                    // Password field with additional safety measures
                    TextFormField(
                      controller: _passwordController,
                      decoration: const InputDecoration(
                        labelText: 'Password',
                        border: OutlineInputBorder(),
                        prefixIcon: Icon(Icons.lock),
                      ),
                      obscureText: true,
                      maxLength: _maxPasswordLength,
                      maxLengthEnforcement: MaxLengthEnforcement.enforced,
                      // Remove counter to avoid potential issues
                      buildCounter:
                          (
                            context, {
                            required currentLength,
                            required isFocused,
                            maxLength,
                          }) => null,
                      inputFormatters: [
                        // Only allow printable ASCII characters
                        FilteringTextInputFormatter.allow(RegExp(r'[ -~]')),
                        LengthLimitingTextInputFormatter(_maxPasswordLength),
                      ],
                      // Disable autofill and IME learning to prevent crashes
                      enableSuggestions: false,
                      autocorrect: false,
                      enableIMEPersonalizedLearning: false,
                      validator: (value) {
                        if (value == null || value.trim().isEmpty) {
                          return 'Please enter password';
                        }
                        if (value.length > _maxPasswordLength) {
                          return 'Password must be at most $_maxPasswordLength characters';
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
