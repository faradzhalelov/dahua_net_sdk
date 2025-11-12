package com.dahua.sdk.dahua_sdk;

import android.content.Context;
import android.util.Log;

import com.company.NetSDK.*;
import com.company.PlaySDK.IPlaySDK;
import com.company.SmartConfig.ISmartConfig;

import java.util.HashMap;
import java.util.Map;

/**
 * DahuaNetSDKBridge - Bridge between Flutter plugin and Dahua NetSDK
 * Handles all SDK initialization, login, real-play, and PTZ control operations
 */
public class DahuaNetSDKBridge {
    private static final String TAG = "DahuaNetSDKBridge";
    private static boolean isInitialized = false;
    
    private final Context context;
    private long searchHandle = 0;
    private DeviceSearchListener searchListener;

    /**
     * Listener interface for device search results
     */
    public interface DeviceSearchListener {
        void onDeviceFound(Map<String, Object> deviceInfo);
    }

    static {
        try {
            System.loadLibrary("netsdk");
            System.loadLibrary("configsdk");
            System.loadLibrary("play");
            System.loadLibrary("avnetsdk");
            DahuaSdkPlugin.emitLog("Native libraries loaded successfully");
        } catch (UnsatisfiedLinkError e) {
            Log.e(TAG, "Failed to load native libraries: " + e.getMessage(), e);
            DahuaSdkPlugin.emitLog("Failed to load native libraries: " + e.getMessage());
        }
    }

    public DahuaNetSDKBridge(Context context) {
        this.context = context;
    }

    /**
     * Initialize Dahua NetSDK
     */
    public void init() {
        if (isInitialized) {
            DahuaSdkPlugin.emitLog("NetSDK already initialized");
            return;
        }

        try {
            INetSDK.Init(null);
            INetSDK.SetAutoReconnect(null);
            
            isInitialized = true;
            DahuaSdkPlugin.emitLog("NetSDK initialized successfully");
        } catch (Exception e) {
            Log.e(TAG, "Failed to initialize NetSDK: " + e.getMessage(), e);
            DahuaSdkPlugin.emitLog("Failed to initialize NetSDK: " + e.getMessage());
            throw e;
        }
    }

    /**
     * Cleanup Dahua NetSDK
     */
    public void cleanup() {
        if (!isInitialized) {
            return;
        }
        
        try {
            INetSDK.Cleanup();
            isInitialized = false;
            DahuaSdkPlugin.emitLog("NetSDK cleaned up");
        } catch (Exception e) {
            Log.e(TAG, "Failed to cleanup NetSDK: " + e.getMessage(), e);
        }
    }

    /**
     * Login to Dahua device
     * @return login handle, 0 if failed
     */
    public long login(String ip, int port, String username, String password) {
        NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY loginInfo = new NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY();
        
        // Copy string bytes to fixed-size byte arrays (64 bytes each)
        // The native SDK expects fixed-size buffers
        copyStringToByteArray(ip, loginInfo.szIP);
        loginInfo.nPort = port;
        copyStringToByteArray(username, loginInfo.szUserName);
        copyStringToByteArray(password, loginInfo.szPassword);

        NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY outInfo = new NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY();
        long loginHandle = INetSDK.LoginWithHighLevelSecurity(loginInfo, outInfo);

        if (loginHandle == 0L) {
            int error = INetSDK.GetLastError();
            String msg = "Login failed for " + ip + ":" + port + ", error: " + error;
            Log.e(TAG, msg);
            DahuaSdkPlugin.emitLog(msg);
        } else {
            String msg = "Login successful for " + ip + ":" + port + ", handle: " + loginHandle;
            Log.d(TAG, msg);
            DahuaSdkPlugin.emitLog(msg);
        }

        return loginHandle;
    }

    /**
     * Logout from Dahua device
     */
    public void logout(long loginHandle) {
        if (loginHandle == 0L) {
            return;
        }
        
        try {
            INetSDK.Logout(loginHandle);
            DahuaSdkPlugin.emitLog("Logout successful for handle: " + loginHandle);
        } catch (Exception e) {
            Log.e(TAG, "Logout failed: " + e.getMessage(), e);
        }
    }

