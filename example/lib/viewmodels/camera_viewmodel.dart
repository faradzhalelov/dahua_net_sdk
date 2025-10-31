import 'package:flutter/material.dart';
import '../models/camera_config.dart';
import '../models/connection_status.dart' as model;
import '../constants/app_constants.dart';
import 'package:dahua_sdk/dahua_sdk.dart';

class CameraViewModel extends ChangeNotifier {
  CameraConfig _config;
  model.ConnectionStatus _status = const model.ConnectionStatus(
    state: model.ConnectionState.idle,
    message: AppConstants.msgReady,
  );
  bool _isInitialized = false;

  CameraViewModel(this._config);

  // Getters
  CameraConfig get config => _config;
  model.ConnectionStatus get status => _status;
  bool get isInitialized => _isInitialized;
  bool get canConnect => _isInitialized && _status.canConnect;

  // Update configuration
  void updateConfig(CameraConfig newConfig) {
    _config = newConfig;
    notifyListeners();
  }

  // Initialize SDK
  Future<void> initialize() async {
    try {
      await DahuaSdk.init();
      _isInitialized = true;
      _updateStatus(model.ConnectionState.idle, AppConstants.msgInitialized);
    } catch (e) {
      _updateStatus(model.ConnectionState.error, 'Init failed: $e');
    }
  }

  // Validate connection
  bool validateConnection() {
    if (!_config.isValid) {
      _updateStatus(model.ConnectionState.error, AppConstants.msgFillAllFields);
      return false;
    }
    return true;
  }

  // Start connection
  void startConnection() {
    _updateStatus(model.ConnectionState.connecting, AppConstants.msgConnecting);
  }

  // End connection
  void endConnection() {
    _updateStatus(
      model.ConnectionState.disconnected,
      AppConstants.msgDisconnected,
    );
  }

  // Cleanup
  Future<void> cleanup() async {
    await DahuaSdk.cleanup();
  }

  // Private helper
  void _updateStatus(model.ConnectionState state, String message) {
    _status = model.ConnectionStatus(state: state, message: message);
    notifyListeners();
  }
}
