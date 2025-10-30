package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Coaxial alarm type
 * \else
 * 同轴报警类型
 * \endif
 */
public class EM_COAXIAL_ALARM_TYPE implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_COAXIAL_ALARM_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * ExtAlarm
     * \else
     * 同轴自带外部报警
     * \endif
     */
    public static final int EM_COAXIAL_ALARM_TYPE_EXT_ALARM = 1;

    /**
     * \if ENGLISH_LANG
     * MotionAlarm
     * \else
     * 同轴自带动检报警
     * \endif
     */
    public static final int EM_COAXIAL_ALARM_TYPE_MOTION_ALARM = 2;

    /**
     * \if ENGLISH_LANG
     * VoltageAlarm
     * \else
     * 同轴自带电压报警
     * \endif
     */
    public static final int EM_COAXIAL_ALARM_TYPE_VOLTAGE_ALARM = 3;

    /**
     * \if ENGLISH_LANG
     * AlarmLocal
     * \else
     * 同轴网关防区传感器报警
     * \endif
     */
    public static final int EM_COAXIAL_ALARM_TYPE_ALARM_LOCAL = 4;

    /**
     * \if ENGLISH_LANG
     * AlarmBel
     * \else
     * 同轴网关报警喇叭
     * \endif
     */
    public static final int EM_COAXIAL_ALARM_TYPE_ALARM_BEL = 5;

    /**
     * \if ENGLISH_LANG
     * TemperatureAlarm
     * \else
     * 同轴温度报警
     * \endif
     */
    public static final int EM_COAXIAL_ALARM_TYPE_TEMPERATURE_ALARM = 6;

    /**
     * \if ENGLISH_LANG
     * HumidityAlarm
     * \else
     * 同轴湿度报警
     * \endif
     */
    public static final int EM_COAXIAL_ALARM_TYPE_HUMIDITY_ALARM = 7;
}
