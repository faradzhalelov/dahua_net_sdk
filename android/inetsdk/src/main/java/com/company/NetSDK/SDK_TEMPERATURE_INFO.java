package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Temperature info
 * \else
 * 温度信息
 * \endif
 */
public class SDK_TEMPERATURE_INFO implements Serializable {
    /**
     *
     */
    private static final long       serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * Sensor name
     * \else
     * 传感器名称
     * \endif
     */
    public byte[]                   szName = new byte[64];
    /**
     * \if ENGLISH_LANG
     * Temperature
     * \else
     * 温度
     * \endif
     */
    public float                    fTemperature;
}
