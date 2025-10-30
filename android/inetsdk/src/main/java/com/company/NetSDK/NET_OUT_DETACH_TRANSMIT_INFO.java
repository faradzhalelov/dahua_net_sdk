package com.company.NetSDK;
import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * CLIENT_DetachTransmitInfo output parameter {@link INetSDK#DetachTransmitInfo}}
 * \else
 * CLIENT_DetachTransmitInfo输出参数 {@link INetSDK#DetachTransmitInfo}
 * \endif
 */
public class NET_OUT_DETACH_TRANSMIT_INFO implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Response data buffer space, user application space
     * \else
     *  应答数据缓冲空间, 用户申请空间
     * \endif
     */
    public byte[]                    szOutBuffer;
    /**
     * \if ENGLISH_LANG
     * Response data buffer space length
     * \else
     * 应答数据缓冲空间长度
     * \endif
     */
    public int                    dwOutBufferSize;
    /**
     * \if ENGLISH_LANG
     * Json request data length
     * \else
     * Json请求数据长度
     * \endif
     */
    public int                dwOutJsonLen;

}
