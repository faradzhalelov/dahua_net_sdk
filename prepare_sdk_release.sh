#!/bin/bash
# prepare_sdk_release.sh
# Script to prepare SDK binaries for GitHub Release

set -e

echo "🔧 Preparing SDK binaries for release..."

SDK_VERSION="v0.0.1-sdk"
OUTPUT_DIR="sdk-release"

# Create output directory
mkdir -p "$OUTPUT_DIR"

# Package Android libraries
echo "📦 Packaging Android libraries..."
if [ -d "android/libs" ]; then
    cd android
    zip -r "../$OUTPUT_DIR/android-libs.zip" libs/ -x "*.DS_Store"
    cd ..
    echo "✅ Created android-libs.zip ($(du -h "$OUTPUT_DIR/android-libs.zip" | cut -f1))"
else
    echo "⚠️  Warning: android/libs not found"
fi

# Package iOS 3rdparty
echo "📦 Packaging iOS libraries..."
if [ -d "ios/Classes/3rdparty" ]; then
    cd ios/Classes
    zip -r "../../$OUTPUT_DIR/ios-3rdparty.zip" 3rdparty/ -x "*.DS_Store"
    cd ../..
    echo "✅ Created ios-3rdparty.zip ($(du -h "$OUTPUT_DIR/ios-3rdparty.zip" | cut -f1))"
else
    echo "⚠️  Warning: ios/Classes/3rdparty not found"
fi

# Package Android SDK example (optional)
echo "📦 Packaging Android SDK example..."
if [ -d "android/sdk_example" ]; then
    cd android
    zip -r "../$OUTPUT_DIR/android-sdk-example.zip" sdk_example/ -x "*.DS_Store" -x "*/build/*"
    cd ..
    echo "✅ Created android-sdk-example.zip ($(du -h "$OUTPUT_DIR/android-sdk-example.zip" | cut -f1))"
fi

# Package iOS SDK example (optional)
echo "📦 Packaging iOS SDK example..."
if [ -d "ios/netsdk" ]; then
    cd ios
    zip -r "../$OUTPUT_DIR/ios-netsdk-example.zip" netsdk/ -x "*.DS_Store" -x "*/build/*"
    cd ..
    echo "✅ Created ios-netsdk-example.zip ($(du -h "$OUTPUT_DIR/ios-netsdk-example.zip" | cut -f1))"
fi

# Create checksums
echo "🔐 Generating checksums..."
cd "$OUTPUT_DIR"
shasum -a 256 *.zip > checksums.txt
cd ..

echo ""
echo "✅ SDK release packages prepared in: $OUTPUT_DIR/"
echo ""
echo "📋 Files created:"
ls -lh "$OUTPUT_DIR"
echo ""
echo "📝 Next steps:"
echo "1. Create a new release on GitHub: https://github.com/faradzhalelov/dahua_net_sdk/releases/new"
echo "2. Tag: $SDK_VERSION"
echo "3. Title: 'SDK Binaries v0.0.1'"
echo "4. Upload all files from $OUTPUT_DIR/"
echo "5. Add release notes from SDK_INSTALLATION.md"
echo ""
echo "🔗 After release, users can download from:"
echo "https://github.com/faradzhalelov/dahua_net_sdk/releases/tag/$SDK_VERSION"
