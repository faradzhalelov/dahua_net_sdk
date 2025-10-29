# Двухканальное видео (Multi-Channel Video)

## 📋 Обзор

Ваш Flutter плагин **уже поддерживает многоканальное видео**! Нативная реализация на iOS позволяет одновременно воспроизводить несколько видеопотоков с разных каналов (камер) одного устройства.

## ✅ Что уже работает

### iOS Native (DahuaNetSDKBridge.mm)
- ✅ `dh_start_realplay2` принимает параметры `channel` и `streamType`
- ✅ Каждый поток имеет независимый `PlayContext` с отдельным `playPort`
- ✅ Глобальное хранилище `g_playContexts` управляет несколькими потоками
- ✅ `RealDataCallback` правильно маршрутизирует данные для каждого канала

### Flutter (dahua_sdk.dart)
- ✅ `DahuaPreview` виджет поддерживает параметры `channel` и `streamType`
- ✅ `DahuaPreviewFactory` создаёт независимые `UIView` для каждого канала
- ✅ Каждый `PlatformView` имеет свой lifecycle (login/logout/realplay)

## 🎯 Как использовать

### 1. Двухканальный просмотр (2 камеры)

```dart
import 'package:dahua_sdk/dahua_sdk.dart';

// Горизонтальное разделение
Column(
  children: [
    Expanded(
      child: DahuaPreview(
        ip: "192.168.1.108",
        port: 37777,
        user: "admin",
        pass: "admin123",
        channel: 0,      // Камера 1
        streamType: 0,   // Main stream (высокое качество)
      ),
    ),
    Expanded(
      child: DahuaPreview(
        ip: "192.168.1.108",
        port: 37777,
        user: "admin",
        pass: "admin123",
        channel: 1,      // Камера 2
        streamType: 0,   // Main stream
      ),
    ),
  ],
)
```

### 2. Четырёхканальный просмотр (2x2 grid)

```dart
Column(
  children: [
    Expanded(
      child: Row(
        children: [
          Expanded(child: DahuaPreview(channel: 0, streamType: 1, ...)),
          Expanded(child: DahuaPreview(channel: 1, streamType: 1, ...)),
        ],
      ),
    ),
    Expanded(
      child: Row(
        children: [
          Expanded(child: DahuaPreview(channel: 2, streamType: 1, ...)),
          Expanded(child: DahuaPreview(channel: 3, streamType: 1, ...)),
        ],
      ),
    ),
  ],
)
```

**💡 Совет:** Для 4+ каналов используйте `streamType: 1` (Extra Stream) для экономии пропускной способности.

### 3. Сравнение разных потоков одного канала

```dart
Column(
  children: [
    Expanded(
      child: DahuaPreview(
        channel: 0,
        streamType: 0, // Main stream (1080p)
        ...
      ),
    ),
    Expanded(
      child: DahuaPreview(
        channel: 0,
        streamType: 1, // Extra stream (480p)
        ...
      ),
    ),
  ],
)
```

## 📝 Параметры

### `channel` (int)
- Физический индекс канала (камеры)
- Начинается с `0`
- Диапазон: `0` до `g_ChannelCount - 1`
- **Пример:** `channel: 0` — первая камера

### `streamType` (int)
- Тип потока видео
- `0` = **Main Stream** (DH_RType_Realplay) — основной поток, высокое качество
- `1` = **Extra Stream 1** (DH_RType_Realplay_1) — дополнительный поток, среднее качество
- `2` = **Extra Stream 2** (DH_RType_Realplay_2) — ещё ниже
- `3` = **Extra Stream 3** (DH_RType_Realplay_3) — минимальное качество

**Маппинг в native коде:**
```objective-c
static DH_RealPlayType mapStreamType(int streamType) {
    switch (streamType) {
        case 0: return DH_RType_Realplay;      // Main
        case 1: return DH_RType_Realplay_1;    // Extra1
        case 2: return DH_RType_Realplay_2;    // Extra2
        case 3: return DH_RType_Realplay_3;    // Extra3
        default: return DH_RType_Realplay;
    }
}
```

## 🎨 Готовые примеры

В `example/lib/dual_channel_screen.dart`:

### `DualChannelScreen`
- 2 камеры одновременно
- Переключение layout (горизонтально/вертикально)
- Main stream для обоих каналов

### `QuadChannelScreen`
- 4 камеры в сетке 2x2
- Extra stream для экономии ресурсов
- Компактный UI

