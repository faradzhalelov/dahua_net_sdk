package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the type of BitRateControl
 * \else
 * 码流控制模式
 * \endif
 */
public class NET_EM_BITRATE_CONTROL implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * CBR
     * \else
     * 固定码流
     * \endif
     */
    public static final int EM_BITRATE_CBR = 0;									// CBR

    /**
     * \if ENGLISH_LANG
     * VBR
     * \else
     * 可变码流
     * \endif
     */
    public static final int EM_BITRATE_VBR = 1;									// VBR
}
