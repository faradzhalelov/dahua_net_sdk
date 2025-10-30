package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Video stream type
 * \else
 * 视频流类型
 * \endif
 */
public class EM_SMD_VIDEO_STREAM implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_SMD_VIDEO_STREAM_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Main code stream
     * \else
     *  主码流
     * \endif
     */
    public static final int					EM_SMD_VIDEO_STREAM_MAIN = 1;

    /**
     * \if ENGLISH_LANG
     *  video stream extra1
     * \else
     *  辅码流1
     * \endif
     */
    public static final int					EM_SMD_VIDEO_STREAM_EXTRA1 = 2;

    /**
     * \if ENGLISH_LANG
     *  video stream extra2
     * \else
     *  辅码流2
     * \endif
     */
    public static final int					EM_SMD_VIDEO_STREAM_EXTRA2 = 3;

    /**
     * \if ENGLISH_LANG
     *  video stream extra3
     * \else
     *  辅码流3
     * \endif
     */
    public static final int					EM_SMD_VIDEO_STREAM_EXTRA3 = 4;

    /**
     * \if ENGLISH_LANG
     *  all video stream extrax
     * \else
     *  所有的辅码流
     * \endif
     */
    public static final int					EM_SMD_VIDEO_STREAM_EXTRAX = 5;

}