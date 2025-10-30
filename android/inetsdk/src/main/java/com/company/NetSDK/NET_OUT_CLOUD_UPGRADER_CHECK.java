package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#CloudUpgraderCheck} cloud upgrade check output parameter
 * \else
 *  接口 {@link INetSDK#CloudUpgraderCheck} 云升级软件检查出参
 * \endif
 */
public class NET_OUT_CLOUD_UPGRADER_CHECK implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * has new version
     * \else
     * 是否有可升级版本
     * \endif
     */
    public boolean                bHasNewVersion;

    /**
     * \if ENGLISH_LANG
     * version info
     * \else
     * 版本信息
     * \endif
     */
    public byte                   szVersion[] = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * prompt information
     * \else
     * 提醒设备升级的提示信息
     * \endif
     */
    public byte                   szAttention[] = new byte[FinalVar.SDK_COMMON_STRING_1024];

    /**
     * \if ENGLISH_LANG
     * package url
     * \else
     * 设备升级包的URL
     * \endif
     */
    public byte                   szPackageUrl[] = new byte[FinalVar.SDK_COMMON_STRING_1024];

    /**
     * \if ENGLISH_LANG
     * package id
     * \else
     * 升级包ID
     * \endif
     */
    public byte 			       szPackageId[] = new byte[FinalVar.SDK_COMMON_STRING_64];
}
