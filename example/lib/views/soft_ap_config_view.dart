import 'package:flutter/material.dart';
import 'package:dahua_sdk/dahua_sdk.dart';
import 'dart:async';

/// View for configuring camera WiFi when connected to camera's Soft AP network
///
/// Usage flow:
/// 1. User connects phone to camera's Soft AP network (e.g., "DHIPC-XXXXXX")
/// 2. User opens this screen and:
///    - Scans for available WiFi networks
///    - Selects home WiFi from the list
///    - Enters WiFi password
///    - Enters camera serial number
/// 3. App sends WiFi credentials to camera via sound/FSK modulation
/// 4. Camera connects to home WiFi
/// 5. App searches for camera on home network
class SoftApConfigView extends StatefulWidget {
  const SoftApConfigView({super.key});

  @override
  State<SoftApConfigView> createState() => _SoftApConfigViewState();
}

class _SoftApConfigViewState extends State<SoftApConfigView> {
  final _formKey = GlobalKey<FormState>();
  final _serialController = TextEditingController();
  final _passwordController = TextEditingController();

  bool _isConfiguring = false;
  bool _isScanning = false;
  String _statusMessage = '';
  String? _selectedSsid;
  final List<WlanDevice> _availableNetworks = [];
  final List<DeviceInfo> _foundDevices = [];

  // Default camera Soft AP IP (typically 192.168.1.1 or 192.168.80.1)
  final _cameraIpController = TextEditingController(text: '192.168.1.1');

  @override
  void dispose() {
    _serialController.dispose();
    _passwordController.dispose();
    _cameraIpController.dispose();
    DahuaSdk.stopSmartConfig();
    DahuaSdk.stopDeviceSearch();
    super.dispose();
  }

  Future<String?> _findCameraIpViaDeviceSearch() async {
    setState(() {
      _statusMessage = 'Поиск камеры в сети...';
    });

    try {
      final completer = Completer<String?>();

      // Start device search
      final subscription = DahuaSdk.searchDeviceBySerial().listen(
        (device) {
          debugPrint('Found device: ${device.ip} - ${device.serialNo}');
          if (!completer.isCompleted) {
            completer.complete(device.ip);
          }
        },
        onError: (error) {
          debugPrint('Device search error: $error');
          if (!completer.isCompleted) {
            completer.complete(null);
          }
        },
      );

      // Wait up to 5 seconds for first device
      Future.delayed(const Duration(seconds: 5), () {
        if (!completer.isCompleted) {
          completer.complete(null);
        }
      });

      final foundIp = await completer.future;
      await subscription.cancel();
      await DahuaSdk.stopDeviceSearch();

      return foundIp;
    } catch (e) {
      debugPrint('Error in device search: $e');
      return null;
    }
  }

  Future<void> _scanWifiNetworks() async {
    setState(() {
      _isScanning = true;
      _availableNetworks.clear();
      _selectedSsid = null;
      _statusMessage = 'Поиск камеры...';
    });

    try {
      // First, find camera via device search
      String? foundIp = await _findCameraIpViaDeviceSearch();

      if (foundIp == null) {
        setState(() {
          _statusMessage =
              'Камера не найдена через поиск устройств.\nПопробуем стандартные IP...';
        });

        // Fallback to trying common IPs
        final ipsToTry = ['192.168.1.1', '192.168.80.1', '192.168.0.1'];
        for (final ip in ipsToTry) {
          setState(() {
            _statusMessage = 'Проверка $ip...';
          });

          try {
            final networks = await DahuaSdk.getDevWifiList(ip);
            if (networks.isNotEmpty) {
              foundIp = ip;
              break;
            }
          } catch (e) {
            debugPrint('Not at $ip: $e');
          }
        }
      }

      if (foundIp == null) {
        setState(() {
          _isScanning = false;
          _statusMessage =
              'Камера не найдена!\n'
              '• Убедитесь что вы подключены к WiFi камеры\n'
              '• Попробуйте ввести IP вручную';
        });
        return;
      }

      // Update IP in UI
      _cameraIpController.text = foundIp;

      setState(() {
        _statusMessage = 'Камера найдена: $foundIp\nСканирование WiFi сетей...';
      });

      // Scan WiFi networks using camera (no login required)
      final networks = await DahuaSdk.getDevWifiList(foundIp);

      setState(() {
        _isScanning = false;
        if (networks.isEmpty) {
          _statusMessage = 'WiFi сети не найдены';
        } else {
          _availableNetworks.addAll(networks);
          _statusMessage = 'Найдено WiFi сетей: ${networks.length}';
        }
      });
    } catch (e) {
      setState(() {
        _isScanning = false;
        _statusMessage = 'Ошибка: $e';
      });
    }
  }

  Color _getSignalColor(int signalLevel) {
    if (signalLevel >= 80) return Colors.green;
    if (signalLevel >= 60) return Colors.lightGreen;
    if (signalLevel >= 40) return Colors.orange;
    if (signalLevel >= 20) return Colors.deepOrange;
    return Colors.red;
  }

