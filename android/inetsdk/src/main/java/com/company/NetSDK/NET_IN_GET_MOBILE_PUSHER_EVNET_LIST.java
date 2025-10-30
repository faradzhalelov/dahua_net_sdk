package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetMobilePusherEventList} input param
 * \else
 * {@link INetSDK#GetMobilePusherEventList} 输入参数
 * \endif
 */
public class NET_IN_GET_MOBILE_PUSHER_EVNET_LIST implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel number
     * \else
     * 通道号的数量
     * \endif
     */
    public int                  nChannelNum;

    /**
     * \if ENGLISH_LANG
     * Channel array.Each element represents one channel, - 1 represents the whole channel
     * \else
     * 通道号，每个元素表示一个通道,-1 表示全通道
     * \endif
     */
    public int[]                  nChannel = new int[1024];

}
