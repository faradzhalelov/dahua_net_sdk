package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Has messenger bag or not
 * \else
 * @brief 是否有斜挎包
 * \endif
 */
public class EM_HAS_MESSENGER_BAG implements Serializable {
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
    public static final int					EM_HAS_MESSENGER_BAG_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  No messenger bag
     * \else
     *  没有斜挎包
     * \endif
     */
    public static final int					EM_HAS_MESSENGER_BAG_NO = 1;

    /**
     * \if ENGLISH_LANG
     *  Has messenger bag
     * \else
     *  有斜挎包
     * \endif
     */
    public static final int					EM_HAS_MESSENGER_BAG_YES = 2;

}