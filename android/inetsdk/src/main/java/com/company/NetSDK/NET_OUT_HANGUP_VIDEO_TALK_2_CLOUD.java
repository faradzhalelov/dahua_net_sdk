package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_HangupVideoTalk2Cloud output parameters
 * \else
 * @brief CLIENT_HangupVideoTalk2Cloud 接口输出参数
 * \endif
 */
public class NET_OUT_HANGUP_VIDEO_TALK_2_CLOUD implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

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
    public NET_RES_HANGUP_OVER_SEAS_CLOUD					stuOverSeasCloud = new NET_RES_HANGUP_OVER_SEAS_CLOUD();

}