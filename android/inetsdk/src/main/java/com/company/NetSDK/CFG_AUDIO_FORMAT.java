package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief audio coding mode
 * \else
 * @brief 音频编码模式
 * \endif
 */
public class CFG_AUDIO_FORMAT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  G711a
     * \else
     *  G711a
     * \endif
     */
    public static final int					AUDIO_FORMAT_G711A = 0;

    /**
     * \if ENGLISH_LANG
     *  PCM
     * \else
     *  PCM
     * \endif
     */
    public static final int					AUDIO_FORMAT_PCM = 1;

    /**
     * \if ENGLISH_LANG
     *  G711u
     * \else
     *  G711u
     * \endif
     */
    public static final int					AUDIO_FORMAT_G711U = 2;

    /**
     * \if ENGLISH_LANG
     *  AMR
     * \else
     *  AMR
     * \endif
     */
    public static final int					AUDIO_FORMAT_AMR = 3;

    /**
     * \if ENGLISH_LANG
     *  AAC
     * \else
     *  AAC
     * \endif
     */
    public static final int					AUDIO_FORMAT_AAC = 4;

    /**
     * \if ENGLISH_LANG
     *  G.726	
     * \else
     *  G.726
     * \endif
     */
    public static final int					AUDIO_FORMAT_G726 = 5;

    /**
     * \if ENGLISH_LANG
     *  MPEG2-Layer2
     * \else
     *  MPEG2-Layer2
     * \endif
     */
    public static final int					AUDIO_FORMAT_MPEG2_LAYER2 = 6;

    /**
     * \if ENGLISH_LANG
     *  G.729
     * \else
     *  G.729
     * \endif
     */
    public static final int					AUDIO_FORMAT_G729 = 7;

    /**
     * \if ENGLISH_LANG
     *  G.722.1
     * \else
     *  G.722.1
     * \endif
     */
    public static final int					AUDIO_FORMAT_G7221 = 8;

}