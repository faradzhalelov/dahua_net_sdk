package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The type of alarm source device
 * \else
 * 报警源设备的类型
 * \endif
 */
public class EM_ALARM_TRANSMIT_DEV_SRC_TYPE implements Serializable {
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
    public static final int EM_ALARM_TRANSMIT_DEV_SRC_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Digit
     * \else
     * 数字
     * \endif
     */
    public static final int EM_ALARM_TRANSMIT_DEV_SRC_TYPE_DIGIT = 1;

    /**
     * \if ENGLISH_LANG
     * Analog
     * \else
     * 模拟
     * \endif
     */
    public static final int EM_ALARM_TRANSMIT_DEV_SRC_TYPE_ANALOG = 2;

    /**
     * \if ENGLISH_LANG
     * SmartLock
     * \else
     * 智能锁
     * \endif
     */
    public static final int EM_ALARM_TRANSMIT_DEV_SRC_TYPE_SMARTLOCK = 3;

}
