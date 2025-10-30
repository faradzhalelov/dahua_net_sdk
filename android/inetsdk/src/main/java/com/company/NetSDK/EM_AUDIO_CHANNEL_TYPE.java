package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * audio channel type
 * \else
 * 设备声道支持类型
 * \endif
 */
public class EM_AUDIO_CHANNEL_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * single
     * \else
     * 单声道
     * \endif
     */
    public static final int EM_AUDIO_CHANNEL_SINGLE = 0;

    /**
     * \if ENGLISH_LANG
     * double
     * \else
     * 双声道
     * \endif
     */
    public static final int EM_AUDIO_CHANNEL_DOUBLE = 1;
}
