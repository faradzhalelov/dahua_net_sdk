import 'package:flutter/material.dart';
import 'package:dahua_sdk/dahua_sdk.dart';

/// Экран для одновременного просмотра двух каналов (камер)
class DualChannelScreen extends StatefulWidget {
  final String ip;
  final int port;
  final String user;
  final String pass;

  const DualChannelScreen({
    super.key,
    required this.ip,
    required this.port,
    required this.user,
    required this.pass,
  });

  @override
  State<DualChannelScreen> createState() => _DualChannelScreenState();
}

class _DualChannelScreenState extends State<DualChannelScreen> {
  bool _isHorizontalSplit = true; // true = горизонтально, false = вертикально
  bool _isDisposing = false;

  Future<bool> _onWillPop() async {
    if (_isDisposing) return false;

    setState(() {
      _isDisposing = true;
    });

    // Даём время для корректного закрытия нативных ресурсов
    await Future.delayed(const Duration(milliseconds: 300));
    return true;
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
              onPressed: _isDisposing
                  ? null
                  : () {
                      setState(() {
                        _isHorizontalSplit = !_isHorizontalSplit;
                      });
                    },
            ),
          ],
        ),
        body: Stack(
          children: [
            SafeArea(
              child: _isHorizontalSplit
                  ? Column(
                      children: [
                        _buildChannelView(
                          channel: 0,
                          title: 'Camera 1 (Channel 0)',
                        ),
                        const Divider(height: 2, thickness: 2),
                        _buildChannelView(
                          channel: 1,
                          title: 'Camera 2 (Channel 1)',
                        ),
                      ],
                    )
                  : Row(
                      children: [
                        _buildChannelView(channel: 0, title: 'Camera 1'),
                        const VerticalDivider(width: 2, thickness: 2),
                        _buildChannelView(channel: 1, title: 'Camera 2'),
                      ],
                    ),
            ),
            // Индикатор закрытия
            if (_isDisposing)
              Container(
                color: Colors.black87,
                child: const Center(
                  child: Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      CircularProgressIndicator(color: Colors.white),
                      SizedBox(height: 16),
                      Text(
                        'Closing connections...',
                        style: TextStyle(color: Colors.white, fontSize: 16),
                      ),
                    ],
                  ),
                ),
              ),
          ],
        ),
      ),
    );
  }

  Widget _buildChannelView({required int channel, required String title}) {
    return Expanded(
      child: Container(
        color: Colors.black,
        child: Column(
          children: [
            // Заголовок канала
            Container(
              width: double.infinity,
              padding: const EdgeInsets.all(8),
              color: Colors.black87,
              child: Text(
                title,
                style: const TextStyle(
                  color: Colors.white,
                  fontWeight: FontWeight.bold,
                ),
                textAlign: TextAlign.center,
              ),
            ),
            // Видео
            Expanded(
              child: DahuaPreview(
                ip: widget.ip,
                port: widget.port,
                user: widget.user,
                pass: widget.pass,
                channel: channel,
                streamType: 0, // 0 = MainStream (высокое качество)
              ),
            ),
          ],
        ),
      ),
    );
  }

  @override
  void dispose() {
    super.dispose();
  }
}

/// Расширенный экран с 4 каналами (2x2 grid)
class QuadChannelScreen extends StatefulWidget {
  final String ip;
  final int port;
  final String user;
  final String pass;

  const QuadChannelScreen({
    super.key,
    required this.ip,
    required this.port,
    required this.user,
    required this.pass,
  });

  @override
  State<QuadChannelScreen> createState() => _QuadChannelScreenState();
}

class _QuadChannelScreenState extends State<QuadChannelScreen> {
  bool _isDisposing = false;

