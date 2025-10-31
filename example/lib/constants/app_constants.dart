class AppConstants {
  // Default values
  static const String defaultIp = '192.168.1.1';
  static const int defaultPort = 37777;
  static const String defaultUsername = 'admin';
  static const String defaultPassword = 'password';

  // Environment keys
  static const String envIpKey = 'DAHUA_IP';
  static const String envPortKey = 'DAHUA_PORT';
  static const String envUserKey = 'DAHUA_USER';
  static const String envPassKey = 'DAHUA_PASS';

  // UI constants
  static const int closeDelayMs = 300;
  static const int quadCloseDelayMs = 500;
  static const int ptzSpeed = 5;

  // Messages
  static const String msgReady = 'Ready';
  static const String msgInitialized = 'SDK Initialized';
  static const String msgConnecting = 'Connecting...';
  static const String msgDisconnected = 'Disconnected';
  static const String msgClosingConnections = 'Closing connections...';
  static const String msgClosing4Connections = 'Closing 4 connections...';
  static const String msgFillAllFields = 'Please fill all fields';
}
