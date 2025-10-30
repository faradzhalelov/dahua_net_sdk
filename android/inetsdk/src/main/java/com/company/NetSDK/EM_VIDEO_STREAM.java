package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * video stream
 * \else
 * 视频码流
 * \endif
 */
public class EM_VIDEO_STREAM implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_VIDEO_STREAM_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  main   
     * \else
     *  主码流
     * \endif
     */
    public static final int					EM_VIDEO_STREAM_MAIN = 1;

    /**
     * \if ENGLISH_LANG
     *  extra1 
     * \else
     *  辅码流1
     * \endif
     */
    public static final int					EM_VIDEO_STREAM_EXTRA1 = 2;

    /**
     * \if ENGLISH_LANG
     *  extra2 
     * \else
     *  辅码流2
     * \endif
     */
    public static final int					EM_VIDEO_STREAM_EXTRA2 = 3;

    /**
     * \if ENGLISH_LANG
     *  extra3 
     * \else
     *  辅码流3
     * \endif
     */
    public static final int					EM_VIDEO_STREAM_EXTRA3 = 4;

    /**
     * \if ENGLISH_LANG
     *  auto   
     * \else
     *  自动选择合适码流
     * \endif
     */
    public static final int					EM_VIDEO_STREAM_AUTO = 5;

    /**
     * \if ENGLISH_LANG
     *  preview
     * \else
     *  预览裸数据码流
     * \endif
     */
    public static final int					EM_VIDEO_STREAM_PREVIEW = 6;

    /**
     * \if ENGLISH_LANG
     *  no video stream, just audio stream
     * \else
     *  无视频码流(纯音频流)
     * \endif
     */
    public static final int					EM_VIDEO_STREAM_NO_VIDEO_JUST_AUDIO = 7;

}
