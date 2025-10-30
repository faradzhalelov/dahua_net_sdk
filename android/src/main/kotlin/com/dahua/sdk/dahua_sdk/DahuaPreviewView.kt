package com.dahua.sdk.dahua_sdk

import android.content.Context
import android.graphics.PixelFormat
import android.util.Log
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.View
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.platform.PlatformView
import com.company.NetSDK.*
import com.company.PlaySDK.IPlaySDK
import kotlinx.coroutines.*

class DahuaPreviewView(
    private val context: Context,
    private val viewId: Int,
    private val creationParams: Map<String, Any>,
    private val messenger: BinaryMessenger
) : PlatformView {

    companion object {
        private const val TAG = "DahuaPreviewView"
    }

    private val surfaceView: SurfaceView = SurfaceView(context)
    private var loginHandle: Long = 0
    private var realHandle: Long = 0
    private var playPort: Int = -1
    private var dataCount: Int = 0
    
    private val netSDKBridge = DahuaNetSDKBridge(context)
    private val playSDK: IPlaySDK = netSDKBridge.getPlaySDK()
    
    private val scope = CoroutineScope(Dispatchers.Main + SupervisorJob())

    init {
        surfaceView.holder.addCallback(object : SurfaceHolder.Callback {
            override fun surfaceCreated(holder: SurfaceHolder) {
                Log.d(TAG, "Surface created")
                DahuaSdkPlugin.emitLog("Surface created")
                connectAndStartPreview()
            }

            override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {
                Log.d(TAG, "Surface changed: ${width}x${height}, format=$format")
            }

            override fun surfaceDestroyed(holder: SurfaceHolder) {
                Log.d(TAG, "Surface destroyed")
                DahuaSdkPlugin.emitLog("Surface destroyed")
                cleanup()
            }
        })

        surfaceView.holder.setFormat(PixelFormat.RGBA_8888)
        surfaceView.setZOrderOnTop(false)
        surfaceView.setZOrderMediaOverlay(false)
    }

    private fun connectAndStartPreview() {
        scope.launch {
            try {
                val ip = creationParams["ip"] as? String ?: ""
                val port = (creationParams["port"] as? Number)?.toInt() ?: 37777
                val username = creationParams["user"] as? String ?: "admin"
                val password = creationParams["pass"] as? String ?: ""
                val channel = (creationParams["channel"] as? Number)?.toInt() ?: 0
                val streamType = (creationParams["streamType"] as? Number)?.toInt() ?: 0

                DahuaSdkPlugin.emitLog("Connecting to $ip:$port with user $username, channel=$channel, streamType=$streamType")

                // Initialize SDK if not already done
                netSDKBridge.init()

                // Login
                loginHandle = withContext(Dispatchers.IO) {
                    netSDKBridge.login(ip, port, username, password)
                }

                if (loginHandle == 0L) {
                    DahuaSdkPlugin.emitLog("Login failed")
                    return@launch
                }

                DahuaSdkPlugin.emitLog("Login successful, handle: $loginHandle")

                // Small delay to ensure surface is ready
                delay(300)

                // Initialize PlaySDK port
                playPort = withContext(Dispatchers.IO) {
                    playSDK.pLAY_GetFreePort()
                }

                if (playPort < 0) {
                    DahuaSdkPlugin.emitLog("Failed to get free play port")
                    return@launch
                }

                DahuaSdkPlugin.emitLog("Got play port: $playPort")

                // Open play port
                val openResult = withContext(Dispatchers.IO) {
                    playSDK.pLAY_OpenStream(playPort, null, 0, 1024 * 1024)
                }

                if (!openResult) {
                    DahuaSdkPlugin.emitLog("Failed to open play stream")
                    return@launch
                }

                // Set surface view for rendering
                val surfaceResult = withContext(Dispatchers.IO) {
                    playSDK.pLAY_SetDisplayCallBack(playPort, null)
                    playSDK.pLAY_SetOverlayMode(playPort, 1, 0xFF000000.toInt())
                    playSDK.pLAY_SetSurfaceHolder(playPort, surfaceView.holder)
                }

                if (!surfaceResult) {
                    DahuaSdkPlugin.emitLog("Failed to set surface holder")
                }

                // Start play
                val playResult = withContext(Dispatchers.IO) {
                    playSDK.pLAY_Play(playPort, null)
                }

                if (!playResult) {
                    DahuaSdkPlugin.emitLog("Failed to start play")
                    return@launch
                }

                DahuaSdkPlugin.emitLog("Play started on port $playPort")

                // Create real data callback
                val callback = object : fRealDataCallBackEx {
                    override fun invoke(
                        lRealHandle: LLong?,
                        dwDataType: Int,
                        pBuffer: ByteArray?,
                        dwBufSize: Int,
                        param: LLong?,
                        dwUser: LLong?
                    ): Int {
                        if (dataCount < 5) {
                            DahuaSdkPlugin.emitLog("Callback: type=$dwDataType, size=$dwBufSize, port=$playPort")
                        }

                        // Raw data type (0 = REALDATA_FLAG_RAW_DATA)
                        if (dwDataType == 0 && pBuffer != null && dwBufSize > 0) {
                            val inputResult = playSDK.pLAY_InputData(playPort, pBuffer, dwBufSize)
                            dataCount++
                            
                            if (dataCount <= 5 || dataCount % 100 == 0) {
                                DahuaSdkPlugin.emitLog("Packet #$dataCount: size=$dwBufSize, InputData=$inputResult")
                            }
                        }
                        
                        return 0
                    }
                }

                // Start real play
                realHandle = withContext(Dispatchers.IO) {
                    netSDKBridge.startRealPlay(loginHandle, channel, streamType, callback)
                }

                if (realHandle == 0L) {
                    DahuaSdkPlugin.emitLog("Failed to start real play")
                } else {
                    DahuaSdkPlugin.emitLog("Real play started successfully, handle: $realHandle")
                }

            } catch (e: Exception) {
                Log.e(TAG, "Error in connectAndStartPreview: ${e.message}", e)
                DahuaSdkPlugin.emitLog("Error: ${e.message}")
            }
        }
    }

    private fun cleanup() {
        scope.launch {
            try {
                // Stop real play
                if (realHandle != 0L) {
                    withContext(Dispatchers.IO) {
                        netSDKBridge.stopRealPlay(realHandle)
                    }
                    realHandle = 0
                }

                // Stop play SDK
                if (playPort >= 0) {
                    withContext(Dispatchers.IO) {
                        playSDK.pLAY_Stop(playPort)
                        playSDK.pLAY_CloseStream(playPort)
                        playSDK.pLAY_FreePort(playPort)
                    }
                    playPort = -1
                }

                // Logout
                if (loginHandle != 0L) {
                    withContext(Dispatchers.IO) {
                        netSDKBridge.logout(loginHandle)
                    }
                    loginHandle = 0
                }

                DahuaSdkPlugin.emitLog("Preview cleanup completed")
            } catch (e: Exception) {
                Log.e(TAG, "Error in cleanup: ${e.message}", e)
            }
        }
    }

    override fun getView(): View = surfaceView

    override fun dispose() {
        cleanup()
        scope.cancel()
    }
}
