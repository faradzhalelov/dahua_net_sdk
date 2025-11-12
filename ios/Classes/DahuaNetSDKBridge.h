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

/// WiFi Configuration
// Structure for WiFi configuration
typedef struct {
    char ssid[128];
    char password[128];
    int authMode;      // Authentication mode (0=OPEN, 1=SHARED, 2=WPA, 3=WPA-PSK, 4=WPA2, 5=WPA2-PSK, etc.)
    int encryptionAlg; // Encryption algorithm (0=NONE, 4=WEP, 5=TKIP, 6=AES, 7=TKIP+AES)
    int encryption;    // Combined encryption mode (calculated from authMode + encryptionAlg)
    bool enabled;
    bool connectEnabled;
} DHWlanConfig;

// Get WiFi configuration from device
bool     dh_get_wlan_config(DHHandle login, DHWlanConfig* config);
// Set WiFi configuration to device
bool     dh_set_wlan_config(DHHandle login, const DHWlanConfig* config);

/// WiFi Device Scanning
// Structure for a single WiFi device (access point)
typedef struct {
    char ssid[128];
    int authMode;      // Authentication mode
    int encryptionAlg; // Encryption algorithm
    int signalLevel;   // Signal strength (0-100)
} DHWlanDevice;

// Scan for available WiFi devices/networks
// Returns number of devices found, fills devices array (max 128 devices)
int      dh_scan_wlan_devices(DHHandle login, DHWlanDevice* devices, int maxDevices);

// Get WiFi list from device without login (by IP and port only)
// Returns number of networks found, fills devices array (max 128 devices)
int      dh_get_dev_wifi_list(const char* deviceIp, int devicePort, DHWlanDevice* devices, int maxDevices);

/// Device Search by Serial Number
// Structure for device network info
typedef struct {
    char serialNo[128];
    char ip[64];
    char mac[64];
    int port;
    bool initialized;
    int ipVersion;      // 4 for IPv4, 6 for IPv6
    char deviceType[64]; // Device type string
} DHDeviceInfo;

// Callback for device search results
typedef void (*DHDeviceSearchCallback)(const DHDeviceInfo* device, void* userData);

// Start searching for devices on network
// Returns search handle (> 0 on success, 0 on failure)
DHHandle dh_start_search_devices(DHDeviceSearchCallback callback, void* userData);

// Stop device search
void     dh_stop_search_devices(DHHandle searchHandle);

/// WiFi Smart Configuration (Soft AP mode)
// Start sending WiFi credentials to device in Soft AP mode
// Returns 0 on success, non-zero on failure
int      dh_start_smart_config(const char* serialNumber, const char* ssid, const char* password);

// Stop sending WiFi credentials
// Returns 0 on success, non-zero on failure
int      dh_stop_smart_config(void);

// Configure device WiFi with timeout (synchronous)
// Returns 0 on success, non-zero on failure
int      dh_config_device_wifi(const char* serialNumber, const char* ssid, const char* password, int timeoutSeconds);

#ifdef __cplusplus
}
#endif
