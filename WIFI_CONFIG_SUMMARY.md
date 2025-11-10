# Обновление Dahua SDK - WiFi Configuration (AP Config)

## Что добавлено

### 1. **Новые методы в DahuaSdk**

#### Login/Logout
```dart
// Логин на устройство
final handle = await DahuaSdk.login(
  ip: '192.168.1.108',
  port: 37777,
  user: 'admin',
  pass: 'admin123',
);

// Логаут
await DahuaSdk.logout(handle);
```

#### WiFi Configuration
```dart
// Получить текущую WiFi конфигурацию
final config = await DahuaSdk.getWlanConfig(handle);
print('SSID: ${config?.ssid}');

// Установить новую WiFi конфигурацию
final newConfig = WlanConfig(
  ssid: 'MyNetwork',
  password: 'MyPassword',
  authMode: WlanAuthMode.wpa2Psk.value,
  encryptionAlg: WlanEncryptionAlg.aes.value,
  enabled: true,
  connectEnabled: true,
);
await DahuaSdk.setWlanConfig(handle, newConfig);
```

### 2. **Новые модели данных**

#### WlanConfig
```dart
class WlanConfig {
  final String ssid;
  final String password;
  final int authMode;      // 0-11 (см. WlanAuthMode)
  final int encryptionAlg; // 0,4,5,6,7 (см. WlanEncryptionAlg)
  final int encryption;    // Рассчитывается автоматически
  final bool enabled;
  final bool connectEnabled;
}
```

#### Enums для безопасности WiFi
```dart
enum WlanAuthMode {
  open(0), shared(1), wpa(2), wpaPsk(3),
  wpa2(4), wpa2Psk(5), // Рекомендуется
  // ... и другие
}

enum WlanEncryptionAlg {
  none(0), wep(4), tkip(5),
  aes(6), // Рекомендуется
  tkipAes(7)
}
```

### 3. **UI в Example App**

Добавлена новая кнопка на главном экране: **"WiFi Configuration (AP Config)"**

#### Функции UI:
- ✅ Автоматический логин на устройство
- ✅ Загрузка текущей конфигурации WiFi
- ✅ Редактирование SSID и пароля
- ✅ Выбор режима аутентификации
- ✅ Выбор алгоритма шифрования
- ✅ Автоматический расчет режима шифрования
- ✅ Переключатели для включения WiFi и авто-подключения
- ✅ Сохранение конфигурации

## Файлы изменены/добавлены

### Core Library
- `lib/dahua_sdk.dart` - Добавлены WlanConfig, enums, методы login/logout/WiFi

### iOS Native
- `ios/Classes/DahuaNetSDKBridge.h` - Добавлена структура DHWlanConfig и функции
- `ios/Classes/DahuaNetSDKBridge.mm` - Реализация WiFi конфигурации
- `ios/Classes/DahuaSdkPlugin.m` - Обработчики method channel

### Example App
- `example/lib/views/wifi_config_view.dart` - UI для WiFi конфигурации
- `example/lib/views/wifi_config_navigator.dart` - Wrapper с логином
- `example/lib/views/home_view.dart` - Добавлена кнопка навигации

## Рекомендации по безопасности

### ✅ Используйте WPA2-PSK + AES (наиболее безопасно)
```dart
authMode: WlanAuthMode.wpa2Psk.value,     // 5
encryptionAlg: WlanEncryptionAlg.aes.value, // 6
// Автоматически получится encryption: 11 (WPA2-PSK-AES)
```

### ❌ Избегайте:
- WEP (легко взламывается)
- TKIP (устаревший, менее безопасный)
- OPEN (без шифрования)

## Таблица режимов шифрования

| Auth Mode | Encryption Alg | Encryption | Описание |
|-----------|----------------|------------|----------|
| WPA2-PSK (5) | AES (6) | 11 | ✅ **Рекомендуется** |
| WPA2-PSK (5) | TKIP (5) | 7 | Совместимость |
| WPA-PSK (3) | AES (6) | 9 | Старые устройства |
| OPEN (0) | NONE (0) | 1 | ❌ Небезопасно |

## Тестирование

Приложение успешно протестировано на:
- ✅ iPhone (Physical Device)
- ✅ iOS Simulator (stubs)
- ✅ Логин на устройство работает
- ✅ Чтение WiFi конфигурации работает
- ✅ UI отображается корректно

### Пример лога:
```
flutter: [DahuaBridge] Login success, ID: 4353376256
flutter: [DahuaBridge] Get WLAN config: SSID='Cerebro', encryption=9
```

## Как использовать

1. Запустите пример: `cd example && flutter run`
2. Введите IP, порт, логин и пароль камеры
3. Нажмите **"WiFi Configuration (AP Config)"**
4. Дождитесь загрузки текущей конфигурации
5. Измените SSID, пароль и настройки безопасности
6. Нажмите **"Save Configuration"**

## Troubleshooting

### Логин не работает
- Проверьте IP адрес и порт
- Убедитесь что устройство доступно в сети
- Проверьте логин и пароль

### Конфигурация не сохраняется
- Убедитесь что устройство поддерживает WiFi
- Проверьте что handle валидный (> 0)
- Некоторые устройства требуют перезагрузки после смены WiFi

## Следующие шаги

- [ ] Добавить поддержку Android
- [ ] Добавить валидацию SSID и пароля
- [ ] Добавить сканирование доступных сетей
- [ ] Добавить проверку силы сигнала
- [ ] Добавить логирование в файл

## Документация

См. подробную документацию в `AP_CONFIG_README.md`
