package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of NAS APK Install Request, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_NAS_APK_INSTALL_REQUEST}
 * \else
 * 请求设备安装APK事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_NAS_APK_INSTALL_REQUEST}
 * \endif
 */
public class ALARM_NAS_APK_INSTALL_REQUEST_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * APK Path
     * \else
     * 安装文件路径名
     * \endif
     */
    public byte[]					  szApkPath = new byte[FinalVar.SDK_COMMON_STRING_128];
}
