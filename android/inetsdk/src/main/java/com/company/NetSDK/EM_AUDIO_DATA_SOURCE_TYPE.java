package com.company.NetSDK;
import java.io.Serializable;


public class EM_AUDIO_DATA_SOURCE_TYPE implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unkonwn data type
     * \else
     * 未知数据类型
     * \endif
     */
    public static final int EM_AUDIO_DATA_SOURCE_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * talk data
     * \else
     * 对讲数据
     * \endif
     */
    public static final int EM_AUDIO_DATA_SOURCE_TYPE_TALK = 0;

    /**
     * \if ENGLISH_LANG
     * normal audio data
     * \else
     * 普通音频数据，如伴音
     * \endif
     */
    public static final int EM_AUDIO_DATA_SOURCE_TYPE_NORMAL = 1;

    /**
     * \if ENGLISH_LANG
     * alarm audio data
     * \else
     * 报警音频数据流
     * \endif
     */
    public static final int EM_AUDIO_DATA_SOURCE_TYPE_ALARM = 2;
}