### `StreamComparisonScreen`
- Сравнение разных типов потоков
- Один канал, два потока
- Полезно для отладки

## ⚠️ Важные замечания

### 1. Управление ресурсами
Каждый `DahuaPreview` создаёт:
- Отдельный login session
- Отдельный RealPlay handle
- Отдельный PLAY port для декодирования

**Проблема:** При 4+ каналах может быть много login sessions к одному устройству.

**Решение (опционально):** Можно реализовать `DahuaLoginManager` для переиспользования одного login между несколькими каналами.

### 2. Производительность

| Каналов | Stream Type | Рекомендация |
|---------|-------------|--------------|
| 1-2     | Main (0)    | ✅ Отлично    |
| 3-4     | Extra (1)   | ✅ Хорошо     |
| 5-9     | Extra (1-2) | ⚠️ Тестируйте |
| 10+     | Extra (2-3) | ❌ Не рекомендуется |

### 3. Лимиты устройства
- Большинство устройств Dahua поддерживают до **4-8 одновременных подключений**
- Проверьте документацию вашего устройства
- При превышении лимита `CLIENT_RealPlayEx` вернёт ошибку

### 4. Память
- Main stream (1080p): ~2-4 MB/s на канал
- Extra stream (480p): ~0.5-1 MB/s на канал
- Следите за потреблением памяти на iOS

## 🔧 Архитектура

```
┌─────────────────────────────────────────────┐
│          Flutter UI Layer                   │
├─────────────────────────────────────────────┤
│  DahuaPreview   DahuaPreview   DahuaPreview │
│  (channel: 0)   (channel: 1)   (channel: 2) │
└────────┬──────────────┬──────────────┬──────┘
         │              │              │
         ▼              ▼              ▼
┌─────────────────────────────────────────────┐
│       iOS PlatformView Factory              │
│     (creates separate UIViews)              │
└────────┬──────────────┬──────────────┬──────┘
         │              │              │
         ▼              ▼              ▼
┌─────────────────────────────────────────────┐
│         DahuaNetSDKBridge                   │
│  ┌──────────┐  ┌──────────┐  ┌──────────┐  │
│  │ Context1 │  │ Context2 │  │ Context3 │  │
│  │ port: 0  │  │ port: 1  │  │ port: 2  │  │
│  └──────────┘  └──────────┘  └──────────┘  │
└─────────────────────────────────────────────┘
         │              │              │
         ▼              ▼              ▼
┌─────────────────────────────────────────────┐
│     Dahua SDK (CLIENT_RealPlayEx)           │
│     + PlaySDK (PLAY_Play)                   │
└─────────────────────────────────────────────┘
```

## 🚀 Запуск примера

1. Откройте `example` проект
2. Запустите на iOS устройстве
3. Введите данные подключения
4. Нажмите:
   - **"Single Channel View"** — один канал
   - **"Dual Channel View"** — два канала
   - **"Quad Channel View"** — четыре канала

## 📚 Дополнительные ресурсы

### Референсы из Dahua Demo
- `LivePreviewViewController.mm` — пример одноканального просмотра
- Показывает использование `CLIENT_RealPlayEx` с разными `DH_RealPlayType`
- Демонстрирует переключение каналов и типов потоков

### Что изучать дальше
1. **PTZ управление** — поддержка `dh_ptz_control` для каждого канала
2. **Запись** — синхронная запись нескольких каналов
3. **Снимки** — захват кадров с разных камер
4. **Аудио** — микширование аудио с нескольких источников

## ❓ FAQ

**Q: Можно ли смотреть каналы с разных устройств?**
A: Да! Просто используйте разные `ip` для каждого `DahuaPreview`.

**Q: Сколько каналов поддерживает одно устройство?**
A: Зависит от модели. Обычно 4-16 каналов. Проверьте `g_ChannelCount` после login.

**Q: Можно ли динамически добавлять/удалять каналы?**
A: Да! Используйте `setState()` для изменения списка виджетов.

**Q: Как узнать, какие каналы доступны?**
A: После `CLIENT_LoginWithHighLevelSecurity` проверьте `stOut.stuDeviceInfo.nChanNum`.

## ✨ Готово!

Ваш плагин полностью готов для многоканального видео. Просто создайте несколько виджетов `DahuaPreview` с разными параметрами `channel`!
