import 'package:flutter/material.dart';
import 'dart:async';
import 'package:dahua_sdk/dahua_sdk.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Dahua SDK Example',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.blue),
        useMaterial3: true,
      ),
      home: const DahuaHomePage(),
    );
  }
}

class DahuaHomePage extends StatefulWidget {
  const DahuaHomePage({super.key});

  @override
  State<DahuaHomePage> createState() => _DahuaHomePageState();
}

class _DahuaHomePageState extends State<DahuaHomePage> {
  final _ipController = TextEditingController(text: '192.168.80.203');
  final _portController = TextEditingController(text: '37777');
  final _userController = TextEditingController(text: 'admin');
  final _passController = TextEditingController(text: 'cerebro123Q');
  /*
  192.168.80.203
  admin
  cerebro123Q
  */

  bool _isInitialized = false;
  bool _isConnected = false;
  String _statusMessage = 'Ready';

  @override
  void initState() {
    super.initState();
    _initializeSDK();
  }

  Future<void> _initializeSDK() async {
    try {
      await DahuaSdk.init();
      setState(() {
        _isInitialized = true;
        _statusMessage = 'SDK Initialized';
      });
    } catch (e) {
      setState(() {
        _statusMessage = 'Init failed: $e';
      });
    }
  }

  void _connect() {
    if (_ipController.text.isEmpty ||
        _userController.text.isEmpty ||
        _passController.text.isEmpty) {
      setState(() {
        _statusMessage = 'Please fill all fields';
      });
      return;
    }

    setState(() {
      _isConnected = true;
      _statusMessage = 'Connecting...';
    });

    // Navigate to video screen
    Navigator.push(
      context,
      MaterialPageRoute(
        builder: (context) => DahuaVideoScreen(
          ip: _ipController.text,
          port: int.tryParse(_portController.text) ?? 37777,
          user: _userController.text,
          pass: _passController.text,
        ),
      ),
    ).then((_) {
      setState(() {
        _isConnected = false;
        _statusMessage = 'Disconnected';
      });
    });
  }

  @override
  void dispose() {
    _ipController.dispose();
    _portController.dispose();
    _userController.dispose();
    _passController.dispose();
    DahuaSdk.cleanup();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Theme.of(context).colorScheme.inversePrimary,
        title: const Text('Dahua SDK Example'),
      ),
      body: SingleChildScrollView(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            // Status Card
            Card(
              color: _isInitialized
                  ? Colors.green.shade50
                  : Colors.orange.shade50,
              child: Padding(
                padding: const EdgeInsets.all(16.0),
                child: Column(
                  children: [
                    Icon(
                      _isInitialized ? Icons.check_circle : Icons.info,
                      color: _isInitialized ? Colors.green : Colors.orange,
                      size: 48,
                    ),
                    const SizedBox(height: 8),
                    Text(
                      _statusMessage,
                      style: Theme.of(context).textTheme.titleMedium,
                      textAlign: TextAlign.center,
                    ),
                  ],
                ),
              ),
            ),
            const SizedBox(height: 24),

            // Connection Form
            Text(
              'Camera Connection',
              style: Theme.of(context).textTheme.headlineSmall,
            ),
            const SizedBox(height: 16),

            TextField(
              controller: _ipController,
              decoration: const InputDecoration(
                labelText: 'IP Address',
                border: OutlineInputBorder(),
                prefixIcon: Icon(Icons.router),
              ),
              keyboardType: TextInputType.number,
            ),
            const SizedBox(height: 12),

            TextField(
              controller: _portController,
              decoration: const InputDecoration(
                labelText: 'Port',
                border: OutlineInputBorder(),
                prefixIcon: Icon(Icons.settings_ethernet),
              ),
              keyboardType: TextInputType.number,
            ),
            const SizedBox(height: 12),

            TextField(
              controller: _userController,
              decoration: const InputDecoration(
                labelText: 'Username',
                border: OutlineInputBorder(),
                prefixIcon: Icon(Icons.person),
              ),
            ),
            const SizedBox(height: 12),

            TextField(
              controller: _passController,
              decoration: const InputDecoration(
                labelText: 'Password',
                border: OutlineInputBorder(),
                prefixIcon: Icon(Icons.lock),
              ),
              obscureText: true,
            ),
            const SizedBox(height: 24),

            ElevatedButton.icon(
              onPressed: _isInitialized && !_isConnected ? _connect : null,
              icon: const Icon(Icons.videocam),
              label: const Text('Connect & View Stream'),
              style: ElevatedButton.styleFrom(
                padding: const EdgeInsets.all(16),
              ),
            ),
          ],
        ),
      ),
    );
  }
}

class DahuaVideoScreen extends StatefulWidget {
  final String ip;
  final int port;
  final String user;
  final String pass;

  const DahuaVideoScreen({
    super.key,
    required this.ip,
    required this.port,
    required this.user,
    required this.pass,
  });

  @override
  State<DahuaVideoScreen> createState() => _DahuaVideoScreenState();
}

class _DahuaVideoScreenState extends State<DahuaVideoScreen> {
  bool _isLoading = true;
  String _debugInfo = 'Initializing...';

  @override
  void initState() {
    super.initState();
    // Simulate loading delay
    Future.delayed(const Duration(seconds: 1), () {
      if (mounted) {
        setState(() {
          _isLoading = false;
          _debugInfo = 'Connected to ${widget.ip}:${widget.port}';
        });
      }
    });
  }

