package com.company.NetSDK;
import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * CLIENT_DetachTransmitInfo input parameter {@link INetSDK#DetachTransmitInfo}}
 * \else
 * CLIENT_DetachTransmitInfo输入参数 {@link INetSDK#DetachTransmitInfo}
 * \endif
 */
public class NET_IN_DETACH_TRANSMIT_INFO implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
 
    /**
     * \if ENGLISH_LANG
     * Json requests data, users apply for space
     * \else
     * Json请求数据,用户申请空间
     * \endif
     */
    public byte[]                   szInJsonBuffer;
    /**
     * \if ENGLISH_LANG
     * Json request data length
     * \else
     * Json请求数据长度
     * \endif
     */
    public int                   dwInJsonBufferSize;

}
