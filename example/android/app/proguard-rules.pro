## Minimal ProGuard rules for the example app
# Keep common Flutter embedding classes and plugins. Adjust if you add more libraries

# Keep Flutter embedding classes
-keep class io.flutter.embedding.** { *; }
-dontwarn io.flutter.embedding.**

# Keep plugin registrant (older Flutter projects)
-keep class io.flutter.app.** { *; }

# Dahua SDK native bridges may use reflection; keep bridge classes if necessary.
# If you observe missing methods after shrinking, add keep rules for the relevant classes.

# Keep JNI bridge classes used by the Dahua plugin
-keep class com.dahua.sdk.dahua_sdk.** { *; }
