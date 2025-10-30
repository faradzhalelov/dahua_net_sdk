package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * seat type
 * \else
 * 座驾类型
 * \endif
 */
public class EM_COMMON_SEAT_TYPE implements  Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未识别
     * \endif
     */
    public static final int COMMON_SEAT_TYPE_UNKNOWN    = 0;

    /**
     * \if ENGLISH_LANG
     * main seat
     * \else
     * 主驾驶
     * \endif
     */
    public static final int COMMON_SEAT_TYPE_MAIN       = 1;

    /**
     * \if ENGLISH_LANG
     * sub seat
     * \else
     * 副驾驶
     * \endif
     */
    public static final int COMMON_SEAT_TYPE_SLAVE      = 2;
}
