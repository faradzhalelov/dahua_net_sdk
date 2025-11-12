package com.dahua.sdk.dahua_sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import androidx.annotation.NonNull;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;

import com.company.NetSDK.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DahuaSdkPlugin - Main Flutter plugin class for Dahua SDK integration
 * Handles method channel communication between Flutter and native Android code
 */
public class DahuaSdkPlugin implements FlutterPlugin, MethodCallHandler, EventChannel.StreamHandler {
    private static final String TAG = "DahuaSdkPlugin";
    private static final String CHANNEL_NAME = "dahua_sdk";
    private static final String EVENT_CHANNEL_NAME = "dahua_sdk/device_search";
    
    private MethodChannel channel;
    private EventChannel eventChannel;
    private Context context;
    private DahuaNetSDKBridge netSDKBridge;
    private EventChannel.EventSink deviceSearchEventSink;
    
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
        
        // Setup EventChannel for device search stream
        eventChannel = new EventChannel(flutterPluginBinding.getBinaryMessenger(), EVENT_CHANNEL_NAME);
        eventChannel.setStreamHandler(this);
        
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
            case "login":
                handleLogin(call, result);
                break;
            case "logout":
                handleLogout(call, result);
                break;
            case "ptz":
                handlePtz(call, result);
                break;
            case "getWlanConfig":
                handleGetWlanConfig(call, result);
                break;
            case "setWlanConfig":
                handleSetWlanConfig(call, result);
                break;
            case "scanWlanDevices":
                handleScanWlanDevices(call, result);
                break;
            case "getDevWifiList":
                handleGetDevWifiList(call, result);
                break;
            case "stopDeviceSearch":
                handleStopDeviceSearch(result);
                break;
            case "startSmartConfig":
                handleStartSmartConfig(call, result);
                break;
            case "stopSmartConfig":
                handleStopSmartConfig(result);
                break;
            case "configDeviceWifi":
                handleConfigDeviceWifi(call, result);
                break;
            case "initDeviceAccount":
                handleInitDeviceAccount(call, result);
                break;
            case "modifyDevicePassword":
                handleModifyDevicePassword(call, result);
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

    private void handleLogin(MethodCall call, Result result) {
        try {
            String ip = call.argument("ip");
            Number portNum = call.argument("port");
            String username = call.argument("user");
            String password = call.argument("pass");
            
            if (ip == null || portNum == null || username == null || password == null) {
                result.error("INVALID_ARGUMENTS", "Missing required arguments", null);
                return;
            }
            
            long handle = netSDKBridge.login(ip, portNum.intValue(), username, password);
            result.success(handle);
        } catch (Exception e) {
            Log.e(TAG, "Login failed: " + e.getMessage(), e);
            result.error("LOGIN_ERROR", e.getMessage(), null);
        }
    }

    private void handleLogout(MethodCall call, Result result) {
        try {
            Number handleNum = call.argument("handle");
            
            if (handleNum == null) {
                result.error("INVALID_ARGUMENTS", "Missing handle", null);
                return;
            }
            
            netSDKBridge.logout(handleNum.longValue());
            result.success(null);
        } catch (Exception e) {
            Log.e(TAG, "Logout failed: " + e.getMessage(), e);
            result.error("LOGOUT_ERROR", e.getMessage(), null);
        }
    }

    private void handleGetWlanConfig(MethodCall call, Result result) {
        try {
            Number handleNum = call.argument("handle");
            
            if (handleNum == null) {
                result.error("INVALID_ARGUMENTS", "Missing handle", null);
                return;
            }
            
            CFG_WLAN_INFO wlanInfo = netSDKBridge.getWlanConfig(handleNum.longValue());
            
            if (wlanInfo != null) {
                Map<String, Object> configMap = new HashMap<>();
                configMap.put("ssid", byteArrayToString(wlanInfo.szSSID));
                // Do NOT send password back to Flutter to avoid text input corruption
                configMap.put("password", "");
                configMap.put("authMode", getAuthModeFromEncryption(wlanInfo.nEncryption));
                configMap.put("encryptionAlg", getEncryptionAlgFromEncryption(wlanInfo.nEncryption));
                configMap.put("encryption", wlanInfo.nEncryption);
                configMap.put("enabled", wlanInfo.bEnable);
                configMap.put("connectEnabled", wlanInfo.bConnectEnable);
                result.success(configMap);
            } else {
                result.error("GET_WLAN_FAILED", "Failed to get WLAN configuration", null);
            }
        } catch (Exception e) {
            Log.e(TAG, "GetWlanConfig failed: " + e.getMessage(), e);
            result.error("GET_WLAN_ERROR", e.getMessage(), null);
        }
    }

