/// Camera configuration model
class CameraConfig {
  final String ip;
  final int port;
  final String username;
  final String password;

  const CameraConfig({
    required this.ip,
    required this.port,
    required this.username,
    required this.password,
  });

  bool get isValid =>
      ip.isNotEmpty && username.isNotEmpty && password.isNotEmpty;

  CameraConfig copyWith({
    String? ip,
    int? port,
    String? username,
    String? password,
  }) {
    return CameraConfig(
      ip: ip ?? this.ip,
      port: port ?? this.port,
      username: username ?? this.username,
      password: password ?? this.password,
    );
  }
}
