package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#AttachTransmitInfo} Interface input parameters
 * \else
 * {@link INetSDK#AttachTransmitInfo} 接口输入参数
 * \endif
 */
public class NET_IN_ATTACH_TRANSMIT_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * callback
     * \else
     * 回调函数
     * \endif
     */
    public CB_fAsyncTransmitInfoCallBack   cbTransmitInfo;

    /**
     * \if ENGLISH_LANG
     * Json buffer,size is dwInJsonBufferSize
     * \else
     * Json请求数据，长度为dwInJsonBufferSize
     * \endif
     */
    public byte[]					szInJsonBuffer;

    /**
     * \if ENGLISH_LANG
     * Json size，must be not 0
     * \else
     * Json请求数据长度，不能为０
     * \endif
     */
    public int					   dwInJsonBufferSize;

    /**
     * \if ENGLISH_LANG
     * true:When the device supports it, use the sub-connection to receive the subscription data. false:Only receive the subscription data in the main connection
     * \else
     * TRUE-当设备支持时，使用子连接方式接收订阅数据 FALSE-只在主连接接收订阅数据
     * \endif
     */
    public boolean              bSubConnFirst;
}
