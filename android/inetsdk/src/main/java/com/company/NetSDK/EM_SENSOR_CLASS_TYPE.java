package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Sensor Class Type
 * \else
 * 传感器大类
 * \endif
 */
public class EM_SENSOR_CLASS_TYPE implements Serializable {
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
    public static final int EM_SENSOR_CLASS_TYPE_UNKOWN = 0;

    /**
     * \if ENGLISH_LANG
     * AlarmIn
     * \else
     * 开关量报警输入类
     * \endif
     */
    public static final int EM_SENSOR_CLASS_TYPE_ALARM = 1;

    /**
     * \if ENGLISH_LANG
     * AlarmOut
     * \else
     * 报警输出类
     * \endif
     */
    public static final int EM_SENSOR_CLASS_TYPE_ALARMOUT = 2;

    /**
     * \if ENGLISH_LANG
     * Analogalarm
     * \else
     * 模拟量输入
     * \endif
     */
    public static final int EM_SENSOR_CLASS_TYPE_ANALOGALARM = 3;
}
