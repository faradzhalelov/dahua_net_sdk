package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief upgrade serial info
 * \else
 * @brief 云升级信息
 * \endif
 */
public class NET_UPGRADER_SERIAL_INO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * vendor,{@link ENUM_VENDOR_TYPE}
     * \else
     * 设备制造商,{@link ENUM_VENDOR_TYPE}
     * \endif
     */
    public int					emVendor;

    /**
     * \if ENGLISH_LANG
     * video standard,{@link ENUM_STANDARD_TYPE}
     * \else
     * 视频制式,{@link ENUM_STANDARD_TYPE}
     * \endif
     */
    public int					emStandard;

    /**
     * \if ENGLISH_LANG
     * build info
     * \else
     * 发布日期
     * \endif
     */
    public NET_TIME_EX					stuBuild = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * chip
     * \else
     * 可升级的程序名
     * \endif
     */
    public byte					szChip[] = new byte[FinalVar.SDK_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * serial
     * \else
     *  内部型号
     * \endif
     */
    public byte					szSerial[] = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * language
     * \else
     * 语言
     * \endif
     */
    public byte					szLanguage[] = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * sn
     * \else
     *  序列号
     * \endif
     */
    public byte					szSn[] = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * software version    
     * \else
     *  软件版本    
     * \endif
     */
    public byte					szSWVersion[] = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * tag
     * \else
     * 自定义标记
     * \endif
     */
    public byte					szTag[] = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * tag2
     * \else
     * 自定义标记2
     * \endif
     */
    public byte					szTag2[] = new byte[FinalVar.SDK_COMMON_STRING_256];

}