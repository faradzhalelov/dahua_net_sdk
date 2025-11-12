import 'package:flutter/material.dart';
import 'package:dahua_sdk/dahua_sdk.dart';
import 'dart:async';
import '../utils/validators.dart';

/// View for initializing a new device (first time setup) or modifying password
///
/// Two modes:
/// 1. **Initialization mode** (device.initialized == false):
///    - Set username and password for first time
///    - Optionally set recovery info (phone/email)
///    - Does not require login
///
/// 2. **Password modification mode** (device.initialized == true):
///    - Change password for existing user
///    - Requires old password
///    - Must login first, then modify
///
/// Usage flow:
/// 1. Search for device to get its info (IP, MAC, initialized status)
/// 2. If uninitialized: set username/password
/// 3. If initialized: provide old password, set new password
class InitDeviceView extends StatefulWidget {
  const InitDeviceView({super.key});

  @override
  State<InitDeviceView> createState() => _InitDeviceViewState();
}

class _InitDeviceViewState extends State<InitDeviceView> {
  final _formKey = GlobalKey<FormState>();
  final _serialController = TextEditingController(text: 'AJ0DBFDPAG00068');
  final _usernameController = TextEditingController(text: 'admin');
  final _oldPasswordController = TextEditingController(text: 'cerebro123Q');
  final _passwordController = TextEditingController(text: 'cerebro123Q');
  final _phoneOrEmailController = TextEditingController();

  bool _isSearching = false;
  bool _isProcessing = false;
  bool _deviceIsInitialized = false; // User manually sets this
  String _statusMessage = '';
  DeviceInfo? _foundDevice;
  StreamSubscription<DeviceInfo>? _searchSubscription;

  @override
  void dispose() {
    _serialController.dispose();
    _usernameController.dispose();
    _oldPasswordController.dispose();
    _passwordController.dispose();
    _phoneOrEmailController.dispose();
    _searchSubscription?.cancel();
    DahuaSdk.stopDeviceSearch();
    super.dispose();
  }

  Future<void> _searchDevice() async {
    final serialNumber = _serialController.text.trim();
    if (serialNumber.isEmpty) {
      setState(() {
        _statusMessage = 'Введите серийный номер устройства';
      });
      return;
    }

    setState(() {
      _isSearching = true;
      _statusMessage = 'Поиск устройства...';
      _foundDevice = null;
    });

    try {
      await _searchSubscription?.cancel();

      _searchSubscription = DahuaSdk.searchDeviceBySerial().listen(
        (device) {
          // Only process devices with valid IP addresses
          if (!isValidIpAddress(device.ip)) {
            debugPrint('Ignoring device with invalid IP: ${device.ip}');
            return;
          }

          // Filter by serial number
          if (device.serialNo.toLowerCase().contains(
            serialNumber.toLowerCase(),
          )) {
            setState(() {
              _foundDevice = device;
              _statusMessage =
                  'Устройство найдено. Укажите, инициализировано ли оно.';
            });

            // Stop search after finding device
            _stopSearch();
          }
        },
        onError: (error) {
          setState(() {
            _statusMessage = 'Ошибка поиска: $error';
            _isSearching = false;
          });
        },
      );

      // Auto-stop after 15 seconds
      Future.delayed(const Duration(seconds: 15), () {
        if (_isSearching && _foundDevice == null) {
          _stopSearch();
          setState(() {
            _statusMessage = 'Устройство не найдено. Проверьте серийный номер.';
          });
        }
      });
    } catch (e) {
      setState(() {
        _statusMessage = 'Ошибка: $e';
        _isSearching = false;
      });
    }
  }

  Future<void> _stopSearch() async {
    await _searchSubscription?.cancel();
    await DahuaSdk.stopDeviceSearch();
    setState(() {
      _isSearching = false;
    });
  }

