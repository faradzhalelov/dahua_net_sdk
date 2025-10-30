package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Test result type of respirator
 * \else
 * 口罩检测结果类型
 * \endif
 */
public class EM_MASK_DETECT_RESULT_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_MASK_DETECT_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  No mask
     * \else
     *  未戴口罩
     * \endif
     */
    public static final int					EM_MASK_DETECT_TYPE_NO_MASK = 1;

    /**
     * \if ENGLISH_LANG
     *  Wear mask
     * \else
     *  戴口罩
     * \endif
     */
    public static final int					EM_MASK_DETECT_TYPE_WEAR_MASK = 2;

}
