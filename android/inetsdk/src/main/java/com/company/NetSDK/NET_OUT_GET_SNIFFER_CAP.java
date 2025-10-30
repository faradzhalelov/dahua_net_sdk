package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetSnifferCaps} port output parameter
 * \else
 * {@link INetSDK#GetSnifferCaps} 接口输出参数
 * \endif
 */
public class NET_OUT_GET_SNIFFER_CAP implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Suppor remote capture or not
     * \else
     * 是否支持远程流式抓包
     * \endif
     */
    public boolean          bRemoteCap;
}
