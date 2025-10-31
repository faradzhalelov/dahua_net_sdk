import 'package:flutter/material.dart';
import 'package:dahua_sdk/dahua_sdk.dart';
import '../models/camera_config.dart';
import '../models/channel_config.dart';

/// Reusable camera channel view widget
class CameraChannelView extends StatelessWidget {
  final CameraConfig config;
  final ChannelConfig channelConfig;

  const CameraChannelView({
    super.key,
    required this.config,
    required this.channelConfig,
  });

  @override
  Widget build(BuildContext context) {
    return Expanded(
      child: Container(
        color: Colors.black,
        child: Column(
          children: [
            _buildHeader(),
            Expanded(child: _buildPreview()),
          ],
        ),
      ),
    );
  }

  Widget _buildHeader() {
    return Container(
      width: double.infinity,
      padding: const EdgeInsets.all(8),
      color: Colors.black87,
      child: Text(
        channelConfig.title,
        style: const TextStyle(
          color: Colors.white,
          fontWeight: FontWeight.bold,
        ),
        textAlign: TextAlign.center,
      ),
    );
  }

  Widget _buildPreview() {
    return DahuaPreview(
      ip: config.ip,
      port: config.port,
      user: config.username,
      pass: config.password,
      channel: channelConfig.channel,
      streamType: channelConfig.streamType,
    );
  }
}
