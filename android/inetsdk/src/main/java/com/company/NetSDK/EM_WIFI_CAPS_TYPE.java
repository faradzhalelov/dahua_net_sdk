package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Wifi Caps
 * \else
 * Wifi 能力集
 * \endif
 */
public class EM_WIFI_CAPS_TYPE implements Serializable {
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
    public static final int EM_CAPS_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Client
     * \else
     * Client
     * \endif
     */
    public static final int EM_CAPS_TYPE_CLIENT = 1;

    /**
     * \if ENGLISH_LANG
     * Ap
     * \else
     * Ap
     * \endif
     */
    public static final int EM_CAPS_TYPE_AP = 2;

    /**
     * \if ENGLISH_LANG
     * Wps
     * \else
     * Wps
     * \endif
     */
    public static final int EM_CAPS_TYPE_WPS = 3;

}
