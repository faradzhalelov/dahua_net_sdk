package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Has shoulder bag or not
 * \else
 * @brief 是否有肩包
 * \endif
 */
public class EM_HAS_SHOULDER_BAG implements Serializable {
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
    public static final int					EM_HAS_SHOULDER_BAG_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  No shoulder bag
     * \else
     *  没有肩包
     * \endif
     */
    public static final int					EM_HAS_SHOULDER_BAG_NO = 1;

    /**
     * \if ENGLISH_LANG
     *  Has shoulder bag
     * \else
     *  有肩包
     * \endif
     */
    public static final int					EM_HAS_SHOULDER_BAG_YES = 2;

}