  Future<void> _initializeDevice() async {
    if (!_formKey.currentState!.validate()) return;
    if (_foundDevice == null) {
      setState(() {
        _statusMessage = 'Сначала найдите устройство';
      });
      return;
    }

    setState(() {
      _isProcessing = true;

      if (!_deviceIsInitialized) {
        _statusMessage = 'Инициализация устройства...';
      } else {
        _statusMessage = 'Изменение пароля...';
      }
    });

    try {
      final bool success;

      if (!_deviceIsInitialized) {
        // Device is not initialized - use initDeviceAccount
        final deviceInfoMap = {
          'mac': _foundDevice!.mac,
          'ip': _foundDevice!.ip,
          'serialNo': _foundDevice!.serialNo,
          'port': _foundDevice!.port,
          'initialized': _foundDevice!.initialized,
          'pwdResetWay': 0,
        };

        success = await DahuaSdk.initDeviceAccount(
          deviceInfo: deviceInfoMap,
          username: _usernameController.text.trim(),
          password: _passwordController.text.trim(),
          phoneOrEmail: _phoneOrEmailController.text.trim().isNotEmpty
              ? _phoneOrEmailController.text.trim()
              : null,
          useIP: true,
        );
      } else {
        // Device is initialized - use modifyDevicePassword
        // First login
        final loginHandle = await DahuaSdk.login(
          ip: _foundDevice!.ip,
          port: _foundDevice!.port,
          user: _usernameController.text.trim(),
          pass: _oldPasswordController.text.trim(),
        );

        if (loginHandle == 0) {
          setState(() {
            _isProcessing = false;
            _statusMessage = 'Ошибка входа. Проверьте старый пароль.';
          });
          return;
        }

        // Modify password
        success = await DahuaSdk.modifyDevicePassword(
          loginHandle: loginHandle,
          username: _usernameController.text.trim(),
          oldPassword: _oldPasswordController.text.trim(),
          newPassword: _passwordController.text.trim(),
        );

        // Logout
        await DahuaSdk.logout(loginHandle);
      }

      setState(() {
        _isProcessing = false;
        if (success) {
          if (!_deviceIsInitialized) {
            _statusMessage = 'Устройство успешно инициализировано!';
          } else {
            _statusMessage = 'Пароль успешно изменен!';
          }
          _showSuccessDialog();
        } else {
          _statusMessage = 'Ошибка. Проверьте данные.';
        }
      });
    } catch (e) {
      setState(() {
        _isProcessing = false;
        _statusMessage = 'Ошибка: $e';
      });
    }
  }

