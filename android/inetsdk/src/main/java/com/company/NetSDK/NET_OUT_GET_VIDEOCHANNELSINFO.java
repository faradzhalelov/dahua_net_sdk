package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#QueryDevInfo} port output parameter,{@link NET_VIDEO_CHANNEL_TYPE}
 * \else
 * {@link INetSDK#QueryDevInfo} 接口输出参数,{@link NET_VIDEO_CHANNEL_TYPE}
 * \endif
 */
public class NET_OUT_GET_VIDEOCHANNELSINFO  implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 输入通道信息,获取类型为NET_VIDEO_CHANNEL_TYPE_ALL/INPUT时有效
     * \endif
     */
    public NET_VIDEOCHANNELS_INPUT     stInputChannels = new NET_VIDEOCHANNELS_INPUT();

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 输出通道信息,获取类型为NET_VIDEO_CHANNEL_TYPE_ALL/OUTPUT时有效
     * \endif
     */
    public NET_VIDEOCHANNELS_OUTPUT    stOutputChannels = new NET_VIDEOCHANNELS_OUTPUT();
}
