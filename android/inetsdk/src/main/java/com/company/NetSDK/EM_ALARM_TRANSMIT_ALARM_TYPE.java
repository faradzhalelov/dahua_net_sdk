package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm type
 * \else
 * 报警类型
 * \endif
 */
public class EM_ALARM_TRANSMIT_ALARM_TYPE implements Serializable {
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
    public static final int EM_ALARM_TRANSMIT_ALARM_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * PreventRemove
     * \else
     * 防拆
     * \endif
     */
    public static final int EM_ALARM_TRANSMIT_ALARM_TYPE_PREVENTREMOVE = 1;

    /**
     * \if ENGLISH_LANG
     * LowerPower
     * \else
     * 低电压
     * \endif
     */
    public static final int EM_ALARM_TRANSMIT_ALARM_TYPE_LOWERPOWER = 2;

    /**
     * \if ENGLISH_LANG
     * Key
     * \else
     * 钥匙
     * \endif
     */
    public static final int EM_ALARM_TRANSMIT_ALARM_TYPE_KEY = 3;

    /**
     * \if ENGLISH_LANG
     * Duress
     * \else
     * 胁迫
     * \endif
     */
    public static final int EM_ALARM_TRANSMIT_ALARM_TYPE_DURESS = 4;

}
