package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * @brief  SD卡加锁状态
 * \endif
 */
public class EM_SD_LOCK_STATE implements Serializable {
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
    public static final int					EM_SD_LOCK_STATE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  normal
     * \else
     *  未进行过加锁的状态, 如出厂状态，或清除密码时状态
     * \endif
     */
    public static final int					EM_SD_LOCK_STATE_NORMAL = 0;

    /**
     * \if ENGLISH_LANG
     *  locked
     * \else
     *  加锁
     * \endif
     */
    public static final int					EM_SD_LOCK_STATE_LOCKED = 1;

    /**
     * \if ENGLISH_LANG
     *  unlocked(after locked)
     * \else
     *  未加锁（加锁后解锁）
     * \endif
     */
    public static final int					EM_SD_LOCK_STATE_UNLOCKED = 2;

}
