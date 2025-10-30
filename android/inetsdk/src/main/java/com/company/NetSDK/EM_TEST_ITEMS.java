package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  Test items
 * \else
 *  测试项目
 * \endif
 */
public class EM_TEST_ITEMS implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  UNKNOWN
     * \else
     * 未知
     * \endif
     */
    public static final int EM_TEST_ITEMS_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  other projects
     * \else
     * 其他项目
     * \endif
     */
    public static final int EM_TEST_ITEMS_OTHER = 0;

    /**
     * \if ENGLISH_LANG
     *  Hand test electrostatic resistance
     * \else
     * 手部测试静电电阻
     * \endif
     */
    public static final int EM_TEST_ITEMS_HAND_TEST = 1;

    /**
     * \if ENGLISH_LANG
     *  Two feet test electrostatic resistance
     * \else
     * 双脚测试静电电阻
     * \endif
     */
    public static final int EM_TEST_ITEMS_TWOFEET_TEST = 2;

    /**
     * \if ENGLISH_LANG
     *  Test electrostatic resistance with hands and feet
     * \else
     * 手部和双脚测试静电电阻
     * \endif
     */
    public static final int EM_TEST_ITEMS_HANDTWOFEET_TEST = 3;

    /**
     * \if ENGLISH_LANG
     *  All untested
     * \else
     * 全部不测
     * \endif
     */
    public static final int EM_TEST_ITEMS_NONE = 4;
}
