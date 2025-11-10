# Device Search Feature

## Overview
The Device Search feature allows discovering Dahua devices on the local network without knowing their IP addresses. This implementation is based on both `SearchDeviceViewController` (full device list) and `DeviceInfoViewController` (specific device search) from the iOS SDK demo.

## Implementation Details

### Native iOS Bridge (DahuaNetSDKBridge)

#### Data Structures
```objectivec
// Device information structure
typedef struct {
    char serialNo[128];  // Device serial number
    char ip[64];         // IP address
    char mac[64];        // MAC address
    int port;            // Network port
    bool initialized;    // Device initialization status
    int ipVersion;       // 4 for IPv4, 6 for IPv6
    char deviceType[64]; // Device type/model string
} DHDeviceInfo;

// Callback type for search results
typedef void (*DHDeviceSearchCallback)(const DHDeviceInfo* deviceInfo, void* userData);
```

#### Functions
- `DHHandle dh_start_search_devices(DHDeviceSearchCallback callback, void* userData)`
  - Starts network device search
  - Calls callback for each discovered device
  - Returns search handle (0 on failure)
  - **Filters IPv4 only** (like SearchDeviceViewController)
  
- `void dh_stop_search_devices(DHHandle searchHandle)`
  - Stops active search
  - Frees search resources

#### Key Features
- **IPv4 Filter**: Only processes IPv4 devices (`iIPVersion == 4`)
- **Device Type Detection**: Captures device model/type from SDK
- **Initialization Status**: Detects if device needs setup
- **Detailed Logging**: Logs each discovered device with full info

### Flutter Plugin (DahuaSdkPlugin)

#### EventChannel Implementation
- **Channel Name**: `dahua_sdk/device_search`
- **Stream Handler**: Implements `FlutterStreamHandler` protocol
  - `onListenWithArguments`: Starts device search and registers event sink
  - `onCancelWithArguments`: Stops search and cleans up

#### Search Callback Bridge
The native C callback is bridged to Flutter streams:
```objectivec
static void DeviceSearchStreamCallback(const DHDeviceInfo* deviceInfo, void* userData) {
    // Convert DHDeviceInfo to NSDictionary
    // Send to Flutter via s_deviceSearchEventSink on main thread
}
```

### Dart API (dahua_sdk.dart)

#### DeviceInfo Model
```dart
class DeviceInfo {
  final String serialNo;
  final String ip;
  final String mac;
  final int port;
  final bool initialized;
  final int ipVersion;      // 4 or 6
  final String deviceType;  // Device model/type
  
  // Helper properties
  String get statusDescription;  // Human-readable status
  bool get isIPv4;
  bool get isIPv6;
}
```

#### Methods
- `Stream<DeviceInfo> searchDeviceBySerial()`
  - Returns broadcast stream of discovered devices
  - Automatically starts search when subscribed
  - No duplicate devices in stream
  - **Only IPv4 devices** are returned
  
- `Future<void> stopDeviceSearch()`
  - Manually stops active search
  - Called automatically when stream subscription is cancelled

### UI (DeviceSearchView)

#### Features
- **Serial Number Filter**: Optional text field to filter devices by SN
- Start/Stop search button
- Auto-stop after 30 seconds
- Real-time device list updates
- Device status indicators (initialized/not initialized)
- **Device Type Display**: Shows device model/type if available
- Copy IP:Port to clipboard
- Error handling and display

#### Device Card Information
- Serial number (monospace font)
- IP address and port
- MAC address
- **Device Type** (if available, shown in blue)
- Initialization status with color coding:
  - 🟢 Green: "Ready to use"
  - 🟠 Orange: "Not initialized - Setup required"

## Usage Example

```dart
// Search all devices on network
final searchStream = DahuaSdk.searchDeviceBySerial();
final subscription = searchStream.listen((device) {
  print('Found device: ${device.serialNo} at ${device.ip}:${device.port}');
  print('Device Type: ${device.deviceType}');
  print('Status: ${device.statusDescription}');
  
  if (device.isIPv4) {
    print('IPv4 device');
  }
});

// Stop search after 10 seconds
await Future.delayed(Duration(seconds: 10));
await subscription.cancel();
await DahuaSdk.stopDeviceSearch();
```

## Technical Notes

