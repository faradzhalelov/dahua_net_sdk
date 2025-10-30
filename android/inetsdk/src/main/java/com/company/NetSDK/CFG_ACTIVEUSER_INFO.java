package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Max active user list
 * \else
 * 最大活动用户列表
 * \endif
 */
public class CFG_ACTIVEUSER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Active user ID, normally dialogue ID
     * \else
     * 活动用户ID，一般是会话ID
     * \endif
     */
    public int           nUserID;

    /**
     * \if ENGLISH_LANG
     * Username
     * \else
     * 用户名
     * \endif
     */
    public byte[]        szUser = new byte[FinalVar.MAX_USERNAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Group name
     * \else
     * 用户所在组名
     * \endif
     */
    public byte[]        szGroupName = new byte[FinalVar.MAX_USERNAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Group level
     * \else
     * 用户所在组等级
     * \endif
     */
    public int           nGroupLevel;

    /**
     * \if ENGLISH_LANG
     * Client-end type
     * \else
     * 客户端类型
     * \endif
     */
    public byte[]        szClientType = new byte[FinalVar.MAX_USERNAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Client-end IP address
     * \else
     * 客户端IP地址
     * \endif
     */
    public byte[]        szClientAddr = new byte[FinalVar.MAX_ADDRESS_LEN];

    /**
     * \if ENGLISH_LANG
     * Login time
     * \else
     * 用户登入时间
     * \endif
     */
    public CFG_NET_TIME  stuLoginTime = new CFG_NET_TIME();
}
