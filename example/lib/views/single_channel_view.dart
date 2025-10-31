import 'package:flutter/material.dart';
import 'package:dahua_sdk/dahua_sdk.dart';
import '../models/camera_config.dart';
import '../models/ptz_command.dart';
import '../viewmodels/ptz_viewmodel.dart';
import '../widgets/ptz_controls.dart';

class SingleChannelView extends StatefulWidget {
  final CameraConfig config;

  const SingleChannelView({super.key, required this.config});

  @override
  State<SingleChannelView> createState() => _SingleChannelViewState();
}

class _SingleChannelViewState extends State<SingleChannelView> {
  bool _isLoading = true;
  String _debugInfo = 'Initializing...';
  late final PtzViewModel _ptzViewModel;

  @override
  void initState() {
    super.initState();
    _ptzViewModel = PtzViewModel(
      loginHandle: 0, // TODO: Get actual handle from login
      onError: _showError,
    );
    _initializeConnection();
  }

  Future<void> _initializeConnection() async {
    await Future.delayed(const Duration(seconds: 1));
    if (mounted) {
      setState(() {
        _isLoading = false;
        _debugInfo = 'Connected to ${widget.config.ip}:${widget.config.port}';
      });
    }
  }

  void _showError(String message) {
    if (mounted) {
      ScaffoldMessenger.of(
        context,
      ).showSnackBar(SnackBar(content: Text(message)));
    }
  }

  void _handlePtzControl(PtzCommand command, bool start) {
    _ptzViewModel.executeCommand(command, start);
  }

  void _refresh() {
    setState(() => _isLoading = true);
    Future.delayed(const Duration(milliseconds: 500), () {
      if (mounted) {
        setState(() => _isLoading = false);
      }
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Live View - ${widget.config.ip}'),
        actions: [
          IconButton(icon: const Icon(Icons.refresh), onPressed: _refresh),
        ],
      ),
      body: Column(
        children: [
          Expanded(child: _buildVideoPreview()),
          PtzControlsPanel(onControl: _handlePtzControl),
        ],
      ),
    );
  }

  Widget _buildVideoPreview() {
    return Container(
      color: Colors.black,
      child: Stack(
        children: [
          if (_isLoading)
            const Center(
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  CircularProgressIndicator(color: Colors.white),
                  SizedBox(height: 16),
                  Text(
                    'Connecting to camera...',
                    style: TextStyle(color: Colors.white),
                  ),
                ],
              ),
            )
          else
            DahuaPreview(
              ip: widget.config.ip,
              port: widget.config.port,
              user: widget.config.username,
              pass: widget.config.password,
            ),
          _buildDebugOverlay(),
        ],
      ),
    );
  }

  Widget _buildDebugOverlay() {
    return Positioned(
      top: 8,
      left: 8,
      right: 8,
      child: Container(
        padding: const EdgeInsets.all(8),
        decoration: BoxDecoration(
          color: Colors.black54,
          borderRadius: BorderRadius.circular(4),
        ),
        child: Text(
          _debugInfo,
          style: const TextStyle(color: Colors.white, fontSize: 12),
        ),
      ),
    );
  }
}
