package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm light type
 * \else
 * 警戒灯光类型
 * \endif
 */
public class EM_ALARM_LIGHT_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知类型
     * \endif
     */
    public static final int EM_ALARM_LIGHT_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Infrared
     * \else
     * 红外灯
     * \endif
     */
    public static final int EM_ALARM_LIGHT_TYPE_INFRARED = 1;

    /**
     * \if ENGLISH_LANG
     * White
     * \else
     * 白光灯
     * \endif
     */
    public static final int EM_ALARM_LIGHT_TYPE_WHITE = 2;

    /**
     * \if ENGLISH_LANG
     * Laser
     * \else
     * 激光灯
     * \endif
     */
    public static final int EM_ALARM_LIGHT_TYPE_LASER = 3;

    /**
     * \if ENGLISH_LANG
     * Redblue
     * \else
     * 红蓝警示灯
     * \endif
     */
    public static final int EM_ALARM_LIGHT_TYPE_REDBLUE = 4;
}
