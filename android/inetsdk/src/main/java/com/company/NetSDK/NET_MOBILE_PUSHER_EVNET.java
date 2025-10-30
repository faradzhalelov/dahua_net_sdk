package com.company.NetSDK;
import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 事件信息
 * \else
 * event info
 * \endif
 */
public class NET_MOBILE_PUSHER_EVNET implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Event code
     * \else
     * 事件码
     * \endifl
     */
    public byte[]       szCode = new byte[64];

    /**
     * \if ENGLISH_LANG
     * Event type
     * \else
     * 事件类型
     * \endifl
     */
    public int                   nEventType;

    /**
     * \if ENGLISH_LANG
     * Group push capability set for events,{@link EM_PUSH_BY_GROUP_TYPE}
     * \else
     * 事件的组推送能力集{@link EM_PUSH_BY_GROUP_TYPE}
     * \endif
     */
    public int                   emPushByGroupType;
}
