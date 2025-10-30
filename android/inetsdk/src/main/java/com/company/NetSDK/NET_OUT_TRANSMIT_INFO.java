package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#TransmitInfoForWebEx} output parameter
 * \else
 * {@link INetSDK#TransmitInfoForWebEx} 接口输出参数
 * \endif
 */
public class NET_OUT_TRANSMIT_INFO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Output buffer
     * \else
     * 应答数据缓冲空间
     * \endif
     */
    public byte[]					szOutBuffer;

    /**
     * \if ENGLISH_LANG
     * Output buffer size
     * \else
     * 应答数据缓冲空间长度
     * \endif
     */
    public int					   dwOutBufferSize;

    /**
     * \if ENGLISH_LANG
     * Output Json size
     * \else
     * Json应答数据长度
     * \endif
     */
    public int					   dwOutJsonLen;

    /**
     * \if ENGLISH_LANG
     * Output Binary size
     * \else
     * 二进制请求数据长度
     * \endif
     */
    public int					   dwOutBinLen;

}