### SDK Integration
- Uses `CLIENT_StartSearchDevices` from Dahua NetSDK
- Converts `DEVICE_NET_INFO_EX` to `DHDeviceInfo`
- **IPv4 Filter**: `if (pDevNetInfo->iIPVersion != 4) return;`
- Handles both initialized and uninitialized devices
- Extracts device type from `szDeviceType` field

### Device Filtering
Based on `SearchDeviceViewController.mm`:
- Only IPv4 devices are processed
- Duplicates are filtered by serial number
- Empty MAC or IP addresses are skipped

### Initialization Status
Based on `DeviceInfoViewController.mm`:
```objectivec
// byInitStatus & 0x01 == 0 means not initialized
// (byInitStatus >> 1) & 0x01 == 1 means can be initialized
initialized = !((byInitStatus & 0x01) == 0 && ((byInitStatus >> 1) & 0x01) == 1)
```

### Memory Management
- SearchContext wrapper manages callback lifecycle
- Automatic cleanup on stream cancellation
- Static handle prevents multiple concurrent searches

### Threading
- Callbacks executed on background thread
- Results dispatched to main thread for Flutter
- Event sink access synchronized via dispatch_async

### Simulator Support
- Simulator stubs return 0 (no devices found)
- Real implementation only on physical devices
- Conditional compilation via TARGET_OS_SIMULATOR

## Testing Checklist

- [ ] Device discovery on same network (IPv4 only)
- [ ] Multiple devices discovered simultaneously
- [ ] Serial number accuracy
- [ ] IP/MAC address format validation
- [ ] Port number correctness
- [ ] Device type detection and display
- [ ] Initialization status detection
- [ ] Serial number filter functionality
- [ ] Case-insensitive filtering
- [ ] Start/stop search functionality
- [ ] Auto-stop after timeout
- [ ] No duplicate devices in list
- [ ] IPv6 devices filtered out
- [ ] Error handling and display
- [ ] Stream cancellation cleanup
- [ ] Memory leak verification

## Reference Implementation

This feature is based on two iOS SDK demo files:

1. **SearchDeviceViewController.mm**: 
   - Full device list with table view
   - Duplicate filtering using std::list
   - IPv4-only filter
   - Start/Stop toggle functionality

2. **DeviceInfoViewController.mm**:
   - Serial number input with QR scanner
   - Specific device search with timeout
   - Initialization status check
   - Direct navigation to WiFi config after login

### Key Differences from Reference

| Feature | SearchDeviceViewController | DeviceInfoViewController | Our Implementation |
|---------|---------------------------|-------------------------|-------------------|
| Search Type | All devices | Specific device by SN | All + Optional filter |
| UI | Native UITableView | Native UITextField + Scanner | Flutter widgets |
| Duplicate Filter | C++ std::list | Boolean flag | Dart List.any() |
| IPv Filter | IPv4 only | IPv4 only | IPv4 only |
| Auto-stop | Manual only | 5 seconds | 30 seconds |
| Device Info | IP + SN | IP + SN + Login | IP + SN + Type + Status |

## Known Limitations

1. **Network Scope**: Only discovers devices on local subnet
2. **IPv4 Only**: IPv6 devices are filtered out (following SDK demo pattern)
3. **Search Duration**: SDK-dependent timeout (typically 5-10 seconds per cycle)
4. **Concurrent Searches**: Only one active search at a time
5. **Platform Support**: iOS implementation complete, Android pending

## Future Enhancements

- [ ] Add QR code scanner for serial number input (like DeviceInfoViewController)
- [ ] Save discovered devices to local storage for quick access
- [ ] Android platform implementation
- [ ] Search progress indicator with device count
- [ ] Export device list to CSV/JSON
- [ ] Device grouping by subnet or type
- [ ] Direct login navigation from device list (like DeviceInfoViewController)
- [ ] Support for IPv6 devices (optional toggle)
- [ ] Adjustable search timeout in UI
- [ ] Device refresh/re-scan functionality

## Related SDK Demo Files

- `ios/netsdk/SearchDeviceViewController.h/mm` - Main reference for device list UI
- `ios/netsdk/DeviceInfoViewController.h/mm` - Reference for SN-based search
- Uses `CLIENT_StartSearchDevices` and `CLIENT_StopSearchDevices` from netsdk.h
- Processes `DEVICE_NET_INFO_EX` structure from SDK callbacks
