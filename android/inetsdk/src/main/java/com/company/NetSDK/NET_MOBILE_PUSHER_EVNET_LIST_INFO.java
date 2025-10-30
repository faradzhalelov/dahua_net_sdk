package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event list info
 * \else
 * 事件列表信息
 * \endif
 */
public class NET_MOBILE_PUSHER_EVNET_LIST_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Event count
     * \else
     * 所支持的事件数量
     * \endif
     */
    public int                   nCount;

    /**
     * \if ENGLISH_LANG
     * Array of event info
     * \else
     * 事件信息数组
     * \endif
     */
    public NET_MOBILE_PUSHER_EVNET[]         stuMobilePusherEvent = new NET_MOBILE_PUSHER_EVNET[1024];

    public NET_MOBILE_PUSHER_EVNET_LIST_INFO()
    {
        for (int i = 0; i < 1024; ++i) {
            stuMobilePusherEvent[i] = new NET_MOBILE_PUSHER_EVNET();
        }
    }
}
