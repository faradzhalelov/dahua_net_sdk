package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * GPS work state
 * \else
 * GPS工作状态
 * \endif
 */
public class NET_GPS_WORK_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown work status
     * \else
     * 未知工作状态
     * \endif
     */
    public static final int EM_WORK_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * no positioning
     * \else
     * 未定位
     * \endif
     */
    public static final int EM_NO_POSITIONING = 1;

    /**
     * \if ENGLISH_LANG
     * not differential positioning
     * \else
     * 非差分定位
     * \endif
     */
    public static final int EM_NO_DIFFERENTIAL_POSITIONING = 2;

    /**
     * \if ENGLISH_LANG
     * differential positioning
     * \else
     * 差分定位
     * \endif
     */
    public static final int EM_DIFFERENTIAL_POSITIONING = 3;

    /**
     * \if ENGLISH_LANG
     * invalid PPS
     * \else
     * 无效PPS
     * \endif
     */
    public static final int EM_INVALID_PPS = 4;

    /**
     * \if ENGLISH_LANG
     * evalusting
     * \else
     * 正在估算
     * \endif
     */
    public static final int EM_EVALUATING = 5;
}
