package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * WLAN Encryption
 * \else
 * WLAN加密方式
 * \endif
 */
public class EM_WLAN_ENCRYPTION_TYPE implements Serializable {
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
    public static final int EM_ENCRYPTION_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Auto
     * \else
     * 自动
     * \endif
     */
    public static final int EM_ENCRYPTION_TYPE_AUTO = 1;
}
