package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input parameter of interface {@link INetSDK#GetMediaEncryptCaps}
 * \else
 * 接口 {@link INetSDK#GetMediaEncryptCaps} 入参
 * \endif
 */
public class NET_IN_GET_MEDIA_ENCRYPT_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel offset
     * \else
     * 获取的通道偏移
     * \endif
     */
    public int					nChannelOffset;

    /**
     * \if ENGLISH_LANG
     * channel count
     * \else
     * 一次获取的通道数量
     * \endif
     */
    public int					nChannelCount;
}
