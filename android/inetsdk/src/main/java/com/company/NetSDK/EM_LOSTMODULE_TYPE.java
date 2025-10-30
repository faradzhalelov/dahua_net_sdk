package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * lost module type
 * \else
 * 掉线模块类型
 * \endif
 */
public class EM_LOSTMODULE_TYPE implements Serializable{
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
    public static final int EM_LOSTMODULE_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Wired
     * \else
     * 有线扩展模块
     * \endif
     */
    public static final int EM_LOSTMODULE_TYPE_WIRED = 1;

    /**
     * \if ENGLISH_LANG
     * Wireless
     * \else
     * 无线配件
     * \endif
     */
    public static final int EM_LOSTMODULE_TYPE_WIRELESS = 2;
}
