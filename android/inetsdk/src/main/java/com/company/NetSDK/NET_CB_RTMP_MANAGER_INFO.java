package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * NET_CB_RTMP_MANAGER_INFO
 * \else
 * NET_CB_RTMP_MANAGER_INFO
 * \endif
 */
public class NET_CB_RTMP_MANAGER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Push ID
     * \else
     *  推流ID
     * \endif
     */
    public int					nPushId;

    /**
     * \if ENGLISH_LANG
     *  State change
     * \else
     *  状态变化,NET_EM_RTMP_MANAGER_STATUS
     * \endif
     */
    public int					emStatus;

    /**
     * \if ENGLISH_LANG
     *  Error code
     * \else
     *  错误码
     * \endif
     */
    public int					emErrCode;

    @Override
    public String toString() {
        return "NET_CB_RTMP_MANAGER_INFO{" +
                "nPushId=" + nPushId +
                ", emStatus=" + emStatus +
                ", emErrCode=" + emErrCode +
                '}';
    }
}
