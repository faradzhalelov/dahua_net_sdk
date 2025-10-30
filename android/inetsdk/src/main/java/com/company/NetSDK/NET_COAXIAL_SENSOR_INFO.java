package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Coaxial Sensor Info
 * \else
 * 传感器信息
 * \endif
 */
public class NET_COAXIAL_SENSOR_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Sensor ID
     * \else
     * 传感器ID信息
     * \endif
     */
    public NET_SENSOR_ID_INFO					stSensorID = new NET_SENSOR_ID_INFO();

    /**
     * \if ENGLISH_LANG
     * IsOnline
     * \else
     * 传感器是否在线
     * \endif
     */
    public boolean							bIsOnLine;

    /**
     * \if ENGLISH_LANG
     * Alarm Name
     * \else
     * 报警通道名称
     * \endif
     */
    public byte[]								szAlarmName = new byte[FinalVar.MAX_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * Sensor Class, refer to {@link EM_SENSOR_CLASS_TYPE}
     * \else
     * 传感器大类, 参考 {@link EM_SENSOR_CLASS_TYPE}
     * \endif
     */
    public int				                    emSensorClass;

    /**
     * \if ENGLISH_LANG
     * Serial Number
     * \else
     * 传感器序列号
     * \endif
     */
    public byte[]								szSN = new byte[FinalVar.MAX_COMMON_STRING_32];


}
