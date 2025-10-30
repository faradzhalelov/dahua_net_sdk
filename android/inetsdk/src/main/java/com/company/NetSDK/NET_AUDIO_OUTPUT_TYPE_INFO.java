package com.company.NetSDK;
import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Audio output type
 * \else
 * 音频输出类型
 * \endif
 */
public class NET_AUDIO_OUTPUT_TYPE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The number of audio line out, >0 means support line out
     * \else
     * 音频线性输出个数,大于0表示支持线性输出
     * \endif
     */
    public int                      nLineOut;

    /**
     * \if ENGLISH_LANG
     * The number of audio speaker, >0 means support speaker
     * \else
     * 音频内置扬声器输出个数,大于0表示支持内置扬声器输出
     * \endif
     */
    public int                      nSpeaker;

}
