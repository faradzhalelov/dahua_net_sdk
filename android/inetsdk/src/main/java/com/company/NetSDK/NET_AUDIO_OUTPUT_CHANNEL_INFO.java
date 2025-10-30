package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio output channel info
 * \else
 *  音频输出通道相关信息
 * \endif
 */
public class NET_AUDIO_OUTPUT_CHANNEL_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel ID
     * \else
     * 通道编号
     * \endif
     */
    public byte[]                      szID = new byte[FinalVar.MAX_CHANNEL_ID_LEN];

}
