package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  user type
 * \else
 *  用户类型
 * \endif
 */
public class NET_ENUM_USER_TYPE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     * 未知用户
     * \endif
     */
    public static final int NET_ENUM_USER_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  normal
     * \else
     * 普通用户
     * \endif
     */
    public static final int NET_ENUM_USER_TYPE_NORMAL = 0;

    /**
     * \if ENGLISH_LANG
     *  block list
     * \else
     * 禁止名单用户
     * \endif
     */
    public static final int NET_ENUM_USER_TYPE_BLACKLIST = 1;

    /**
     * \if ENGLISH_LANG
     *  guset
     * \else
     * 来宾账户
     * \endif
     */
    public static final int NET_ENUM_USER_TYPE_GUEST = 2;

    /**
     * \if ENGLISH_LANG
     *  patrol
     * \else
     * 巡逻用户
     * \endif
     */
    public static final int NET_ENUM_USER_TYPE_PATROL = 3;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *
     * \endif
     */
    public static final int NET_ENUM_USER_TYPE_VIP = 4;

    /**
     * \if ENGLISH_LANG
     *  handicap
     * \else
     * 残障人士
     * \endif
     */
    public static final int NET_ENUM_USER_TYPE_HANDICAP = 5;

    /**
     * \if ENGLISH_LANG
     *  Custom user1
     * \else
     * 自定义用户1
     * \endif
     */
    public static final int NET_ENUM_USER_TYPE_CUSTOM1 = 6;

    /**
     * \if ENGLISH_LANG
     *  Custom user2
     * \else
     * 自定义用户2
     * \endif
     */
    public static final int NET_ENUM_USER_TYPE_CUSTOM2 = 7;

}
