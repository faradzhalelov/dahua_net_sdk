import 'package:flutter/material.dart';
import '../models/camera_config.dart';
import '../viewmodels/camera_viewmodel.dart';
import '../widgets/status_card.dart';
import 'single_channel_view.dart';
import 'dual_channel_view.dart';
import 'quad_channel_view.dart';

class HomeView extends StatefulWidget {
  final CameraViewModel viewModel;

  const HomeView({super.key, required this.viewModel});

  @override
  State<HomeView> createState() => _HomeViewState();
}

class _HomeViewState extends State<HomeView> {
  late final TextEditingController _ipController;
  late final TextEditingController _portController;
  late final TextEditingController _userController;
  late final TextEditingController _passController;

  @override
  void initState() {
    super.initState();
    final config = widget.viewModel.config;
    _ipController = TextEditingController(text: config.ip);
    _portController = TextEditingController(text: config.port.toString());
    _userController = TextEditingController(text: config.username);
    _passController = TextEditingController(text: config.password);

    widget.viewModel.addListener(_onViewModelChanged);
    widget.viewModel.initialize();
  }

  @override
  void dispose() {
    widget.viewModel.removeListener(_onViewModelChanged);
    _ipController.dispose();
    _portController.dispose();
    _userController.dispose();
    _passController.dispose();
    widget.viewModel.cleanup();
    super.dispose();
  }

  void _onViewModelChanged() {
    if (mounted) setState(() {});
  }

  void _navigateToView(Widget view) {
    if (!_updateAndValidateConfig()) return;

    widget.viewModel.startConnection();
    Navigator.push(
      context,
      MaterialPageRoute(builder: (_) => view),
    ).then((_) => widget.viewModel.endConnection());
  }

  bool _updateAndValidateConfig() {
    final config = CameraConfig(
      ip: _ipController.text,
      port: int.tryParse(_portController.text) ?? 37777,
      username: _userController.text,
      password: _passController.text,
    );
    widget.viewModel.updateConfig(config);
    return widget.viewModel.validateConnection();
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
            StatusCard(
              isInitialized: widget.viewModel.isInitialized,
              message: widget.viewModel.status.message,
            ),
            const SizedBox(height: 24),
            _buildConnectionForm(),
            const SizedBox(height: 24),
            _buildViewButtons(),
          ],
        ),
      ),
    );
  }

  Widget _buildConnectionForm() {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Text(
          'Camera Connection',
          style: Theme.of(context).textTheme.headlineSmall,
        ),
        const SizedBox(height: 16),
        _buildTextField(
          controller: _ipController,
          label: 'IP Address',
          icon: Icons.router,
          keyboardType: TextInputType.number,
        ),
        const SizedBox(height: 12),
        _buildTextField(
          controller: _portController,
          label: 'Port',
          icon: Icons.settings_ethernet,
          keyboardType: TextInputType.number,
        ),
        const SizedBox(height: 12),
        _buildTextField(
          controller: _userController,
          label: 'Username',
          icon: Icons.person,
        ),
        const SizedBox(height: 12),
        _buildTextField(
          controller: _passController,
          label: 'Password',
          icon: Icons.lock,
          obscureText: true,
        ),
      ],
    );
  }

  Widget _buildTextField({
    required TextEditingController controller,
    required String label,
    required IconData icon,
    TextInputType? keyboardType,
    bool obscureText = false,
  }) {
    return TextField(
      controller: controller,
      decoration: InputDecoration(
        labelText: label,
        border: const OutlineInputBorder(),
        prefixIcon: Icon(icon),
      ),
      keyboardType: keyboardType,
      obscureText: obscureText,
    );
  }

  Widget _buildViewButtons() {
    final canConnect = widget.viewModel.canConnect;
    return Column(
      children: [
        _buildButton(
          label: 'Single Channel View',
          icon: Icons.videocam,
          color: Colors.blue,
          enabled: canConnect,
          onPressed: () => _navigateToView(
            SingleChannelView(config: widget.viewModel.config),
          ),
        ),
        const SizedBox(height: 12),
        _buildButton(
          label: 'Dual Channel View (2 Cameras)',
          icon: Icons.video_library,
          color: Colors.green,
          enabled: canConnect,
          onPressed: () =>
              _navigateToView(DualChannelView(config: widget.viewModel.config)),
        ),
        const SizedBox(height: 12),
        _buildButton(
          label: 'Quad Channel View (4 Cameras)',
          icon: Icons.grid_view,
          color: Colors.orange,
          enabled: canConnect,
          onPressed: () =>
              _navigateToView(QuadChannelView(config: widget.viewModel.config)),
        ),
      ],
    );
  }

  Widget _buildButton({
    required String label,
    required IconData icon,
    required Color color,
    required bool enabled,
    required VoidCallback onPressed,
  }) {
    return ElevatedButton.icon(
      onPressed: enabled ? onPressed : null,
      icon: Icon(icon),
      label: Text(label),
      style: ElevatedButton.styleFrom(
        padding: const EdgeInsets.all(16),
        backgroundColor: color,
      ),
    );
  }
}
