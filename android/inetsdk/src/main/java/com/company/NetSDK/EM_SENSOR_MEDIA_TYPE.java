package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *
 * \else
 * 传感器传输介质
 * \endif
 */
public class EM_SENSOR_MEDIA_TYPE implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 未知
     * \endif
     */
    public static final int EM_SENSOR_MEDIA_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 同轴接入的传感器
     * \endif
     */
    public static final int EM_SENSOR_MEDIA_TYPE_COAXIAL = 1;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 通过433接入的传感器
     * \endif
     */
    public static final int EM_SENSOR_MEDIA_TYPE_433 = 2;
}
