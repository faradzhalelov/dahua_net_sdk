package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  input of  remove user
 * \else
 *  删除指定ID人员信息入参
 * \endif
 */
public class NET_IN_ACCESS_USER_SERVICE_REMOVE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  remove number
     * \else
     * 删除的数量
     * \endif
     */
    public int     nUserNum;

    /**
     * \if ENGLISH_LANG
     *  user ID
     * \else
     * 用户ID
     * \endif
     */
    public byte     szUserID[][] = new byte[100][32];

}
