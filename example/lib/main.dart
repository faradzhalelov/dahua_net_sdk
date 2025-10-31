import 'package:flutter/material.dart';
import 'package:flutter_dotenv/flutter_dotenv.dart';
import 'models/camera_config.dart';
import 'viewmodels/camera_viewmodel.dart';
import 'views/home_view.dart';
import 'constants/app_constants.dart';

Future<void> main() async {
  await dotenv.load(fileName: ".env");
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
      home: HomeView(viewModel: CameraViewModel(_loadConfigFromEnv())),
    );
  }

  static CameraConfig _loadConfigFromEnv() {
    return CameraConfig(
      ip: dotenv.env[AppConstants.envIpKey] ?? AppConstants.defaultIp,
      port:
          int.tryParse(dotenv.env[AppConstants.envPortKey] ?? '') ??
          AppConstants.defaultPort,
      username:
          dotenv.env[AppConstants.envUserKey] ?? AppConstants.defaultUsername,
      password:
          dotenv.env[AppConstants.envPassKey] ?? AppConstants.defaultPassword,
    );
  }
}
