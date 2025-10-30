package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetEventChannels} out param
 * \else
 * {@link INetSDK#GetEventChannels} 出参
 * \endif
 */
public class NET_OUT_EVENT_CHANNELS implements Serializable {

    /**
     *
     */
    private static final long                   serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Number of channels
     * \else
     * 通道个数
     * \endif
     */
    public int						            nChannelNum;

    /**
     * \if ENGLISH_LANG
     * There is a list of channels with corresponding events. Each member indicates whether corresponding events exist in corresponding channels
     * \else
     * 存在对应事件的通道列表,每一个成员表示对应通道是否存在对应的事件
     * \endif
     */
    public int[]                                nEventChannelList = new int[1024];
}
