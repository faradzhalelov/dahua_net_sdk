# dahua_sdk - Android Plugin

This folder contains the Android implementation of the Dahua SDK Flutter plugin.

## Structure

```
android/
├── src/main/
│   ├── AndroidManifest.xml          # Plugin manifest
│   └── kotlin/com/dahua/sdk/dahua_sdk/
│       ├── DahuaSdkPlugin.kt        # Main plugin class
│       ├── DahuaNetSDKBridge.kt     # SDK wrapper
│       ├── DahuaPreviewFactory.kt   # Platform view factory
│       └── DahuaPreviewView.kt      # Camera preview view
├── libs/                            # Dahua SDK libraries (JARs + native .so)
│   ├── INetSDK.jar
│   ├── IPlaySDK.jar
│   ├── arm64-v8a/
│   ├── armeabi-v7a/
│   └── armeabi/
├── build.gradle                     # Build configuration
└── gradle.properties                # Gradle properties
```

## Integration

The plugin mirrors the iOS implementation:

1. **DahuaSdkPlugin**: Handles method channel calls (init, cleanup, ptz, getPlatformVersion)
2. **DahuaNetSDKBridge**: Wraps Dahua NetSDK and PlaySDK native libraries
3. **DahuaPreviewView**: Provides camera preview using SurfaceView and Platform Views
4. **DahuaPreviewFactory**: Factory for creating preview views

## Native Libraries

The plugin uses the following Dahua SDK libraries:
- `INetSDK.jar` - Network SDK Java wrapper
- `IPlaySDK.jar` - Playback SDK Java wrapper
- `libnetsdk.so` - Core network SDK (ARM)
- `libplay.so` - Playback decoder (ARM)
- `libconfigsdk.so` - Configuration SDK (ARM)
- Additional support libraries (.so files)

## Usage in Example App

The example app in `/example` demonstrates usage. To integrate in your own Flutter app:

1. Add to `pubspec.yaml`:
```yaml
dependencies:
  dahua_sdk:
    path: ../
```

2. Use in your app:
```dart
import 'package:dahua_sdk/dahua_sdk.dart';

// Initialize SDK
await DahuaSdk.init();

// Show camera preview
DahuaPreview(
  ip: '192.168.1.108',
  port: 37777,
  user: 'admin',
  pass: 'password',
  channel: 0,
  streamType: 0, // 0=Main, 1=Extra1, 2=Extra2
)
```

## Permissions

The plugin requires the following permissions in your app's `AndroidManifest.xml`:

```xml
<uses-permission android:name="android.permission.INTERNET"/>
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
```

## Build Requirements

- Android SDK 21+
- Kotlin 1.7.10+
- Gradle 7.3.0+
- NDK for ARM architectures (arm64-v8a, armeabi-v7a)
