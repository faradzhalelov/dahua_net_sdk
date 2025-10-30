package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief protocol type
 * \else
 * @brief 协议类型
 * \endif
 */
public class EM_PROTOCOL_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown protocol
     * \else
     *  未知协议
     * \endif
     */
    public static final int					EM_PROTOCOL_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  TCP protocol
     * \else
     *  TCP协议
     * \endif
     */
    public static final int					EM_PROTOCOL_TCP = 0;

    /**
     * \if ENGLISH_LANG
     *  UDP protocol
     * \else
     *  UDP协议
     * \endif
     */
    public static final int					EM_PROTOCOL_UDP = 1;

}
