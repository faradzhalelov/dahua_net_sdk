# Changelog

All notable changes to the Dahua SDK Flutter Plugin will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [0.0.2] - 2025-12-01

### Added

#### WiFi Camera Configuration (AP Mode)
- ✨ `startSmartConfig()` - Start WiFi Smart Configuration for cameras in AP mode
- ✨ `stopSmartConfig()` - Stop WiFi Smart Configuration
- ✨ `configDeviceWifi()` - Configure camera WiFi settings with timeout
- ✨ `getDevWifiList()` - Get available WiFi networks from camera (without login)
- ✨ `initDeviceAccount()` - Initialize device admin account (first-time setup)
- ✨ `modifyDevicePassword()` - Change device password for initialized devices
- ✨ `searchDeviceBySerial()` - Stream-based device discovery on local network
- ✨ `stopDeviceSearch()` - Stop device discovery
- ✨ `getWlanConfig()` - Get current WiFi configuration from device
- ✨ `setWlanConfig()` - Set WiFi configuration to device
- ✨ `scanWlanDevices()` - Scan for available WiFi networks via device

#### Models
- `WlanConfig` - WiFi configuration model with auth mode and encryption
- `WlanDevice` - WiFi network info (SSID, signal level, security)
- `DeviceInfo` - Device discovery result (serial, IP, MAC, init status)
- `WlanAuthMode` - Enum for WiFi authentication modes
- `WlanEncryptionAlg` - Enum for WiFi encryption algorithms

### Fixed
- 🐛 iOS build errors with missing `searchIPCWifi.h` include
- 🐛 Added simulator stubs for all WiFi configuration functions
- 🐛 Fixed `CLIENT_StartSearchIPCWifi`, `CLIENT_StopSearchIPCWifi`, `CLIENT_ConfigIPCWifi` undefined symbols
- 🐛 Fixed missing simulator stubs for `dh_init_device_account`, `dh_modify_device_password`

### Documentation
- 📚 Added iOS Local Network Access setup instructions
- 📚 Added Multicast Entitlement requirements for device discovery
- 📚 Added direct IP connection examples as alternative to broadcast discovery
- 📚 Added WiFi camera configuration (AP mode) usage examples

---

## [0.0.1] - 2025-10-31

### Added

#### Core Features
- ✨ Initial release of Dahua SDK Flutter Plugin
- 📹 Live video streaming support for Dahua WiFi cameras
- 🎮 PTZ (Pan-Tilt-Zoom) control functionality
- 📱 Cross-platform support for iOS and Android
- 🔄 Multiple stream types support (main stream and extra streams)
- 📺 Multi-channel camera support

#### iOS Implementation
- Native iOS plugin integration with Dahua NetSDK v3.49+
- `DahuaSdkPlugin` for method channel communication
- `DahuaNetSDKBridge` for native SDK operations
- `DahuaPreviewFactory` for UiKitView rendering
- Automatic SDK initialization and cleanup
- Real-time video decoding and rendering
- PTZ command execution via native bridge

#### Android Implementation
- Native Android plugin integration with Dahua NetSDK v3.49+
- PlatformView support for video rendering
- Multi-architecture support (armeabi-v7a, arm64-v8a)
- Native library bundling and automatic loading
- Stream management and connection handling

#### Flutter SDK
- `DahuaSdk` class with static methods for SDK operations
- `DahuaPreview` widget for live video display
- Method channel communication between Dart and native platforms
- Debug logging stream for monitoring SDK operations
- Platform interface for extensibility

#### Example Application
- Comprehensive example app showcasing all features
- Single channel view with PTZ controls
- Dual channel view (horizontal/vertical split layouts)
- Quad channel view (2x2 grid layout)
- Stream comparison view (main vs extra stream)
- Environment-based configuration (.env support)
- MVVM architecture with ViewModels
- Reusable UI components and widgets

#### Documentation
- Comprehensive README with usage examples
- API reference documentation
- Troubleshooting guide
- Performance optimization tips
- Installation instructions for iOS and Android

### Features Details

#### Video Streaming
- Support for H.264/H.265 video codecs
- Multiple resolution support
- Frame rate optimization
- Automatic reconnection on connection loss
- Buffer management for smooth playback

#### PTZ Control
- Directional control (up, down, left, right)
- Zoom control (zoom in, zoom out)
- Variable speed control (1-8 speed levels)
- Start/stop command support
- Real-time command execution

#### Multi-View Support
- Single camera view with full controls
- Dual camera split view
- Quad camera grid view
- Stream comparison mode
- Dynamic layout switching
- Independent stream management per view

#### Configuration
- IP address and port configuration
- User authentication support
- Channel selection (0-based indexing)
- Stream type selection (main/extra)
- Environment variable support
- Persistent configuration management

### Platform Support

#### iOS
- Minimum deployment target: iOS 12.0
- CocoaPods integration
- Native framework bundling
- UiKitView for video rendering
- Background thread handling
- Memory management optimizations

#### Android
- Minimum SDK version: API 21 (Android 5.0)
- Gradle build integration
- Multi-architecture AAR libraries
- PlatformView for video rendering
- Native JNI bindings
- Lifecycle-aware cleanup

### Technical Specifications

#### Dependencies
- Flutter SDK: 3.3.0+
- Dart SDK: 3.9.2+
- iOS: Dahua NetSDK v3.49.29364+
- Android: Dahua NetSDK v3.49.29364+
- flutter_dotenv: ^6.0.0 (example app)

#### Architecture
- Plugin architecture using Platform Channels
- Method channel for bidirectional communication
- Platform views for native UI embedding
- Stream controllers for log broadcasting
- Factory pattern for view creation

### Known Limitations
- Maximum 4 simultaneous video streams recommended on mobile devices
- H.265 codec support depends on device hardware capabilities
- PTZ functionality requires camera hardware support
- Network latency affects video quality and PTZ responsiveness

### Development Tools
- Example app with hot reload support
- Debug logging for troubleshooting
- macOS log streaming script (`watch_logs.sh`)
- Environment-based configuration for testing

### Future Roadmap
- Audio support (bidirectional talk)
- Snapshot/screenshot capture
- Video recording functionality
- Playback of recorded footage
- Motion detection events
- Alarm event handling
- Device configuration management
- Network bandwidth optimization
- More PTZ presets and patterns

---

## [Unreleased]

### Planned Features
- Audio streaming support
- Video snapshot capture
- Motion detection callbacks
- Alarm event listeners
- Advanced configuration options
- Performance metrics and monitoring
- Enhanced error handling and recovery
- Video recording to file
- Playback of recorded footage

---

**Note**: This is the initial release. Future versions will include additional features, bug fixes, and performance improvements based on user feedback and requirements.

For detailed usage instructions, see [README.md](README.md).

For issues and feature requests, please create an issue on GitHub. 
