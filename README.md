# dahua_sdk

A new Flutter plugin project.

## Getting Started

This project is a starting point for a Flutter
[plug-in package](https://flutter.dev/to/develop-plugins),
a specialized package that includes platform-specific implementation code for
Android and/or iOS.

For help getting started with Flutter development, view the
[online documentation](https://docs.flutter.dev), which offers tutorials,
samples, guidance on mobile development, and a full API reference.

## iOS live preview (Dahua NetSDK)

This plugin wraps Dahua NetSDK on iOS to log in and start live preview using the following interfaces:

- `CLIENT_LoginWithHighLevelSecurity`
- `CLIENT_RealPlayEx`
- `CLIENT_SetRealDataCallBackEx2`
- `CLIENT_StopRealPlayEx`

From Dart, embed the `DahuaPreview` widget and provide connection parameters. You can also select channel and stream type:

```
import 'package:dahua_sdk/dahua_sdk.dart';

// Initialize once (e.g., in app startup)
await DahuaSdk.init();

// In your widget tree (iOS only)
const DahuaPreview(
	ip: '192.168.1.108',
	port: 37777,
	user: 'admin',
	pass: 'password',
	channel: 0,        // 0-based channel index
	streamType: 0,     // 0=Main, 1=Extra1, 2=Extra2
)
```

Notes:
- Main stream vs. extra stream is selected by `streamType` and maps to `DH_RType_Realplay` (main) or `DH_RType_Realplay_1/2/...` (extra).
- The underlying Objective‑C bridge renders frames using Dahua PLAY SDK into the `UiKitView`.
- When the preview view is disposed, the plugin stops realplay and logs out automatically.