    /**
     * Start real-time video playback
     * @param loginHandle login handle from login()
     * @param channel channel index (0-based)
     * @param streamType stream type (0=Main, 1=Extra1, 2=Extra2)
     * @param callback data callback for receiving video data
     * @return real play handle, 0 if failed
     */
    public long startRealPlay(long loginHandle, int channel, int streamType, CB_fRealDataCallBackEx callback) {
        if (loginHandle == 0L) {
            DahuaSdkPlugin.emitLog("Invalid login handle");
            return 0L;
        }

        // Map stream type: 0=Main, 1=Extra1, 2=Extra2
        int realPlayType;
        switch (streamType) {
            case 0:
                realPlayType = 0; // Main stream
                break;
            case 1:
                realPlayType = 1; // Extra stream 1
                break;
            case 2:
                realPlayType = 2; // Extra stream 2
                break;
            case 3:
                realPlayType = 3; // Extra stream 3
                break;
            default:
                realPlayType = 0; // Default to main stream
                break;
        }

        NET_IN_REALPLAY_BY_DATA_TYPE realPlayInfo = new NET_IN_REALPLAY_BY_DATA_TYPE();
        realPlayInfo.cbRealData = callback;
        realPlayInfo.rType = realPlayType;
        realPlayInfo.nChannelID = channel;
        // Request private data format for direct playback
        realPlayInfo.emDataType = 0; // EM_REAL_DATA_TYPE_PRIVATE

        NET_OUT_REALPLAY_BY_DATA_TYPE outInfo = new NET_OUT_REALPLAY_BY_DATA_TYPE();
        long realHandle = INetSDK.RealPlayByDataType(loginHandle, realPlayInfo, outInfo, 5000);

        if (realHandle == 0L) {
            int error = INetSDK.GetLastError();
            String msg = "RealPlay failed for channel " + channel + ", streamType " + streamType + ", error: " + error;
            Log.e(TAG, msg);
            DahuaSdkPlugin.emitLog(msg);
        } else {
            String msg = "RealPlay started for channel " + channel + ", streamType " + streamType + ", handle: " + realHandle;
            Log.d(TAG, msg);
            DahuaSdkPlugin.emitLog(msg);
        }

        return realHandle;
    }

    /**
     * Stop real-time video playback
     */
    public void stopRealPlay(long realHandle) {
        if (realHandle == 0L) {
            return;
        }
        
        try {
            INetSDK.StopRealPlayEx(realHandle);
            DahuaSdkPlugin.emitLog("RealPlay stopped for handle: " + realHandle);
        } catch (Exception e) {
            Log.e(TAG, "Stop RealPlay failed: " + e.getMessage(), e);
        }
    }

