package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#GetCoaxialSensorInfo} input parameter
 * \else
 * {@link INetSDK#GetCoaxialSensorInfo}接口入参
 * \endif
 */
public class NET_IN_GET_COAXIAL_SENSOR_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel ID (-1 means all channels)
     * \else
     * 视频通道, -1表示全部通道
     * \endif
     */
    public int									nChannel;
}
