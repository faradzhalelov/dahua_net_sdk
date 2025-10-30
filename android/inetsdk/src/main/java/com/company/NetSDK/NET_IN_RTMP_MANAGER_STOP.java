package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Error code
 * \else
 * 错误码
 * \endif
 */
public class NET_IN_RTMP_MANAGER_STOP implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Push ID
     * \else
     *  要停止的推流ID
     * \endif
     */
    public int					nPushId;

}
