import 'package:flutter/material.dart';
import '../models/camera_config.dart';
import '../models/channel_config.dart';
import '../widgets/camera_channel_view.dart';
import '../widgets/loading_overlay.dart';
import '../constants/app_constants.dart';

class QuadChannelView extends StatefulWidget {
  final CameraConfig config;

  const QuadChannelView({super.key, required this.config});

  @override
  State<QuadChannelView> createState() => _QuadChannelViewState();
}

class _QuadChannelViewState extends State<QuadChannelView> {
  bool _isDisposing = false;

  Future<bool> _onWillPop() async {
    if (_isDisposing) return false;

    setState(() => _isDisposing = true);
    await Future.delayed(
      const Duration(milliseconds: AppConstants.quadCloseDelayMs),
    );
    return true;
  }

  @override
  Widget build(BuildContext context) {
    return WillPopScope(
      onWillPop: _onWillPop,
      child: Scaffold(
        appBar: AppBar(title: const Text('Quad Channel View (2x2)')),
        body: Stack(
          children: [
            SafeArea(child: _buildQuadLayout()),
            if (_isDisposing)
              const LoadingOverlay(
                message: AppConstants.msgClosing4Connections,
              ),
          ],
        ),
      ),
    );
  }

  Widget _buildQuadLayout() {
    return Column(
      children: [
        Expanded(
          child: Row(
            children: [
              _buildChannel(0, 'Camera 1'),
              _buildChannel(1, 'Camera 2'),
            ],
          ),
        ),
        Expanded(
          child: Row(
            children: [
              _buildChannel(2, 'Camera 3'),
              _buildChannel(3, 'Camera 4'),
            ],
          ),
        ),
      ],
    );
  }

  Widget _buildChannel(int channel, String title) {
    return Expanded(
      child: Container(
        decoration: BoxDecoration(
          border: Border.all(color: Colors.grey),
          color: Colors.black,
        ),
        child: CameraChannelView(
          config: widget.config,
          channelConfig: ChannelConfig(
            channel: channel,
            streamType: ChannelConfig.extraStream,
            title: title,
          ),
        ),
      ),
    );
  }
}
