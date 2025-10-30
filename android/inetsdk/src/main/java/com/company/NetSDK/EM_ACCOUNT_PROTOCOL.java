package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief 协议类型
 * \else
 * @brief 协议类型
 * \endif
 */
public class EM_ACCOUNT_PROTOCOL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  通用协议
     * \else
     *  通用协议
     * \endif
     */
    public static final int					EM_ACCOUNT_PROTOCOL_NORMAL = 0;

    /**
     * \if ENGLISH_LANG
     *  TTLV协议
     * \else
     *  TTLV协议
     * \endif
     */
    public static final int					EM_ACCOUNT_PROTOCOL_TTLV = 1;

}