    private void handleSetWlanConfig(MethodCall call, Result result) {
        try {
            Number handleNum = call.argument("handle");
            String ssid = call.argument("ssid");
            String password = call.argument("password");
            Number encryptionNum = call.argument("encryption");
            
            if (handleNum == null || ssid == null || password == null || encryptionNum == null) {
                result.error("INVALID_ARGUMENTS", "Missing required arguments", null);
                return;
            }
            
            boolean success = netSDKBridge.setWlanConfig(
                handleNum.longValue(),
                ssid,
                password,
                encryptionNum.intValue()
            );
            result.success(success);
        } catch (Exception e) {
            Log.e(TAG, "SetWlanConfig failed: " + e.getMessage(), e);
            result.error("SET_WLAN_ERROR", e.getMessage(), null);
        }
    }

    private void handleScanWlanDevices(MethodCall call, Result result) {
        try {
            Number handleNum = call.argument("handle");
            
            if (handleNum == null) {
                result.error("INVALID_ARGUMENTS", "Missing handle", null);
                return;
            }
            
            // CRITICAL FIX: Run scan on background thread to avoid text input corruption
            // The native Dahua SDK's scanWlanDevices can interfere with Flutter's text input
            // if called from the main thread, causing ArrayIndexOutOfBoundsException in TextInput
            final long loginHandle = handleNum.longValue();
            
            new Thread(() -> {
                try {
                    // Add delay before scan to ensure UI thread is free
                    Thread.sleep(100);
                    
                    SDKDEV_WLAN_DEVICE_EX[] devices = netSDKBridge.scanWlanDevices(loginHandle);
                    
                    // Return result on main thread after another delay for safety
                    mainHandler.postDelayed(() -> {
                        if (devices != null && devices.length > 0) {
                            List<Map<String, Object>> deviceList = new ArrayList<>();
                            
                            for (SDKDEV_WLAN_DEVICE_EX device : devices) {
                                Map<String, Object> deviceMap = new HashMap<>();
                                deviceMap.put("ssid", byteArrayToString(device.szSSID));
                                deviceMap.put("authMode", device.byAuthMode & 0xFF);
                                deviceMap.put("encryptionAlg", device.byEncrAlgr & 0xFF);
                                deviceMap.put("signalLevel", device.byLinkQuality & 0xFF);
                                deviceList.add(deviceMap);
                            }
                            
                            result.success(deviceList);
                        } else {
                            result.error("SCAN_FAILED", "Failed to scan WiFi devices", null);
                        }
                    }, 150);  // Wait 150ms before returning to ensure UI is settled
                    
                } catch (Exception e) {
                    Log.e(TAG, "ScanWlanDevices failed: " + e.getMessage(), e);
                    mainHandler.post(() -> 
                        result.error("SCAN_ERROR", e.getMessage(), null)
                    );
                }
            }).start();
            
        } catch (Exception e) {
            Log.e(TAG, "ScanWlanDevices setup failed: " + e.getMessage(), e);
            result.error("SCAN_ERROR", e.getMessage(), null);
        }
    }

