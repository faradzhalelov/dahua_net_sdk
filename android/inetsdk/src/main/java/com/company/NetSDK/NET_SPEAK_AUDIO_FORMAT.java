package com.company.NetSDK;

import java.io.Serializable;



/**
 * \if ENGLISH_LANG
 * Speak audio Format
 * \else
 * 音频格式
 * \endif
 */
public class NET_SPEAK_AUDIO_FORMAT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Audio type,{@link EM_SPEAK_AUDIO_TYPE}
     * \else
     * 音频编码格式,{@link EM_SPEAK_AUDIO_TYPE}
     * \endif
     */
    public int                emFormat;

}
