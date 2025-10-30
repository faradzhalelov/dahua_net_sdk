package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#GetCoaxialSensorInfo} output parameter
 * \else
 * {@link INetSDK#GetCoaxialSensorInfo}接口出参
 * \endif
 */
public class NET_OUT_GET_COAXIAL_SENSOR_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Retuen Count
     * \else
     * 返回的传感器ID数量
     * \endif
     */
    public int									nRetCount;

    /**
     * \if ENGLISH_LANG
     * Coaxial Sensor Info
     * \else
     * 传感器信息数组
     * \endif
     */
    public NET_COAXIAL_SENSOR_INFO[]			stSensorInfo = new NET_COAXIAL_SENSOR_INFO[FinalVar.MAX_COAXIAL_SENSOR_INFO_COUNT];

    public NET_OUT_GET_COAXIAL_SENSOR_INFO() {
        for(int i = 0; i < FinalVar.MAX_COAXIAL_SENSOR_INFO_COUNT; i++) {
            stSensorInfo[i] = new NET_COAXIAL_SENSOR_INFO();
        }
    }
}
