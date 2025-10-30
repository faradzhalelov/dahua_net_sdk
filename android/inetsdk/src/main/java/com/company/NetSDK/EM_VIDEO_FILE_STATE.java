package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * video file state
 * \else
 * 录像文件的状态
 * \endif
 */
public class EM_VIDEO_FILE_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int     EM_VIDEO_FILE_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * in writing
     * \else
     * 正在写
     * \endif
     */
    public static final int     EM_VIDEO_FILE_STATE_TEMPORARY = 1;

    /**
     * \if ENGLISH_LANG
     * Finished writing and closed file handle normally
     * \else
     * 已写完并正常关闭文件句柄
     * \endif
     */
    public static final int     EM_VIDEO_FILE_STATE_COMPLETE = 2;
}
