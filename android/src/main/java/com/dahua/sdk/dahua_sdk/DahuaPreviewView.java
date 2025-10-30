package com.dahua.sdk.dahua_sdk;

import android.content.Context;
import android.graphics.PixelFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformView;

import com.company.NetSDK.*;
import com.company.PlaySDK.IPlaySDK;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * DahuaPreviewView - Native Android view for displaying Dahua camera video stream
 * Implements PlatformView to integrate with Flutter's platform view system
 */
public class DahuaPreviewView implements PlatformView {
    private static final String TAG = "DahuaPreviewView";
    
    private final SurfaceView surfaceView;
    private final Context context;
    private final int viewId;
    private final Map<String, Object> creationParams;
    private final BinaryMessenger messenger;
    
    private long loginHandle = 0;
    private long realHandle = 0;
    private int playPort = -1;
    private int dataCount = 0;
    
    private final DahuaNetSDKBridge netSDKBridge;
    private final ExecutorService executorService;
    private final Handler mainHandler;

    public DahuaPreviewView(Context context, int viewId, Map<String, Object> creationParams, BinaryMessenger messenger) {
        this.context = context;
        this.viewId = viewId;
        this.creationParams = creationParams;
        this.messenger = messenger;
        
        this.netSDKBridge = new DahuaNetSDKBridge(context);
        this.executorService = Executors.newSingleThreadExecutor();
        this.mainHandler = new Handler(Looper.getMainLooper());
        
        this.surfaceView = new SurfaceView(context);
        this.surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                Log.d(TAG, "Surface created");
                DahuaSdkPlugin.emitLog("Surface created");
                connectAndStartPreview();
            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
                Log.d(TAG, "Surface changed: " + width + "x" + height + ", format=" + format);
            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
                Log.d(TAG, "Surface destroyed");
                DahuaSdkPlugin.emitLog("Surface destroyed");
                cleanup();
            }
        });

        surfaceView.getHolder().setFormat(PixelFormat.RGBA_8888);
        surfaceView.setZOrderOnTop(false);
        surfaceView.setZOrderMediaOverlay(false);
    }

    private void connectAndStartPreview() {
        executorService.execute(() -> {
            try {
                // Extract parameters
                String ip = getStringParam("ip", "");
                int port = getIntParam("port", 37777);
                String username = getStringParam("user", "admin");
                String password = getStringParam("pass", "");
                int channel = getIntParam("channel", 0);
                int streamType = getIntParam("streamType", 0);

                String msg = "Connecting to " + ip + ":" + port + " with user " + username + 
                            ", channel=" + channel + ", streamType=" + streamType;
                DahuaSdkPlugin.emitLog(msg);

                // Initialize SDK if not already done
                netSDKBridge.init();

                // Login
                loginHandle = netSDKBridge.login(ip, port, username, password);
                if (loginHandle == 0L) {
                    DahuaSdkPlugin.emitLog("Login failed");
                    return;
                }

                DahuaSdkPlugin.emitLog("Login successful, handle: " + loginHandle);

                // Small delay to ensure surface is ready
                Thread.sleep(300);

                // Initialize PlaySDK port
                playPort = IPlaySDK.PLAYGetFreePort();
                if (playPort < 0) {
                    DahuaSdkPlugin.emitLog("Failed to get free play port");
                    return;
                }

                DahuaSdkPlugin.emitLog("Got play port: " + playPort);

                // Open play port
                int openResult = IPlaySDK.PLAYOpenStream(playPort, null, 0, 1024 * 1024);
                if (openResult == 0) {
                    DahuaSdkPlugin.emitLog("Failed to open play stream");
                    return;
                }

                // Start play with surface
                final int finalPlayPort = playPort;
                mainHandler.post(() -> {
                    int playResult = IPlaySDK.PLAYPlay(finalPlayPort, surfaceView.getHolder().getSurface());
                    if (playResult == 0) {
                        DahuaSdkPlugin.emitLog("Failed to start play");
                    } else {
                        DahuaSdkPlugin.emitLog("Play started on port " + finalPlayPort);
                    }
                });

                // Wait for play to start
                Thread.sleep(100);

                // Create real data callback
                final fRealDataCallBackEx callback = new fRealDataCallBackEx() {
                    @Override
                    public int invoke(LLong lRealHandle, int dwDataType, byte[] pBuffer, 
                                     int dwBufSize, LLong param, LLong dwUser) {
                        if (dataCount < 5) {
                            DahuaSdkPlugin.emitLog("Callback: type=" + dwDataType + ", size=" + dwBufSize + ", port=" + finalPlayPort);
                        }

                        // Raw data type (0 = REALDATA_FLAG_RAW_DATA)
                        if (dwDataType == 0 && pBuffer != null && dwBufSize > 0) {
                            int inputResult = IPlaySDK.PLAYInputData(finalPlayPort, pBuffer, dwBufSize);
                            dataCount++;
                            
                            if (dataCount <= 5 || dataCount % 100 == 0) {
                                DahuaSdkPlugin.emitLog("Packet #" + dataCount + ": size=" + dwBufSize + ", InputData=" + inputResult);
                            }
                        }
                        
                        return 0;
                    }
                };

                // Start real play
                realHandle = netSDKBridge.startRealPlay(loginHandle, channel, streamType, callback);
                if (realHandle == 0L) {
                    DahuaSdkPlugin.emitLog("Failed to start real play");
                } else {
                    DahuaSdkPlugin.emitLog("Real play started successfully, handle: " + realHandle);
                }

            } catch (Exception e) {
                Log.e(TAG, "Error in connectAndStartPreview: " + e.getMessage(), e);
                DahuaSdkPlugin.emitLog("Error: " + e.getMessage());
            }
        });
    }

    private void cleanup() {
        executorService.execute(() -> {
            try {
                // Stop real play
                if (realHandle != 0L) {
                    netSDKBridge.stopRealPlay(realHandle);
                    realHandle = 0;
                }

                // Stop play SDK
                if (playPort >= 0) {
                    IPlaySDK.PLAYStop(playPort);
                    IPlaySDK.PLAYCloseStream(playPort);
                    IPlaySDK.PLAYFreePort(playPort);
                    playPort = -1;
                }

                // Logout
                if (loginHandle != 0L) {
                    netSDKBridge.logout(loginHandle);
                    loginHandle = 0;
                }

                DahuaSdkPlugin.emitLog("Preview cleanup completed");
            } catch (Exception e) {
                Log.e(TAG, "Error in cleanup: " + e.getMessage(), e);
            }
        });
    }

    private String getStringParam(String key, String defaultValue) {
        if (creationParams == null || !creationParams.containsKey(key)) {
            return defaultValue;
        }
        Object value = creationParams.get(key);
        return (value instanceof String) ? (String) value : defaultValue;
    }

    private int getIntParam(String key, int defaultValue) {
        if (creationParams == null || !creationParams.containsKey(key)) {
            return defaultValue;
        }
        Object value = creationParams.get(key);
        if (value instanceof Number) {
            return ((Number) value).intValue();
        }
        return defaultValue;
    }

    @Override
    public View getView() {
        return surfaceView;
    }

    @Override
    public void dispose() {
        cleanup();
        executorService.shutdown();
    }
}
