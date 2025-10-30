package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief alcohol state
 * \else
 * @brief 酒精状态
 * \endif
 */
public class EM_ALCOHOL_STATE implements Serializable {
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
    public static final int					EM_ALCOHOL_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  normal
     * \else
     *  正常
     * \endif
     */
    public static final int					EM_ALCOHOL_STATE_NORMAL = 1;

    /**
     * \if ENGLISH_LANG
     *  drink
     * \else
     *  饮酒
     * \endif
     */
    public static final int					EM_ALCOHOL_STATE_DRINK = 2;

}
