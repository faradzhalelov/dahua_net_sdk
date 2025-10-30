# Быстрый старт - Тестирование Android плагина

## 1. Подготовка

Убедитесь что у вас установлено:
- Flutter SDK (3.3.0+)
- Android Studio с Android SDK 34
- Android NDK
- Физическое Android устройство или эмулятор

## 2. Проверка структуры проекта

```bash
cd /Volumes/ssd/flutter/CEREBRO/dahua_connection/dahua_sdk

# Проверить что все файлы на месте
ls -la android/src/main/kotlin/com/dahua/sdk/dahua_sdk/
ls -la android/libs/
```

Должны присутствовать:
- ✅ DahuaSdkPlugin.kt
- ✅ DahuaNetSDKBridge.kt
- ✅ DahuaPreviewFactory.kt
- ✅ DahuaPreviewView.kt
- ✅ JAR файлы в libs/
- ✅ Native .so файлы в libs/arm64-v8a/ и libs/armeabi-v7a/

## 3. Сборка примера

```bash
cd example

# Получить зависимости
flutter pub get

# Подключить устройство и проверить
flutter devices

# Запустить на Android устройстве
flutter run -d <device-id>
```

## 4. Тестирование функций

### 4.1 Инициализация SDK

В example/lib/main.dart должен быть вызов:
```dart
await DahuaSdk.init();
```

Проверьте логи:
```bash
flutter logs | grep "DahuaSdk"
```

Ожидаемый вывод:
```
[DahuaSdkPlugin] Native libraries loaded successfully
[DahuaSdkPlugin] NetSDK initialized successfully
```

### 4.2 Предпросмотр камеры

Добавьте в код:
```dart
DahuaPreview(
  ip: '192.168.1.108',      // IP вашей камеры
  port: 37777,
  user: 'admin',
  pass: 'your_password',
  channel: 0,
  streamType: 1,  // 1 = Extra Stream для тестирования
)
```

Проверьте логи:
```
[DahuaPreviewView] Surface created
[DahuaNetSDKBridge] Login successful for 192.168.1.108:37777
[DahuaNetSDKBridge] Got play port: X
[DahuaNetSDKBridge] Play started on port X
[DahuaNetSDKBridge] RealPlay started successfully
[DahuaPreviewView] Callback: type=0, size=XXXX
[DahuaPreviewView] Packet #1: size=XXXX, InputData=true
```

### 4.3 PTZ управление

```dart
// Движение вверх
await DahuaSdk.ptz(
  handle: loginHandle,
  cmd: 0,  // UP
  speed: 5,
  start: true,
);

await Future.delayed(Duration(seconds: 1));

// Остановка
await DahuaSdk.ptz(
  handle: loginHandle,
  cmd: 0,
  speed: 5,
  start: false,
);
```

## 5. Отладка проблем

### Проблема: Не загружаются native библиотеки

**Решение:**
```bash
# Проверить что .so файлы на месте
ls -la android/libs/arm64-v8a/*.so
ls -la android/libs/armeabi-v7a/*.so

# Пересобрать
cd example
flutter clean
flutter pub get
flutter run
```

### Проблема: Не авторизуется на камере

**Решение:**
1. Проверьте IP адрес камеры: `ping 192.168.1.108`
2. Проверьте порт (обычно 37777)
3. Проверьте логин и пароль
4. Убедитесь что камера в той же сети

**Логи:**
```
[DahuaNetSDKBridge] Login failed for 192.168.1.108:37777, error: XXXXX
```

### Проблема: Черный экран (нет видео)

**Возможные причины:**
1. SurfaceView не создан - проверьте `Surface created` в логах
2. Не идут данные - проверьте `Callback: type=0` в логах
3. PlaySDK не декодирует - проверьте `InputData=true` в логах

**Решение:**
```bash
# Включить подробные логи
flutter run --verbose

# Или в коде
DahuaSdk.logs.listen((message) {
  print('DAHUA: $message');
});
```

### Проблема: Краш при старте

**Решение:**
Проверьте AndroidManifest.xml example приложения:
```xml
<uses-permission android:name="android.permission.INTERNET"/>
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
```

## 6. Сравнение с iOS

Запустите на iOS и Android одновременно:
```bash
# Terminal 1 - iOS
flutter run -d iphone

# Terminal 2 - Android  
flutter run -d android
```

Оба должны показывать одинаковое видео с камеры.

## 7. Performance тестирование

### Задержка видео
Измерьте задержку между iOS и Android:
- iOS обычно: 100-300ms
- Android должен быть аналогично: 100-400ms

### FPS
Проверьте плавность:
```dart
// Добавьте overlay с FPS
flutter run --profile
```

### Потребление памяти
```bash
adb shell dumpsys meminfo com.example.dahua_sdk_example
```

## 8. Production checklist

Перед релизом:
- [ ] Протестирован на разных устройствах (Samsung, Xiaomi, etc.)
- [ ] Протестированы все типы потоков (Main, Extra1, Extra2)
- [ ] Протестированы все каналы камеры
- [ ] PTZ работает корректно
- [ ] Нет утечек памяти при многократном connect/disconnect
- [ ] Нет крашей при потере сети
- [ ] Правильная очистка при dispose виджета
- [ ] Логирование отключено в release билде

## 9. Следующие шаги

После успешного тестирования:
1. Интегрируйте в основное приложение
2. Добавьте обработку ошибок
3. Добавьте UI для управления камерой
4. Реализуйте дополнительные функции (запись, снимки)

## Контакты

При возникновении проблем проверьте:
- ANDROID_INTEGRATION.md - полная документация
- example/lib/main.dart - пример использования
- android/README_PLUGIN.md - технические детали

Успешной интеграции! 🚀