  Future<bool> _onWillPop() async {
    if (_isDisposing) return false;

    setState(() {
      _isDisposing = true;
    });

    // Даём время для корректного закрытия нативных ресурсов
    await Future.delayed(const Duration(milliseconds: 500));
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
            SafeArea(
              child: Column(
                children: [
                  Expanded(
                    child: Row(
                      children: [
                        _buildChannelView(0, 'Camera 1'),
                        _buildChannelView(1, 'Camera 2'),
                      ],
                    ),
                  ),
                  Expanded(
                    child: Row(
                      children: [
                        _buildChannelView(2, 'Camera 3'),
                        _buildChannelView(3, 'Camera 4'),
                      ],
                    ),
                  ),
                ],
              ),
            ),
            // Индикатор закрытия
            if (_isDisposing)
              Container(
                color: Colors.black87,
                child: const Center(
                  child: Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      CircularProgressIndicator(color: Colors.white),
                      SizedBox(height: 16),
                      Text(
                        'Closing 4 connections...',
                        style: TextStyle(color: Colors.white, fontSize: 16),
                      ),
                    ],
                  ),
                ),
              ),
          ],
        ),
      ),
    );
  }

  Widget _buildChannelView(int channel, String title) {
    return Expanded(
      child: Container(
        decoration: BoxDecoration(
          border: Border.all(color: Colors.grey, width: 1),
          color: Colors.black,
        ),
        child: Column(
          children: [
            // Компактный заголовок
            Container(
              width: double.infinity,
              padding: const EdgeInsets.symmetric(vertical: 4),
              color: Colors.black87,
              child: Text(
                title,
                style: const TextStyle(
                  color: Colors.white,
                  fontSize: 12,
                  fontWeight: FontWeight.bold,
                ),
                textAlign: TextAlign.center,
              ),
            ),
            // Видео
            Expanded(
              child: DahuaPreview(
                ip: widget.ip,
                port: widget.port,
                user: widget.user,
                pass: widget.pass,
                channel: channel,
                streamType: 1, // 1 = ExtraStream (низкое качество для экономии)
              ),
            ),
          ],
        ),
      ),
    );
  }
}

/// Экран с выбором разных типов потоков для одного канала
class StreamComparisonScreen extends StatefulWidget {
  final String ip;
  final int port;
  final String user;
  final String pass;
  final int channel;

  const StreamComparisonScreen({
    super.key,
    required this.ip,
    required this.port,
    required this.user,
    required this.pass,
    this.channel = 0,
  });

  @override
  State<StreamComparisonScreen> createState() => _StreamComparisonScreenState();
}

class _StreamComparisonScreenState extends State<StreamComparisonScreen> {
  bool _isDisposing = false;

  Future<bool> _onWillPop() async {
    if (_isDisposing) return false;

    setState(() {
      _isDisposing = true;
    });

    await Future.delayed(const Duration(milliseconds: 300));
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
            SafeArea(
              child: Column(
                children: [
                  _buildStreamView(
                    title: 'Main Stream (High Quality)',
                    streamType: 0,
                  ),
                  const Divider(height: 2, thickness: 2),
                  _buildStreamView(
                    title: 'Extra Stream 1 (Low Quality)',
                    streamType: 1,
                  ),
                ],
              ),
            ),
            if (_isDisposing)
              Container(
                color: Colors.black87,
                child: const Center(
                  child: Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      CircularProgressIndicator(color: Colors.white),
                      SizedBox(height: 16),
                      Text(
                        'Closing connections...',
                        style: TextStyle(color: Colors.white, fontSize: 16),
                      ),
                    ],
                  ),
                ),
              ),
          ],
        ),
      ),
    );
  }

  Widget _buildStreamView({required String title, required int streamType}) {
    return Expanded(
      child: Container(
        color: Colors.black,
        child: Column(
          children: [
            Container(
              width: double.infinity,
              padding: const EdgeInsets.all(8),
              color: Colors.black87,
              child: Text(
                title,
                style: const TextStyle(
                  color: Colors.white,
                  fontWeight: FontWeight.bold,
                ),
                textAlign: TextAlign.center,
              ),
            ),
            Expanded(
              child: DahuaPreview(
                ip: widget.ip,
                port: widget.port,
                user: widget.user,
                pass: widget.pass,
                channel: widget.channel,
                streamType: streamType,
              ),
            ),
          ],
        ),
      ),
    );
  }
}
