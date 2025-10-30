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
        
        byte[] sourceBytes = source.getBytes();
        int copyLength = Math.min(sourceBytes.length, dest.length - 1); // Leave room for null terminator
        
        // Copy the bytes
        System.arraycopy(sourceBytes, 0, dest, 0, copyLength);
        
        // Fill the rest with zeros (null terminator and padding)
        for (int i = copyLength; i < dest.length; i++) {
            dest[i] = 0;
        }
    }
}
