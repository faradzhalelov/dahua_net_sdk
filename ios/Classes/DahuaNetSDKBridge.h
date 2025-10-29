#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

#ifdef __cplusplus
extern "C" {
#endif

typedef long long DHHandle;

void dh_init(void);
void dh_cleanup(void);

DHHandle dh_login(const char* ip, int port, const char* user, const char* pass);
void     dh_logout(DHHandle login);

// Start realplay on a channel with a given stream type.
// channel: physical channel index starting at 0
// streamType: 0 = MainStream (DH_RType_Realplay/_0), 1 = ExtraStream1 (DH_RType_Realplay_1), 2 = ExtraStream2, etc.
DHHandle dh_start_realplay2(DHHandle login, int channel, int streamType, UIView* renderView);
// Backward-compatible helper: defaults to channel 0, main stream
DHHandle dh_start_realplay(DHHandle login, UIView* renderView);
void     dh_stop_realplay(DHHandle realplay);

/// PTZ: cmd/speed/stop - параметры зависят от netsdk.h (замените на реальные значения)
bool     dh_ptz_control(DHHandle loginOrReal, int cmd, int speed, bool start);

#ifdef __cplusplus
}
#endif
