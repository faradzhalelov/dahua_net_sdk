# Архитектура многоканального видео

## Как это работает

```
╔═══════════════════════════════════════════════════════════╗
║                     Flutter UI                            ║
║  ┌──────────────┐  ┌──────────────┐  ┌──────────────┐   ║
║  │ DahuaPreview │  │ DahuaPreview │  │ DahuaPreview │   ║
║  │  channel: 0  │  │  channel: 1  │  │  channel: 2  │   ║
║  │  stream: 0   │  │  stream: 0   │  │  stream: 1   │   ║
║  └──────┬───────┘  └──────┬───────┘  └──────┬───────┘   ║
╚═════════╪══════════════════╪══════════════════╪═══════════╝
          │                  │                  │
          │ UiKitView        │ UiKitView        │ UiKitView
          ▼                  ▼                  ▼
╔═══════════════════════════════════════════════════════════╗
║              DahuaPreviewFactory (iOS)                    ║
║  ┌──────────────┐  ┌──────────────┐  ┌──────────────┐   ║
║  │ DahuaPreview │  │ DahuaPreview │  │ DahuaPreview │   ║
║  │   UIView     │  │   UIView     │  │   UIView     │   ║
║  │ login: 123   │  │ login: 124   │  │ login: 125   │   ║
║  │ real: 456    │  │ real: 457    │  │ real: 458    │   ║
║  └──────┬───────┘  └──────┬───────┘  └──────┬───────┘   ║
╚═════════╪══════════════════╪══════════════════╪═══════════╝
          │                  │                  │
          │ dh_start_        │ dh_start_        │ dh_start_
          │ realplay2(0,0)   │ realplay2(1,0)   │ realplay2(2,1)
          ▼                  ▼                  ▼
╔═══════════════════════════════════════════════════════════╗
║            DahuaNetSDKBridge.mm                           ║
║                                                           ║
║  g_playContexts = {                                       ║
║    456 -> PlayContext { playPort: 0, dataCount: 1234 }   ║
║    457 -> PlayContext { playPort: 1, dataCount: 5678 }   ║
║    458 -> PlayContext { playPort: 2, dataCount: 91011 }  ║
║  }                                                        ║
║                                                           ║
║  RealDataCallback(real=456) ──> PLAY_InputData(port=0)   ║
║  RealDataCallback(real=457) ──> PLAY_InputData(port=1)   ║
║  RealDataCallback(real=458) ──> PLAY_InputData(port=2)   ║
╚═══════════════════════════════════════════════════════════╝
          │                  │                  │
          │ CLIENT_          │ CLIENT_          │ CLIENT_
          │ RealPlayEx       │ RealPlayEx       │ RealPlayEx
          ▼                  ▼                  ▼
╔═══════════════════════════════════════════════════════════╗
║                  Dahua NetSDK                             ║
║  ┌──────────────┐  ┌──────────────┐  ┌──────────────┐   ║
║  │   Channel 0  │  │   Channel 1  │  │   Channel 2  │   ║
║  │ Main Stream  │  │ Main Stream  │  │ Extra Stream │   ║
║  └──────────────┘  └──────────────┘  └──────────────┘   ║
╚═══════════════════════════════════════════════════════════╝
          │                  │                  │
          ▼                  ▼                  ▼
     ┌─────────┐        ┌─────────┐        ┌─────────┐
     │ Camera1 │        │ Camera2 │        │ Camera3 │
     │ 📹      │        │ 📹      │        │ 📹      │
     └─────────┘        └─────────┘        └─────────┘
```

## Поток данных для одного канала

