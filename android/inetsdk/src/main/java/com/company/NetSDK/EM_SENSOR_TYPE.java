package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Sensor type
 * \else
 * 传感器类型
 * \endif
 */
public class EM_SENSOR_TYPE implements Serializable {
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
    public static final int EM_SENSOR_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Normal Close
     * \else
     * 常闭
     * \endif
     */
    public static final int EM_SENSOR_TYPE_NC = 1;

    /**
     * \if ENGLISH_LANG
     * Normal Open
     * \else
     * 常开
     * \endif
     */
    public static final int EM_SENSOR_TYPE_NO = 2;
}
