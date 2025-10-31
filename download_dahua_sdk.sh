#!/bin/bash
# download_dahua_sdk.sh
# Automatically download and install Dahua SDK binaries
# Place this script in your Flutter project root and run it after adding dahua_sdk dependency

set -e

SDK_VERSION="v0.0.1-sdk"
GITHUB_REPO="faradzhalelov/dahua_net_sdk"
BASE_URL="https://github.com/${GITHUB_REPO}/releases/download/${SDK_VERSION}"

echo "📥 Downloading Dahua SDK binaries..."
echo "Version: $SDK_VERSION"
echo ""

# Function to check if command exists
command_exists() {
    command -v "$1" >/dev/null 2>&1
}

# Check dependencies
if ! command_exists curl; then
    echo "❌ Error: curl is required but not installed."
    exit 1
fi

if ! command_exists unzip; then
    echo "❌ Error: unzip is required but not installed."
    exit 1
fi

# Create temp directory
TEMP_DIR=$(mktemp -d)
trap "rm -rf $TEMP_DIR" EXIT

# Download Android libraries
echo "📦 Downloading Android libraries..."
curl -L --progress-bar "${BASE_URL}/android-libs.zip" -o "${TEMP_DIR}/android-libs.zip"

echo "📦 Extracting Android libraries..."
mkdir -p android
unzip -q "${TEMP_DIR}/android-libs.zip" -d android/
echo "✅ Android libraries installed to android/libs/"

# Download iOS libraries
echo "📦 Downloading iOS libraries..."
curl -L --progress-bar "${BASE_URL}/ios-3rdparty.zip" -o "${TEMP_DIR}/ios-3rdparty.zip"

echo "📦 Extracting iOS libraries..."
mkdir -p ios/Classes
unzip -q "${TEMP_DIR}/ios-3rdparty.zip" -d ios/Classes/
echo "✅ iOS libraries installed to ios/Classes/3rdparty/"

echo ""
echo "✅ Dahua SDK binaries downloaded and installed successfully!"
echo ""
echo "📋 Next steps:"
echo "1. Run: flutter pub get"
echo "2. For iOS: cd ios && pod install"
echo "3. Build your app: flutter run"
echo ""
echo "📚 For more information, see: https://github.com/${GITHUB_REPO}"
