package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Permission Types
 * \else
 * @brief 权限类型
 * \endif
 */
public class EM_NET_AUTHORITY_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * NET_AUTHORITY_UNKNOW					,
     * \else
     *    NET_AUTHORITY_UNKNOW,
     * \endif
     */
    public static final int					NET_AUTHORITY_UNKNOW = 0;

    /**
     * \if ENGLISH_LANG
     *  open gate
     * \else
     * 开闸权限
     * \endif
     */
    public static final int					NET_AUTHORITY_OPEN_GATE = 1;

}
