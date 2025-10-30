package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * NET_IN_RTMP_MANAGER_DETACH_STATUS
 * \else
 * NET_IN_RTMP_MANAGER_DETACH_STATUS
 * \endif
 */
public class NET_IN_RTMP_MANAGER_DETACH_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Push ID
     * \else
     *  要取消订阅的推流ID
     * \endif
     */
    public int					nPushId;

}
