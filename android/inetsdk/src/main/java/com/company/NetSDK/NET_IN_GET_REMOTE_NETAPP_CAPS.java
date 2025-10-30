package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetRemoteNetAppCaps input parameters
 * \else
 * @brief CLIENT_GetRemoteNetAppCaps 接口输入参数
 * \endif
 */
public class NET_IN_GET_REMOTE_NETAPP_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel
     * \else
     *  通道号
     * \endif
     */
    public int					nChannel;

}