package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Interface {@link INetSDK#GetSCADADeviceStatus} output param
 * \else
 * 接口 {@link INetSDK#GetSCADADeviceStatus} 出参
 * \endif
 */
public class NET_OUT_GET_SCADA_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Count device status
     * \else
     * 设备状态信息个数
     * \endif
     */
    public int						   nDevStatusNum;

    /**
     * \if ENGLISH_LANG
     * Device status
     * \else
     * 设备状态信息
     * \endif
     */
    public NET_SCADA_STATUS_INFO[]	   stuStatusInfo = new NET_SCADA_STATUS_INFO[64];

    public NET_OUT_GET_SCADA_STATUS() {
        for(int i = 0; i < 64; i++) {
            stuStatusInfo[i] = new NET_SCADA_STATUS_INFO();
        }
    }
}
