package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Add Indicates the error code
 * \else
 * Add 表示错误码
 * \endif
 */
public class NET_OUT_RTMP_MANAGER_ADD implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The push stream ID is returned after adding successfully, and 0 is filled in if it fails
     * \else
     *  添加成功返回推流ID，失败时填0
     * \endif
     */
    public int					nPushId;

    /**
     * \if ENGLISH_LANG
     *  Add Indicates the error code
     * \else
     *  Add 表示错误码
     * \endif
     */
    public int					emErrCode;

}
