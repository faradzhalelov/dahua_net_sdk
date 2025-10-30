package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * video channel type when query video channel info
 * \else
 * 获取视频通道属性命令的子类型
 * \endif
 */
public class NET_VIDEO_CHANNEL_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * all types
     * \else
     * 全部
     * \endif
     */
    public static final int NET_VIDEO_CHANNEL_TYPE_ALL = 0;

    /**
     * \if ENGLISH_LANG
     * input
     * \else
     * 输入
     * \endif
     */
    public static final int NET_VIDEO_CHANNEL_TYPE_INPUT = 1;

    /**
     * \if ENGLISH_LANG
     * output
     * \else
     * 输出
     * \endif
     */
    public static final int NET_VIDEO_CHANNEL_TYPE_OUTPUT = 2;
}
