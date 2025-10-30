package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * WIFI scan and config support version type
 * \else
 * WIFI扫描及配置支持的版本类型
 * \endif
 */
public class EM_WLAN_SCAN_AND_CONFIG_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_WLAN_SCAN_AND_CONFIG_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * version 2
     * \else
     * 二代协议
     * \endif
     */
    public static final int EM_WLAN_SCAN_AND_CONFIG_V2 = 1;

    /**
     * \if ENGLISH_LANG
     * version 3
     * \else
     * 三代协议
     * \endif
     */
    public static final int EM_WLAN_SCAN_AND_CONFIG_V3 = 2;
}
