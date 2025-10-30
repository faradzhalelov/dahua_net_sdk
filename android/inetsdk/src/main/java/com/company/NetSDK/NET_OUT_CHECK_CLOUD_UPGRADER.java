package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output parameter about Check Cloud Upgrader
 * \else
 * 检查是否有可用升级包 出参
 * \endif
 */
public class NET_OUT_CHECK_CLOUD_UPGRADER implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Old Version
     * \else
     * 升级状态
     * \endif
     */
    public int emState;

    /**
     * \if ENGLISH_LANG
     * Old Version
     * \else
     * 新版本升级包类型
     * \endif
     */
    public int emPackageType;

    /**
     * \if ENGLISH_LANG
     * Old Version
     * \else
     * 旧版本号
     * \endif
     */
    public byte                   szOldVersion[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * New Version
     * \else
     * 新版本号
     * \endif
     */
    public byte                   szNewVersion[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * Attention
     * \else
     * 新的升级包更新内容
     * \endif
     */
    public byte                   szAttention[] = new byte[FinalVar.MAX_COMMON_STRING_2048];

    /**
     * \if ENGLISH_LANG
     * Package URL
     * \else
     * 升级包下载地址(代理升级需要)
     * \endif
     */
    public byte                   szPackageURL[] = new byte[FinalVar.MAX_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * Package Id
     * \else
     * 升级包ID
     * \endif
     */
    public byte                   szPackageID[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * Check Sum
     * \else
     * 升级包的SHA-256校验和
     * \endif
     */
    public byte                   szCheckSum[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * Build Time
     * \else
     * 升级包构建时间
     * \endif
     */
    public byte                   szBuildTime[] = new byte[FinalVar.MAX_COMMON_STRING_32];

}