    /**
     * Helper method to convert byte array to string
     */
    private String byteArrayToString(byte[] bytes) {
        if (bytes == null) return "";
        
        try {
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
     * Extract auth mode from encryption value
     * Based on CFG_WLAN_INFO.nEncryption mapping
     */
    private int getAuthModeFromEncryption(int encryption) {
        // Simplified mapping based on common values
        switch (encryption) {
            case 0: // off
            case 1: // on
            case 2: // WEP-OPEN
                return 0; // OPEN
            case 3: // WEP-SHARED
                return 1; // SHARED
            case 4: // WPA-TKIP
            case 8: // WPA-AES
                return 2; // WPA
            case 5: // WPA-PSK-TKIP
            case 9: // WPA-PSK-AES
                return 3; // WPA-PSK
            case 6: // WPA2-TKIP
            case 10: // WPA2-AES
                return 4; // WPA2
            case 7: // WPA2-PSK-TKIP
            case 11: // WPA2-PSK-AES
            default:
                return 5; // WPA2-PSK (default)
        }
    }

    /**
     * Extract encryption algorithm from encryption value
     */
    private int getEncryptionAlgFromEncryption(int encryption) {
        switch (encryption) {
            case 0: // off
            case 1: // on
                return 0; // NONE
            case 2: // WEP-OPEN
            case 3: // WEP-SHARED
                return 4; // WEP
            case 4: // WPA-TKIP
            case 5: // WPA-PSK-TKIP
            case 6: // WPA2-TKIP
            case 7: // WPA2-PSK-TKIP
                return 5; // TKIP
            case 8: // WPA-AES
            case 9: // WPA-PSK-AES
            case 10: // WPA2-AES
            case 11: // WPA2-PSK-AES
            default:
                return 6; // AES (default)
        }
    }

    private void handleGetDevWifiList(MethodCall call, Result result) {
        try {
            String deviceIp = call.argument("deviceIp");
            Integer devicePort = call.argument("devicePort");
            
            if (deviceIp == null || deviceIp.isEmpty()) {
                result.error("INVALID_ARGUMENT", "Device IP is required", null);
                return;
            }
            
            if (devicePort == null) {
                devicePort = 37777; // Default port
            }
            
            if (netSDKBridge == null) {
                netSDKBridge = new DahuaNetSDKBridge(context);
            }
            
            SDKDEV_WLAN_DEVICE_EX[] devices = netSDKBridge.getDevWifiList(deviceIp, devicePort);
            
            if (devices != null && devices.length > 0) {
                List<Map<String, Object>> deviceList = new ArrayList<>();
                for (SDKDEV_WLAN_DEVICE_EX device : devices) {
                    Map<String, Object> deviceMap = new HashMap<>();
                    deviceMap.put("ssid", byteArrayToString(device.szSSID));
                    deviceMap.put("authMode", device.byAuthMode & 0xFF);
                    deviceMap.put("encryptionAlg", device.byEncrAlgr & 0xFF);
                    deviceMap.put("signalLevel", device.byLinkQuality & 0xFF);
                    deviceList.add(deviceMap);
                }
                result.success(deviceList);
            } else {
                result.success(new ArrayList<>()); // Return empty list instead of error
            }
        } catch (Exception e) {
            Log.e(TAG, "GetDevWifiList failed: " + e.getMessage(), e);
            result.error("GET_DEV_WIFI_LIST_ERROR", e.getMessage(), null);
        }
    }

    private void handleStopDeviceSearch(Result result) {
        try {
            if (netSDKBridge != null) {
                netSDKBridge.stopDeviceSearch();
            }
            result.success(null);
        } catch (Exception e) {
            Log.e(TAG, "Stop device search failed: " + e.getMessage(), e);
            result.error("STOP_SEARCH_ERROR", e.getMessage(), null);
        }
    }

    private void handleStartSmartConfig(MethodCall call, Result result) {
        try {
            String serialNumber = call.argument("serialNumber");
            String ssid = call.argument("ssid");
            String password = call.argument("password");
            
            if (serialNumber == null || serialNumber.isEmpty() || ssid == null || ssid.isEmpty()) {
                result.error("INVALID_ARGUMENT", "Serial number and SSID are required", null);
                return;
            }
            
            if (netSDKBridge == null) {
                netSDKBridge = new DahuaNetSDKBridge(context);
            }
            
            boolean success = netSDKBridge.startSmartConfig(serialNumber, ssid, password);
            result.success(success);
        } catch (Exception e) {
            Log.e(TAG, "StartSmartConfig failed: " + e.getMessage(), e);
            result.error("START_SMART_CONFIG_ERROR", e.getMessage(), null);
        }
    }

    private void handleStopSmartConfig(Result result) {
        try {
            if (netSDKBridge != null) {
                boolean success = netSDKBridge.stopSmartConfig();
                result.success(success);
            } else {
                result.success(true); // Already stopped
            }
        } catch (Exception e) {
            Log.e(TAG, "StopSmartConfig failed: " + e.getMessage(), e);
            result.error("STOP_SMART_CONFIG_ERROR", e.getMessage(), null);
        }
    }

    private void handleConfigDeviceWifi(MethodCall call, Result result) {
        try {
            String serialNumber = call.argument("serialNumber");
            String ssid = call.argument("ssid");
            String password = call.argument("password");
            Integer timeout = call.argument("timeout");
            
            if (serialNumber == null || serialNumber.isEmpty() || ssid == null || ssid.isEmpty()) {
                result.error("INVALID_ARGUMENT", "Serial number and SSID are required", null);
                return;
            }
            
            int timeoutSeconds = timeout != null ? timeout : 60;
            
            if (netSDKBridge == null) {
                netSDKBridge = new DahuaNetSDKBridge(context);
            }
            
            boolean success = netSDKBridge.configDeviceWifi(serialNumber, ssid, password, timeoutSeconds);
            result.success(success);
        } catch (Exception e) {
            Log.e(TAG, "ConfigDeviceWifi failed: " + e.getMessage(), e);
            result.error("CONFIG_DEVICE_WIFI_ERROR", e.getMessage(), null);
        }
    }

    // EventChannel.StreamHandler implementation
    @Override
    public void onListen(Object arguments, EventChannel.EventSink events) {
        deviceSearchEventSink = events;
        
        if (netSDKBridge == null) {
            netSDKBridge = new DahuaNetSDKBridge(context);
        }
        
        // Start device search with callback that sends results to Flutter stream
        netSDKBridge.startDeviceSearch(new DahuaNetSDKBridge.DeviceSearchListener() {
            @Override
            public void onDeviceFound(Map<String, Object> deviceInfo) {
                // Send device info to Flutter on main thread
                mainHandler.post(() -> {
                    if (deviceSearchEventSink != null) {
                        deviceSearchEventSink.success(deviceInfo);
                    }
                });
            }
        });
        
        emitLog("Device search started");
    }

    @Override
    public void onCancel(Object arguments) {
        if (netSDKBridge != null) {
            netSDKBridge.stopDeviceSearch();
        }
        deviceSearchEventSink = null;
        emitLog("Device search cancelled");
    }

    private void handleInitDeviceAccount(MethodCall call, Result result) {
        try {
            Map<String, Object> deviceInfo = call.argument("deviceInfo");
            String username = call.argument("username");
            String password = call.argument("password");
            String phoneOrEmail = call.argument("phoneOrEmail");
            Boolean useIP = call.argument("useIP");

            if (deviceInfo == null || username == null || password == null) {
                result.error("INVALID_ARGS", "Device info, username and password are required", null);
                return;
            }

            if (useIP == null) {
                useIP = true; // Default to IP-based initialization
            }

            Log.d(TAG, "InitDeviceAccount: username=" + username + ", useIP=" + useIP);
            emitLog("InitDeviceAccount: username=" + username + ", useIP=" + useIP);

            boolean success = netSDKBridge.initDeviceAccount(deviceInfo, username, password, 
                                                             phoneOrEmail != null ? phoneOrEmail : "", useIP);
            result.success(success);
        } catch (Exception e) {
            Log.e(TAG, "InitDeviceAccount error: " + e.getMessage(), e);
            emitLog("InitDeviceAccount error: " + e.getMessage());
            result.error("INIT_ACCOUNT_ERROR", e.getMessage(), null);
        }
    }

    private void handleModifyDevicePassword(MethodCall call, Result result) {
        try {
            Long loginHandle = call.argument("loginHandle");
            String username = call.argument("username");
            String oldPassword = call.argument("oldPassword");
            String newPassword = call.argument("newPassword");

            if (loginHandle == null || username == null || oldPassword == null || newPassword == null) {
                result.error("INVALID_ARGS", "loginHandle, username, oldPassword and newPassword are required", null);
                return;
            }

            Log.d(TAG, "ModifyDevicePassword: username=" + username);
            emitLog("ModifyDevicePassword: username=" + username);

            boolean success = netSDKBridge.modifyDevicePassword(loginHandle, username, oldPassword, newPassword);
            result.success(success);
        } catch (Exception e) {
            Log.e(TAG, "ModifyDevicePassword error: " + e.getMessage(), e);
            emitLog("ModifyDevicePassword error: " + e.getMessage());
            result.error("MODIFY_PASSWORD_ERROR", e.getMessage(), null);
        }
    }

    @Override
    public void onDetachedFromEngine(@NonNull FlutterPluginBinding binding) {
        channel.setMethodCallHandler(null);
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
        }
        if (netSDKBridge != null) {
            netSDKBridge.cleanup();
        }
        instance = null;
        pluginChannel = null;
        deviceSearchEventSink = null;
        emitLog("DahuaSdkPlugin detached from Flutter engine");
    }
}
