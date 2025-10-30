package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * eyes state
 * \else
 * 眼睛状态
 * \endif
 */
public class EM_EYE_STATE_TYPE implements Serializable {
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
    public static final int EM_EYE_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * no disringuish
     * \else
     * 未识别
     * \endif
     */
    public static final int EM_EYE_STATE_NODISTI = 1;

    /**
     * \if ENGLISH_LANG
     * close eyes
     * \else
     * 闭眼
     * \endif
     */
    public static final int EM_EYE_STATE_CLOSE = 2;

    /**
     * \if ENGLISH_LANG
     * open eyes
     * \else
     * 睁眼
     * \endif
     */
    public static final int EM_EYE_STATE_OPEN = 3;
}
