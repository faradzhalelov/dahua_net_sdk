package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Media encrypt caps info
 * \else
 * 码流加密能力集信息
 * \endif
 */
public class NET_MEDIA_ENCRYPT_CAPS_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * whether media encrypt is support
     * \else
     * 是否支持码流加密
     * \endif
     */
    public boolean bSupport;
}
