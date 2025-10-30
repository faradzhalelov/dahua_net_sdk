package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Overseas cloud call information
 * \else
 * @brief 海外云呼叫信息
 * \endif
 */
public class NET_RES_HANGUP_OVER_SEAS_CLOUD implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Error Code
     * \else
     *  错误码
     * \endif
     */
    public int					nErrorCode;

    /**
     * \if ENGLISH_LANG
     *  Call forwarding information is valid when the Error Code is 302
     * \else
     *  呼叫转移信息，当ErrorCode为302的时候，这个信息有效
     * \endif
     */
    public NET_OVER_SEAS_CLOUD_CALL_FORWARD					stuCallForward = new NET_OVER_SEAS_CLOUD_CALL_FORWARD();

}