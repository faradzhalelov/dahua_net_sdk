package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * AttachTransmitInfo report information callback
 * \else
 * AttachTransmitInfo 上报信息回调
 * \endif
 */
public class NET_CB_TRANSMIT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Data buffer
     * \else
     * 数据缓冲地址，SDK内部申请空间
     * \endif
     */
    public byte[]    pBuffer;

    /**
     * \if ENGLISH_LANG
     * Data buffer len
     * \else
     * 数据缓冲总长度
     * \endif
     */
    public int       dwBufferSize;

    /**
     * \if ENGLISH_LANG
     * json data len
     * \else
     * Json数据长度
     * \endif
     */
    public int       dwJsonLen;

    /**
     * \if ENGLISH_LANG
     * binary data len
     * \else
     * 二进制数据长度
     * \endif
     */
    public int       dwBinLen;

}
