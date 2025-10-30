package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * sensorID info
 * \else
 * 传感器ID信息
 * \endif
 */
public class NET_SENSOR_ID_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Media Type, refer to {@link EM_SENSOR_MEDIA_TYPE}
     * \else
     * 传感器传输介质，对应枚举 {@link EM_SENSOR_MEDIA_TYPE}
     * \endif
     */
    public int				     emMediaType;

    /**
     * \if ENGLISH_LANG
     * AP Index
     * \else
     * 接入点序号
     * \endif
     */
    public int					 nAPIndex;

    /**
     * \if ENGLISH_LANG
     * Alarm Channel
     * \else
     * 报警通道号
     * \endif
     */
    public int					 nAlarmChannel;

    /**
     * \if ENGLISH_LANG
     * Wireless Device Type, refer to {@link NET_WIRELESS_DEVICE_TYPE}
     * \else
     * 无线设备类型, 对应枚举 {@link NET_WIRELESS_DEVICE_TYPE}
     * \endif
     */
    public int			         emDeviceType;

    /**
     * \if ENGLISH_LANG
     * Wireless Sensor Type, refer to {@link EM_WIRELESS_SENSOR_TYPE}
     * \else
     * 传感器类型, 对应枚举 {@link EM_WIRELESS_SENSOR_TYPE}
     * \endif
     */
    public int					 emSensorType;
}
