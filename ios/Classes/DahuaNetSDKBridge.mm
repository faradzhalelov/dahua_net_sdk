#import "DahuaNetSDKBridge.h"
#import "DahuaSdkPlugin.h"

#import <TargetConditionals.h>

#if TARGET_OS_SIMULATOR
// Simulator stubs: Dahua SDK vendor libraries are device-only. Provide no-op
// implementations so the app can run in Simulator without linking the SDK.

void dh_init(void) {
    NSLog(@"[DahuaBridge] Simulator: dh_init() stub");
    [DahuaSdkPlugin emitLog:@"[DahuaBridge] Simulator: dh_init() stub"]; 
}

void dh_cleanup(void) {
    NSLog(@"[DahuaBridge] Simulator: dh_cleanup() stub");
    [DahuaSdkPlugin emitLog:@"[DahuaBridge] Simulator: dh_cleanup() stub"]; 
}

DHHandle dh_login(const char* ip, int port, const char* user, const char* pass) {
    NSLog(@"[DahuaBridge] Simulator: dh_login() stub — returns 0");
    [DahuaSdkPlugin emitLog:@"[DahuaBridge] Simulator: dh_login() stub — returns 0"]; 
    return 0;
}

void dh_logout(DHHandle login) {
    NSLog(@"[DahuaBridge] Simulator: dh_logout() stub");
    [DahuaSdkPlugin emitLog:@"[DahuaBridge] Simulator: dh_logout() stub"]; 
}

DHHandle dh_start_realplay(DHHandle login, UIView* renderView) {
    NSLog(@"[DahuaBridge] Simulator: dh_start_realplay() stub — returns 0");
    [DahuaSdkPlugin emitLog:@"[DahuaBridge] Simulator: dh_start_realplay() stub — returns 0"]; 
    return 0;
}

DHHandle dh_start_realplay2(DHHandle login, int channel, int streamType, UIView* renderView) {
    NSString* m = [NSString stringWithFormat:@"[DahuaBridge] Simulator: dh_start_realplay2(channel=%d, streamType=%d) stub — returns 0", channel, streamType];
    NSLog(@"%@", m);
    [DahuaSdkPlugin emitLog:m];
    return 0;
}

void dh_stop_realplay(DHHandle realplay) {
    NSLog(@"[DahuaBridge] Simulator: dh_stop_realplay() stub");
}

bool dh_ptz_control(DHHandle login, int cmd, int speed, bool start) {
    NSLog(@"[DahuaBridge] Simulator: dh_ptz_control() stub — returns false");
    [DahuaSdkPlugin emitLog:@"[DahuaBridge] Simulator: dh_ptz_control() stub — returns false"]; 
    return false;
}

#else

#import "3rdparty/include/netsdk.h"
#import "3rdparty/include/play.h"

// Структура для хранения контекста воспроизведения
typedef struct {
    LONG playPort;
    UIView* renderView;
    int dataCount;
} PlayContext;

// Глобальное хранилище контекстов (realHandle -> PlayContext*)
static NSMutableDictionary* g_playContexts = nil;

// Callback для получения данных видео
static void CALLBACK RealDataCallback(LLONG lRealHandle, DWORD dwDataType, BYTE *pBuffer, DWORD dwBufSize, LLONG param, LDWORD dwUser) {
    PlayContext* ctx = (PlayContext*)dwUser;
    
    // Логируем первые несколько вызовов
    if (ctx && ctx->dataCount < 5) {
        NSString* msg = [NSString stringWithFormat:@"[DahuaBridge] Callback: type=%u, size=%u, port=%ld", 
                         dwDataType, dwBufSize, (long)ctx->playPort];
        NSLog(@"%@", msg);
        [DahuaSdkPlugin emitLog:msg];
    }
    
    if (dwDataType == 0 && pBuffer && dwBufSize > 0) {  // Raw private data (REALDATA_FLAG_RAW_DATA)
        if (ctx && ctx->playPort >= 0) {
            // Отправляем данные в PLAY для декодирования
            BOOL ret = PLAY_InputData(ctx->playPort, pBuffer, dwBufSize);
            ctx->dataCount++;
            if (ctx->dataCount <= 5 || ctx->dataCount % 100 == 0) {  // Логируем первые 5 и каждые 100 пакетов
                NSString* msg = [NSString stringWithFormat:@"[DahuaBridge] Packet #%d: size=%u, PLAY_InputData=%d", 
                                 ctx->dataCount, dwBufSize, ret];
                NSLog(@"%@", msg);
                [DahuaSdkPlugin emitLog:msg];
            }
        }
    }
}

static BOOL g_inited = NO;

