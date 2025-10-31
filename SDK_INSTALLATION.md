# SDK Installation Guide

## ⚠️ Important: SDK Binaries Required

This Flutter plugin requires Dahua SDK native libraries which are **not included** in the pub.dev package due to size limitations.

## 📦 Installation Steps

### 1. Add the Plugin

Add to your `pubspec.yaml`:

```yaml
dependencies:
  dahua_sdk: ^0.0.1
```

### 2. Download SDK Binaries

Download the SDK binaries from our GitHub Releases:

**👉 [Download SDK v0.0.1](https://github.com/faradzhalelov/dahua_net_sdk/releases/tag/v0.0.1-sdk)**

The release contains:
- `android-libs.zip` - Android native libraries (~240 MB)
- `ios-3rdparty.zip` - iOS native libraries and headers (~180 MB)

### 3. Extract SDK Files

#### For Android:

1. Extract `android-libs.zip`
2. Copy contents to `android/libs/` in your Flutter project:
   ```
   your_project/
   ├── android/
   │   ├── libs/
   │   │   ├── arm64-v8a/
   │   │   ├── armeabi/
   │   │   └── armeabi-v7a/
   ```

#### For iOS:

1. Extract `ios-3rdparty.zip`
2. Copy to `ios/Classes/3rdparty/` in your Flutter project:
   ```
   your_project/
   ├── ios/
   │   ├── Classes/
   │   │   ├── 3rdparty/
   │   │   │   ├── include/
   │   │   │   └── lib/
   ```

### 4. Alternative: Automatic Download Script

You can create a script to automatically download and extract SDK files:

```bash
#!/bin/bash
# download_sdk.sh

SDK_VERSION="v0.0.1-sdk"
GITHUB_REPO="faradzhalelov/dahua_net_sdk"

# Download Android libs
curl -L "https://github.com/${GITHUB_REPO}/releases/download/${SDK_VERSION}/android-libs.zip" -o android-libs.zip
unzip -q android-libs.zip -d android/
rm android-libs.zip

# Download iOS libs
curl -L "https://github.com/${GITHUB_REPO}/releases/download/${SDK_VERSION}/ios-3rdparty.zip" -o ios-3rdparty.zip
unzip -q ios-3rdparty.zip -d ios/Classes/
rm ios-3rdparty.zip

echo "✅ SDK binaries downloaded successfully!"
```

### 5. Update Your Build Configuration

#### Android (`android/build.gradle`):

```gradle
allprojects {
    repositories {
        google()
        mavenCentral()
        flatDir {
            dirs project(':dahua_sdk').file('libs')
        }
    }
}
```

#### iOS (`ios/Podfile`):

The plugin automatically configures the necessary paths in its podspec.

## 🔧 Troubleshooting

### SDK Files Not Found Error

If you see errors like:
- Android: `libnetsdk.so not found`
- iOS: `'netsdk.h' file not found`

**Solution**: Make sure you've downloaded and extracted the SDK binaries to the correct locations.

### Build Fails After Update

1. Clean build:
   ```bash
   flutter clean
   flutter pub get
   ```

2. For Android:
   ```bash
   cd android && ./gradlew clean
   ```

3. For iOS:
   ```bash
   cd ios && pod install --repo-update
   ```

## 📂 Add to .gitignore

**Important**: Don't commit SDK binaries to your repository!

Add these lines to your project's `.gitignore`:

```gitignore
# Dahua SDK binaries (download separately)
android/libs/arm64-v8a/
android/libs/armeabi/
android/libs/armeabi-v7a/
android/libs/*.jar
android/libs/*.aar
ios/Classes/3rdparty/
```

Each developer on your team should run `download_dahua_sdk.sh` after cloning the repository.

## 🔄 CI/CD Integration

For continuous integration, add this step to your workflow before building:

**GitHub Actions:**
```yaml
- name: Download Dahua SDK
  run: |
    curl -L https://raw.githubusercontent.com/faradzhalelov/dahua_net_sdk/main/download_dahua_sdk.sh | bash
```

**GitLab CI:**
```yaml
before_script:
  - curl -L https://raw.githubusercontent.com/faradzhalelov/dahua_net_sdk/main/download_dahua_sdk.sh | bash
```

## 📚 Why Are Binaries Separate?

- **pub.dev size limit**: Maximum 100-200 MB per package
- **SDK size**: Android (~240 MB) + iOS (~180 MB) = ~420 MB total
- **Solution**: Host large binaries on GitHub Releases, keep Dart code on pub.dev

## 🔗 Links

- [GitHub Repository](https://github.com/faradzhalelov/dahua_net_sdk)
- [SDK Releases](https://github.com/faradzhalelov/dahua_net_sdk/releases)
- [Issue Tracker](https://github.com/faradzhalelov/dahua_net_sdk/issues)
- [Example App](https://github.com/faradzhalelov/dahua_net_sdk/tree/main/example)

## ℹ️ SDK Version Information

- **Android SDK**: General_NetSDK_ChnEng_Android_Java_IS_V3.49.29364.T.250724
- **iOS SDK**: Included in 3rdparty libraries
- **Plugin Version**: 0.0.1

## 📄 License

See [LICENSE](LICENSE) file for details.
