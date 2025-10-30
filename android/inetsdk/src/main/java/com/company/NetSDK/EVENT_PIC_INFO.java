package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * traffic event snap picture info
 * \else
 * 交通抓图图片信息
 * \endif
 */
public class EVENT_PIC_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * offset
     * \else
     * 原始图片偏移，单位字节
     * \endif
     */
    public int                       nOffset;

    /**
     * \if ENGLISH_LANG
     * length of picture
     * \else
     * 原始图片长度，单位字节
     * \endif
     */
    public int                       nLength;
}
