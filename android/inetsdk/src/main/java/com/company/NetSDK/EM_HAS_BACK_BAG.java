package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Has back bag or not
 * \else
 * @brief 是否有背包
 * \endif
 */
public class EM_HAS_BACK_BAG implements Serializable {
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
    public static final int					EM_HAS_BACK_BAG_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  No back bag
     * \else
     *  没有背包
     * \endif
     */
    public static final int					EM_HAS_BACK_BAG_NO = 1;

    /**
     * \if ENGLISH_LANG
     *  Has back bag
     * \else
     *  有背包
     * \endif
     */
    public static final int					EM_HAS_BACK_BAG_YES = 2;

}