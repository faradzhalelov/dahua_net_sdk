package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_HangupVideoTalk2Cloud input parameters
 * \else
 * @brief CLIENT_HangupVideoTalk2Cloud 接口输入参数
 * \endif
 */
public class NET_IN_HANGUP_VIDEO_TALK_2_CLOUD implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Local channel number, starting from 0
     * \else
     *  本地通道号，从0开始
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Call protocol type: "OverSeasCloud"
     * \else
     *  呼叫协议类型，"OverSeasCloud":海外云
     * \endif
     */
    public byte					szCallType[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Overseas cloud call information
     * \else
     *  海外云呼叫
     * \endif
     */
    public NET_HANGUP_OVER_SEAS_CLOUD					stuOverSeasCloud = new NET_HANGUP_OVER_SEAS_CLOUD();

    /**
     * \if ENGLISH_LANG
     *  CallId
     * \else
     *  呼叫id，唯一标识呼叫
     * \endif
     */
    public byte					szCallId[] = new byte[64];

}