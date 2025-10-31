import '../models/ptz_command.dart';
import 'package:dahua_sdk/dahua_sdk.dart';
import '../constants/app_constants.dart';

class PtzViewModel {
  final int loginHandle;
  final void Function(String) onError;

  PtzViewModel({required this.loginHandle, required this.onError});

  Future<void> executeCommand(PtzCommand command, bool start) async {
    try {
      await DahuaSdk.ptz(
        handle: loginHandle,
        cmd: command.code,
        speed: AppConstants.ptzSpeed,
        start: start,
      );
    } catch (e) {
      onError('PTZ Error: $e');
    }
  }
}
