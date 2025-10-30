package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#AttachVK} input param
 * \else
 * {@link INetSDK#AttachVK} 输入参数
 * \endif
 */
public class NET_IN_ATTACH_VK implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel ID
     * \else
     * 通道ID
     * \endif
     */
    public int                     nChannelID;

    /**
     * \if ENGLISH_LANG
     * attach VK callback
     * \else
     *  订阅VK回调
     * \endif
     */
    public  CB_fAttachVK cbAttachVK;

}
