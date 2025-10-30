package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Trousers type
 * \else
 * @brief 裤子类型
 * \endif
 */
public class EM_TROUSERS_TYPE implements Serializable {
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
    public static final int					EM_TROUSERS_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Trousers
     * \else
     *  长裤
     * \endif
     */
    public static final int					EM_TROUSERS_TYPE_TROUSERS = 1;

    /**
     * \if ENGLISH_LANG
     *  Shorts
     * \else
     *  短裤
     * \endif
     */
    public static final int					EM_TROUSERS_TYPE_SHORTS = 2;

    /**
     * \if ENGLISH_LANG
     *  Skirt
     * \else
     *  裙子
     * \endif
     */
    public static final int					EM_TROUSERS_TYPE_SKIRT = 3;

}