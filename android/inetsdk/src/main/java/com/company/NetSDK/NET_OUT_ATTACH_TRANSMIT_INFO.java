package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#AttachTransmitInfo} Interface output parameters
 * \else
 * {@link INetSDK#AttachTransmitInfo} 接口输出参数
 * \endif
 */
public class NET_OUT_ATTACH_TRANSMIT_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Output buffer
     * \else
     * 应答数据缓冲，需要用户自己申请空间
     * \endif
     */
    public byte[]					szOutBuffer;

    /**
     * \if ENGLISH_LANG
     * Output buffer size
     * \else
     * 应答缓冲总长度
     * \endif
     */
    public int					   dwOutBufferSize;

    /**
     * \if ENGLISH_LANG
     * Output Json size
     * \else
     * 应答Json数据长度
     * \endif
     */
    public int					   dwOutJsonLen;

    /**
     * \if ENGLISH_LANG
     * Output Binary size
     * \else
     * 应答二进制数据长度
     * \endif
     */
    public int					   dwOutBinLen;

}
