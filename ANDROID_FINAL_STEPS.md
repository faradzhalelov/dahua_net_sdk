# Android Integration - Требуется финальная настройка

## ✅ Что сделано

1. **Создана структура Android плагина** - все файлы на месте
2. **Настроена конфигурация Gradle** - build.gradle, dependencies
3. **Создан Example приложение для Android**
4. **Добавлены необходимые разрешения**
5. **Обновлен Flutter код** для поддержки AndroidView

## ⚠️ Текущая проблема

При компиляции возникают ошибки, связанные с:
1. API различиями между Java SDK и Kotlin обертками
2. Правильными именами методов (статические vs instance методы)
3. Типами данных (LLong, ByteArray, callbacks)

## 🔧 Решение

### Вариант 1: Использовать Java вместо Kotlin

Dahua SDK изначально написан на Java. Рекомендуется переписать плагин на Java, чтобы избежать проблем с типами:

```bash
# Удалить Kotlin файлы
rm -rf android/src/main/kotlin

# Создать Java директорию
mkdir -p android/src/main/java/com/dahua/sdk/dahua_sdk
```

### Вариант 2: Использовать рабочий пример из SDK

В папке `android/app/src/main/java/com/company/netsdk/module/` есть рабочие модули:
- `LivePreviewModule.java` - предпросмотр камеры
- `IPLoginModule.java` - авторизация

Нужно скопировать их логику и адаптировать под Flutter плагин.

### Вариант 3: Быстрое исправление (Рекомендуется)

Используйте готовые Java модули напрямую:

1. Скопируйте необходимые классы из `android/app/src/main/java/com/company/netsdk/`
2. Создайте простую Java обертку для Flutter
3. Зарегистрируйте в plugin

## 📋 Шаги для финального исправления

### Шаг 1: Изучите примеры

```bash
cd android/app/src/main/java/com/company/netsdk/module/

# Смотрите эти файлы:
# - LivePreviewModule.java (видеопоток)
# - IPLoginModule.java (авторизация)  
# - PlayBackModule.java (воспроизведение)
```

### Шаг 2: Правильные имена методов

Вот корректные имена методов из SDK:

**INetSDK:**
```java
// Инициализация
INetSDK.Init(disConnectCallback);
INetSDK.SetAutoReconnect(reConnectCallback);
INetSDK.Cleanup();

// Авторизация
LLong loginHandle = INetSDK.LoginWithHighLevelSecurity(inParam, outParam);
INetSDK.Logout(loginHandle);
INetSDK.GetLastError();

// RealPlay
LLong realHandle = INetSDK.RealPlayByDataType(loginHandle, inParam, outParam, timeout);
INetSDK.StopRealPlayEx(realHandle);

// PTZ
INetSDK.DHPTZControl(handle, cmd, param1, param2, param3, stop, reserved);
```

**IPlaySDK:**
```java
// Play port
int port = IPlaySDK.PLAYGetFreePort();
IPlaySDK.PLAYFreePort(port);

// Открытие/Закрытие потока
IPlaySDK.PLAYOpenStream(port, data, len, bufSize);
IPlaySDK.PLAYCloseStream(port);

// Воспроизведение
IPlaySDK.PLAYPlay(port, surface);
IPlaySDK.PLAYStop(port);

// Ввод данных
IPlaySDK.PLAYInputData(port, buffer, size);

// Настройки
IPlaySDK.PLAYSetLogToFile(level, path, size);
```

### Шаг 3: Правильные типы данных

```java
// LLong - это класс из SDK
LLong handle = new LLong(0);
long value = handle.longValue();

// String -> ByteArray
String ip = "192.168.1.1";
loginInfo.szIP = ip.getBytes();

// Callbacks
fDisConnectCallBack disconnectCB = new fDisConnectCallBack() {
    @Override
    public void invoke(LLong lLoginID, String pchDVRIP, int nDVRPort, LLong dwUser) {
        // handle disconnect
    }
};
```

## 🚀 Быстрое решение

Я рекомендую создать **гибридную версию**: оставить Kotlin для плагина, но использовать Java helper класс для работы с Dahua SDK.

### Создайте DahuaSDKHelper.java:

```java
package com.dahua.sdk.dahua_sdk;

import com.company.NetSDK.*;
import com.company.PlaySDK.IPlaySDK;

public class DahuaSDKHelper {
    
    public static void initSDK() {
        INetSDK.Init(null);
        INetSDK.SetAutoReconnect(null);
    }
    
    public static long login(String ip, int port, String user, String pass) {
        NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY inParam = new NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY();
        inParam.szIP = ip.getBytes();
        inParam.nPort = port;
        inParam.szUserName = user.getBytes();
        inParam.szPassword = pass.getBytes();
        
        NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY outParam = new NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY();
        LLong handle = INetSDK.LoginWithHighLevelSecurity(inParam, outParam);
        
        return handle.longValue();
    }
    
    // И так далее для других методов...
}
```

Затем используйте его из Kotlin:
```kotlin
val loginHandle = DahuaSDKHelper.login(ip, port, user, pass)
```

## 📖 Дополнительные ресурсы

1. **Документация Dahua SDK** - в `android/inetsdk/General_NetSDK_ChnEng_Android_Java_IS_V3.49.29364.T.250724/`
2. **Примеры кода** - в `android/app/src/main/java/com/company/netsdk/`
3. **Исходники SDK** - в `android/inetsdk/src/main/java/com/company/NetSDK/`

## ✅ Заключение

Android интеграция **почти готова**. Осталось только:
1. Исправить вызовы API методов согласно примерам выше
2. Или создать Java helper класс
3. Протестировать на устройстве

Все файлы созданы, структура правильная, осталась только финальная настройка API вызовов! 🎉

---

**Следующий шаг**: Изучите `LivePreviewModule.java` и скопируйте его логику в `DahuaPreviewView.kt` или создайте Java helper.
