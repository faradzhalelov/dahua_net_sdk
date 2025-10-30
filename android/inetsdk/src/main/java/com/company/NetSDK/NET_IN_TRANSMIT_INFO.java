package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#TransmitInfoForWebEx} input parameter
 * \else
 * {@link INetSDK#TransmitInfoForWebEx} 接口输入参数
 * \endif
 */
public class NET_IN_TRANSMIT_INFO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Transmit type, refer to {@link NET_TRANSMIT_INFO_TYPE}
     * \else
     * 透传类型, 取值参考 {@link NET_TRANSMIT_INFO_TYPE}
     * \endif
     */
    public int  emType;

    /**
     * \if ENGLISH_LANG
     * Json buffer
     * \else
     * Json请求数据
     * \endif
     */
    public byte[]					szInJsonBuffer;

    /**
     * \if ENGLISH_LANG
     * Json size
     * \else
     * Json请求数据长度
     * \endif
     */
    public int					   dwInJsonBufferSize;

    /**
     * \if ENGLISH_LANG
     * Binary buffer
     * \else
     * 二进制请求数据
     * \endif
     */
    public byte[]         	   szInBinBuffer;

    /**
     * \if ENGLISH_LANG
     * Binary size
     * \else
     * 二进制请求数据长度
     * \endif
     */
    public int					   dwInBinBufferSize;

}