```
┌──────────────────────────────────────────────────────────┐
│ 1. Flutter создаёт DahuaPreview виджет                   │
│    • channel = 0                                         │
│    • streamType = 0 (Main)                               │
└────────────────────┬─────────────────────────────────────┘
                     │
                     ▼
┌──────────────────────────────────────────────────────────┐
│ 2. DahuaPreviewFactory.createWithFrame()                 │
│    • Создаёт UIView                                      │
│    • Вызывает dh_login()                                 │
│    • loginHandle = 123                                   │
└────────────────────┬─────────────────────────────────────┘
                     │
                     ▼
┌──────────────────────────────────────────────────────────┐
│ 3. dh_start_realplay2(login=123, ch=0, type=0, view)    │
│    • Создаёт PlayContext                                 │
│    • PLAY_GetFreePort(&port) → port = 0                  │
│    • PLAY_OpenStream(0)                                  │
│    • CLIENT_RealPlayEx(123, 0, NULL, DH_RType_Realplay)  │
│    • realHandle = 456                                    │
│    • g_playContexts[456] = PlayContext{port:0, view:..}  │
└────────────────────┬─────────────────────────────────────┘
                     │
                     ▼
┌──────────────────────────────────────────────────────────┐
│ 4. CLIENT_SetRealDataCallBackEx2(456, callback, ctx)    │
│    • Регистрирует RealDataCallback                       │
└────────────────────┬─────────────────────────────────────┘
                     │
                     ▼
┌──────────────────────────────────────────────────────────┐
│ 5. PLAY_Play(port=0, view)                               │
│    • Начинает рендеринг на UIView                        │
└────────────────────┬─────────────────────────────────────┘
                     │
                     ▼
┌──────────────────────────────────────────────────────────┐
│ 6. [Постоянно] RealDataCallback(real=456, data, size)   │
│    • Получает данные с камеры                            │
│    • ctx = g_playContexts[456]                           │
│    • PLAY_InputData(ctx->playPort=0, data, size)         │
│    • PlaySDK декодирует и рендерит на view               │
└──────────────────────────────────────────────────────────┘
```

## Ключевые компоненты

### PlayContext
```c
typedef struct {
    LONG playPort;        // Порт PlaySDK для декодирования (0, 1, 2, ...)
    UIView* renderView;   // UIView для рендеринга видео
    int dataCount;        // Счётчик пакетов (для отладки)
} PlayContext;
```

### Глобальное хранилище
```objective-c
static NSMutableDictionary* g_playContexts;
// Key: NSNumber(@(realHandle))  — handle от CLIENT_RealPlayEx
// Value: NSValue(PlayContext*)  — контекст воспроизведения
```

### Маршрутизация данных
```objective-c
static void CALLBACK RealDataCallback(
    LLONG lRealHandle,     // Идентификатор потока (456, 457, ...)
    DWORD dwDataType,      // Тип данных (0 = raw video)
    BYTE *pBuffer,         // Данные
    DWORD dwBufSize,       // Размер
    LLONG param,
    LDWORD dwUser          // PlayContext*
) {
    PlayContext* ctx = (PlayContext*)dwUser;
    
    if (dwDataType == 0) {  // Video data
        // Отправляем данные в правильный PlayPort
        PLAY_InputData(ctx->playPort, pBuffer, dwBufSize);
    }
}
```

## Изоляция между каналами

Каждый канал **полностью изолирован**:

| Ресурс | Channel 0 | Channel 1 | Channel 2 |
|--------|-----------|-----------|-----------|
| Login Handle | 123 | 124 | 125 |
| Real Handle | 456 | 457 | 458 |
| Play Port | 0 | 1 | 2 |
| UIView | view1 | view2 | view3 |
| PlayContext | ctx1 | ctx2 | ctx3 |

**Преимущества:**
- ✅ Сбой одного канала не влияет на другие
- ✅ Независимое управление (stop/start)
- ✅ Разные типы потоков для каждого канала

**Недостатки:**
- ⚠️ Множественные login к одному устройству
- ⚠️ Больше потребление памяти
- ⚠️ Может достигать лимит подключений устройства

## Оптимизация (опционально)

### Shared Login Manager
```
┌──────────────────────────────────────────────┐
│        DahuaLoginManager                     │
│  ┌────────────────────────────────────────┐  │
│  │ Cache: "192.168.1.108:37777"           │  │
│  │   -> LoginInfo{                        │  │
│  │        handle: 123,                    │  │
│  │        refCount: 3  ← 3 channels       │  │
│  │      }                                 │  │
│  └────────────────────────────────────────┘  │
└──────────────────────────────────────────────┘
         ▲          ▲          ▲
         │          │          │
    ┌────┴───┐  ┌───┴────┐  ┌─┴──────┐
    │ Ch 0   │  │ Ch 1   │  │ Ch 2   │
    │real:456│  │real:457│  │real:458│
    └────────┘  └────────┘  └────────┘
    
// Все три канала используют ОДИН login handle (123)
// но разные real handles (456, 457, 458)
```

**Экономия:**
- 1 login вместо 3
- Меньше нагрузки на устройство
- Не превышаем лимит подключений

Файл уже создан: `ios/Classes/DahuaLoginManager.{h,m}` (но сейчас не используется)
