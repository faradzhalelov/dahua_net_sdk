package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Has carrier bag or not
 * \else
 * @brief 是否有手提包
 * \endif
 */
public class EM_HAS_CARRIER_BAG implements Serializable {
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
    public static final int					EM_HAS_CARRIER_BAG_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  No carrier bag
     * \else
     *  没有手提包
     * \endif
     */
    public static final int					EM_HAS_CARRIER_BAG_NO = 1;

    /**
     * \if ENGLISH_LANG
     *  Has carrier bag
     * \else
     *  有手提包
     * \endif
     */
    public static final int					EM_HAS_CARRIER_BAG_YES = 2;

}