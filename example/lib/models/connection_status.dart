/// Connection state
enum ConnectionState { idle, connecting, connected, disconnected, error }

/// Connection status model
class ConnectionStatus {
  final ConnectionState state;
  final String message;

  const ConnectionStatus({required this.state, required this.message});

  bool get isConnected => state == ConnectionState.connected;
  bool get canConnect =>
      state == ConnectionState.idle || state == ConnectionState.disconnected;
}
