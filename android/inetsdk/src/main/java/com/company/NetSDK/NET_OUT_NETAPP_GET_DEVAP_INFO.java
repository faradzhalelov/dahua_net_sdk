package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * EM_RPC_NETAPP_TYPE_GET_DEVAP_INFO output param
 * \else
 * EM_RPC_NETAPP_TYPE_GET_DEVAP_INFO 出参
 * \endif
 */
public class NET_OUT_NETAPP_GET_DEVAP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Device side obtains RSSI of connected AP             
     * \else
     *  设备端获取连接的AP的rssi             
     * \endif
     */
    public int					nRssi;

}