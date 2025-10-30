package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetEventChannels} in param
 * \else
 * {@link INetSDK#GetEventChannels} 入参
 * \endif
 */
public class NET_IN_EVENT_CHANNELS implements Serializable {

    /**
     *
     */
    private static final long                   serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Any event code defined in the event code Chapter,This customization only supports IP conflict, MAC conflict, video occlusion event, video loss event and network monitoring interruption event
     * \else
     * 事件码章节定义的任意事件码 只支持IP冲突、MAC冲突、视频遮挡事件、视频丢失事件、网络预览中断事件
     * \endif
     */
    public int		                            nEventCode;
}