  Future<void> _startConfiguration() async {
    if (!_formKey.currentState!.validate()) return;
    if (_selectedSsid == null || _selectedSsid!.isEmpty) {
      setState(() {
        _statusMessage = 'Выберите WiFi сеть!';
      });
      return;
    }

    setState(() {
      _isConfiguring = true;
      _statusMessage = 'Начинается конфигурация...';
      _foundDevices.clear();
    });

    try {
      final serialNumber = _serialController.text.trim();
      final password = _passwordController.text.trim();

      // Start Smart Config with WiFi credentials
      setState(() => _statusMessage = 'Отправка WiFi данных камере...');

      await DahuaSdk.startSmartConfig(
        serialNumber: serialNumber,
        ssid: _selectedSsid!,
        password: password,
      );

      // Wait a bit for camera to process
      await Future.delayed(const Duration(seconds: 3));

      // Search for device on home network
      setState(() => _statusMessage = 'Поиск камеры в сети...');

      final subscription = DahuaSdk.searchDeviceBySerial().listen((device) {
        if (!_foundDevices.any((d) => d.serialNo == device.serialNo)) {
          setState(() => _foundDevices.add(device));
        }
      });

      // Search for 15 seconds
      await Future.delayed(const Duration(seconds: 15));
      await subscription.cancel();
      await DahuaSdk.stopDeviceSearch();
      await DahuaSdk.stopSmartConfig();

      setState(() => _isConfiguring = false);

      if (_foundDevices.isNotEmpty) {
        _showSuccessDialog(_foundDevices.first);
      } else {
        setState(() {
          _statusMessage =
              'Камера не найдена в сети. '
              'Проверьте WiFi данные и попробуйте снова.';
        });
      }
    } catch (e) {
      setState(() {
        _isConfiguring = false;
        _statusMessage = 'Ошибка: $e';
      });
      DahuaSdk.stopSmartConfig();
      DahuaSdk.stopDeviceSearch();
    }
  }

