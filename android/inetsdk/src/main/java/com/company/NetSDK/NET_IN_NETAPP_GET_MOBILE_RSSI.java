package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * network application component, company internal customized port
 * \else
 * EM_RPC_NETAPP_TYPE_GET_MOBILE_RSSI 入参
 * \endif
 */
public class NET_IN_NETAPP_GET_MOBILE_RSSI implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Module name，{@link EM_WIRELESS_MODE}
     * \else
     *  无线模块名称，{@link EM_WIRELESS_MODE}
     * \endif
     */
    public int					emName;

}