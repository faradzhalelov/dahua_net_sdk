import 'package:flutter/material.dart';
import '../models/ptz_command.dart';

/// PTZ Control Button Widget
class PtzButton extends StatelessWidget {
  final PtzCommand command;
  final IconData icon;
  final Color color;
  final void Function(PtzCommand, bool) onControl;

  const PtzButton({
    super.key,
    required this.command,
    required this.icon,
    required this.color,
    required this.onControl,
  });

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTapDown: (_) => onControl(command, true),
      onTapUp: (_) => onControl(command, false),
      child: Container(
        width: 60,
        height: 60,
        decoration: BoxDecoration(
          color: color,
          borderRadius: BorderRadius.circular(8),
        ),
        child: Icon(icon, color: Colors.white, size: 32),
      ),
    );
  }
}

/// PTZ Controls Panel
class PtzControlsPanel extends StatelessWidget {
  final void Function(PtzCommand, bool) onControl;

  const PtzControlsPanel({super.key, required this.onControl});

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: const EdgeInsets.all(16),
      color: Colors.grey.shade200,
      child: Column(
        children: [
          Text('PTZ Controls', style: Theme.of(context).textTheme.titleMedium),
          const SizedBox(height: 16),
          Row(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              _buildDirectionalControls(),
              const SizedBox(width: 32),
              _buildZoomControls(),
            ],
          ),
        ],
      ),
    );
  }

  Widget _buildDirectionalControls() {
    return Column(
      children: [
        PtzButton(
          command: PtzCommand.up,
          icon: Icons.arrow_upward,
          color: Colors.blue,
          onControl: onControl,
        ),
        const SizedBox(height: 8),
        Row(
          children: [
            PtzButton(
              command: PtzCommand.left,
              icon: Icons.arrow_back,
              color: Colors.blue,
              onControl: onControl,
            ),
            const SizedBox(width: 8),
            _buildCenterIndicator(),
            const SizedBox(width: 8),
            PtzButton(
              command: PtzCommand.right,
              icon: Icons.arrow_forward,
              color: Colors.blue,
              onControl: onControl,
            ),
          ],
        ),
        const SizedBox(height: 8),
        PtzButton(
          command: PtzCommand.down,
          icon: Icons.arrow_downward,
          color: Colors.blue,
          onControl: onControl,
        ),
      ],
    );
  }

  Widget _buildZoomControls() {
    return Column(
      children: [
        PtzButton(
          command: PtzCommand.zoomIn,
          icon: Icons.zoom_in,
          color: Colors.green,
          onControl: onControl,
        ),
        const SizedBox(height: 8),
        PtzButton(
          command: PtzCommand.zoomOut,
          icon: Icons.zoom_out,
          color: Colors.green,
          onControl: onControl,
        ),
      ],
    );
  }

  Widget _buildCenterIndicator() {
    return Container(
      width: 60,
      height: 60,
      decoration: BoxDecoration(
        color: Colors.grey,
        borderRadius: BorderRadius.circular(8),
      ),
      child: const Icon(Icons.circle, color: Colors.white, size: 16),
    );
  }
}
