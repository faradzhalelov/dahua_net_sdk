@echo off
echo [INFO] ��ʼ���� Android ��Ŀ...
gradle build

if %errorlevel% neq 0 (
    echo [ERROR] ����ʧ�ܣ�
)

echo [INFO] ������ɣ��ȴ� 3 ������� Java ����...
timeout /t 3 >nul
taskkill /F /IM java.exe /T >nul 2>&1
taskkill /F /IM javaw.exe /T >nul 2>&1
echo [INFO] ���� Java �����ѹر�.
pause