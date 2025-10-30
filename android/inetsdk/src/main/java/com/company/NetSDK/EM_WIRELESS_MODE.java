package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * wireless mode
 * \else
 * 无线模块类型
 * \endif
 */
public class EM_WIRELESS_MODE implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知
     * \endif
     */
    public static final int EM_WIRELESS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * 3G
     * \else
     * 3G
     * \endif
     */
    public static final int EM_WIRELESS_3G = 1;

    /**
     * \if ENGLISH_LANG
     * 3G1
     * \else
     * 3G1
     * \endif
     */
    public static final int EM_WIRELESS_3G1 = 2;

    /**
     * \if ENGLISH_LANG
     * 3G2
     * \else
     * 3G2
     * \endif
     */
    public static final int EM_WIRELESS_3G2 = 3;

    /**
     * \if ENGLISH_LANG
     * 3G3
     * \else
     * 3G3
     * \endif
     */
    public static final int EM_WIRELESS_3G3 = 4;
}
