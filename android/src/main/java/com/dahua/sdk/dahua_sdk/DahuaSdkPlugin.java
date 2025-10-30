package com.dahua.sdk.dahua_sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import androidx.annotation.NonNull;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;

import java.util.HashMap;
import java.util.Map;

/**
 * DahuaSdkPlugin - Main Flutter plugin class for Dahua SDK integration
 * Handles method channel communication between Flutter and native Android code
 */
public class DahuaSdkPlugin implements FlutterPlugin, MethodCallHandler {
    private static final String TAG = "DahuaSdkPlugin";
    private static final String CHANNEL_NAME = "dahua_sdk";
    
    private MethodChannel channel;
    private Context context;
    private DahuaNetSDKBridge netSDKBridge;
    
    // Static reference for logging from native code
    private static DahuaSdkPlugin instance;
    private static MethodChannel pluginChannel;
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    /**
     * Emit a debug log message from native to Dart (flutter run console)
     * This method is thread-safe and can be called from any thread
     */
    public static void emitLog(String message) {
        Log.d(TAG, message);
        if (pluginChannel != null) {
            // Always run on UI thread to avoid RuntimeException
            mainHandler.post(() -> {
                Map<String, Object> args = new HashMap<>();
                args.put("message", message);
                pluginChannel.invokeMethod("debugLog", args);
            });
        }
    }

    @Override
    public void onAttachedToEngine(@NonNull FlutterPluginBinding flutterPluginBinding) {
        context = flutterPluginBinding.getApplicationContext();
        channel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), CHANNEL_NAME);
        channel.setMethodCallHandler(this);
        
        instance = this;
        pluginChannel = channel;
        
        // Register platform view factory for camera preview
        flutterPluginBinding
            .getPlatformViewRegistry()
            .registerViewFactory(
                "dahua_sdk/preview",
                new DahuaPreviewFactory(flutterPluginBinding.getBinaryMessenger(), context)
            );
        
        emitLog("DahuaSdkPlugin attached to Flutter engine");
    }

    @Override
    public void onMethodCall(@NonNull MethodCall call, @NonNull Result result) {
        switch (call.method) {
            case "init":
                handleInit(result);
                break;
            case "cleanup":
                handleCleanup(result);
                break;
            case "ptz":
                handlePtz(call, result);
                break;
            case "getPlatformVersion":
                result.success("Android " + android.os.Build.VERSION.RELEASE);
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    private void handleInit(Result result) {
        try {
            if (netSDKBridge == null) {
                netSDKBridge = new DahuaNetSDKBridge(context);
            }
            netSDKBridge.init();
            result.success(null);
        } catch (Exception e) {
            Log.e(TAG, "Init failed: " + e.getMessage(), e);
            emitLog("Init failed: " + e.getMessage());
            result.error("INIT_ERROR", e.getMessage(), null);
        }
    }

    private void handleCleanup(Result result) {
        try {
            if (netSDKBridge != null) {
                netSDKBridge.cleanup();
            }
            result.success(null);
        } catch (Exception e) {
            Log.e(TAG, "Cleanup failed: " + e.getMessage(), e);
            result.error("CLEANUP_ERROR", e.getMessage(), null);
        }
    }

    private void handlePtz(MethodCall call, Result result) {
        try {
            Number handleNum = call.argument("handle");
            long handle = (handleNum != null) ? handleNum.longValue() : 0L;
            
            Integer cmd = call.argument("cmd");
            Integer speed = call.argument("speed");
            Boolean start = call.argument("start");
            
            if (cmd == null) cmd = 0;
            if (speed == null) speed = 5;
            if (start == null) start = false;
            
            boolean success = false;
            if (netSDKBridge != null) {
                success = netSDKBridge.ptzControl(handle, cmd, speed, start);
            }
            result.success(success);
        } catch (Exception e) {
            Log.e(TAG, "PTZ control failed: " + e.getMessage(), e);
            result.error("PTZ_ERROR", e.getMessage(), null);
        }
    }

    @Override
    public void onDetachedFromEngine(@NonNull FlutterPluginBinding binding) {
        channel.setMethodCallHandler(null);
        if (netSDKBridge != null) {
            netSDKBridge.cleanup();
        }
        instance = null;
        pluginChannel = null;
        emitLog("DahuaSdkPlugin detached from Flutter engine");
    }
}
