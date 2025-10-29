Pod::Spec.new do |s|
  s.name             = 'dahua_sdk'
  s.version          = '0.0.1'
  s.summary          = 'Dahua camera SDK plugin.'
  s.homepage         = 'https://yourcompany.com'
  s.license          = { :file => '../LICENSE' }
  s.author           = { 'Your Company' => 'email@example.com' }
  s.source           = { :path => '.' }
  
  s.source_files = 'Classes/**/*.{h,m,mm}'
  s.public_header_files = 'Classes/**/*.h'
  
  s.ios.deployment_target = '13.0'
  
  # Пути поиска заголовков SDK
  s.xcconfig = {
    'HEADER_SEARCH_PATHS' => [
      '"$(PODS_TARGET_SRCROOT)/Classes/3rdparty/include"',
      '"$(PODS_TARGET_SRCROOT)/Classes/3rdparty/include/**"'
    ].join(' '),
    'OTHER_LDFLAGS' => '-ObjC',
    'CLANG_ALLOW_NON_MODULAR_INCLUDES_IN_FRAMEWORK_MODULES' => 'YES'
  }
  
  # Библиотеки SDK (статические .a)
  s.vendored_libraries = 'Classes/3rdparty/lib/*.a'
  
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
    'MediaPlayer'
  ]
  
  # Системные библиотеки
  s.libraries = 'z', 'c++', 'resolv'
  
  s.dependency 'Flutter'
  s.platform = :ios, '12.0'
  s.pod_target_xcconfig = { 'DEFINES_MODULE' => 'YES', 'EXCLUDED_ARCHS[sdk=iphonesimulator*]' => 'i386' }
end