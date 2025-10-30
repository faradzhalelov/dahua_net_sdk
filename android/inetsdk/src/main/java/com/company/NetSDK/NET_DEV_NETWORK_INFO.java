package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Network info of device
 * \else
 * @brief 设备网络信息
 * \endif
 */
public class NET_DEV_NETWORK_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Device IP
     * \else
     *  设备IP
     * \endif
     */
    public byte					szDevIP[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  Device port
     * \else
     *  设备端口号
     * \endif
     */
    public int					nDevPort;

}