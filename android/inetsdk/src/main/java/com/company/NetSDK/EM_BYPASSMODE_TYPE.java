package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief Bypass mode type
 * \else
 * @brief 旁路模式类型
 * \endif
 */
public class EM_BYPASSMODE_TYPE implements Serializable {
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
    public static final int EM_BYPASSMODE_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Not use
     * \else
     * 不使用
     * \endif
     */
    public static final int EM_BYPASSMODE_TYPE_OFF = 1;

    /**
     * \if ENGLISH_LANG
     * Normal
     * \else
     * 正常
     * \endif
     */
    public static final int EM_BYPASSMODE_TYPE_ACTIVE = 2;

    /**
     * \if ENGLISH_LANG
     * Bypass
     * \else
     * 旁路
     * \endif
     */
    public static final int EM_BYPASSMODE_TYPE_BYPASSED = 3;

    /**
     * \if ENGLISH_LANG
     * Isolate
     * \else
     * 隔离
     * \endif
     */
    public static final int EM_BYPASSMODE_TYPE_ISOLATED = 4;

    /**
     * \if ENGLISH_LANG
     * Test
     * \else
     * 测试
     * \endif
     */
    public static final int EM_BYPASSMODE_TYPE_TEST = 5;

}