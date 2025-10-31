/// Channel configuration for camera streams
class ChannelConfig {
  final int channel;
  final int streamType;
  final String title;

  const ChannelConfig({
    required this.channel,
    required this.streamType,
    required this.title,
  });

  static const int mainStream = 0;
  static const int extraStream = 1;
}
