package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#CloudUpgraderCheck} cloud upgrade check input parameter
 * \else
 *  接口 {@link INetSDK#CloudUpgraderCheck} 云升级软件检查入参
 * \endif
 */
public class NET_IN_CLOUD_UPGRADER_CHECK implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * vendor, refer to {@link ENUM_VENDOR_TYPE}
     * \else
     * 厂商, 参考 {@link ENUM_VENDOR_TYPE}
     * \endif
     */
    public int                    emVendor;

    /**
     * \if ENGLISH_LANG
     * video standard, refer to {@link ENUM_STANDARD_TYPE}
     * \else
     * 视频制式, 参考 {@link ENUM_STANDARD_TYPE}
     * \endif
     */
    public int                    emStandard;

    /**
     * \if ENGLISH_LANG
     * compile time, for comparison versions
     * \else
     * 编译时间，用于比较版本
     * \endif
     */
    public NET_TIME_EX            stuBuild = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * url
     * \else
     * 云URL
     * \endif
     */
    public byte                   szUrl[] = new byte[FinalVar.SDK_COMMON_STRING_1024];

    /**
     * \if ENGLISH_LANG
     * device class
     * \else
     * 设备大类
     * \endif
     */
    public byte                   szClass[] = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * device hardware signal series
     * \else
     * 设备硬件信号系列
     * \endif
     */
    public byte                   szSerial[] = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * language
     * \else
     * 语言
     * \endif
     */
    public byte                   szLanguage[] = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * device serial
     * \else
     * 设备序列号, 不能为空
     * \endif
     */
    public byte                   szSN[] = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * software version
     * \else
     * 版本号，用于显示
     * \endif
     */
    public byte                   szSWVersion[] = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * reserved bytes1
     * \else
     * 预留字段，可用于扩展
     * \endif
     */
    public byte                   szTag1[] = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * reserved bytes2
     * \else
     * 预留字段，可用于扩展
     * \endif
     */
    public byte                   szTag2[] = new byte[FinalVar.SDK_COMMON_STRING_256];

}