void dh_init(void) {
    if (g_inited) return;
    CLIENT_Init(NULL, 0);
    CLIENT_SetAutoReconnect(NULL, NULL);
    g_inited = YES;
    g_playContexts = [NSMutableDictionary dictionary];
    // Enable detailed PlaySDK logs to console
    PLAY_SetPrintLogLevel(LOG_LevelDebug);
}

void dh_cleanup(void) {
    if (!g_inited) return;
    CLIENT_Cleanup();
    g_inited = NO;
}

DHHandle dh_login(const char* ip, int port, const char* user, const char* pass) {
    NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY stIn = {sizeof(stIn)};
    NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY stOut = {sizeof(stOut)};
    
    stIn.nPort = port;
    strncpy(stIn.szIP, ip, sizeof(stIn.szIP) - 1);
    strncpy(stIn.szUserName, user, sizeof(stIn.szUserName) - 1);
    strncpy(stIn.szPassword, pass, sizeof(stIn.szPassword) - 1);
    
    LLONG h = CLIENT_LoginWithHighLevelSecurity(&stIn, &stOut);
    
    if (h == 0) {
        int err = CLIENT_GetLastError();
        NSString* m = [NSString stringWithFormat:@"[DahuaBridge] Login failed, error: 0x%x", err];
        NSLog(@"%@", m);
        [DahuaSdkPlugin emitLog:m];
    } else {
        NSString* m = [NSString stringWithFormat:@"[DahuaBridge] Login success, ID: %lld", h];
        NSLog(@"%@", m);
        [DahuaSdkPlugin emitLog:m];
    }
    
    return (DHHandle)h;
}

void dh_logout(DHHandle login) {
    if (login) {
        CLIENT_Logout((LLONG)login);
    }
}

static DH_RealPlayType mapStreamType(int streamType) {
    switch (streamType) {
        case 0: return DH_RType_Realplay;      // same as _0
        case 1: return DH_RType_Realplay_1;    // ExtraStream 1
        case 2: return DH_RType_Realplay_2;    // ExtraStream 2
        case 3: return DH_RType_Realplay_3;    // ExtraStream 3
        default: return DH_RType_Realplay;     // fallback to main
    }
}

