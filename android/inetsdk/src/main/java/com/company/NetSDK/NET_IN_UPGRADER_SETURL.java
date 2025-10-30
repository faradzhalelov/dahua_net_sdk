package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief setting upgrade pakcages url input parameters
 * \else
 * @brief 设置升级包URL入参
 * \endif
 */
public class NET_IN_UPGRADER_SETURL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  upgrade pakcages url
     * \else
     *升级包下载地址
     * \endif
     */
    public byte					szUrl[] = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     *  upgrade pakcages verification mode 0:MD5
     * \else
     *升级包校验方式0:传入MD5值校验
     * \endif
     */
    public int					nCheckType;

    /**
     * \if ENGLISH_LANG
     *  upgrade pakcages verification value
     * \else
     *升级包校验值
     * \endif
     */
    public byte					szCheckSum[] = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     *  The number of supare upgrade pakcages url
     * \else
     *备选升级包的个数 
     * \endif
     */
    public int					nSpareUrl;

    /**
     * \if ENGLISH_LANG
     *  supare upgrade pakcages url
     * \else
     *备选升级包下载地址
     * \endif
     */
    public byte					szSpareUrl[][] = new byte[4][256];

    /**
     * \if ENGLISH_LANG
     * Upgrade type, default main program 0: Main 1: Sub 2: ExternDevice 3: APK
     * \else
     * 升级类型,默认主程序 0:主程序 1:从片 2:第三方设备 3:安卓应用软件通用包格式升级
     * \endif
     */
    public int					nUpgradeType;

    /**
     * \if ENGLISH_LANG
     * Whether to use the bReboot field
     * \else
     * 是否使用bReboot字段
     * \endif
     */
    public boolean					bUseReboot;

    /**
     * \if ENGLISH_LANG
     * Whether restart the device after the upgrade is completed
     * \else
     * 升级完毕后是否需要重启设备
     * \endif
     */
    public boolean					bReboot;

    /**
     * \if ENGLISH_LANG
     * Whether to use the stuApkInfo field
     * \else
     * 是否使用stuApkInfo字段
     * \endif
     */
    public boolean					bUseApkInfo;

    /**
     * \if ENGLISH_LANG
     * Used to set the remote upgrade information of the corresponding APK (installation package) for Android apps
     * \else
     * 用于设置安卓app对应apk（安装包）远程升级信息
     * \endif
     */
    public NET_UPGRADER_APK_INFO stuApkInfo = new NET_UPGRADER_APK_INFO();

}