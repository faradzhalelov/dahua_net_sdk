# Dahua SDK Flutter Plugin

A Flutter plugin for integrating Dahua WiFi cameras on iOS and Android platforms. This plugin provides live video preview, PTZ (Pan-Tilt-Zoom) control, and camera management capabilities using the official Dahua NetSDK.

## Features

- 📹 **Live Video Streaming**: Real-time video preview from Dahua cameras
- 🎮 **PTZ Control**: Full pan, tilt, and zoom control
- 📱 **Cross-Platform**: Works on both iOS and Android
- 🔄 **Multiple Streams**: Support for main stream and extra streams
- 📺 **Multi-Channel Support**: View multiple camera channels simultaneously
- 🎯 **Easy Integration**: Simple API for quick integration

## Supported Platforms

- ✅ iOS 12.0+
- ✅ Android API 21+ (Android 5.0+)

## Installation

Add this to your package's `pubspec.yaml` file:

```yaml
dependencies:
  dahua_sdk:
    path: ../  # Or use git/pub.dev URL when published
```

Then run:

```bash
flutter pub get
```

### iOS Setup

The plugin uses native iOS frameworks. CocoaPods will automatically link the required Dahua NetSDK libraries.

Minimum iOS deployment target: **12.0**

Update your `ios/Podfile` if needed:

```ruby
platform :ios, '12.0'
```

### Android Setup

The plugin includes the Dahua NetSDK for Android. 

Minimum SDK version: **21** (Android 5.0)

Ensure your `android/app/build.gradle` has:

```gradle
android {
    defaultConfig {
        minSdkVersion 21
    }
}
```

## Usage

### 1. Initialize the SDK

Initialize the SDK before using any camera features:

```dart
import 'package:dahua_sdk/dahua_sdk.dart';

await DahuaSdk.init();
```

### 2. Display Camera Preview

Use the `DahuaPreview` widget to show live video:

```dart
DahuaPreview(
  ip: '192.168.1.108',
  port: 37777,
  user: 'admin',
  pass: 'your_password',
  channel: 0,        // Camera channel (0-based)
  streamType: 0,     // 0=Main stream, 1=Extra stream
)
```

### 3. PTZ Control

Control camera movement:

```dart
// Start moving up
await DahuaSdk.ptz(
  handle: loginHandle,
  cmd: 0,           // 0=Up, 1=Down, 2=Left, 3=Right
  speed: 5,         // Speed: 1-8
  start: true,      // true=start, false=stop
);

// Stop movement
await DahuaSdk.ptz(
  handle: loginHandle,
  cmd: 0,
  speed: 5,
  start: false,
);

// Zoom control
await DahuaSdk.ptz(
  handle: loginHandle,
  cmd: 10,          // 10=Zoom in, 11=Zoom out
  speed: 5,
  start: true,
);
```

### 4. Multiple Camera Views

Display multiple channels or streams:

```dart
Row(
  children: [
    Expanded(
      child: DahuaPreview(
        ip: '192.168.1.108',
        port: 37777,
        user: 'admin',
        pass: 'password',
        channel: 0,
        streamType: 0, // Main stream
      ),
    ),
    Expanded(
      child: DahuaPreview(
        ip: '192.168.1.108',
        port: 37777,
        user: 'admin',
        pass: 'password',
        channel: 0,
        streamType: 1, // Extra stream
      ),
    ),
  ],
)
```

### 5. Cleanup

Clean up resources when done:

```dart
await DahuaSdk.cleanup();
```

## Complete Example

See the [example](example/) directory for a complete application demonstrating:

- Single channel view with PTZ controls
- Dual channel view (horizontal/vertical split)
- Quad channel view (2x2 grid)
- Stream comparison view
- Environment-based configuration

To run the example:

```bash
cd example
cp .env.example .env
# Edit .env with your camera credentials
flutter run
```

### Example .env file

```env
DAHUA_IP=192.168.1.108
DAHUA_PORT=37777
DAHUA_USER=admin
DAHUA_PASS=your_password
```

## API Reference

### DahuaSdk Class

#### Methods

##### `init()`
Initialize the Dahua SDK. Must be called before any other SDK operations.

```dart
await DahuaSdk.init();
```

##### `cleanup()`
Clean up SDK resources. Call when you're done using the SDK.

```dart
await DahuaSdk.cleanup();
```

