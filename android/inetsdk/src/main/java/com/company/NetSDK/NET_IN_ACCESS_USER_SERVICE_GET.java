package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  input param of Get user
 * \else
 *  获取用户信息入参
 * \endif
 */
public class NET_IN_ACCESS_USER_SERVICE_GET implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Get number
     * \else
     * 查询的数量
     * \endif
     */
    public int     nUserNum;

    /**
     * \if ENGLISH_LANG
     *  user id
     * \else
     * 用户ID
     * \endif
     */
    public byte     szUserID[][] = new byte[100][32];

}
