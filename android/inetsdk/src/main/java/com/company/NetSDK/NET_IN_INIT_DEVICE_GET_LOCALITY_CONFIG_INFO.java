package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_InitDevGetLocalityConfig input parameters
 * \else
 * @brief CLIENT_InitDevGetLocalityConfig 输入参数
 * \endif
 */
public class NET_IN_INIT_DEVICE_GET_LOCALITY_CONFIG_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Device MAC address
     * \else
     *  设备mac地址
     * \endif
     */
    public byte					szMac[] = new byte[18];

}