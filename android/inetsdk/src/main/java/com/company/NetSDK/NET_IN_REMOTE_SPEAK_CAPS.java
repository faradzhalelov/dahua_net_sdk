package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetDevCaps}NET_REMOTE_SPEAK_CAPS input param
 * \else
 *  {@link INetSDK#GetDevCaps}NET_REMOTE_SPEAK_CAPS 入参
 * \endif
 */
public class NET_IN_REMOTE_SPEAK_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel number
     * \else
     * 通道数
     * \endif
     */
    public int                  nChannelNum;

    /**
     * \if ENGLISH_LANG
     * Channel list
     * \else
     * 通道列表
     * \endif
     */
    public int                  nChannels[] = new int[128];
}
