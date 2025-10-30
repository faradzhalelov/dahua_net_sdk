package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Speak audio type
 * \else
 * 音频编码压缩格式
 * \endif
 */
public class EM_SPEAK_AUDIO_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_SPEAK_AUDIO_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * PCM
     * \else
     * PCM
     * \endif
     */
    public static final int EM_SPEAK_AUDIO_TYPE_PCM = 1;

    /**
     * \if ENGLISH_LANG
     * ADPCM
     * \else
     * ADPCM
     * \endif
     */
    public static final int EM_SPEAK_AUDIO_TYPE_ADPCM = 2;

    /**
     * \if ENGLISH_LANG
     * G711A
     * \else
     * G711A
     * \endif
     */
    public static final int EM_SPEAK_AUDIO_TYPE_G711A = 3;

    /**
     * \if ENGLISH_LANG
     * G711Mu
     * \else
     * G711Mu
     * \endif
     */
    public static final int EM_SPEAK_AUDIO_TYPE_G711Mu = 4;

    /**
     * \if ENGLISH_LANG
     * G726
     * \else
     * G726
     * \endif
     */
    public static final int EM_SPEAK_AUDIO_TYPE_G726 = 5;

    /**
     * \if ENGLISH_LANG
     * G729
     * \else
     * G729
     * \endif
     */
    public static final int EM_SPEAK_AUDIO_TYPE_G729 = 6;

    /**
     * \if ENGLISH_LANG
     * MPEG2
     * \else
     * MPEG2
     * \endif
     */
    public static final int EM_SPEAK_AUDIO_TYPE_MPEG2 = 7;

    /**
     * \if ENGLISH_LANG
     * AMR
     * \else
     * AMR
     * \endif
     */
    public static final int EM_SPEAK_AUDIO_TYPE_AMR = 8;

}
