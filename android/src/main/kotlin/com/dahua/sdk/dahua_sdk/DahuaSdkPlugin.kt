package com.dahua.sdk.dahua_sdk

import android.content.Context
import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import android.util.Log

/** DahuaSdkPlugin */
class DahuaSdkPlugin: FlutterPlugin, MethodCallHandler {
  private lateinit var channel: MethodChannel
  private lateinit var context: Context
  private var netSDKBridge: DahuaNetSDKBridge? = null

  companion object {
    private const val TAG = "DahuaSdkPlugin"
    private var instance: DahuaSdkPlugin? = null
    private var pluginChannel: MethodChannel? = null

    fun emitLog(message: String) {
      Log.d(TAG, message)
      pluginChannel?.invokeMethod("debugLog", mapOf("message" to message))
    }
  }

  override fun onAttachedToEngine(flutterPluginBinding: FlutterPlugin.FlutterPluginBinding) {
    context = flutterPluginBinding.applicationContext
    channel = MethodChannel(flutterPluginBinding.binaryMessenger, "dahua_sdk")
    channel.setMethodCallHandler(this)
    
    instance = this
    pluginChannel = channel
    
    // Register platform view factory for camera preview
    flutterPluginBinding
      .platformViewRegistry
      .registerViewFactory(
        "dahua_sdk/preview",
        DahuaPreviewFactory(flutterPluginBinding.binaryMessenger, context)
      )
  }

  override fun onMethodCall(call: MethodCall, result: Result) {
    when (call.method) {
      "init" -> {
        try {
          if (netSDKBridge == null) {
            netSDKBridge = DahuaNetSDKBridge(context)
          }
          netSDKBridge?.init()
          result.success(null)
        } catch (e: Exception) {
          Log.e(TAG, "Init failed: ${e.message}")
          emitLog("Init failed: ${e.message}")
          result.error("INIT_ERROR", e.message, null)
        }
      }
      "cleanup" -> {
        try {
          netSDKBridge?.cleanup()
          result.success(null)
        } catch (e: Exception) {
          Log.e(TAG, "Cleanup failed: ${e.message}")
          result.error("CLEANUP_ERROR", e.message, null)
        }
      }
      "ptz" -> {
        try {
          val handle = (call.argument<Number>("handle"))?.toLong() ?: 0L
          val cmd = call.argument<Int>("cmd") ?: 0
          val speed = call.argument<Int>("speed") ?: 5
          val start = call.argument<Boolean>("start") ?: false
          
          val success = netSDKBridge?.ptzControl(handle, cmd, speed, start) ?: false
          result.success(success)
        } catch (e: Exception) {
          Log.e(TAG, "PTZ control failed: ${e.message}")
          result.error("PTZ_ERROR", e.message, null)
        }
      }
      "getPlatformVersion" -> {
        result.success("Android ${android.os.Build.VERSION.RELEASE}")
      }
      else -> {
        result.notImplemented()
      }
    }
  }

  override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) {
    channel.setMethodCallHandler(null)
    netSDKBridge?.cleanup()
    instance = null
    pluginChannel = null
  }
}
