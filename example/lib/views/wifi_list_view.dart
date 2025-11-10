import 'package:flutter/material.dart';
import 'package:dahua_sdk/dahua_sdk.dart';
import 'wifi_config_view.dart';

class WifiListView extends StatefulWidget {
  final int loginHandle;

  const WifiListView({super.key, required this.loginHandle});

  @override
  State<WifiListView> createState() => _WifiListViewState();
}

class _WifiListViewState extends State<WifiListView> {
  List<WlanDevice> _devices = [];
  bool _isLoading = false;
  String? _errorMessage;

  @override
  void initState() {
    super.initState();
    _scanWifi();
  }

  Future<void> _scanWifi() async {
    setState(() {
      _isLoading = true;
      _errorMessage = null;
    });

    try {
      final devices = await DahuaSdk.scanWlanDevices(widget.loginHandle);
      if (mounted) {
        setState(() {
          _devices = devices;
          _isLoading = false;
          if (devices.isEmpty) {
            _errorMessage = 'No WiFi networks found';
          }
        });
      }
    } catch (e) {
      if (mounted) {
        setState(() {
          _errorMessage = 'Scan failed: $e';
          _isLoading = false;
        });
      }
    }
  }

  void _navigateToConfig(WlanDevice device) {
    Navigator.push(
      context,
      MaterialPageRoute(
        builder: (_) => WifiConfigView(
          loginHandle: widget.loginHandle,
          prefilledDevice: device,
        ),
      ),
    );
  }

  IconData _getSignalIcon(int level) {
    if (level >= 80) return Icons.signal_wifi_4_bar;
    if (level >= 60) return Icons.signal_wifi_4_bar;
    if (level >= 40) return Icons.network_wifi_3_bar;
    if (level >= 20) return Icons.network_wifi_2_bar;
    return Icons.network_wifi_1_bar;
  }

  Color _getSignalColor(int level) {
    if (level >= 80) return Colors.green;
    if (level >= 60) return Colors.lightGreen;
    if (level >= 40) return Colors.orange;
    if (level >= 20) return Colors.deepOrange;
    return Colors.red;
  }

  IconData _getSecurityIcon(WlanDevice device) {
    if (device.authMode == 0 && device.encryptionAlg == 0) {
      return Icons.lock_open; // Open network
    }
    return Icons.lock; // Secured network
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Available WiFi Networks'),
        backgroundColor: Theme.of(context).colorScheme.inversePrimary,
        actions: [
          IconButton(
            icon: const Icon(Icons.refresh),
            onPressed: _isLoading ? null : _scanWifi,
            tooltip: 'Refresh',
          ),
        ],
      ),
      body: _buildBody(),
    );
  }

  Widget _buildBody() {
    if (_isLoading) {
      return const Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            CircularProgressIndicator(),
            SizedBox(height: 16),
            Text('Scanning for WiFi networks...'),
          ],
        ),
      );
    }

    if (_errorMessage != null) {
      return Center(
        child: Padding(
          padding: const EdgeInsets.all(24),
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Icon(Icons.wifi_off, size: 64, color: Colors.grey.shade400),
              const SizedBox(height: 16),
              Text(
                _errorMessage!,
                textAlign: TextAlign.center,
                style: Theme.of(context).textTheme.bodyLarge,
              ),
              const SizedBox(height: 24),
              ElevatedButton.icon(
                onPressed: _scanWifi,
                icon: const Icon(Icons.refresh),
                label: const Text('Scan Again'),
              ),
            ],
          ),
        ),
      );
    }

    if (_devices.isEmpty) {
      return Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(Icons.wifi_off, size: 64, color: Colors.grey.shade400),
            const SizedBox(height: 16),
            const Text('No WiFi networks found'),
            const SizedBox(height: 24),
            ElevatedButton.icon(
              onPressed: _scanWifi,
              icon: const Icon(Icons.refresh),
              label: const Text('Scan Again'),
            ),
          ],
        ),
      );
    }

    return Column(
      children: [
        Padding(
          padding: const EdgeInsets.all(16),
          child: Row(
            children: [
              Icon(Icons.info_outline, color: Colors.blue.shade700),
              const SizedBox(width: 8),
              Expanded(
                child: Text(
                  'Found ${_devices.length} network(s). Tap to configure.',
                  style: TextStyle(color: Colors.blue.shade700),
                ),
              ),
            ],
          ),
        ),
        Expanded(
          child: ListView.builder(
            itemCount: _devices.length,
            itemBuilder: (context, index) {
              final device = _devices[index];
              return _buildDeviceCard(device);
            },
          ),
        ),
      ],
    );
  }

  Widget _buildDeviceCard(WlanDevice device) {
    return Card(
      margin: const EdgeInsets.symmetric(horizontal: 12, vertical: 6),
      child: ListTile(
        leading: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(
              _getSignalIcon(device.signalLevel),
              color: _getSignalColor(device.signalLevel),
              size: 32,
            ),
          ],
        ),
        title: Row(
          children: [
            Expanded(
              child: Text(
                device.ssid,
                style: const TextStyle(
                  fontWeight: FontWeight.bold,
                  fontSize: 16,
                ),
              ),
            ),
            Icon(
              _getSecurityIcon(device),
              size: 20,
              color: Colors.grey.shade600,
            ),
          ],
        ),
        subtitle: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            const SizedBox(height: 4),
            Row(
              children: [
                Icon(Icons.security, size: 14, color: Colors.grey.shade600),
                const SizedBox(width: 4),
                Text(
                  device.securityDescription,
                  style: TextStyle(color: Colors.grey.shade700),
                ),
              ],
            ),
            const SizedBox(height: 2),
            Row(
              children: [
                Icon(
                  Icons.signal_cellular_alt,
                  size: 14,
                  color: Colors.grey.shade600,
                ),
                const SizedBox(width: 4),
                Text(
                  'Signal: ${device.signalLevel}% (${device.signalStrengthDescription})',
                  style: TextStyle(color: Colors.grey.shade700),
                ),
              ],
            ),
          ],
        ),
        trailing: const Icon(Icons.arrow_forward_ios, size: 16),
        onTap: () => _navigateToConfig(device),
      ),
    );
  }
}
