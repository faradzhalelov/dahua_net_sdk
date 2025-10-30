package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Tour link configuration
 * \else
 * 轮巡联动配置
 * \endif
 */
public class NET_CFG_TOURLINK implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Polling enabled
     * \else
     * 轮巡使能
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     * Split mode when polling, refer to {@link SDK_SPLIT_MODE}
     * \else
     * 轮巡时的分割模式, 参考 {@link SDK_SPLIT_MODE}
     * \endif
     */
    public int   	                    emSplitMode;

    /**
     * \if ENGLISH_LANG
     * Polling the list of channel numbers
     * \else
     * 轮巡通道号列表
     * \endif
     */
    public int[]						nChannels = new int[FinalVar.CFG_MAX_VIDEO_CHANNEL_NUM];

    /**
     * \if ENGLISH_LANG
     * Numbers of polling channels
     * \else
     * 轮巡通道数量
     * \endif
     */
    public int						    nChannelCount;
}
