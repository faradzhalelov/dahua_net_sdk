import 'package:flutter/material.dart';

/// Reusable status card widget
class StatusCard extends StatelessWidget {
  final bool isInitialized;
  final String message;

  const StatusCard({
    super.key,
    required this.isInitialized,
    required this.message,
  });

  @override
  Widget build(BuildContext context) {
    return Card(
      color: isInitialized ? Colors.green.shade50 : Colors.orange.shade50,
      child: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            Icon(
              isInitialized ? Icons.check_circle : Icons.info,
              color: isInitialized ? Colors.green : Colors.orange,
              size: 48,
            ),
            const SizedBox(height: 8),
            Text(
              message,
              style: Theme.of(context).textTheme.titleMedium,
              textAlign: TextAlign.center,
            ),
          ],
        ),
      ),
    );
  }
}
