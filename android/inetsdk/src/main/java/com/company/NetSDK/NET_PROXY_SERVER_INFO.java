package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Proxy Server Info
 * \else
 * 代理服务器地址
 * \endif
 */
public class NET_PROXY_SERVER_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * IP Address
     * \else
     * IP地址
     * \endif
     */
    public byte[]				szIP = new byte[FinalVar.SDK_MAX_IPADDR_LEN_EX];

    /**
     * \if ENGLISH_LANG
     * Port
     * \else
     * 端口
     * \endif
     */
    public int                 nPort;
}
