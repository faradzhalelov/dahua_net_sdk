package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * NET_IN_RTMP_MANAGER_ATTACH_STATUS
 * \else
 * NET_IN_RTMP_MANAGER_ATTACH_STATUS
 * \endif
 */
public class NET_IN_RTMP_MANAGER_ATTACH_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Push ID
     * \else
     *  要订阅的推流ID
     * \endif
     */
    public int					nPushId;

    /**
     * \if ENGLISH_LANG
     *  Parameter callback function
     * \else
     *  入参回调函数
     * \endif
     */
    public CB_fRTMPAttachStatusCallBack					cbRTMPAttachStatusCallBack;

    /**
     * \if ENGLISH_LANG
     *  User defined parameters
     * \else
     *  用户自定义参数
     * \endif
     */
    public long					dwUser;

}
