import 'package:flutter/material.dart';
import 'dart:async';
import 'package:dahua_sdk/dahua_sdk.dart';

class DeviceSearchView extends StatefulWidget {
  const DeviceSearchView({super.key});

  @override
  State<DeviceSearchView> createState() => _DeviceSearchViewState();
}

class _DeviceSearchViewState extends State<DeviceSearchView> {
  final TextEditingController _serialController = TextEditingController();
  final List<DeviceInfo> _foundDevices = [];
  StreamSubscription<DeviceInfo>? _searchSubscription;
  bool _isSearching = false;
  String? _errorMessage;

  @override
  void dispose() {
    _stopSearch();
    _serialController.dispose();
    super.dispose();
  }

  Future<void> _startSearch() async {
    if (_isSearching) return;

    setState(() {
      _isSearching = true;
      _errorMessage = null;
      _foundDevices.clear();
    });

    try {
      _searchSubscription = DahuaSdk.searchDeviceBySerial().listen(
        (device) {
          setState(() {
            // Filter by serial number if specified
            if (_serialController.text.isNotEmpty) {
              if (!device.serialNo.toLowerCase().contains(
                _serialController.text.toLowerCase(),
              )) {
                return; // Skip this device
              }
            }

            // Only add if not already in list
            if (!_foundDevices.any((d) => d.serialNo == device.serialNo)) {
              _foundDevices.add(device);
            }
          });
        },
        onError: (error) {
          setState(() {
            _errorMessage = error.toString();
            _isSearching = false;
          });
        },
      );

      // Auto-stop after 30 seconds
      Future.delayed(const Duration(seconds: 30), () {
        if (_isSearching) {
          _stopSearch();
        }
      });
    } catch (e) {
      setState(() {
        _errorMessage = 'Failed to start search: $e';
        _isSearching = false;
      });
    }
  }

  Future<void> _stopSearch() async {
    if (!_isSearching) return;

    await _searchSubscription?.cancel();
    _searchSubscription = null;
    await DahuaSdk.stopDeviceSearch();

    setState(() {
      _isSearching = false;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Device Search')),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            Card(
              child: Padding(
                padding: const EdgeInsets.all(16.0),
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    const Text(
                      'Search Devices on Network',
                      style: TextStyle(
                        fontSize: 18,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                    const SizedBox(height: 12),
                    TextField(
                      controller: _serialController,
                      decoration: const InputDecoration(
                        labelText: 'Filter by Serial Number (optional)',
                        hintText: 'Enter partial serial number',
                        border: OutlineInputBorder(),
                        prefixIcon: Icon(Icons.filter_alt),
                      ),
                      enabled: !_isSearching,
                    ),
                    const SizedBox(height: 12),
                    const Text(
                      'This will search for all Dahua devices on the local network. '
                      'You can filter results by entering a serial number above.',
                      style: TextStyle(color: Colors.grey, fontSize: 12),
                    ),
                    const SizedBox(height: 16),
                    ElevatedButton.icon(
                      onPressed: _isSearching ? _stopSearch : _startSearch,
                      icon: Icon(_isSearching ? Icons.stop : Icons.search),
                      label: Text(
                        _isSearching ? 'Stop Search' : 'Start Search',
                      ),
                      style: ElevatedButton.styleFrom(
                        minimumSize: const Size.fromHeight(48),
                      ),
                    ),
                  ],
                ),
              ),
            ),
            const SizedBox(height: 16),
            if (_errorMessage != null)
              Card(
                color: Colors.red.shade50,
                child: Padding(
                  padding: const EdgeInsets.all(12.0),
                  child: Row(
                    children: [
                      const Icon(Icons.error, color: Colors.red),
                      const SizedBox(width: 8),
                      Expanded(
                        child: Text(
                          _errorMessage!,
                          style: const TextStyle(color: Colors.red),
                        ),
                      ),
                    ],
                  ),
                ),
              ),
            if (_isSearching)
              const Card(
                child: Padding(
                  padding: EdgeInsets.all(16.0),
                  child: Row(
                    children: [
                      SizedBox(
                        width: 20,
                        height: 20,
                        child: CircularProgressIndicator(strokeWidth: 2),
                      ),
                      SizedBox(width: 12),
                      Text('Searching for devices...'),
                    ],
                  ),
                ),
              ),
            const SizedBox(height: 8),
            Expanded(
              child: _foundDevices.isEmpty
                  ? Center(
                      child: Text(
                        _isSearching
                            ? 'Waiting for devices...'
                            : 'No devices found yet.\nStart search to discover devices.',
                        textAlign: TextAlign.center,
                        style: const TextStyle(color: Colors.grey),
                      ),
                    )
                  : ListView.builder(
                      itemCount: _foundDevices.length,
                      itemBuilder: (context, index) {
                        final device = _foundDevices[index];
                        return Card(
                          child: ListTile(
                            leading: CircleAvatar(
                              backgroundColor: device.initialized
                                  ? Colors.green
                                  : Colors.orange,
                              child: Icon(
                                device.initialized
                                    ? Icons.check
                                    : Icons.settings,
                                color: Colors.white,
                              ),
                            ),
                            title: Text(
                              device.serialNo,
                              style: const TextStyle(
                                fontWeight: FontWeight.bold,
                                fontFamily: 'monospace',
                              ),
                            ),
                            subtitle: Column(
                              crossAxisAlignment: CrossAxisAlignment.start,
                              children: [
                                const SizedBox(height: 4),
                                Text('IP: ${device.ip}:${device.port}'),
                                Text('MAC: ${device.mac}'),
                                if (device.deviceType.isNotEmpty)
                                  Text(
                                    'Type: ${device.deviceType}',
                                    style: const TextStyle(
                                      color: Colors.blue,
                                      fontSize: 12,
                                    ),
                                  ),
                                Text(
                                  device.statusDescription,
                                  style: TextStyle(
                                    color: device.initialized
                                        ? Colors.green
                                        : Colors.orange,
                                    fontWeight: FontWeight.w500,
                                  ),
                                ),
                              ],
                            ),
                            trailing: IconButton(
                              icon: const Icon(Icons.content_copy),
                              onPressed: () {
                                // Copy device info to clipboard
                                ScaffoldMessenger.of(context).showSnackBar(
                                  SnackBar(
                                    content: Text(
                                      'Copied: ${device.ip}:${device.port}',
                                    ),
                                  ),
                                );
                              },
                              tooltip: 'Copy IP:Port',
                            ),
                            isThreeLine: true,
                          ),
                        );
                      },
                    ),
            ),
          ],
        ),
      ),
    );
  }
}