  void _showSuccessDialog() {
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        title: const Text('Успешно!'),
        content: Column(
          mainAxisSize: MainAxisSize.min,
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            const Text('Устройство инициализировано:'),
            const SizedBox(height: 8),
            Text('IP: ${_foundDevice!.ip}:${_foundDevice!.port}'),
            Text('MAC: ${_foundDevice!.mac}'),
            Text('S/N: ${_foundDevice!.serialNo}'),
            const SizedBox(height: 8),
            Text('Логин: ${_usernameController.text}'),
            const Text('Теперь вы можете войти с этими данными'),
          ],
        ),
        actions: [
          TextButton(
            onPressed: () {
              Navigator.of(context).pop();
              Navigator.of(context).pop(); // Return to home
            },
            child: const Text('OK'),
          ),
        ],
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Инициализация устройства'),
        backgroundColor: Theme.of(context).colorScheme.inversePrimary,
      ),
      body: SingleChildScrollView(
        padding: const EdgeInsets.all(16),
        child: Form(
          key: _formKey,
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.stretch,
            children: [
              Card(
                color: Colors.amber.shade50,
                child: Padding(
                  padding: const EdgeInsets.all(12),
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Row(
                        children: [
                          Icon(
                            Icons.info_outline,
                            color: Colors.amber.shade700,
                          ),
                          const SizedBox(width: 8),
                          Text(
                            'Инструкция',
                            style: TextStyle(
                              fontWeight: FontWeight.bold,
                              color: Colors.amber.shade700,
                            ),
                          ),
                        ],
                      ),
                      const SizedBox(height: 8),
                      const Text(
                        'Два режима работы:\n'
                        '\n'
                        '📱 Новое устройство (первая настройка):\n'
                        '1. Введите серийный номер устройства\n'
                        '2. Нажмите "Найти устройство"\n'
                        '3. ВАЖНО: Если Config Tool показывает "Not Initialized" - оставьте флажок снятым!\n'
                        '4. Заполните логин и пароль (8+ символов, буквы и цифры)\n'
                        '5. Опционально: укажите телефон/email для восстановления\n'
                        '6. Нажмите "Инициализировать устройство"\n'
                        '\n'
                        '🔒 Изменение пароля (устройство уже настроено):\n'
                        '1. Введите серийный номер устройства\n'
                        '2. Нажмите "Найти устройство"\n'
                        '3. Поставьте галочку "Устройство уже инициализировано"\n'
                        '4. Введите логин и СТАРЫЙ пароль\n'
                        '5. Введите новый пароль (8+ символов, буквы и цифры)\n'
                        '6. Нажмите "Изменить пароль"',
                        style: TextStyle(fontSize: 12),
                      ),
                    ],
                  ),
                ),
              ),
              const SizedBox(height: 16),

              // Status message
              if (_statusMessage.isNotEmpty)
                Card(
                  color: _statusMessage.contains('Ошибка')
                      ? Colors.red.shade50
                      : _statusMessage.contains('успешно') ||
                            _statusMessage.contains('найдено')
                      ? Colors.green.shade50
                      : Colors.blue.shade50,
                  child: Padding(
                    padding: const EdgeInsets.all(12),
                    child: Text(
                      _statusMessage,
                      style: TextStyle(
                        color: _statusMessage.contains('Ошибка')
                            ? Colors.red.shade900
                            : _statusMessage.contains('успешно') ||
                                  _statusMessage.contains('найдено')
                            ? Colors.green.shade900
                            : Colors.blue.shade900,
                      ),
                    ),
                  ),
                ),
              const SizedBox(height: 16),

              // Device search section
              Text(
                'Шаг 1: Поиск устройства',
                style: Theme.of(context).textTheme.titleMedium,
              ),
              const SizedBox(height: 8),

              TextFormField(
                controller: _serialController,
                decoration: const InputDecoration(
                  labelText: 'Серийный номер',
                  hintText: 'ABC123456',
                  prefixIcon: Icon(Icons.qr_code),
                  border: OutlineInputBorder(),
                ),
                validator: (value) {
                  if (value == null || value.trim().isEmpty) {
                    return 'Введите серийный номер';
                  }
                  return null;
                },
                enabled: !_isSearching && !_isProcessing,
              ),
              const SizedBox(height: 12),

              ElevatedButton.icon(
                onPressed: (_isSearching || _isProcessing)
                    ? null
                    : _searchDevice,
                style: ElevatedButton.styleFrom(
                  padding: const EdgeInsets.symmetric(vertical: 12),
                  backgroundColor: Colors.blue,
                  foregroundColor: Colors.white,
                ),
                icon: _isSearching
                    ? const SizedBox(
                        width: 20,
                        height: 20,
                        child: CircularProgressIndicator(
                          strokeWidth: 2,
                          valueColor: AlwaysStoppedAnimation<Color>(
                            Colors.white,
                          ),
                        ),
                      )
                    : const Icon(Icons.search),
                label: Text(_isSearching ? 'Поиск...' : 'Найти устройство'),
              ),

              // Device info display
              if (_foundDevice != null) ...[
                const SizedBox(height: 16),
                Card(
                  color: Colors.blue.shade50,
                  child: Padding(
                    padding: const EdgeInsets.all(12),
                    child: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Text(
                          'Найденное устройство',
                          style: TextStyle(
                            fontWeight: FontWeight.bold,
                            color: Colors.blue.shade900,
                          ),
                        ),
                        const SizedBox(height: 8),
                        Text('IP: ${_foundDevice!.ip}:${_foundDevice!.port}'),
                        Text('MAC: ${_foundDevice!.mac}'),
                        Text('S/N: ${_foundDevice!.serialNo}'),
                        const SizedBox(height: 12),
                        const Divider(),
                        const SizedBox(height: 8),
                        CheckboxListTile(
                          title: const Text('Устройство уже инициализировано'),
                          subtitle: const Text(
                            'Если камера новая или Config Tool показывает "Not Initialized", '
                            'оставьте этот флажок снятым',
                            style: TextStyle(fontSize: 11),
                          ),
                          value: _deviceIsInitialized,
                          onChanged: (value) {
                            setState(() {
                              _deviceIsInitialized = value ?? false;
                            });
                          },
                          contentPadding: EdgeInsets.zero,
                          dense: true,
                        ),
                      ],
                    ),
                  ),
                ),
              ],

              const SizedBox(height: 24),
              const Divider(),
              const SizedBox(height: 16),

              // Initialization section
              Text(
                'Шаг 2: Настройка учётной записи',
                style: Theme.of(context).textTheme.titleMedium,
              ),
              const SizedBox(height: 8),

              TextFormField(
                controller: _usernameController,
                decoration: const InputDecoration(
                  labelText: 'Логин',
                  hintText: 'admin',
                  prefixIcon: Icon(Icons.person),
                  border: OutlineInputBorder(),
                  helperText: 'По умолчанию: admin',
                ),
                validator: (value) {
                  if (value == null || value.trim().isEmpty) {
                    return 'Введите логин';
                  }
                  return null;
                },
                enabled: !_isProcessing,
              ),
              const SizedBox(height: 12),

              // Old password field (only for initialized devices)
              if (_foundDevice != null && _foundDevice!.initialized) ...[
                TextFormField(
                  controller: _oldPasswordController,
                  decoration: const InputDecoration(
                    labelText: 'Старый пароль',
                    hintText: 'Текущий пароль',
                    prefixIcon: Icon(Icons.lock_outline),
                    border: OutlineInputBorder(),
                    helperText: 'Требуется для смены пароля',
                  ),
                  obscureText: true,
                  validator: (value) {
                    if (_foundDevice!.initialized &&
                        (value == null || value.isEmpty)) {
                      return 'Введите старый пароль';
                    }
                    return null;
                  },
                  enabled: !_isProcessing,
                ),
                const SizedBox(height: 12),
              ],

              TextFormField(
                controller: _passwordController,
                decoration: InputDecoration(
                  labelText: _foundDevice != null && _foundDevice!.initialized
                      ? 'Новый пароль'
                      : 'Пароль',
                  hintText: 'Минимум 8 символов',
                  prefixIcon: const Icon(Icons.lock),
                  border: const OutlineInputBorder(),
                  helperText: 'Должен содержать буквы и цифры',
                ),
                obscureText: true,
                validator: (value) {
                  if (value == null || value.isEmpty) {
                    return 'Введите пароль';
                  }
                  if (value.length < 8) {
                    return 'Минимум 8 символов';
                  }
                  if (!RegExp(r'[a-zA-Z]').hasMatch(value) ||
                      !RegExp(r'[0-9]').hasMatch(value)) {
                    return 'Должен содержать буквы и цифры';
                  }
                  return null;
                },
                enabled: !_isProcessing,
              ),
              const SizedBox(height: 12),

              // Phone/Email field (only for uninitialized devices)
              if (!_deviceIsInitialized)
                TextFormField(
                  controller: _phoneOrEmailController,
                  decoration: const InputDecoration(
                    labelText: 'Телефон или Email (опционально)',
                    hintText: '+79001234567 или user@example.com',
                    prefixIcon: Icon(Icons.contact_mail),
                    border: OutlineInputBorder(),
                    helperText: 'Для восстановления пароля',
                  ),
                  enabled: !_isProcessing,
                ),
              const SizedBox(height: 24),

              ElevatedButton.icon(
                onPressed: (_isProcessing || _foundDevice == null)
                    ? null
                    : _initializeDevice,
                style: ElevatedButton.styleFrom(
                  padding: const EdgeInsets.symmetric(vertical: 16),
                  backgroundColor: Colors.green,
                  foregroundColor: Colors.white,
                ),
                icon: _isProcessing
                    ? const SizedBox(
                        width: 20,
                        height: 20,
                        child: CircularProgressIndicator(
                          strokeWidth: 2,
                          valueColor: AlwaysStoppedAnimation<Color>(
                            Colors.white,
                          ),
                        ),
                      )
                    : const Icon(Icons.check_circle),
                label: Text(
                  _isProcessing
                      ? (_deviceIsInitialized
                            ? 'Изменение пароля...'
                            : 'Инициализация...')
                      : (_deviceIsInitialized
                            ? 'Изменить пароль'
                            : 'Инициализировать устройство'),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
