package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#AttachNMPPortStatus}interface input param
 * \else
 * {@link INetSDK#AttachNMPPortStatus} 接口入参
 * \endif
 */
public class NET_IN_ATTACH_NMP_PORT_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Callback function of attach nmp device port status
     * \else
     * 端口状态订阅回调函数
     * \endif
     */
    public CB_fNMPPortStatus cbNMPPortStatusCallBac;
}
