#ifndef _LINK_IPC_WIFI_H_
#define _LINK_IPC_WIFI_H_



#ifdef __cplusplus
extern "C"
{
#endif

/** start send data to IPC
 *
 * (in)szDeviceSN       device serial number, can't be NULL
 * (in)szSSID           ssid name, can't be NULL
 * (in)szSSIDPassword   ssid password
 * return       0 success; other failed
 */
extern int CLIENT_StartSearchIPCWifi(const char *szDeviceSN, const char *szSSID, const char *szSSIDPassword);

/** stop send data to IPC
 * return       0 success; other failed
 */
extern int CLIENT_StopSearchIPCWifi();

/** start send data to IPC
 *
 * (in)szDeviceSN       device serial number, can't be NULL
 * (in)szSSID           ssid name, can't be NULL
 * (in)szSSIDPassword   ssid password
 * (in)nWaitTime		waittime, unit:second
 * return       0 success; other failed
 */
extern int CLIENT_ConfigIPCWifi(const char *szDeviceSN, const char *szSSID, const char *szSSIDPassword,int nWaitTime);

#ifdef __cplusplus
} //extern "C"
#endif

#endif //_LINK_IPC_WIFI_H_
