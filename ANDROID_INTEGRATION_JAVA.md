# Android Integration Guide for Dahua SDK Plugin

This plugin provides native Android integration for Dahua camera SDK, written in Java.

## Architecture

The plugin consists of the following components:

### 1. **DahuaSdkPlugin.java**
- Main Flutter plugin class
- Handles method channel communication between Flutter and native Android
- Registers the platform view factory for video preview
- Provides static `emitLog()` method for native-to-Dart logging

### 2. **DahuaNetSDKBridge.java**
- Bridge between Flutter plugin and Dahua NetSDK
- Manages SDK lifecycle (init, cleanup)
- Handles device login/logout
- Controls real-time video playback
- Provides PTZ (Pan-Tilt-Zoom) control

### 3. **DahuaPreviewFactory.java**
- Factory class for creating native preview views
- Implements Flutter's PlatformViewFactory

### 4. **DahuaPreviewView.java**
- Native Android view for displaying video stream
- Uses SurfaceView for video rendering
- Manages PlaySDK for video decoding
- Handles data callbacks from NetSDK

## Native Libraries

The plugin uses the following Dahua native libraries:
- `libnetsdk.so` - Network SDK for device communication
- `libconfigsdk.so` - Configuration SDK
- `libplay.so` - Play SDK for video decoding
- `libavnetsdk.so` - Audio/Video network SDK

Libraries are located in:
```
android/libs/arm64-v8a/
android/libs/armeabi-v7a/
```

## Java Dependencies

The plugin depends on the following JAR files:
- `INetSDK.jar` - NetSDK Java interface
- `IPlaySDK.jar` - PlaySDK Java interface
- `SmartConfig.jar` - Smart configuration
- `audiopairsdk.jar` - Audio pairing
- `libToUProxy.jar` - Proxy library
- `zxing.jar` - QR code scanning
- `Android_DataGridView-1.01.aar` - Data grid view

## Usage in Flutter

### Initialize SDK
```dart
await DahuaSdk.init();
```

### Create Preview Widget
```dart
DahuaPreview(
  ip: '192.168.1.100',
  port: 37777,
  user: 'admin',
  pass: 'password',
  channel: 0,        // Camera channel (0-based)
  streamType: 0,     // 0=Main, 1=Extra1, 2=Extra2
)
```

### PTZ Control
```dart
await DahuaSdk.ptz(
  handle: loginHandle,
  cmd: ptzCommand,
  speed: 5,
  start: true,
);
```

### Cleanup
```dart
await DahuaSdk.cleanup();
```

## Video Stream Types

- `0` - Main Stream (High resolution)
- `1` - Extra Stream 1 (Sub stream, lower resolution)
- `2` - Extra Stream 2 (Mobile stream, lowest resolution)
- `3` - Extra Stream 3 (if supported)

## Threading Model

- **Main Thread**: UI operations, SurfaceView rendering
- **Executor Thread**: SDK operations (login, real play, cleanup)
- **Callback Thread**: Video data reception from NetSDK

## Data Flow

```
Dahua Camera
    ↓
NetSDK (RealPlay)
    ↓
fRealDataCallBackEx callback
    ↓
PlaySDK (PLAYInputData)
    ↓
SurfaceView (rendering)
```

## Error Handling

All errors are logged through `DahuaSdkPlugin.emitLog()` which sends logs to:
1. Android Logcat (via Log.d/Log.e)
2. Flutter console (via method channel `debugLog`)

Monitor logs with:
```bash
adb logcat | grep DahuaSdk
```

Or in Flutter:
```dart
DahuaSdk.logs.listen((log) {
  print(log);
});
```

## Build Configuration

The plugin requires:
- `minSdkVersion 21` (Android 5.0)
- `targetSdkVersion 34` (Android 14)
- `compileSdkVersion 34`
- Java 8 compatibility

## Permissions

Add to your app's `AndroidManifest.xml`:
```xml
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
```

## Troubleshooting

### Video not displaying
- Check network connectivity to camera
- Verify camera IP, port, username, password
- Check if camera supports the requested stream type
- Monitor logs for error messages

### Native library not found
- Ensure native libraries exist in `libs/arm64-v8a` and `libs/armeabi-v7a`
- Check ABI filters in build.gradle match your device

### Black screen
- Wait for surface to be created (callbacks in SurfaceHolder)
- Ensure PlaySDK port was successfully opened
- Check if real play handle is valid (non-zero)

## Example

See the example app in `example/` directory for a complete implementation showing:
- Single camera preview
- Dual camera preview
- Connection management
- Error handling
- Log monitoring
