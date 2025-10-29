#import "DahuaNetSDKBridge.h"

#import <TargetConditionals.h>

#if TARGET_OS_SIMULATOR
// Simulator stubs: Dahua SDK vendor libraries are device-only. Provide no-op
// implementations so the app can run in Simulator without linking the SDK.

void dh_init(void) {
    NSLog(@"[DahuaBridge] Simulator: dh_init() stub");
}

void dh_cleanup(void) {
    NSLog(@"[DahuaBridge] Simulator: dh_cleanup() stub");
}

DHHandle dh_login(const char* ip, int port, const char* user, const char* pass) {
    NSLog(@"[DahuaBridge] Simulator: dh_login() stub — returns 0");
    return 0;
}

void dh_logout(DHHandle login) {
    NSLog(@"[DahuaBridge] Simulator: dh_logout() stub");
}

DHHandle dh_start_realplay(DHHandle login, UIView* renderView) {
    NSLog(@"[DahuaBridge] Simulator: dh_start_realplay() stub — returns 0");
    return 0;
}

void dh_stop_realplay(DHHandle realplay) {
    NSLog(@"[DahuaBridge] Simulator: dh_stop_realplay() stub");
}

bool dh_ptz_control(DHHandle login, int cmd, int speed, bool start) {
    NSLog(@"[DahuaBridge] Simulator: dh_ptz_control() stub — returns false");
    return false;
}

#else

#import "3rdparty/include/netsdk.h"
#import "3rdparty/include/play.h"

static BOOL g_inited = NO;

void dh_init(void) {
    if (g_inited) return;
    CLIENT_Init(NULL, 0);
    CLIENT_SetAutoReconnect(NULL, NULL);
    g_inited = YES;
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
        NSLog(@"[DahuaBridge] Login failed, error: 0x%x", err);
    } else {
        NSLog(@"[DahuaBridge] Login success, ID: %lld", h);
    }
    
    return (DHHandle)h;
}

void dh_logout(DHHandle login) {
    if (login) {
        CLIENT_Logout((LLONG)login);
    }
}

DHHandle dh_start_realplay(DHHandle login, UIView* renderView) {
    if (!login || !renderView) return 0;
    
    LLONG real = CLIENT_RealPlayEx((LLONG)login, 0, (__bridge void*)renderView, DH_RType_Realplay);
    
    if (real == 0) {
        int err = CLIENT_GetLastError();
        NSLog(@"[DahuaBridge] RealPlay failed, error: 0x%x", err);
    }
    
    return (DHHandle)real;
}

void dh_stop_realplay(DHHandle realplay) {
    if (realplay) {
        CLIENT_StopRealPlayEx((LLONG)realplay);
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