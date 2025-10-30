package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief user type
 * \else
 * @brief 用户类型
 * \endif
 */
public class EM_USER_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_USER_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *
     * \endif
     */
    public static final int					EM_USER_TYPE_ORDINARY = 0;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *
     * \endif
     */
    public static final int					EM_USER_TYPE_BLACKLIST = 1;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *
     * \endif
     */
    public static final int					EM_USER_TYPE_VIP = 2;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *
     * \endif
     */
    public static final int					EM_USER_TYPE_GUEST = 3;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *
     * \endif
     */
    public static final int					EM_USER_TYPE_PATROL = 4;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *
     * \endif
     */
    public static final int					EM_USER_TYPE_DISABLED = 5;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *
     * \endif
     */
    public static final int					EM_USER_TYPE_FROZEN = 6;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *
     * \endif
     */
    public static final int					EM_USER_TYPE_LOGOUT = 7;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *
     * \endif
     */
    public static final int					EM_USER_TYPE_LOSSCARD = 8;

}
