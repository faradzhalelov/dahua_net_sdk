package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief safe belt status
 * \else
 * @brief 安全带状态
 * \endif
 */
public class EM_SAFE_BELT_STATE implements Serializable {
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
    public static final int					EM_SAFE_BELT_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  unidentified
     * \else
     *  未识别
     * \endif
     */
    public static final int					EM_SAFE_BELT_OTHER = 1;

    /**
     * \if ENGLISH_LANG
     *  with safe belt
     * \else
     *  有安全带
     * \endif
     */
    public static final int					EM_SAFE_BELT_WITH = 2;

    /**
     * \if ENGLISH_LANG
     *  without safe belt
     * \else
     *  无安全带
     * \endif
     */
    public static final int					EM_SAFE_BELT_WITHOUT = 3;

}