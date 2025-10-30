package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Call related signaling events
 * \else
 * @brief 呼叫相关信令事件
 * \endif
 */
public class NET_NOTIFY_EVENT_VIDEO_TALK implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The event code pushed to the client, "call":  Call request, "answer":  Answer, "hangup":  Hang up, "ignoreinvite":  Cancel unanswered calls
     * \else
     *  向客户端推送的事件码, "call": 呼叫请求, "answer": 接听, "hangup": 挂断, "ignoreinvite": 取消未接听的呼叫
     * \endif
     */
    public byte					szCode[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Is there any initiator information available
     * \else
     *  是否有发起方信息
     * \endif
     */
    public boolean					bFromValid;

    /**
     * \if ENGLISH_LANG
     *  Initiator information
     * \else
     *  发起方信息
     * \endif
     */
    public NET_EVENT_VIDEO_TALK_FROM					stuFrom = new NET_EVENT_VIDEO_TALK_FROM();

    /**
     * \if ENGLISH_LANG
     *  Is there any information about the other party
     * \else
     *  是否有对方信息
     * \endif
     */
    public boolean					bToValid;

    /**
     * \if ENGLISH_LANG
     *  Other party's information
     * \else
     *  对方信息
     * \endif
     */
    public NET_EVENT_VIDEO_TALK_TO					stuTo = new NET_EVENT_VIDEO_TALK_TO();

    /**
     * \if ENGLISH_LANG
     *  Event channel number
     * \else
     *  事件通道号
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Call Id
     * \else
     *  呼叫id，唯一标识呼叫
     * \endif
     */
    public byte					szCallId[] = new byte[64];

}