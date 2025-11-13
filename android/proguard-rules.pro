# Dahua SDK ProGuard Rules
# Keep all Dahua SDK classes and methods as they are used via JNI
-keep class com.company.NetSDK.** { *; }
-keep class com.company.PlaySDK.** { *; }
-keep class com.company.SmartConfig.** { *; }
-keep class com.company.CodecSDK.** { *; }

# Keep our plugin classes
-keep class com.dahua.sdk.dahua_sdk.** { *; }

# Keep native methods
-keepclasseswithmembernames class * {
    native <methods>;
}
