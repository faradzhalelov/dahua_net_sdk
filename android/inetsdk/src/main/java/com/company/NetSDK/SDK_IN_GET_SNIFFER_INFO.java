package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetSnifferInfo}GetSnifferInfo's interface input param
 * \else
 * {@link INetSDK#GetSnifferInfo}GetSnifferInfo 接口入参
 * \endif
 */
public class SDK_IN_GET_SNIFFER_INFO implements Serializable {

    private static final long serialVersionUID = 1L;

    public byte[] pszNetInterface;
}