##### `ptz()`
Control PTZ (Pan-Tilt-Zoom) operations.

```dart
await DahuaSdk.ptz({
  required int handle,      // Login handle from connection
  required int cmd,         // PTZ command code
  int speed = 5,           // Speed: 1-8
  required bool start,      // true to start, false to stop
});
```

**PTZ Command Codes:**
- `0` - Up
- `1` - Down
- `2` - Left
- `3` - Right
- `10` - Zoom In
- `11` - Zoom Out

##### `logs`
Stream of debug log messages from the native SDK.

```dart
DahuaSdk.logs.listen((message) {
  print('SDK Log: $message');
});
```

### DahuaPreview Widget

A widget that displays live video from a Dahua camera.

#### Properties

| Property | Type | Required | Default | Description |
|----------|------|----------|---------|-------------|
| `ip` | String | Yes | - | Camera IP address |
| `port` | int | Yes | - | Camera port (usually 37777) |
| `user` | String | Yes | - | Username for authentication |
| `pass` | String | Yes | - | Password for authentication |
| `channel` | int | No | 0 | Camera channel (0-based) |
| `streamType` | int | No | 0 | Stream type: 0=Main, 1=Extra1, 2=Extra2 |

## Architecture

### Project Structure

```
dahua_sdk/
├── lib/
│   ├── dahua_sdk.dart                    # Main SDK API
│   ├── dahua_sdk_platform_interface.dart # Platform interface
│   └── dahua_sdk_method_channel.dart     # Method channel implementation
├── ios/
│   ├── Classes/
│   │   ├── DahuaSdkPlugin.m             # iOS plugin implementation
│   │   ├── DahuaNetSDKBridge.mm         # Native SDK bridge
│   │   └── DahuaPreviewFactory.m        # Preview view factory
│   └── Assets/                           # Dahua NetSDK frameworks
├── android/
│   ├── src/main/java/                   # Android plugin implementation
│   └── libs/                             # Dahua NetSDK libraries
└── example/                              # Example application
```

### Native SDKs

- **iOS**: Dahua NetSDK for iOS (included in plugin)
- **Android**: Dahua NetSDK for Android (included in plugin)

## Troubleshooting

### iOS Issues

**Issue**: App crashes on first run
- **Solution**: Ensure iOS deployment target is 12.0 or higher

**Issue**: Black screen instead of video
- **Solution**: Check camera credentials and network connectivity

**Issue**: Build errors with CocoaPods
- **Solution**: Run `cd ios && pod install && cd ..`

### Android Issues

**Issue**: Video not displaying
- **Solution**: Verify minSdkVersion is 21 or higher

**Issue**: Connection timeout
- **Solution**: Ensure camera is on the same network and firewall allows port 37777

### General Issues

**Issue**: Cannot connect to camera
- **Solution**: Verify:
  - Camera IP and port are correct
  - Camera is powered on and connected to network
  - Username and password are correct
  - Device can ping the camera IP

**Issue**: PTZ not working
- **Solution**: Ensure your camera model supports PTZ operations

## Performance Tips

1. **Use Extra Stream for Multiple Views**: When displaying multiple camera feeds, use extra streams (streamType: 1) to reduce bandwidth
2. **Limit Concurrent Streams**: Avoid displaying more than 4 simultaneous streams on mobile devices
3. **Close Connections**: Always cleanup when navigating away from camera views
4. **Network Optimization**: Ensure stable WiFi or ethernet connection for best performance

## Requirements

### Runtime Requirements

- Flutter SDK: 3.3.0 or higher
- Dart SDK: 3.9.2 or higher

### Camera Requirements

- Dahua IP Camera with WiFi support
- Firmware version compatible with NetSDK v3.49+
- Network connectivity (same network as device)

## Limitations

- H.265 codec support depends on device hardware capabilities
- Maximum 4 simultaneous video streams recommended on mobile devices
- PTZ control requires camera hardware support
- Some advanced features may require specific camera models

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

TODO: Add your license here.

## Support

For issues and questions:
- Create an issue on GitHub
- Check the [example app](example/) for usage patterns
- Review Dahua camera documentation for camera-specific features

## Credits

This plugin uses the official Dahua NetSDK:
- iOS NetSDK version: 3.49+
- Android NetSDK version: 3.49+

## Changelog

See [CHANGELOG.md](CHANGELOG.md) for version history and updates.
