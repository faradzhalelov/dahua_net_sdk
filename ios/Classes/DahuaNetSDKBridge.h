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

DHHandle dh_start_realplay(DHHandle login, UIView* renderView);
void     dh_stop_realplay(DHHandle realplay);

/// PTZ: cmd/speed/stop - параметры зависят от netsdk.h (замените на реальные значения)
bool     dh_ptz_control(DHHandle loginOrReal, int cmd, int speed, bool start);

#ifdef __cplusplus
}
#endif
