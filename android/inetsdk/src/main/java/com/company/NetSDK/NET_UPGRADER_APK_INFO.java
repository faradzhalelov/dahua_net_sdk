package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Used to set the remote upgrade information of the corresponding APK (installation package) for Android apps
 * \else
 * @brief 用于设置安卓app对应apk（安装包）远程升级信息
 * \endif
 */
public class NET_UPGRADER_APK_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The app is uniquely identified in the Android system and is used to open the corresponding app in the Android system
     * \else
     * app在安卓系统中唯一标识，用于安卓系统打开对应app
     * \endif
     */
    public byte					szAppPackage[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * The name of the internal activity page of the app, used by the Android system to display the content on which page after opening the app
     * \else
     * app内部活动页名称，用于安卓系统打开app后展示哪页内容
     * \endif
     */
    public byte					szAppActivityName[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * Whether to restart the app after upgrading
     * \else
     * 升级完毕后是否需要重启app
     * \endif
     */
    public boolean					bAppReboot;

}