// Utility functions for validating input data

/// Validates if the given string is a valid IPv4 address
///
/// Returns true if the IP address is valid, false otherwise.
/// A valid IP address has four octets separated by dots,
/// where each octet is a number between 0 and 255.
///
/// Examples:
/// - "192.168.1.1" → true
/// - "10.0.0.1" → true
/// - "/1" → false
/// - "256.1.1.1" → false
/// - "192.168.1" → false
bool isValidIpAddress(String ip) {
  // Check if IP matches IPv4 format
  final ipv4Regex = RegExp(r'^(\d{1,3}\.){3}\d{1,3}$');
  if (!ipv4Regex.hasMatch(ip)) {
    return false;
  }

  // Check each octet is in valid range (0-255)
  final parts = ip.split('.');
  for (var part in parts) {
    final num = int.tryParse(part);
    if (num == null || num < 0 || num > 255) {
      return false;
    }
  }

  return true;
}
