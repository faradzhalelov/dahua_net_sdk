package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#GetRemoteLowRateWPANCaps} input parameter
 * \else
 * {@link INetSDK#GetRemoteLowRateWPANCaps}接口入参
 * \endif
 */
public class NET_IN_GET_REMOTELOWRATEWPAN_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Video Channels Count
     * \else
     * 实际要获取的视频通道个数
     * \endif
     */
    public int									nChannelCount;

    /**
     * \if ENGLISH_LANG
     * Video Channels
     * \else
     * 视频通道号
     * \endif
     */
    public int[]								stChannels = new int[FinalVar.MAX_VIDEO_CHANNEL_COUNT];
}
