package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief support lock or not
 * \else
 * @brief 是否支持锁
 * \endif
 */
public class EM_REGISTER_USER_STATE_SUPPORTLOCK_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_REGISTER_USER_STATE_SUPPORTLOCK_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Support
     * \else
     *  支持
     * \endif
     */
    public static final int					EM_REGISTER_USER_STATE_SUPPORTLOCK_TYPE_SUPPORTLOCK = 1;

    /**
     * \if ENGLISH_LANG
     *  Do not support
     * \else
     *  不支持
     * \endif
     */
    public static final int					EM_REGISTER_USER_STATE_SUPPORTLOCK_TYPE_NOT_SUPPORTLOCK = 2;

}