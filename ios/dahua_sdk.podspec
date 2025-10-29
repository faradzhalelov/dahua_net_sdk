Pod::Spec.new do |s|
  s.name             = 'dahua_sdk'
  s.version          = '0.0.1'
  s.summary          = 'Dahua camera SDK plugin.'
  s.homepage         = 'https://yourcompany.com'
  s.license          = { :file => '../LICENSE' }
  s.author           = { 'Your Company' => 'email@example.com' }
  s.source           = { :path => '.' }
  
  s.source_files = 'Classes/**/*.{h,m,mm}'
  # Only expose plugin headers, not third-party SDK headers, to avoid
  # forcing the module to parse vendor C/C++ headers in Simulator builds.
  s.public_header_files = 'Classes/Dahua*.h'
  
  s.ios.deployment_target = '13.0'
  
  # Пути поиска заголовков SDK
  s.xcconfig = {
    'HEADER_SEARCH_PATHS' => [
      '"$(PODS_TARGET_SRCROOT)/Classes/3rdparty/include"',
      '"$(PODS_TARGET_SRCROOT)/Classes/3rdparty/include/**"'
    ].join(' '),
    'LIBRARY_SEARCH_PATHS' => '"$(PODS_TARGET_SRCROOT)/Classes/3rdparty/lib"',
    'OTHER_LDFLAGS' => '-ObjC -all_load',
    'CLANG_ALLOW_NON_MODULAR_INCLUDES_IN_FRAMEWORK_MODULES' => 'YES',
    'ENABLE_BITCODE' => 'NO'
  }
  
  # Библиотеки SDK (статические .a)
  # Bundle all prebuilt static libraries from the Dahua SDK
  s.vendored_libraries = 'Classes/3rdparty/lib/*.a'

  # Build the pod as a static framework to simplify linking in Flutter apps
  s.static_framework = true
  
  # Если есть .framework, раскомментируйте:
  # s.vendored_frameworks = 'Classes/3rdparty/lib/*.framework'
  
  # Системные фреймворки, необходимые Dahua SDK
  s.frameworks = [
    'AVFoundation',
    'AudioToolbox', 
    'CoreMedia',
    'CoreVideo',
    'CoreGraphics',
    'QuartzCore',
    'SystemConfiguration',
    'CFNetwork',
    'Security',
    'MediaPlayer',
    'VideoToolbox',
    'MetalKit',
    'Metal'
  ]
  
  # Системные библиотеки
  s.libraries = 'z', 'c++', 'resolv'
  
  s.dependency 'Flutter'
  # Keep a single deployment target declaration for consistency
  s.platform = :ios, '13.0'

  # Exclude unsupported simulator architectures for prebuilt vendor libs
  # Dahua vendor libraries included are device-only (arm64/armv7) and do not
  # provide simulator slices. Running on a simulator is not supported.
  s.pod_target_xcconfig = {
    'DEFINES_MODULE' => 'YES',
    'EXCLUDED_ARCHS[sdk=iphonesimulator*]' => 'arm64 x86_64 i386'
  }
end