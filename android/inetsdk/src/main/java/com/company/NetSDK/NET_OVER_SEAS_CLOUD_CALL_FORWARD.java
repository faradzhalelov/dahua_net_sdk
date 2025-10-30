package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Call forwarding information
 * \else
 * @brief 呼叫转移信息
 * \endif
 */
public class NET_OVER_SEAS_CLOUD_CALL_FORWARD implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Long Number
     * \else
     *  呼叫短号
     * \endif
     */
    public byte					szShortNumber[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Short Number
     * \else
     *  呼叫长号
     * \endif
     */
    public byte					szLongNumber[] = new byte[32];

}