import 'package:flutter/material.dart';
import '../models/camera_config.dart';
import '../models/channel_config.dart';
import '../widgets/camera_channel_view.dart';
import '../widgets/loading_overlay.dart';
import '../constants/app_constants.dart';

class StreamComparisonView extends StatefulWidget {
  final CameraConfig config;
  final int channel;

  const StreamComparisonView({
    super.key,
    required this.config,
    this.channel = 0,
  });

  @override
  State<StreamComparisonView> createState() => _StreamComparisonViewState();
}

class _StreamComparisonViewState extends State<StreamComparisonView> {
  bool _isDisposing = false;

  Future<bool> _onWillPop() async {
    if (_isDisposing) return false;

    setState(() => _isDisposing = true);
    await Future.delayed(
      const Duration(milliseconds: AppConstants.closeDelayMs),
    );
    return true;
  }

  @override
  Widget build(BuildContext context) {
    return WillPopScope(
      onWillPop: _onWillPop,
      child: Scaffold(
        appBar: AppBar(
          title: Text('Channel ${widget.channel} - Stream Comparison'),
        ),
        body: Stack(
          children: [
            SafeArea(child: _buildStreamComparison()),
            if (_isDisposing)
              const LoadingOverlay(message: AppConstants.msgClosingConnections),
          ],
        ),
      ),
    );
  }

  Widget _buildStreamComparison() {
    return Column(
      children: [
        CameraChannelView(
          config: widget.config,
          channelConfig: ChannelConfig(
            channel: widget.channel,
            streamType: ChannelConfig.mainStream,
            title: 'Main Stream (High Quality)',
          ),
        ),
        const Divider(height: 2, thickness: 2),
        CameraChannelView(
          config: widget.config,
          channelConfig: ChannelConfig(
            channel: widget.channel,
            streamType: ChannelConfig.extraStream,
            title: 'Extra Stream 1 (Low Quality)',
          ),
        ),
      ],
    );
  }
}
