package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * beard state
 * \else
 * 胡子状态
 * \endif
 */
public class EM_BEARD_STATE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_BEARD_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * no disringuish
     * \else
     * 未识别
     * \endif
     */
    public static final int EM_BEARD_STATE__NODISTI = 1;

    /**
     * \if ENGLISH_LANG
     * no beard
     * \else
     * 没胡子
     * \endif
     */
    public static final int EM_BEARD_STATE_NOBEARD = 2;

    /**
     * \if ENGLISH_LANG
     * have beard
     * \else
     * 有胡子
     * \endif
     */
    public static final int EM_BEARD_STATE_HAVEBEARD = 3;
}
