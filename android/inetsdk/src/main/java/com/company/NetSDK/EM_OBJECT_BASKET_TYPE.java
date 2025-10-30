package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Non Motor vehicle basket
 * \else
 * @brief 非机动车车篮
 * \endif
 */
public class EM_OBJECT_BASKET_TYPE implements Serializable {
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
    public static final int					EM_OBJECT_BASKET_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  no 
     * \else
     *  无 
     * \endif
     */
    public static final int					EM_OBJECT_BASKET_NO = 1;

    /**
     * \if ENGLISH_LANG
     *  yes
     * \else
     *  有
     * \endif
     */
    public static final int					EM_OBJECT_BASKET_YES = 2;

}