    /**
     * PTZ (Pan-Tilt-Zoom) control
     * @param handle login or real play handle
     * @param cmd PTZ command
     * @param speed PTZ speed (1-8)
     * @param start true to start, false to stop
     * @return true if successful
     */
    public boolean ptzControl(long handle, int cmd, int speed, boolean start) {
        if (handle == 0) {
            DahuaSdkPlugin.emitLog("PTZ control failed: Invalid handle");
            return false;
        }
        
        try {
            // PTZControl signature: PTZControl(long handle, int cmd, int param1, int param2, boolean start)
            boolean result = INetSDK.PTZControl(handle, cmd, 0, speed, start);
            if (result) {
                DahuaSdkPlugin.emitLog("PTZ control success: cmd=" + cmd + ", speed=" + speed + ", start=" + start);
            } else {
                DahuaSdkPlugin.emitLog("PTZ control failed: cmd=" + cmd + ", error=" + INetSDK.GetLastError());
            }
            return result;
        } catch (Exception e) {
            DahuaSdkPlugin.emitLog("PTZ control exception: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * Helper method to safely copy a string to a fixed-size byte array
     * Ensures the byte array is properly sized for the native SDK
     * @param source Source string
     * @param dest Destination byte array (must be pre-allocated)
     */
    private void copyStringToByteArray(String source, byte[] dest) {
        if (source == null || dest == null) {
            return;
        }
        
        try {
            byte[] sourceBytes = source.getBytes("UTF-8");
            int copyLength = Math.min(sourceBytes.length, dest.length - 1); // Leave room for null terminator
            System.arraycopy(sourceBytes, 0, dest, 0, copyLength);
            // Fill remaining bytes with 0
            for (int i = copyLength; i < dest.length; i++) {
                dest[i] = 0;
            }
        } catch (Exception e) {
            Log.e(TAG, "copyStringToByteArray error: " + e.getMessage());
        }
    }

    /**
     * Helper method to convert byte array to string
     */
    private String byteArrayToString(byte[] bytes) {
        if (bytes == null) return "";
        
        try {
            // Find the null terminator
            int length = 0;
            for (int i = 0; i < bytes.length; i++) {
                if (bytes[i] == 0) break;
                length++;
            }
            return new String(bytes, 0, length, "UTF-8");
        } catch (Exception e) {
            Log.e(TAG, "byteArrayToString error: " + e.getMessage());
            return "";
        }
    }

    /**
     * Get WiFi (WLAN) configuration from device
     * @param loginHandle login handle from login()
     * @return CFG_WLAN_INFO object or null if failed
     */
    public CFG_WLAN_INFO getWlanConfig(long loginHandle) {
        if (loginHandle == 0L) {
            Log.e(TAG, "getWlanConfig: invalid login handle");
            return null;
        }

        try {
            CFG_NETAPP_WLAN stCfg = new CFG_NETAPP_WLAN();
            
            // Use GetDevConfig to retrieve WLAN configuration
            char[] szBuffer = new char[10240];
            Integer error = 0;
            Integer retLen = 0;
            
            boolean result = INetSDK.GetNewDevConfig(
                loginHandle,
                FinalVar.CFG_CMD_WLAN,
                -1,  // channel
                szBuffer,
                10240,
                error,
                5000  // timeout
            );

            if (result) {
                // Parse the received data
                if (INetSDK.ParseData(FinalVar.CFG_CMD_WLAN, szBuffer, stCfg, 10240)) {
                    DahuaSdkPlugin.emitLog("GetWlanConfig success");
                    return stCfg.stuWlanInfo[0];  // Return first WLAN config
                } else {
                    Log.e(TAG, "Failed to parse WLAN config data");
                    DahuaSdkPlugin.emitLog("Failed to parse WLAN config data");
                }
            } else {
                Log.e(TAG, "GetWlanConfig failed with error: " + error);
                DahuaSdkPlugin.emitLog("GetWlanConfig failed with error: " + error);
            }
        } catch (Exception e) {
            Log.e(TAG, "getWlanConfig exception: " + e.getMessage(), e);
            DahuaSdkPlugin.emitLog("getWlanConfig exception: " + e.getMessage());
        }

        return null;
    }

    /**
     * Set WiFi (WLAN) configuration to device
     * @param loginHandle login handle from login()
     * @param ssid WiFi network name
     * @param password WiFi password
     * @param encryption Encryption mode (see CFG_WLAN_INFO.nEncryption)
     * @return true if successful
     */
    public boolean setWlanConfig(long loginHandle, String ssid, String password, int encryption) {
        if (loginHandle == 0L) {
            Log.e(TAG, "setWlanConfig: invalid login handle");
            return false;
        }

        try {
            // First get current config
            CFG_NETAPP_WLAN stCfg = new CFG_NETAPP_WLAN();
            char[] szBuffer = new char[10240];
            Integer error = 0;
            
            boolean result = INetSDK.GetNewDevConfig(
                loginHandle,
                FinalVar.CFG_CMD_WLAN,
                -1,
                szBuffer,
                10240,
                error,
                5000
            );

            if (!result || !INetSDK.ParseData(FinalVar.CFG_CMD_WLAN, szBuffer, stCfg, 10240)) {
                Log.e(TAG, "Failed to get current WLAN config");
                return false;
            }

            // Modify the configuration
            copyStringToByteArray(ssid, stCfg.stuWlanInfo[0].szSSID);
            copyStringToByteArray(password, stCfg.stuWlanInfo[0].szKeys[0]);
            stCfg.stuWlanInfo[0].nEncryption = encryption;
            stCfg.stuWlanInfo[0].bEnable = true;
            stCfg.stuWlanInfo[0].bConnectEnable = true;
            stCfg.stuWlanInfo[0].nKeyID = 0;
            stCfg.stuWlanInfo[0].bKeyFlag = false;
            stCfg.stuWlanInfo[0].bLinkEnable = true;

            // Set DNS servers
            copyStringToByteArray("8.8.8.8", stCfg.stuWlanInfo[0].stuNetwork.szDnsServers[0]);
            copyStringToByteArray("8.8.4.4", stCfg.stuWlanInfo[0].stuNetwork.szDnsServers[1]);

            // Now set the configuration
            char[] szOutBuffer = new char[10240];
            if (!INetSDK.PacketData(FinalVar.CFG_CMD_WLAN, stCfg, szOutBuffer, 10240)) {
                Log.e(TAG, "Failed to packet WLAN config data");
                DahuaSdkPlugin.emitLog("Failed to packet WLAN config data");
                return false;
            }

            Integer restart = 0;
            result = INetSDK.SetNewDevConfig(
                loginHandle,
                FinalVar.CFG_CMD_WLAN,
                -1,
                szOutBuffer,
                10240,
                error,
                restart,
                3000  // Short timeout as device will disconnect
            );

            if (result) {
                DahuaSdkPlugin.emitLog("SetWlanConfig success");
                return true;
            } else {
                Log.e(TAG, "SetWlanConfig failed with error: " + error);
                DahuaSdkPlugin.emitLog("SetWlanConfig failed with error: " + error);
            }
        } catch (Exception e) {
            Log.e(TAG, "setWlanConfig exception: " + e.getMessage(), e);
            DahuaSdkPlugin.emitLog("setWlanConfig exception: " + e.getMessage());
        }

        return false;
    }

    /**
     * Scan for available WiFi networks
     * @param loginHandle login handle from login()
     * @return array of SDKDEV_WLAN_DEVICE_EX or null if failed
     */
    public SDKDEV_WLAN_DEVICE_EX[] scanWlanDevices(long loginHandle) {
        if (loginHandle == 0L) {
            Log.e(TAG, "scanWlanDevices: invalid login handle");
            return null;
        }

        try {
            SDKDEV_WLAN_DEVICE_LIST_EX2[] stListEx2 = new SDKDEV_WLAN_DEVICE_LIST_EX2[1];
            stListEx2[0] = new SDKDEV_WLAN_DEVICE_LIST_EX2();
            Integer stIntRet = 0;

            boolean result = INetSDK.GetDevConfig(
                loginHandle,
                FinalVar.SDK_DEV_WLAN_DEVICE_CFG_EX2,
                -1,
                stListEx2,
                stIntRet,
                5000
            );

            if (result && stListEx2[0].bWlanDevCount > 0) {
                DahuaSdkPlugin.emitLog("ScanWlanDevices success, found " + stListEx2[0].bWlanDevCount + " networks");
                
                // Return only the valid entries
                SDKDEV_WLAN_DEVICE_EX[] devices = new SDKDEV_WLAN_DEVICE_EX[stListEx2[0].bWlanDevCount];
                System.arraycopy(stListEx2[0].lstWlanDev, 0, devices, 0, stListEx2[0].bWlanDevCount);
                return devices;
            } else {
                Log.e(TAG, "ScanWlanDevices failed or no networks found");
                DahuaSdkPlugin.emitLog("ScanWlanDevices failed or no networks found");
            }
        } catch (Exception e) {
            Log.e(TAG, "scanWlanDevices exception: " + e.getMessage(), e);
            DahuaSdkPlugin.emitLog("scanWlanDevices exception: " + e.getMessage());
        }

        return null;
    }

    /**
     * Start device search on the network
     * @param listener Callback for found devices
     */
    public void startDeviceSearch(DeviceSearchListener listener) {
        if (searchHandle != 0) {
            DahuaSdkPlugin.emitLog("Device search already running");
            return;
        }

        this.searchListener = listener;

        try {
            // Create callback for device search
            CB_fSearchDevicesCB callback = new CB_fSearchDevicesCB() {
                @Override
                public void invoke(DEVICE_NET_INFO_EX deviceInfo) {
                    if (deviceInfo != null && searchListener != null) {
                        try {
                            // Convert device info to Map for Flutter
                            Map<String, Object> deviceMap = new HashMap<>();
                            deviceMap.put("serialNo", byteArrayToString(deviceInfo.szSerialNo));
                            deviceMap.put("ip", byteArrayToString(deviceInfo.szIP));
                            deviceMap.put("mac", byteArrayToString(deviceInfo.szMac));
                            deviceMap.put("port", deviceInfo.nPort);
                            deviceMap.put("initialized", deviceInfo.byInitStatus != 0);
                            deviceMap.put("ipVersion", deviceInfo.iIPVersion);
                            deviceMap.put("deviceType", byteArrayToString(deviceInfo.szDeviceType));

                            searchListener.onDeviceFound(deviceMap);

                            DahuaSdkPlugin.emitLog("Found device: " + byteArrayToString(deviceInfo.szSerialNo) + 
                                " at " + byteArrayToString(deviceInfo.szIP));
                        } catch (Exception e) {
                            Log.e(TAG, "Error processing device info: " + e.getMessage(), e);
                            DahuaSdkPlugin.emitLog("Error processing device info: " + e.getMessage());
                        }
                    }
                }
            };

            // Start search
            searchHandle = INetSDK.StartSearchDevices(callback);

            if (searchHandle != 0) {
                DahuaSdkPlugin.emitLog("Device search started, handle=" + searchHandle);
            } else {
                Log.e(TAG, "Failed to start device search");
                DahuaSdkPlugin.emitLog("Failed to start device search");
            }
        } catch (Exception e) {
            Log.e(TAG, "startDeviceSearch exception: " + e.getMessage(), e);
            DahuaSdkPlugin.emitLog("startDeviceSearch exception: " + e.getMessage());
        }
    }

    /**
     * Stop device search
     */
    public void stopDeviceSearch() {
        if (searchHandle != 0) {
            try {
                INetSDK.StopSearchDevices(searchHandle);
                DahuaSdkPlugin.emitLog("Device search stopped, handle=" + searchHandle);
                searchHandle = 0;
                searchListener = null;
            } catch (Exception e) {
                Log.e(TAG, "stopDeviceSearch exception: " + e.getMessage(), e);
                DahuaSdkPlugin.emitLog("stopDeviceSearch exception: " + e.getMessage());
            }
        }
    }

    /**
     * Get WiFi list from device without login
     * This method gets the WiFi networks list from a device by IP and port only, no login required
     * @param deviceIp Device IP address
     * @param devicePort Device port (typically 37777)
     * @return Array of WiFi devices or null on error
     */
    public SDKDEV_WLAN_DEVICE_EX[] getDevWifiList(String deviceIp, int devicePort) {
        if (deviceIp == null || deviceIp.isEmpty()) {
            Log.e(TAG, "getDevWifiList: Invalid device IP");
            DahuaSdkPlugin.emitLog("getDevWifiList: Invalid device IP");
            return null;
        }

        try {
            NET_IN_GET_DEV_WIFI_LIST stIn = new NET_IN_GET_DEV_WIFI_LIST();
            NET_OUT_GET_DEV_WIFI_LIST stOut = new NET_OUT_GET_DEV_WIFI_LIST();
            
            stIn.nPort = devicePort;
            byte[] ipBytes = deviceIp.getBytes();
            System.arraycopy(ipBytes, 0, stIn.szDevIP, 0, Math.min(ipBytes.length, stIn.szDevIP.length));

            DahuaSdkPlugin.emitLog("GetDevWifiList: requesting from " + deviceIp + ":" + devicePort);

            boolean result = INetSDK.GetDevWifiListInfo(stIn, stOut, 10000);

            if (result && stOut.nWlanDevCount > 0) {
                DahuaSdkPlugin.emitLog("GetDevWifiList success, found " + stOut.nWlanDevCount + " networks");
                
                // Return only the valid entries
                SDKDEV_WLAN_DEVICE_EX[] devices = new SDKDEV_WLAN_DEVICE_EX[stOut.nWlanDevCount];
                System.arraycopy(stOut.stuWlanDev, 0, devices, 0, stOut.nWlanDevCount);
                return devices;
            } else {
                int error = INetSDK.GetLastError();
                Log.e(TAG, "GetDevWifiList failed, error: " + error);
                DahuaSdkPlugin.emitLog("GetDevWifiList failed or no networks found, error: " + error);
            }
        } catch (Exception e) {
            Log.e(TAG, "getDevWifiList exception: " + e.getMessage(), e);
            DahuaSdkPlugin.emitLog("getDevWifiList exception: " + e.getMessage());
        }

        return null;
    }

    /**
     * Start WiFi Smart Configuration for device in Soft AP mode
     * This method sends WiFi credentials to the device via sound/FSK modulation
     * @param serialNumber Device serial number
     * @param ssid Home WiFi SSID
     * @param password Home WiFi password
     * @return true on success
     */
    public boolean startSmartConfig(String serialNumber, String ssid, String password) {
        if (serialNumber == null || serialNumber.isEmpty() || ssid == null || ssid.isEmpty()) {
            Log.e(TAG, "startSmartConfig: Invalid parameters");
            DahuaSdkPlugin.emitLog("startSmartConfig: Invalid parameters");
            return false;
        }

        try {
            int result = ISmartConfig.StartSearchIPCWifi(serialNumber, ssid, password != null ? password : "");
            
            if (result == 0) {
                DahuaSdkPlugin.emitLog("Started smart config for device: " + serialNumber);
                return true;
            } else {
                Log.e(TAG, "StartSearchIPCWifi failed: " + result);
                DahuaSdkPlugin.emitLog("StartSearchIPCWifi failed: " + result);
                return false;
            }
        } catch (Exception e) {
            Log.e(TAG, "startSmartConfig exception: " + e.getMessage(), e);
            DahuaSdkPlugin.emitLog("startSmartConfig exception: " + e.getMessage());
            return false;
        }
    }

    /**
     * Stop WiFi Smart Configuration
     * @return true on success
     */
    public boolean stopSmartConfig() {
        try {
            int result = ISmartConfig.StopSearchIPCWifi();
            DahuaSdkPlugin.emitLog("Stopped smart config: " + result);
            return result == 0;
        } catch (Exception e) {
            Log.e(TAG, "stopSmartConfig exception: " + e.getMessage(), e);
            DahuaSdkPlugin.emitLog("stopSmartConfig exception: " + e.getMessage());
            return false;
        }
    }

    /**
     * Configure device WiFi with timeout (synchronous operation)
     * This is a blocking call that will wait up to timeoutSeconds
     * @param serialNumber Device serial number
     * @param ssid Home WiFi SSID
     * @param password Home WiFi password
     * @param timeoutSeconds Timeout in seconds
     * @return true on success
     */
    public boolean configDeviceWifi(String serialNumber, String ssid, String password, int timeoutSeconds) {
        if (serialNumber == null || serialNumber.isEmpty() || ssid == null || ssid.isEmpty() || timeoutSeconds <= 0) {
            Log.e(TAG, "configDeviceWifi: Invalid parameters");
            DahuaSdkPlugin.emitLog("configDeviceWifi: Invalid parameters");
            return false;
        }

        try {
            DahuaSdkPlugin.emitLog("Configuring device WiFi: " + serialNumber + ", timeout=" + timeoutSeconds);
            
            int result = ISmartConfig.ConfigIPCWifi(serialNumber, ssid, password != null ? password : "", timeoutSeconds);
            
            if (result == 0) {
                DahuaSdkPlugin.emitLog("Device WiFi configured successfully");
                return true;
            } else {
                Log.e(TAG, "ConfigIPCWifi failed: " + result);
                DahuaSdkPlugin.emitLog("ConfigIPCWifi failed: " + result);
                return false;
            }
        } catch (Exception e) {
            Log.e(TAG, "configDeviceWifi exception: " + e.getMessage(), e);
            DahuaSdkPlugin.emitLog("configDeviceWifi exception: " + e.getMessage());
            return false;
        }
    }
}

