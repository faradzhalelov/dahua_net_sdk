@echo off
echo [INFO] 开始编译 Android 项目...
gradle build

if %errorlevel% neq 0 (
    echo [ERROR] 编译失败！
)

echo [INFO] 编译完成，等待 3 秒后清理 Java 进程...
timeout /t 3 >nul
taskkill /F /IM java.exe /T >nul 2>&1
taskkill /F /IM javaw.exe /T >nul 2>&1
echo [INFO] 所有 Java 进程已关闭.
pause