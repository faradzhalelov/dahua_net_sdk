package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * mouth state
 * \else
 * 嘴巴状态
 * \endif
 */
public class EM_MOUTH_STATE_TYPE implements Serializable {
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
    public static final int EM_MOUTH_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * no disringuish
     * \else
     * 未识别
     * \endif
     */
    public static final int EM_MOUTH_STATE_NODISTI = 1;

    /**
     * \if ENGLISH_LANG
     * close mouth
     * \else
     * 闭嘴
     * \endif
     */
    public static final int EM_MOUTH_STATE_CLOSE = 2;

    /**
     * \if ENGLISH_LANG
     * open nouth
     * \else
     * 张嘴
     * \endif
     */
    public static final int EM_MOUTH_STATE_OPEN = 3;
}
