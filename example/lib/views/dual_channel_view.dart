import 'package:flutter/material.dart';
import '../models/camera_config.dart';
import '../models/channel_config.dart';
import '../widgets/camera_channel_view.dart';
import '../widgets/loading_overlay.dart';
import '../constants/app_constants.dart';

class DualChannelView extends StatefulWidget {
  final CameraConfig config;

  const DualChannelView({super.key, required this.config});

  @override
  State<DualChannelView> createState() => _DualChannelViewState();
}

class _DualChannelViewState extends State<DualChannelView> {
  bool _isHorizontalSplit = true;
  bool _isDisposing = false;

  Future<bool> _onWillPop() async {
    if (_isDisposing) return false;

    setState(() => _isDisposing = true);
    await Future.delayed(
      const Duration(milliseconds: AppConstants.closeDelayMs),
    );
    return true;
  }

  void _toggleLayout() {
    if (!_isDisposing) {
      setState(() => _isHorizontalSplit = !_isHorizontalSplit);
    }
  }

  @override
  Widget build(BuildContext context) {
    return WillPopScope(
      onWillPop: _onWillPop,
      child: Scaffold(
        appBar: AppBar(
          title: const Text('Dual Channel View'),
          actions: [
            IconButton(
              icon: Icon(
                _isHorizontalSplit ? Icons.view_agenda : Icons.view_day,
              ),
              tooltip: 'Toggle Layout',
              onPressed: _isDisposing ? null : _toggleLayout,
            ),
          ],
        ),
        body: Stack(
          children: [
            SafeArea(child: _buildChannelLayout()),
            if (_isDisposing)
              const LoadingOverlay(message: AppConstants.msgClosingConnections),
          ],
        ),
      ),
    );
  }

  Widget _buildChannelLayout() {
    final channels = [
      ChannelConfig(
        channel: 0,
        streamType: ChannelConfig.mainStream,
        title: 'Camera 1 (Channel 0)',
      ),
      ChannelConfig(
        channel: 1,
        streamType: ChannelConfig.mainStream,
        title: 'Camera 2 (Channel 1)',
      ),
    ];

    final views = channels
        .map(
          (ch) => CameraChannelView(config: widget.config, channelConfig: ch),
        )
        .toList();

    return _isHorizontalSplit
        ? Column(
            children: [
              views[0],
              const Divider(height: 2, thickness: 2),
              views[1],
            ],
          )
        : Row(
            children: [
              views[0],
              const VerticalDivider(width: 2, thickness: 2),
              views[1],
            ],
          );
  }
}
