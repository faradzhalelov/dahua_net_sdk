package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Input parameters for the CLIENT_QueryDeviceTimeNoLogin interface
 * \else
 * @brief CLIENT_QueryDeviceTimeNoLogin 接口输入参数
 * \endif
 */
public class NET_IN_QUERY_DEVICETIME_NO_LOGIN implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Device port number
     * \else
     *  设备端口号
     * \endif
     */
    public int					nPort;

    /**
     * \if ENGLISH_LANG
     *  Device IP
     * \else
     *  设备IP
     * \endif
     */
    public byte					szDevIP[] = new byte[64];

}