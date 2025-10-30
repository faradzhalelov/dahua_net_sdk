package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief video standard
 * \else
 * @brief 视频制式
 * \endif
 */
public class EM_VIDEO_STANDARD implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *    EM_VIDEO_STANDARD_UNKNOWN,
     * \else
     *    EM_VIDEO_STANDARD_UNKNOWN,
     * \endif
     */
    public static final int					EM_VIDEO_STANDARD_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  "PAL"
     * \else
     *  "PAL"
     * \endif
     */
    public static final int					EM_VIDEO_STANDARD_PAL = 1;

    /**
     * \if ENGLISH_LANG
     *  "NTSC"
     * \else
     *  "NTSC"
     * \endif
     */
    public static final int					EM_VIDEO_STANDARD_NTSC = 2;

    /**
     * \if ENGLISH_LANG
     *  "SECAM"
     * \else
     *  "SECAM"
     * \endif
     */
    public static final int					EM_VIDEO_STANDARD_SECAM = 3;

}