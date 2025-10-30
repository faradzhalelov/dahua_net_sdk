package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * NET_OUT_RTMP_MANAGER_ATTACH_STATUS
 * \else
 * NET_OUT_RTMP_MANAGER_ATTACH_STATUS
 * \endif
 */
public class NET_OUT_RTMP_MANAGER_ATTACH_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Subscription ID number
     * \else
     *  订阅id号
     * \endif
     */
    public int					nSID;

    /**
     * \if ENGLISH_LANG
     *  Error code
     * \else
     *  错误码
     * \endif
     */
    public int					emErrCode;

}
