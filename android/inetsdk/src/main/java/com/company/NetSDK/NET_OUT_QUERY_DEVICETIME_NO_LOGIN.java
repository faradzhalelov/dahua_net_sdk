package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Output parameters for the CLIENT_QueryDeviceTimeNoLogin interface
 * \else
 * @brief CLIENT_QueryDeviceTimeNoLogin 接口输出参数
 * \endif
 */
public class NET_OUT_QUERY_DEVICETIME_NO_LOGIN implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Local time of the device
     * \else
     *  设备本地时间
     * \endif
     */
    public NET_TIME_EX					stuTime = new NET_TIME_EX();

}