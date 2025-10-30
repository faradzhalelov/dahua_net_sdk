package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief coat type
 * \else
 * @brief 上衣类型
 * \endif
 */
public class EM_COAT_TYPE implements Serializable {
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
    public static final int					EM_COAT_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Long sleeve
     * \else
     *  长袖
     * \endif
     */
    public static final int					EM_COAT_TYPE_LONG_SLEEVE = 1;

    /**
     * \if ENGLISH_LANG
     *  Cotta
     * \else
     *  短袖
     * \endif
     */
    public static final int					EM_COAT_TYPE_COTTA = 2;

    /**
     * \if ENGLISH_LANG
     * Sleeveless
     * \else
     * 无袖
     * \endif
     */
    public static final int					EM_COAT_TYPE_SLEEVELESS = 3;

}