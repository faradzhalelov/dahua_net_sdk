package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief bag type
 * \else
 * @brief 包类型
 * \endif
 */
public class EM_BAG_TYPE implements Serializable {
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
    public static final int					EM_BAG_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  hand bag
     * \else
     *  手提包
     * \endif
     */
    public static final int					EM_BAG_HANDBAG = 1;

    /**
     * \if ENGLISH_LANG
     *  shoulder bag
     * \else
     *  肩包
     * \endif
     */
    public static final int					EM_BAG_SHOULDERBAG = 2;

    /**
     * \if ENGLISH_LANG
     *  knapsack
     * \else
     *  背包
     * \endif
     */
    public static final int					EM_BAG_KNAPSACK = 3;

    /**
     * \if ENGLISH_LANG
     *  drawar box
     * \else
     *  拉杆箱
     * \endif
     */
    public static final int					EM_BAG_DRAWBARBOX = 4;

    /**
     * \if ENGLISH_LANG
     *  waist pack
     * \else
     *  腰包
     * \endif
     */
    public static final int					EM_BAG_WAISTPACK = 5;

    /**
     * \if ENGLISH_LANG
     *  no bag
     * \else
     *  无包
     * \endif
     */
    public static final int					EM_BAG_NONE = 6;

}