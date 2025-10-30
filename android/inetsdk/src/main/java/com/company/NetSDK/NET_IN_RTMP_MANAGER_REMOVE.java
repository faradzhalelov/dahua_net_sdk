package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Add Indicates the error code
 * \else
 * Add 表示错误码
 * \endif
 */
public class NET_IN_RTMP_MANAGER_REMOVE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Push ID
     * \else
     *  要删除的推流ID
     * \endif
     */
    public int					nPushId;

}
