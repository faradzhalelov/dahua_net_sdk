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

bool dh_get_wlan_config(DHHandle login, DHWlanConfig* config) {
    NSLog(@"[DahuaBridge] Simulator: dh_get_wlan_config() stub — returns false");
    [DahuaSdkPlugin emitLog:@"[DahuaBridge] Simulator: dh_get_wlan_config() stub — returns false"];
    return false;
}

bool dh_set_wlan_config(DHHandle login, const DHWlanConfig* config) {
    NSLog(@"[DahuaBridge] Simulator: dh_set_wlan_config() stub — returns false");
    [DahuaSdkPlugin emitLog:@"[DahuaBridge] Simulator: dh_set_wlan_config() stub — returns false"];
    return false;
}

int dh_scan_wlan_devices(DHHandle login, DHWlanDevice* devices, int maxDevices) {
    NSLog(@"[DahuaBridge] Simulator: dh_scan_wlan_devices() stub — returns 0");
    [DahuaSdkPlugin emitLog:@"[DahuaBridge] Simulator: dh_scan_wlan_devices() stub — returns 0"];
    return 0;
}

#else

#import "3rdparty/include/netsdk.h"
#import "3rdparty/include/configsdk.h"
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
    BOOL ok = CLIENT_DHPTZControlEx2((LLONG)login, cmd, speed, speed, speed, start, 0);
    NSString* msg = [NSString stringWithFormat:@"[DahuaBridge] PTZ cmd=%d speed=%d start=%d => %d", cmd, speed, (int)start, (int)ok];
    NSLog(@"%@", msg);
    [DahuaSdkPlugin emitLog:msg];
    return (bool)ok;
}

// Helper: Calculate encryption mode from authMode and encryptionAlg (from APConfigViewController)
static int calculateEncryption(int byAuthMode, int byEncrAlgr) {
    int nEncryption = 0;
    if(byAuthMode == 6 && byEncrAlgr == 0) nEncryption = 0;
    else if(byAuthMode == 0 && byEncrAlgr == 0) nEncryption = 1;
    else if(byAuthMode == 0 && byEncrAlgr == 4) nEncryption = 2;
    else if(byAuthMode == 1 && byEncrAlgr == 4) nEncryption = 3;
    else if(byAuthMode == 2 && byEncrAlgr == 5) nEncryption = 4;
    else if(byAuthMode == 3 && byEncrAlgr == 5) nEncryption = 5;
    else if(byAuthMode == 4 && byEncrAlgr == 5) nEncryption = 6;
    else if(byAuthMode == 5 && byEncrAlgr == 5) nEncryption = 7;
    else if(byAuthMode == 2 && byEncrAlgr == 6) nEncryption = 8;
    else if(byAuthMode == 3 && byEncrAlgr == 6) nEncryption = 9;
    else if(byAuthMode == 4 && byEncrAlgr == 6) nEncryption = 10;
    else if(byAuthMode == 5 && byEncrAlgr == 6) nEncryption = 11;
    else if(byAuthMode == 2 && byEncrAlgr == 7) nEncryption = 8;
    else if(byAuthMode == 3 && byEncrAlgr == 7) nEncryption = 9;
    else if(byAuthMode == 4 && byEncrAlgr == 7) nEncryption = 10;
    else if(byAuthMode == 5 && byEncrAlgr == 7) nEncryption = 11;
    else if(byAuthMode == 7) {
        if(byEncrAlgr == 5) nEncryption = 7;
        else if(byEncrAlgr == 6) nEncryption = 11;
        else if(byEncrAlgr == 7) nEncryption = 11;
        else nEncryption = 12;
    }
    else if(byAuthMode == 8) {
        if(byEncrAlgr == 5) nEncryption = 6;
        else if(byEncrAlgr == 6) nEncryption = 10;
        else if(byEncrAlgr == 7) nEncryption = 10;
        else nEncryption = 12;
    }
    else if(byAuthMode == 9) {
        if(byEncrAlgr == 5) nEncryption = 5;
        else if(byEncrAlgr == 6) nEncryption = 9;
        else if(byEncrAlgr == 7) nEncryption = 9;
        else nEncryption = 12;
    }
    else if(byAuthMode == 10) {
        if(byEncrAlgr == 5) nEncryption = 7;
        else if(byEncrAlgr == 6) nEncryption = 11;
        else if(byEncrAlgr == 7) nEncryption = 11;
        else nEncryption = 12;
    }
    else if(byAuthMode == 11) {
        if(byEncrAlgr == 5) nEncryption = 7;
        else if(byEncrAlgr == 6) nEncryption = 11;
        else if(byEncrAlgr == 7) nEncryption = 11;
        else nEncryption = 12;
    } else {
        nEncryption = 12;
    }
    return nEncryption;
}

