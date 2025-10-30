package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Has bag
 * \else
 * @brief 是否戴包(包括背包或拎包)
 * \endif
 */
public class EM_HAS_BAG implements Serializable {
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
    public static final int					EM_HAS_BAG_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  No bag
     * \else
     *  不带包
     * \endif
     */
    public static final int					EM_HAS_BAG_NO = 1;

    /**
     * \if ENGLISH_LANG
     *  Has bag
     * \else
     *  带包
     * \endif
     */
    public static final int					EM_HAS_BAG_YES = 2;

}