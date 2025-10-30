package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief audio data type
 * \else
 * @brief 音频数据类型
 * \endif
 */
public class EM_AUDIO_DATA_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  default
     * \else
     *  默认
     * \endif
     */
    public static final int					EM_AUDIO_DATA_TYPE_DEFAULT = 0;

    /**
     * \if ENGLISH_LANG
     *  AAC
     * \else
     *  音频强制转换为AAC
     * \endif
     */
    public static final int					EM_AUDIO_DATA_TYPE_AAC = 1;

    /**
     * \if ENGLISH_LANG
     *  G711A
     * \else
     *  音频强制转换为G711A
     * \endif
     */
    public static final int					EM_AUDIO_DATA_TYPE_G711A = 2;

    /**
     * \if ENGLISH_LANG
     *  G711U
     * \else
     *  音频强制转换为G711U
     * \endif
     */
    public static final int					EM_AUDIO_DATA_TYPE_G711U = 3;

    /**
     * \if ENGLISH_LANG
     *  MP2
     * \else
     *  音频强制转换为MP2
     * \endif
     */
    public static final int					EM_AUDIO_DATA_TYPE_MP2 = 4;

}