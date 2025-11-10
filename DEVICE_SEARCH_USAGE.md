# Device Search Usage Guide

## Quick Start

### 1. Start Device Search

Open the example app and tap **"Device Search (Network Discovery)"** button on the home screen.

### 2. Filter by Serial Number (Optional)

Enter partial serial number in the filter field to search for specific devices:
- Case-insensitive search
- Matches partial serial numbers
- Leave empty to see all devices

### 3. Start Scanning

Tap **"Start Search"** button. The app will:
- Scan local network for Dahua devices
- Display found devices in real-time
- Show device information:
  - Serial Number
  - IP Address and Port
  - MAC Address
  - Device Type/Model
  - Initialization Status

### 4. Device Status

Each device shows one of two statuses:

🟢 **Ready to use** - Device is initialized and can be connected
🟠 **Not initialized - Setup required** - Device needs initial configuration

### 5. Copy Device Information

Tap the copy icon (📋) on any device to copy its `IP:Port` to clipboard for quick connection setup.

### 6. Stop Search

- Tap **"Stop Search"** to manually stop
- Search automatically stops after 30 seconds

## Programmatic Usage

### Basic Search

```dart
import 'package:dahua_sdk/dahua_sdk.dart';

// Start search and listen for devices
final subscription = DahuaSdk.searchDeviceBySerial().listen((device) {
  print('Found: ${device.serialNo}');
  print('IP: ${device.ip}:${device.port}');
  print('Type: ${device.deviceType}');
  print('Status: ${device.statusDescription}');
});

// Stop after 10 seconds
await Future.delayed(Duration(seconds: 10));
await subscription.cancel();
await DahuaSdk.stopDeviceSearch();
```

### Filter Devices in Code

```dart
final subscription = DahuaSdk.searchDeviceBySerial().listen((device) {
  // Only process initialized devices
  if (device.initialized) {
    print('Ready device: ${device.serialNo} at ${device.ip}');
  }
  
  // Filter by device type
  if (device.deviceType.contains('IPC')) {
    print('Found IP Camera: ${device.serialNo}');
  }
  
  // Only IPv4
  if (device.isIPv4) {
    // Connect to device...
  }
});
```

### Integration with Login

```dart
// Find device and login
DeviceInfo? targetDevice;
final subscription = DahuaSdk.searchDeviceBySerial().listen((device) {
  if (device.serialNo == 'YOUR_SERIAL_NUMBER' && device.initialized) {
    targetDevice = device;
  }
});

// Wait for device
await Future.delayed(Duration(seconds: 5));
await DahuaSdk.stopDeviceSearch();
await subscription.cancel();

if (targetDevice != null) {
  // Login to found device
  final handle = await DahuaSdk.login(
    ip: targetDevice!.ip,
    port: targetDevice!.port,
    user: 'admin',
    pass: 'password',
  );
  
  if (handle > 0) {
    print('Connected successfully!');
  }
}
```

## Notes

- **Network**: Device must be on the same local network
- **IPv4 Only**: Only IPv4 devices are discovered (IPv6 filtered out)
- **Duplicates**: Automatically filtered - each device appears once
- **Performance**: Search uses broadcast, may take 5-10 seconds to find all devices
- **Connection**: Search doesn't require existing device connection

## Troubleshooting

### No Devices Found

1. Check device is powered on
2. Verify device is on same network
3. Check firewall settings
4. Ensure device has IPv4 address
5. Try increasing search timeout

### Duplicate Devices

This shouldn't happen - duplicates are filtered by serial number. If you see duplicates, please report as a bug.

### Device Shows "Not Initialized"

This device needs initial setup:
1. Connect to device using its IP
2. Complete initialization wizard
3. Set admin password
4. Configure basic settings

### Search Times Out

- Default timeout: 30 seconds
- SDK typically finds devices within 5-10 seconds
- Network congestion may slow discovery
- Some devices respond slower than others

## API Reference

### DeviceInfo Properties

| Property | Type | Description |
|----------|------|-------------|
| serialNo | String | Device serial number |
| ip | String | IPv4 address |
| mac | String | MAC address |
| port | int | Network port (usually 37777) |
| initialized | bool | Device initialization status |
| ipVersion | int | 4 for IPv4, 6 for IPv6 |
| deviceType | String | Device model/type |
| statusDescription | String | Human-readable status |
| isIPv4 | bool | True if IPv4 device |
| isIPv6 | bool | True if IPv6 device |

### Methods

| Method | Returns | Description |
|--------|---------|-------------|
| searchDeviceBySerial() | Stream&lt;DeviceInfo&gt; | Start device search |
| stopDeviceSearch() | Future&lt;void&gt; | Stop active search |
