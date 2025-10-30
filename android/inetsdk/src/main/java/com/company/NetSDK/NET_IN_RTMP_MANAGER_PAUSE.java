package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Error code
 * \else
 * 错误码
 * \endif
 */
public class NET_IN_RTMP_MANAGER_PAUSE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Push ID
     * \else
     *  要暂停的推流ID
     * \endif
     */
    public int					nPushId;

}
