package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#SetGPSStatus}, Set GPS Status input parameter
 * \else
 * 接口{@link INetSDK#SetGPSStatus}, 设置GPS状态输入参数
 * \endif
 */
public class NET_IN_SET_GPS_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * whether use setup data
     * \else
     * 使能项, 是否使用设置的数据
     * \endif
     */
    public boolean                 bEnable;

    /**
     * \if ENGLISH_LANG
     * channel
     * \else
     * 通道号
     * \endif
     */
    public int                      nChannel;

    /**
     * \if ENGLISH_LANG
     * GPS status info
     * \else
     * GPS 状态信息
     * \endif
     */
    public NET_SET_GPS_STATUS_INFO		stGPSInfo = new NET_SET_GPS_STATUS_INFO();
}
