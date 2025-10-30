package com.dahua.sdk.dahua_sdk;

import android.content.Context;
import android.util.Log;

import com.company.NetSDK.*;
import com.company.PlaySDK.IPlaySDK;

/**
 * DahuaNetSDKBridge - Bridge between Flutter plugin and Dahua NetSDK
 * Handles all SDK initialization, login, real-play, and PTZ control operations
 */
public class DahuaNetSDKBridge {
    private static final String TAG = "DahuaNetSDKBridge";
    private static boolean isInitialized = false;
    
    private final Context context;

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
            INetSDK.Init(null, null, null);
            INetSDK.SetAutoReconnect(null, null);
            
            // Set PlaySDK log file
            String logPath = context.getFilesDir().getAbsolutePath() + "/dahua_play.log";
            IPlaySDK.PLAYSetLogToFile(3, logPath, 10 * 1024 * 1024);
            
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
        loginInfo.szIP = ip.getBytes();
        loginInfo.nPort = port;
        loginInfo.szUserName = username.getBytes();
        loginInfo.szPassword = password.getBytes();

        NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY outInfo = new NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY();
        LLong loginHandle = INetSDK.LoginWithHighLevelSecurity(loginInfo, outInfo);

        if (loginHandle.longValue() == 0L) {
            int error = INetSDK.GetLastError();
            String msg = "Login failed for " + ip + ":" + port + ", error: " + error;
            Log.e(TAG, msg);
            DahuaSdkPlugin.emitLog(msg);
        } else {
            String msg = "Login successful for " + ip + ":" + port + ", handle: " + loginHandle.longValue();
            Log.d(TAG, msg);
            DahuaSdkPlugin.emitLog(msg);
        }

        return loginHandle.longValue();
    }

    /**
     * Logout from Dahua device
     */
    public void logout(long loginHandle) {
        if (loginHandle == 0L) {
            return;
        }
        
        try {
            INetSDK.Logout(new LLong(loginHandle));
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
    public long startRealPlay(long loginHandle, int channel, int streamType, fRealDataCallBackEx callback) {
        if (loginHandle == 0L) {
            DahuaSdkPlugin.emitLog("Invalid login handle");
            return 0L;
        }

        // Map stream type: 0=Main, 1=Extra1, 2=Extra2
        EM_REALPLAY_TYPE realPlayType;
        switch (streamType) {
            case 0:
                realPlayType = EM_REALPLAY_TYPE.EM_REALPLAY_TYPE_REALPLAY;
                break;
            case 1:
                realPlayType = EM_REALPLAY_TYPE.EM_REALPLAY_TYPE_REALPLAY_1;
                break;
            case 2:
                realPlayType = EM_REALPLAY_TYPE.EM_REALPLAY_TYPE_REALPLAY_2;
                break;
            case 3:
                realPlayType = EM_REALPLAY_TYPE.EM_REALPLAY_TYPE_REALPLAY_3;
                break;
            default:
                realPlayType = EM_REALPLAY_TYPE.EM_REALPLAY_TYPE_REALPLAY;
                break;
        }

        NET_IN_REALPLAY_BY_DATA_TYPE realPlayInfo = new NET_IN_REALPLAY_BY_DATA_TYPE();
        realPlayInfo.cbRealData = callback;
        realPlayInfo.rType = realPlayType;
        realPlayInfo.nChannelID = channel;
        // Request private data format for direct playback
        realPlayInfo.emDataType = EM_REAL_DATA_TYPE.EM_REAL_DATA_TYPE_PRIVATE;

        NET_OUT_REALPLAY_BY_DATA_TYPE outInfo = new NET_OUT_REALPLAY_BY_DATA_TYPE();
        LLong realHandle = INetSDK.RealPlayByDataType(new LLong(loginHandle), realPlayInfo, outInfo, 5000);

        if (realHandle.longValue() == 0L) {
            int error = INetSDK.GetLastError();
            String msg = "RealPlay failed for channel " + channel + ", streamType " + streamType + ", error: " + error;
            Log.e(TAG, msg);
            DahuaSdkPlugin.emitLog(msg);
        } else {
            String msg = "RealPlay started for channel " + channel + ", streamType " + streamType + ", handle: " + realHandle.longValue();
            Log.d(TAG, msg);
            DahuaSdkPlugin.emitLog(msg);
        }

        return realHandle.longValue();
    }

    /**
     * Stop real-time video playback
     */
    public void stopRealPlay(long realHandle) {
        if (realHandle == 0L) {
            return;
        }
        
        try {
            INetSDK.StopRealPlayEx(new LLong(realHandle));
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
        if (handle == 0L) {
            DahuaSdkPlugin.emitLog("Invalid handle for PTZ control");
            return false;
        }

        try {
            boolean result = INetSDK.DHPTZControl(
                new LLong(handle),
                cmd,
                0,      // param1
                speed,  // param2
                0,      // param3
                start ? 0 : 1,  // dwStop: 0=start, 1=stop
                0       // reserved
            );
            
            String msg = "PTZ control: cmd=" + cmd + ", speed=" + speed + ", start=" + start + ", result=" + result;
            Log.d(TAG, msg);
            DahuaSdkPlugin.emitLog(msg);
            
            return result;
        } catch (Exception e) {
            Log.e(TAG, "PTZ control failed: " + e.getMessage(), e);
            DahuaSdkPlugin.emitLog("PTZ control failed: " + e.getMessage());
            return false;
        }
    }
}
