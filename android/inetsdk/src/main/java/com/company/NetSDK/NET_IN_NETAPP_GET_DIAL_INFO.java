package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * EM_PRC_NETAPP_TYPE_GET_DIAL_INFO input param
 * \else
 * EM_PRC_NETAPP_TYPE_GET_DIAL_INFO 入参
 * \endif
 */
public class NET_IN_NETAPP_GET_DIAL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  network interface，{@link EM_DIAL_INTERFACE}
     * \else
     *  网卡名称，{@link EM_DIAL_INTERFACE}
     * \endif
     */
    public int					emName;

}