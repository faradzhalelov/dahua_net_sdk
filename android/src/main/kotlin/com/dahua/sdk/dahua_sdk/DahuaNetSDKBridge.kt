package com.dahua.sdk.dahua_sdk

import android.content.Context
import android.util.Log
import com.company.NetSDK.*
import com.company.PlaySDK.IPlaySDK

class DahuaNetSDKBridge(private val context: Context) {
    companion object {
        private const val TAG = "DahuaNetSDKBridge"
        private var isInitialized = false
        
        init {
            try {
                System.loadLibrary("netsdk")
                System.loadLibrary("configsdk")
                System.loadLibrary("play")
                System.loadLibrary("avnetsdk")
                DahuaSdkPlugin.emitLog("Native libraries loaded successfully")
            } catch (e: UnsatisfiedLinkError) {
                Log.e(TAG, "Failed to load native libraries: ${e.message}")
                DahuaSdkPlugin.emitLog("Failed to load native libraries: ${e.message}")
            }
        }
    }

    private val netSDK = INetSDK.getInstance()
    private val playSDK = IPlaySDK.getInstance()

    fun init() {
        if (isInitialized) {
            DahuaSdkPlugin.emitLog("NetSDK already initialized")
            return
        }

        try {
            netSDK.init(null, null, null)
            netSDK.setAutoReconnect(null, null)
            playSDK.pLAY_SetLogToFile(3, context.filesDir.absolutePath + "/dahua_play.log", 10 * 1024 * 1024)
            
            isInitialized = true
            DahuaSdkPlugin.emitLog("NetSDK initialized successfully")
        } catch (e: Exception) {
            Log.e(TAG, "Failed to initialize NetSDK: ${e.message}")
            DahuaSdkPlugin.emitLog("Failed to initialize NetSDK: ${e.message}")
            throw e
        }
    }

    fun cleanup() {
        if (!isInitialized) return
        
        try {
            netSDK.cleanUp()
            isInitialized = false
            DahuaSdkPlugin.emitLog("NetSDK cleaned up")
        } catch (e: Exception) {
            Log.e(TAG, "Failed to cleanup NetSDK: ${e.message}")
        }
    }

    fun login(ip: String, port: Int, username: String, password: String): Long {
        val loginInfo = NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY().apply {
            szIP = ip
            nPort = port
            szUserName = username
            szPassword = password
            emType = EM_LOGIN_SPAC_CAP_TYPE.TCP
            stuDeviceInfo.bDevType = EM_DEVICE_TYPE.UNKNOWN
        }

        val outInfo = NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY()
        val loginHandle = netSDK.loginWithHighLevelSecurity(loginInfo, outInfo)

        if (loginHandle.longValue() == 0L) {
            val error = netSDK.getLastError()
            val msg = "Login failed for $ip:$port, error: $error"
            Log.e(TAG, msg)
            DahuaSdkPlugin.emitLog(msg)
        } else {
            val msg = "Login successful for $ip:$port, handle: ${loginHandle.longValue()}"
            Log.d(TAG, msg)
            DahuaSdkPlugin.emitLog(msg)
        }

        return loginHandle.longValue()
    }

    fun logout(loginHandle: Long) {
        if (loginHandle == 0L) return
        
        try {
            netSDK.logout(LLong(loginHandle))
            DahuaSdkPlugin.emitLog("Logout successful for handle: $loginHandle")
        } catch (e: Exception) {
            Log.e(TAG, "Logout failed: ${e.message}")
        }
    }

    fun startRealPlay(loginHandle: Long, channel: Int, streamType: Int, callback: fRealDataCallBackEx?): Long {
        if (loginHandle == 0L) {
            DahuaSdkPlugin.emitLog("Invalid login handle")
            return 0L
        }

        // Map stream type: 0=Main, 1=Extra1, 2=Extra2
        val realPlayType = when (streamType) {
            0 -> EM_REALPLAY_TYPE.REALPLAY
            1 -> EM_REALPLAY_TYPE.REALPLAY_1
            2 -> EM_REALPLAY_TYPE.REALPLAY_2
            3 -> EM_REALPLAY_TYPE.REALPLAY_3
            else -> EM_REALPLAY_TYPE.REALPLAY
        }

        val realPlayInfo = NET_IN_REALPLAY_BY_DATA_TYPE().apply {
            cbRealData = callback
            rType = realPlayType
            nChannelID = channel
            // Request private data format for direct playback
            emDataType = EM_REAL_DATA_TYPE.REALDATA_FLAG_RAW_DATA
        }

        val outInfo = NET_OUT_REALPLAY_BY_DATA_TYPE()
        val realHandle = netSDK.realPlayByDataType(LLong(loginHandle), realPlayInfo, outInfo, 5000)

        if (realHandle.longValue() == 0L) {
            val error = netSDK.getLastError()
            val msg = "RealPlay failed for channel $channel, streamType $streamType, error: $error"
            Log.e(TAG, msg)
            DahuaSdkPlugin.emitLog(msg)
        } else {
            val msg = "RealPlay started for channel $channel, streamType $streamType, handle: ${realHandle.longValue()}"
            Log.d(TAG, msg)
            DahuaSdkPlugin.emitLog(msg)
        }

        return realHandle.longValue()
    }

    fun stopRealPlay(realHandle: Long) {
        if (realHandle == 0L) return
        
        try {
            netSDK.stopRealPlayEx(LLong(realHandle))
            DahuaSdkPlugin.emitLog("RealPlay stopped for handle: $realHandle")
        } catch (e: Exception) {
            Log.e(TAG, "Stop RealPlay failed: ${e.message}")
        }
    }

    fun ptzControl(handle: Long, cmd: Int, speed: Int, start: Boolean): Boolean {
        if (handle == 0L) {
            DahuaSdkPlugin.emitLog("Invalid handle for PTZ control")
            return false
        }

        return try {
            val result = netSDK.dhPTZControl(
                LLong(handle),
                cmd,
                0, // param1
                speed, // param2
                0, // param3
                if (start) 1 else 0, // dwStop: 0=start, 1=stop
                0  // reserved
            )
            
            val msg = "PTZ control: cmd=$cmd, speed=$speed, start=$start, result=$result"
            Log.d(TAG, msg)
            DahuaSdkPlugin.emitLog(msg)
            
            result
        } catch (e: Exception) {
            Log.e(TAG, "PTZ control failed: ${e.message}")
            DahuaSdkPlugin.emitLog("PTZ control failed: ${e.message}")
            false
        }
    }

    fun getPlaySDK(): IPlaySDK = playSDK
}
