package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link CB_fAttachSnapRev} Callback info of attach snap
 * \else
 * {@link CB_fAttachSnapRev} 订阅抓图回调信息
 * \endif
 */
public class NET_CB_ATTACH_SNAP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Picture data
     * \else
     * 接收到的图片数据
     * \endif
     */
    public byte[]                       pRcvBuf;
    /**
     * \if ENGLISH_LANG
     * Picture data
     * \else
     * 图片数据长度
     * \endif
     */
    public int                       nBufLen;
    /**
     * \if ENGLISH_LANG
     * Picture encoding format
     * \else
     * 图片编码格式
     * \endif
     */
    public int                       emEncodeType;
    /**
     * \if ENGLISH_LANG
     * Serial number
     * \else
     * 抓图请求序列号
     * \endif
     */
    public int                       nCmdSerial;


}