bool dh_get_wlan_config(DHHandle login, DHWlanConfig* config) {
    if (!config) return false;
    
    char *pszBuf = new char[1024*10];
    memset(pszBuf, 0, 1024*10);
    int nError = 0;
    
    BOOL bRet = CLIENT_GetNewDevConfig((LLONG)login, (char*)CFG_CMD_WLAN, -1, pszBuf, 1024*10, &nError, 10000);
    if (bRet) {
        CFG_NETAPP_WLAN stCfg;
        memset(&stCfg, 0, sizeof(stCfg));
        CLIENT_ParseData((char*)CFG_CMD_WLAN, pszBuf, &stCfg, sizeof(stCfg), NULL);
        
        // Extract first WiFi config
        strncpy(config->ssid, stCfg.stuWlanInfo[0].szSSID, sizeof(config->ssid) - 1);
        strncpy(config->password, stCfg.stuWlanInfo[0].szKeys[0], sizeof(config->password) - 1);
        config->enabled = stCfg.stuWlanInfo[0].bEnable;
        config->connectEnabled = stCfg.stuWlanInfo[0].bConnectEnable;
        config->encryption = stCfg.stuWlanInfo[0].nEncryption;
        
        NSString* msg = [NSString stringWithFormat:@"[DahuaBridge] Get WLAN config: SSID='%s', encryption=%d", 
                        config->ssid, config->encryption];
        NSLog(@"%@", msg);
        [DahuaSdkPlugin emitLog:msg];
    } else {
        int errCode = CLIENT_GetLastError() & 0x7fffffff;
        NSString* msg = [NSString stringWithFormat:@"[DahuaBridge] Get WLAN config failed: error=%d", errCode];
        NSLog(@"%@", msg);
        [DahuaSdkPlugin emitLog:msg];
    }
    
    delete[] pszBuf;
    return (bool)bRet;
}