  Future<void> _controlPTZ(int cmd, bool start) async {
    try {
      // Note: You'll need to pass actual handle from login
      // This is a placeholder showing the API usage
      await DahuaSdk.ptz(
        handle: 0, // Replace with actual login handle
        cmd: cmd,
        speed: 5,
        start: start,
      );
    } catch (e) {
      if (mounted) {
        ScaffoldMessenger.of(
          context,
        ).showSnackBar(SnackBar(content: Text('PTZ Error: $e')));
      }
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Live View - ${widget.ip}'),
        actions: [
          IconButton(
            icon: const Icon(Icons.refresh),
            onPressed: () {
              setState(() {
                _isLoading = true;
              });
              Future.delayed(const Duration(milliseconds: 500), () {
                if (mounted) {
                  setState(() {
                    _isLoading = false;
                  });
                }
              });
            },
          ),
        ],
      ),
      body: Column(
        children: [
          // Video Preview
          Expanded(
            child: Container(
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
                      ip: widget.ip,
                      port: widget.port,
                      user: widget.user,
                      pass: widget.pass,
                    ),
                  // Debug info overlay
                  Positioned(
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
                        style: const TextStyle(
                          color: Colors.white,
                          fontSize: 12,
                        ),
                      ),
                    ),
                  ),
                ],
              ),
            ),
          ),

          // PTZ Controls
          Container(
            padding: const EdgeInsets.all(16),
            color: Colors.grey.shade200,
            child: Column(
              children: [
                Text(
                  'PTZ Controls',
                  style: Theme.of(context).textTheme.titleMedium,
                ),
                const SizedBox(height: 16),
                Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    // Up
                    Column(
                      children: [
                        GestureDetector(
                          onTapDown: (_) => _controlPTZ(0, true), // CMD_UP
                          onTapUp: (_) => _controlPTZ(0, false),
                          child: Container(
                            width: 60,
                            height: 60,
                            decoration: BoxDecoration(
                              color: Colors.blue,
                              borderRadius: BorderRadius.circular(8),
                            ),
                            child: const Icon(
                              Icons.arrow_upward,
                              color: Colors.white,
                              size: 32,
                            ),
                          ),
                        ),
                        const SizedBox(height: 8),
                        // Left - Center - Right
                        Row(
                          children: [
                            GestureDetector(
                              onTapDown: (_) =>
                                  _controlPTZ(2, true), // CMD_LEFT
                              onTapUp: (_) => _controlPTZ(2, false),
                              child: Container(
                                width: 60,
                                height: 60,
                                decoration: BoxDecoration(
                                  color: Colors.blue,
                                  borderRadius: BorderRadius.circular(8),
                                ),
                                child: const Icon(
                                  Icons.arrow_back,
                                  color: Colors.white,
                                  size: 32,
                                ),
                              ),
                            ),
                            const SizedBox(width: 8),
                            Container(
                              width: 60,
                              height: 60,
                              decoration: BoxDecoration(
                                color: Colors.grey,
                                borderRadius: BorderRadius.circular(8),
                              ),
                              child: const Icon(
                                Icons.circle,
                                color: Colors.white,
                                size: 16,
                              ),
                            ),
                            const SizedBox(width: 8),
                            GestureDetector(
                              onTapDown: (_) =>
                                  _controlPTZ(3, true), // CMD_RIGHT
                              onTapUp: (_) => _controlPTZ(3, false),
                              child: Container(
                                width: 60,
                                height: 60,
                                decoration: BoxDecoration(
                                  color: Colors.blue,
                                  borderRadius: BorderRadius.circular(8),
                                ),
                                child: const Icon(
                                  Icons.arrow_forward,
                                  color: Colors.white,
                                  size: 32,
                                ),
                              ),
                            ),
                          ],
                        ),
                        const SizedBox(height: 8),
                        // Down
                        GestureDetector(
                          onTapDown: (_) => _controlPTZ(1, true), // CMD_DOWN
                          onTapUp: (_) => _controlPTZ(1, false),
                          child: Container(
                            width: 60,
                            height: 60,
                            decoration: BoxDecoration(
                              color: Colors.blue,
                              borderRadius: BorderRadius.circular(8),
                            ),
                            child: const Icon(
                              Icons.arrow_downward,
                              color: Colors.white,
                              size: 32,
                            ),
                          ),
                        ),
                      ],
                    ),
                    const SizedBox(width: 32),
                    // Zoom Controls
                    Column(
                      children: [
                        GestureDetector(
                          onTapDown: (_) =>
                              _controlPTZ(10, true), // CMD_ZOOM_IN
                          onTapUp: (_) => _controlPTZ(10, false),
                          child: Container(
                            width: 60,
                            height: 60,
                            decoration: BoxDecoration(
                              color: Colors.green,
                              borderRadius: BorderRadius.circular(8),
                            ),
                            child: const Icon(
                              Icons.zoom_in,
                              color: Colors.white,
                              size: 32,
                            ),
                          ),
                        ),
                        const SizedBox(height: 8),
                        GestureDetector(
                          onTapDown: (_) =>
                              _controlPTZ(11, true), // CMD_ZOOM_OUT
                          onTapUp: (_) => _controlPTZ(11, false),
                          child: Container(
                            width: 60,
                            height: 60,
                            decoration: BoxDecoration(
                              color: Colors.green,
                              borderRadius: BorderRadius.circular(8),
                            ),
                            child: const Icon(
                              Icons.zoom_out,
                              color: Colors.white,
                              size: 32,
                            ),
                          ),
                        ),
                      ],
                    ),
                  ],
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
