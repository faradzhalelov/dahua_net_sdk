package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Detection mode
 * \else
 * @brief 检测模式
 * \endif
 */
public class EM_EVENT_DETECT_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_EVENT_DETECT_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  Less than or equal to the threshold alarm
     * \else
     *  小于等于阈值报警
     * \endif
     */
    public static final int					EM_EVENT_DETECT_TYPE_LESS_OR_EQUAL = 0;

    /**
     * \if ENGLISH_LANG
     *  greater than or equal to the threshold alarm
     * \else
     *  大于等于阈值报警
     * \endif
     */
    public static final int					EM_EVENT_DETECT_TYPE_GREATER_OR_EQUAL = 1;

    /**
     * \if ENGLISH_LANG
     *  equal to threshold alarm
     * \else
     *  等于阀值报警
     * \endif
     */
    public static final int					EM_EVENT_DETECT_TYPE_EQUAL = 2;

    /**
     * \if ENGLISH_LANG
     *  Not equal to threshold alarm
     * \else
     *  不等于阀值报警
     * \endif
     */
    public static final int					EM_EVENT_DETECT_TYPE_NOEQUAL = 3;

    /**
     * \if ENGLISH_LANG
     *  Alarm for changes in the number of people
     * \else
     *  人数变化报警
     * \endif
     */
    public static final int					EM_EVENT_DETECT_TYPE_CHANGE = 4;

    /**
     * \if ENGLISH_LANG
     *  greater than the threshold alarm
     * \else
     *  大于阈值报警
     * \endif
     */
    public static final int					EM_EVENT_DETECT_TYPE_GREATER = 5;

    /**
     * \if ENGLISH_LANG
     *  less than threshold alarm
     * \else
     *  小于阈值报警
     * \endif
     */
    public static final int					EM_EVENT_DETECT_TYPE_LESS = 6;

    /**
     * \if ENGLISH_LANG
     *  Alarm in the interval, the number of people detected in the interval is alarmed, including the boundary value.
     * \else
     *  区间内报警，检测人数在区间范围内报警，包括边界值。区间值对应PersonNum字段
     * \endif
     */
    public static final int					EM_EVENT_DETECT_TYPE_IN_INTERVAL = 7;

    /**
     * \if ENGLISH_LANG
     *  Alarm outside the interval, alarm when the number of people detected is outside the interval, excluding the boundary value.
     * \else
     *  区间外报警，检测人数在区间范围外报警，不包括边界值。区间值对应PersonNum字段
     * \endif
     */
    public static final int					EM_EVENT_DETECT_TYPE_OUT_INTERVAL = 8;

}