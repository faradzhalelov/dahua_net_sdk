# Changelog

All notable changes to the Dahua SDK Flutter Plugin will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

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
- Device search and discovery
- Advanced configuration options
- Performance metrics and monitoring
- Enhanced error handling and recovery

---

**Note**: This is the initial release. Future versions will include additional features, bug fixes, and performance improvements based on user feedback and requirements.

For detailed usage instructions, see [README.md](README.md).

For issues and feature requests, please create an issue on GitHub. 
