package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * playback callback stream type
 * \else
 * 灯光联动方式
 * \endif
 */
public class EM_PLAYBACK_STREAM_TYPE implements Serializable {
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
    public static final int EM_PLAYBACK_STREAM_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * Only callback original stream
     * \else
     * 只回调原始码流
     * \endif
     */
    public static final int EM_PLAYBACK_STREAM_TYPE_ORIGINAL_STREAM = 0;

    /**
     * \if ENGLISH_LANG
     * Max
     * \else
     * 最大值
     * \endif
     */
    public static final int EM_PLAYBACK_STREAM_TYPE_MAX = 1;
}
