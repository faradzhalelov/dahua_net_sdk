package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_StartDevAudioDecode input parameter
 * \else
 * @brief CLIENT_StartDevAudioDecode 接口入参
 * \endif
 */
public class NET_IN_START_DEV_AUDIO_DECODE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel
     * \else
     *  通道号
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Data flow source type
     * \else
     *  数据流源类型,0-对讲数据,1-普通音频数据,2-报警音频数据流
     * \endif
     */
    public int					nSourceType;

}