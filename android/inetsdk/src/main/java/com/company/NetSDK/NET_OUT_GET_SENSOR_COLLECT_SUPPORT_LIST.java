package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#GetSensorCollectSupportList} output parameter
 * \else
 * {@link INetSDK#GetSensorCollectSupportList}接口出参
 * \endif
 */
public class NET_OUT_GET_SENSOR_COLLECT_SUPPORT_LIST implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 传感器ID数量
     * \endif
     */
    public int									nCount;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 传感器ID数组
     * \endif
     */
    public NET_SENSOR_ID_INFO[]					stInfo = new NET_SENSOR_ID_INFO[FinalVar.MAX_SENSOR_ID_COUNT];

    public NET_OUT_GET_SENSOR_COLLECT_SUPPORT_LIST() {
        for(int i = 0; i < FinalVar.MAX_SENSOR_ID_COUNT; i++) {
            stInfo[i] = new NET_SENSOR_ID_INFO();
        }
    }
}