DHHandle dh_start_realplay2(DHHandle login, int channel, int streamType, UIView* renderView) {
    if (!login || !renderView) {
        NSLog(@"[DahuaBridge] RealPlay failed: login=%lld, renderView=%p", login, renderView);
        return 0;
    }
    
    DH_RealPlayType rType = mapStreamType(streamType);
    NSString* startMsg = [NSString stringWithFormat:@"[DahuaBridge] Starting RealPlay login=%lld, channel=%d, streamType=%d -> rType=%d, view frame=%@",
                          login, channel, streamType, (int)rType, NSStringFromCGRect(renderView.frame)];
    NSLog(@"%@", startMsg);
    [DahuaSdkPlugin emitLog:startMsg];
    
    // Создаём контекст для воспроизведения
    PlayContext* ctx = (PlayContext*)malloc(sizeof(PlayContext));
    ctx->playPort = -1;
    ctx->renderView = renderView;
    ctx->dataCount = 0;
    
    // Запускаем RealPlay БЕЗ окна (NULL вместо view), данные получим через callback
    __block LLONG real = 0;
    if ([NSThread isMainThread]) {
        real = CLIENT_RealPlayEx((LLONG)login, channel, NULL, rType);
    } else {
        dispatch_sync(dispatch_get_main_queue(), ^{
            real = CLIENT_RealPlayEx((LLONG)login, channel, NULL, rType);
        });
    }
    
    if (real == 0) {
        int err = CLIENT_GetLastError();
        NSString* m = [NSString stringWithFormat:@"[DahuaBridge] RealPlay failed, error: 0x%x", err];
        NSLog(@"%@", m);
        [DahuaSdkPlugin emitLog:m];
        free(ctx);
        return 0;
    }
    
    {
        NSString* m = [NSString stringWithFormat:@"[DahuaBridge] RealPlay started successfully, handle=%lld", real];
        NSLog(@"%@", m);
        [DahuaSdkPlugin emitLog:m];
    }
    
    // Получаем свободный порт и настраиваем режим потокового воспроизведения
    LONG playPort = -1;
    if (!PLAY_GetFreePort(&playPort)) {
        NSString* m = [NSString stringWithFormat:@"[DahuaBridge] PLAY_GetFreePort failed, err=%u", PLAY_GetLastErrorEx()];
        NSLog(@"%@", m);
        [DahuaSdkPlugin emitLog:m];
        CLIENT_StopRealPlayEx(real);
        free(ctx);
        return 0;
    }

    // Реальный режим потока для живого видео
    PLAY_SetStreamOpenMode(playPort, STREAME_REALTIME);

    if (PLAY_OpenStream(playPort, NULL, 0, 4 * 1024 * 1024)) {
        ctx->playPort = playPort;
    NSString* mOpen = [NSString stringWithFormat:@"[DahuaBridge] PLAY_OpenStream success, port=%ld", (long)playPort];
    NSLog(@"%@", mOpen);
    [DahuaSdkPlugin emitLog:mOpen];
        
        // Сохраняем контекст
        @synchronized(g_playContexts) {
            g_playContexts[@(real)] = [NSValue valueWithPointer:ctx];
        }
        
        // Устанавливаем callback для получения данных
        // Получаем из устройства сырые приватные данные (REALDATA_FLAG_RAW_DATA)
        if (CLIENT_SetRealDataCallBackEx2(real, RealDataCallback, (LDWORD)ctx, 0x01)) {
            [DahuaSdkPlugin emitLog:@"[DahuaBridge] Data callback set successfully"]; 

            // Начинаем воспроизведение на view — делаем это на главном потоке
            __block BOOL playOk = NO;
            if ([NSThread isMainThread]) {
                playOk = PLAY_Play(playPort, (__bridge void*)renderView);
            } else {
                dispatch_sync(dispatch_get_main_queue(), ^{
                    playOk = PLAY_Play(playPort, (__bridge void*)renderView);
                });
            }

            if (playOk) {
                [DahuaSdkPlugin emitLog:@"[DahuaBridge] PLAY_Play started on view"]; 
                // Включаем звук в режиме shared (необязательно для видео, но помогает проверить поток)
                PLAY_PlaySoundShare(playPort);
            } else {
                NSString* m = [NSString stringWithFormat:@"[DahuaBridge] PLAY_Play failed, err=%u", PLAY_GetLastErrorEx()];
                NSLog(@"%@", m);
                [DahuaSdkPlugin emitLog:m];
            }
        } else {
            [DahuaSdkPlugin emitLog:@"[DahuaBridge] Failed to set data callback"]; 
            PLAY_CloseStream(playPort);
            PLAY_ReleasePort(playPort);
            CLIENT_StopRealPlayEx(real);
            @synchronized(g_playContexts) {
                [g_playContexts removeObjectForKey:@(real)];
            }
            free(ctx);
            return 0;
        }
    } else {
        NSString* m = [NSString stringWithFormat:@"[DahuaBridge] PLAY_OpenStream failed, err=%u", PLAY_GetLastErrorEx()];
        NSLog(@"%@", m);
        [DahuaSdkPlugin emitLog:m];
        CLIENT_StopRealPlayEx(real);
        if (playPort >= 0) PLAY_ReleasePort(playPort);
        free(ctx);
        return 0;
    }
    
    return (DHHandle)real;
}

// Backward-compatible helper: channel 0, main stream
DHHandle dh_start_realplay(DHHandle login, UIView* renderView) {
    return dh_start_realplay2(login, 0, 0, renderView);
}
void dh_stop_realplay(DHHandle realplay) {
    if (realplay) {
    NSString* m = [NSString stringWithFormat:@"[DahuaBridge] Stopping RealPlay, handle=%lld", realplay];
    NSLog(@"%@", m);
    [DahuaSdkPlugin emitLog:m];
        
        // Получаем контекст
        PlayContext* ctx = NULL;
        @synchronized(g_playContexts) {
            NSValue* val = g_playContexts[@(realplay)];
            if (val) {
                ctx = (PlayContext*)[val pointerValue];
                [g_playContexts removeObjectForKey:@(realplay)];
            }
        }
        
        if (ctx) {
            // Останавливаем воспроизведение
            PLAY_StopSound();
            PLAY_Stop(ctx->playPort);
            
            // Закрываем поток декодирования
            PLAY_CloseStream(ctx->playPort);
            // Освобождаем порт
            PLAY_ReleasePort(ctx->playPort);
            
            free(ctx);
        }
        
        // Останавливаем RealPlay
        CLIENT_StopRealPlayEx((LLONG)realplay);
        
        [DahuaSdkPlugin emitLog:@"[DahuaBridge] RealPlay stopped"]; 
    }
}

bool dh_ptz_control(DHHandle login, int cmd, int speed, bool start) {
    BOOL ok = CLIENT_DHPTZControlEx2((LLONG)login, 
                                     0,
                                     cmd,
                                     0,
                                     start ? 0 : 1,
                                     0,
                                     NULL,
                                     0);
    return ok ? true : false;
}

#endif