package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Test Result
 * \else
 * @brief 测试结果
 * \endif
 */
public class EM_ESD_RESULT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  UNKNOWN
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_ESD_RESULT_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  Other abnormalities
     * \else
     *  其他异常
     * \endif
     */
    public static final int					EM_ESD_RESULT_OTHER_ABERRANT = 0;

    /**
     * \if ENGLISH_LANG
     *  Test passed
     * \else
     *  测试通过
     * \endif
     */
    public static final int					EM_ESD_RESULT_TEST_PASS = 1;

    /**
     * \if ENGLISH_LANG
     *  Hand test failed
     * \else
     *  手测试未通过
     * \endif
     */
    public static final int					EM_ESD_RESULT_HAND_TEST_FAIL = 2;

    /**
     * \if ENGLISH_LANG
     *  Left foot test failed
     * \else
     *  左脚测试未通过
     * \endif
     */
    public static final int					EM_ESD_RESULT_LEFTFOOT_TEST_FAIL = 3;

    /**
     * \if ENGLISH_LANG
     *  The right foot test failed
     * \else
     *  右脚测试未通过
     * \endif
     */
    public static final int					EM_ESD_RESULT_RIGHTFOOT_TEST_FAIL = 4;

    /**
     * \if ENGLISH_LANG
     *  The foot test failed
     * \else
     *  双脚测试未通过
     * \endif
     */
    public static final int					EM_ESD_RESULT_FOOT_TEST_FAIL = 5;

    /**
     * \if ENGLISH_LANG
     *  All tests failed
     * \else
     *  全部测试未通过
     * \endif
     */
    public static final int					EM_ESD_RESULT_TEST_FAIL = 6;

}