  void _showSuccessDialog(DeviceInfo device) {
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        title: const Text('Успешно!'),
        content: Text(
          'Камера подключена к WiFi сети.\n\n'
          'IP адрес: ${device.ip}\n'
          'Порт: ${device.port}\n'
          'MAC: ${device.mac}\n\n'
          'Теперь вы можете подключиться к камере через домашнюю WiFi сеть.',
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
        title: const Text('WiFi Конфигурация (Soft AP)'),
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
                color: Colors.blue.shade50,
                child: Padding(
                  padding: const EdgeInsets.all(12),
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Row(
                        children: [
                          Icon(Icons.info_outline, color: Colors.blue.shade700),
                          const SizedBox(width: 8),
                          Text(
                            'Инструкция',
                            style: TextStyle(
                              fontWeight: FontWeight.bold,
                              color: Colors.blue.shade700,
                            ),
                          ),
                        ],
                      ),
                      const SizedBox(height: 8),
                      const Text(
                        '1. Включите камеру и дождитесь создания Soft AP\n'
                        '2. Подключите телефон к WiFi камеры (DHIPC-xxx)\n'
                        '3. Нажмите "Сканировать WiFi"\n'
                        '4. Выберите вашу домашнюю WiFi сеть\n'
                        '5. Введите серийный номер и пароль WiFi\n'
                        '6. Нажмите "Начать конфигурацию"',
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
                  color:
                      _statusMessage.contains('Ошибка') ||
                          _statusMessage.contains('не найден')
                      ? Colors.red.shade50
                      : _availableNetworks.isNotEmpty
                      ? Colors.green.shade50
                      : Colors.orange.shade50,
                  child: Padding(
                    padding: const EdgeInsets.all(12),
                    child: Text(
                      _statusMessage,
                      style: TextStyle(
                        color:
                            _statusMessage.contains('Ошибка') ||
                                _statusMessage.contains('не найден')
                            ? Colors.red.shade900
                            : _availableNetworks.isNotEmpty
                            ? Colors.green.shade900
                            : Colors.orange.shade900,
                      ),
                    ),
                  ),
                ),
              const SizedBox(height: 16),

              // Scan WiFi button - main action
              ElevatedButton.icon(
                onPressed: (_isConfiguring || _isScanning)
                    ? null
                    : _scanWifiNetworks,
                style: ElevatedButton.styleFrom(
                  padding: const EdgeInsets.symmetric(vertical: 16),
                  backgroundColor: Colors.blue,
                  foregroundColor: Colors.white,
                ),
                icon: _isScanning
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
                    : const Icon(Icons.wifi_find, size: 28),
                label: Text(
                  _isScanning ? 'Сканирование...' : 'Сканировать WiFi сети',
                  style: const TextStyle(fontSize: 16),
                ),
              ),
              const SizedBox(height: 24),

              // Advanced: Manual camera IP (collapsed by default)
              ExpansionTile(
                title: const Text('Дополнительно: IP камеры вручную'),
                children: [
                  Padding(
                    padding: const EdgeInsets.all(8.0),
                    child: TextFormField(
                      controller: _cameraIpController,
                      decoration: const InputDecoration(
                        labelText: 'IP адрес камеры',
                        hintText: '192.168.1.1',
                        prefixIcon: Icon(Icons.router),
                        border: OutlineInputBorder(),
                        helperText: 'Обычно определяется автоматически',
                      ),
                      keyboardType: const TextInputType.numberWithOptions(
                        decimal: true,
                      ),
                      enabled: !_isConfiguring && !_isScanning,
                    ),
                  ),
                ],
              ),
              const SizedBox(height: 24),

              // WiFi network selector
              if (_availableNetworks.isNotEmpty) ...[
                DropdownButtonFormField<String>(
                  value: _selectedSsid,
                  decoration: const InputDecoration(
                    labelText: 'Выберите WiFi сеть',
                    prefixIcon: Icon(Icons.wifi),
                    border: OutlineInputBorder(),
                  ),
                  items: _availableNetworks.map((network) {
                    return DropdownMenuItem<String>(
                      value: network.ssid,
                      child: Row(
                        mainAxisSize: MainAxisSize.min,
                        children: [
                          Icon(
                            Icons.signal_wifi_4_bar,
                            size: 20,
                            color: _getSignalColor(network.signalLevel),
                          ),
                          const SizedBox(width: 8),
                          Flexible(
                            child: Text(
                              network.ssid,
                              overflow: TextOverflow.ellipsis,
                            ),
                          ),
                          const SizedBox(width: 8),
                          Text(
                            '${network.signalLevel}%',
                            style: TextStyle(
                              color: Colors.grey[600],
                              fontSize: 12,
                            ),
                          ),
                        ],
                      ),
                    );
                  }).toList(),
                  onChanged: _isConfiguring
                      ? null
                      : (String? newValue) {
                          setState(() {
                            _selectedSsid = newValue;
                          });
                        },
                  validator: (value) {
                    if (value == null || value.isEmpty) {
                      return 'Выберите WiFi сеть';
                    }
                    return null;
                  },
                ),
                const SizedBox(height: 16),
              ],

              TextFormField(
                controller: _serialController,
                decoration: const InputDecoration(
                  labelText: 'Серийный номер камеры',
                  hintText: 'Например: ABC123456',
                  prefixIcon: Icon(Icons.qr_code),
                  border: OutlineInputBorder(),
                ),
                validator: (value) {
                  if (value == null || value.trim().isEmpty) {
                    return 'Введите серийный номер';
                  }
                  return null;
                },
                enabled: !_isConfiguring,
              ),
              const SizedBox(height: 16),

              TextFormField(
                controller: _passwordController,
                decoration: const InputDecoration(
                  labelText: 'Пароль WiFi (опционально)',
                  hintText: 'Введите пароль',
                  prefixIcon: Icon(Icons.lock),
                  border: OutlineInputBorder(),
                ),
                obscureText: true,
                enabled: !_isConfiguring,
              ),
              const SizedBox(height: 24),

              ElevatedButton(
                onPressed: _isConfiguring ? null : _startConfiguration,
                style: ElevatedButton.styleFrom(
                  padding: const EdgeInsets.symmetric(vertical: 16),
                  backgroundColor: Colors.green,
                  foregroundColor: Colors.white,
                ),
                child: _isConfiguring
                    ? const SizedBox(
                        height: 20,
                        width: 20,
                        child: CircularProgressIndicator(
                          strokeWidth: 2,
                          valueColor: AlwaysStoppedAnimation<Color>(
                            Colors.white,
                          ),
                        ),
                      )
                    : const Text(
                        'Настроить WiFi',
                        style: TextStyle(fontSize: 16),
                      ),
              ),

              if (_statusMessage.isNotEmpty) ...[
                const SizedBox(height: 24),
                Card(
                  color: _isConfiguring
                      ? Colors.orange.shade50
                      : (_statusMessage.contains('Успешно')
                            ? Colors.green.shade50
                            : Colors.red.shade50),
                  child: Padding(
                    padding: const EdgeInsets.all(16),
                    child: Column(
                      children: [
                        if (_isConfiguring) const CircularProgressIndicator(),
                        const SizedBox(height: 12),
                        Text(
                          _statusMessage,
                          style: TextStyle(
                            color: _isConfiguring
                                ? Colors.orange.shade900
                                : (_statusMessage.contains('Успешно')
                                      ? Colors.green.shade900
                                      : Colors.red.shade900),
                          ),
                          textAlign: TextAlign.center,
                        ),
                      ],
                    ),
                  ),
                ),
              ],

              if (_foundDevices.isNotEmpty) ...[
                const SizedBox(height: 16),
                const Text(
                  'Найденные устройства:',
                  style: TextStyle(fontWeight: FontWeight.bold),
                ),
                const SizedBox(height: 8),
                ..._foundDevices.map(
                  (device) => Card(
                    child: ListTile(
                      leading: const Icon(Icons.videocam),
                      title: Text(device.serialNo),
                      subtitle: Text('IP: ${device.ip}\nMAC: ${device.mac}'),
                      trailing: Text(
                        'Порт: ${device.port}',
                        style: const TextStyle(fontSize: 12),
                      ),
                    ),
                  ),
                ),
              ],
            ],
          ),
        ),
      ),
    );
  }
}