bool dh_set_wlan_config(DHHandle login, const DHWlanConfig* config) {
    if (!config) return false;
    
    char *pszBuf = new char[1024*10];
    memset(pszBuf, 0, 1024*10);
    int nError = 0;
    
    // First get current config
    BOOL bRet = CLIENT_GetNewDevConfig((LLONG)login, (char*)CFG_CMD_WLAN, -1, pszBuf, 1024*10, &nError, 10000);
    if (bRet) {
        CFG_NETAPP_WLAN stCfg;
        memset(&stCfg, 0, sizeof(stCfg));
        CLIENT_ParseData((char*)CFG_CMD_WLAN, pszBuf, &stCfg, sizeof(stCfg), NULL);
        
        // Update with new values
        strncpy(stCfg.stuWlanInfo[0].szSSID, config->ssid, sizeof(stCfg.stuWlanInfo[0].szSSID) - 1);
        strncpy(stCfg.stuWlanInfo[0].szKeys[0], config->password, sizeof(stCfg.stuWlanInfo[0].szKeys[0]) - 1);
        
        stCfg.stuWlanInfo[0].bEnable = config->enabled ? YES : NO;
        stCfg.stuWlanInfo[0].bConnectEnable = config->connectEnabled ? YES : NO;
        stCfg.stuWlanInfo[0].nKeyID = 0;
        stCfg.stuWlanInfo[0].bKeyFlag = NO;
        stCfg.stuWlanInfo[0].bLinkEnable = YES;
        stCfg.stuWlanInfo[0].nLinkMode = 0;
        
        // Calculate encryption from authMode and encryptionAlg
        int nEncryption = calculateEncryption(config->authMode, config->encryptionAlg);
        stCfg.stuWlanInfo[0].nEncryption = nEncryption;
        
        strncpy(stCfg.stuWlanInfo[0].stuNetwork.szDnsServers[0], "8.8.8.8", 
                sizeof(stCfg.stuWlanInfo[0].stuNetwork.szDnsServers[0]) - 1);
        strncpy(stCfg.stuWlanInfo[0].stuNetwork.szDnsServers[1], "8.8.4.4", 
                sizeof(stCfg.stuWlanInfo[0].stuNetwork.szDnsServers[1]) - 1);
        
        memset(pszBuf, 0, 1024*10);
        CLIENT_PacketData((char*)CFG_CMD_WLAN, &stCfg, sizeof(stCfg), pszBuf, 1024*10);
        
        bRet = CLIENT_SetNewDevConfig((LLONG)login, (char*)CFG_CMD_WLAN, -1, pszBuf, 1024*10, &nError, NULL, 10000);
        
        if (bRet) {
            NSString* msg = [NSString stringWithFormat:@"[DahuaBridge] Set WLAN config success: SSID='%s', encryption=%d", 
                            config->ssid, nEncryption];
            NSLog(@"%@", msg);
            [DahuaSdkPlugin emitLog:msg];
        } else {
            int errCode = CLIENT_GetLastError() & 0x7fffffff;
            NSString* msg = [NSString stringWithFormat:@"[DahuaBridge] Set WLAN config failed: error=%d", errCode];
            NSLog(@"%@", msg);
            [DahuaSdkPlugin emitLog:msg];
        }
    } else {
        int errCode = CLIENT_GetLastError() & 0x7fffffff;
        NSString* msg = [NSString stringWithFormat:@"[DahuaBridge] Get WLAN config (for set) failed: error=%d", errCode];
        NSLog(@"%@", msg);
        [DahuaSdkPlugin emitLog:msg];
    }
    
    delete[] pszBuf;
    return (bool)bRet;
}

int dh_scan_wlan_devices(DHHandle login, DHWlanDevice* devices, int maxDevices) {
    if (!devices || maxDevices <= 0) return 0;
    
    DHDEV_WLAN_DEVICE_LIST_EX2 st;
    memset(&st, 0, sizeof(st));
    st.dwSize = sizeof(st);
    
    unsigned int retLen = 0;
    BOOL bRet = CLIENT_GetDevConfig((LLONG)login, DH_DEV_WLAN_DEVICE_CFG_EX2, -1, &st, sizeof(st), &retLen, 5000);
    
    if (bRet) {
        int count = st.bWlanDevCount;
        if (count > maxDevices) count = maxDevices;
        
        for (int i = 0; i < count; i++) {
            strncpy(devices[i].ssid, st.lstWlanDev[i].szSSID, sizeof(devices[i].ssid) - 1);
            devices[i].authMode = st.lstWlanDev[i].byAuthMode;
            devices[i].encryptionAlg = st.lstWlanDev[i].byEncrAlgr;
            devices[i].signalLevel = st.lstWlanDev[i].byLinkQuality; // 0-100%
        }
        
        NSString* msg = [NSString stringWithFormat:@"[DahuaBridge] Scanned %d WiFi devices", count];
        NSLog(@"%@", msg);
        [DahuaSdkPlugin emitLog:msg];
        
        return count;
    } else {
        int errCode = CLIENT_GetLastError() & 0x7fffffff;
        NSString* msg = [NSString stringWithFormat:@"[DahuaBridge] WiFi scan failed: error=%d", errCode];
        NSLog(@"%@", msg);
        [DahuaSdkPlugin emitLog:msg];
        return 0;
    }
}

#endif
