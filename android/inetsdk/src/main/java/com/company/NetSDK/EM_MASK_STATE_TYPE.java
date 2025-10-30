package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * mask state
 * \else
 * 口罩状态
 * \endif
 */
public class EM_MASK_STATE_TYPE implements Serializable {
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
    public static final int EM_MASK_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * no disringuish
     * \else
     * 未识别
     * \endif
     */
    public static final int EM_MASK_STATE_NODISTI = 1;

    /**
     * \if ENGLISH_LANG
     * no mask
     * \else
     * 没戴口罩
     * \endif
     */
    public static final int EM_MASK_STATE_NOMASK = 2;

    /**
     * \if ENGLISH_LANG
     * wearing mask
     * \else
     * 戴口罩
     * \endif
     */
    public static final int EM_MASK_STATE_WEAR = 3;
}
