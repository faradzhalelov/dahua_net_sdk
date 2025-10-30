package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event type of Jablotron alarm
 * \else
 * Jablotron报警事件类型
 * \endif
 */
public class EM_JABLOTRON_ALARM_TYPE implements Serializable {
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
    public static final int EM_JABLOTRON_ALARM_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Intrusion
     * \else
     * Intrusion
     * \endif
     */
    public static final int EM_JABLOTRON_ALARM_TYPE_INTRUSION = 1;

    /**
     * \if ENGLISH_LANG
     * Fire
     * \else
     * Fire
     * \endif
     */
    public static final int EM_JABLOTRON_ALARM_TYPE_FIRE = 2;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * Panic
     * \endif
     */
    public static final int EM_JABLOTRON_ALARM_TYPE_PANIC = 3;

    /**
     * \if ENGLISH_LANG
     * AD
     * \else
     * AD
     * \endif
     */
    public static final int EM_JABLOTRON_ALARM_TYPE_ARMED = 4;

    /**
     * \if ENGLISH_LANG
     * DISAD
     * \else
     * DISAD
     * \endif
     */
    public static final int EM_JABLOTRON_ALARM_TYPE_DISARMED = 5;

    /**
     * \if ENGLISH_LANG
     * PG
     * \else
     * PG
     * \endif
     */
    public static final int EM_JABLOTRON_ALARM_TYPE_PG = 6;
}
