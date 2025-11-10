# Device Search Feature

## Overview
The Device Search feature allows discovering Dahua devices on the local network without knowing their IP addresses. This is useful for initial device setup and configuration.

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
} DHDeviceInfo;

// Callback type for search results
typedef void (*DHDeviceSearchCallback)(const DHDeviceInfo* deviceInfo, void* userData);
```

#### Functions
- `DHHandle dh_start_search_devices(DHDeviceSearchCallback callback, void* userData)`
  - Starts network device search
  - Calls callback for each discovered device
  - Returns search handle (0 on failure)
  
- `void dh_stop_search_devices(DHHandle searchHandle)`
  - Stops active search
  - Frees search resources

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
}
```

#### Methods
- `Stream<DeviceInfo> searchDeviceBySerial()`
  - Returns broadcast stream of discovered devices
  - Automatically starts search when subscribed
  - No duplicate devices in stream
  
- `Future<void> stopDeviceSearch()`
  - Manually stops active search
  - Called automatically when stream subscription is cancelled

### UI (DeviceSearchView)

#### Features
- Start/Stop search button
- Auto-stop after 30 seconds
- Real-time device list updates
- Device status indicators (initialized/not initialized)
- Copy IP:Port to clipboard
- Error handling and display

#### Device Card Information
- Serial number (monospace font)
- IP address and port
- MAC address
- Initialization status with color coding:
  - 🟢 Green: Initialized device
  - 🟠 Orange: Not initialized

## Usage Example

```dart
// Start device search
final searchStream = DahuaSdk.searchDeviceBySerial();
final subscription = searchStream.listen((device) {
  print('Found device: ${device.serialNo} at ${device.ip}:${device.port}');
  if (device.initialized) {
    print('Device is initialized and ready');
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
- Handles both initialized and uninitialized devices

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

- [ ] Device discovery on same network
- [ ] Multiple devices discovered
- [ ] Serial number accuracy
- [ ] IP/MAC address format
- [ ] Port number correctness
- [ ] Initialization status detection
- [ ] Start/stop search functionality
- [ ] Auto-stop after timeout
- [ ] No duplicate devices in list
- [ ] Error handling and display
- [ ] Stream cancellation cleanup
- [ ] Memory leak verification

## Known Limitations

1. **Network Scope**: Only discovers devices on local subnet
2. **Search Duration**: SDK-dependent timeout (typically 5-10 seconds per cycle)
3. **Concurrent Searches**: Only one active search at a time
4. **Platform Support**: iOS implementation complete, Android pending

## Future Enhancements

- [ ] Add QR code scanner for direct serial number input
- [ ] Filter devices by serial number pattern
- [ ] Save discovered devices for quick access
- [ ] Android platform implementation
- [ ] Search progress indicator with device count
- [ ] Export device list to file
- [ ] Device grouping by subnet
