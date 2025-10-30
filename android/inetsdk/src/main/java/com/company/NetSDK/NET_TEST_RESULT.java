package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief ESD resistance test result
 * \else
 * @brief ESD阻值测试结果
 * \endif
 */
public class NET_TEST_RESULT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  k ohm (resistance unit)
     * \else
     *  k欧姆（阻值单位）
     * \endif
     */
    public int					nHandValue;

    /**
     * \if ENGLISH_LANG
     *  k ohm (resistance unit)
     * \else
     *  k欧姆（阻值单位）
     * \endif
     */
    public int					nLeftFootValue;

    /**
     * \if ENGLISH_LANG
     *  k ohm (resistance unit))
     * \else
     *  k欧姆（阻值单位）
     * \endif
     */
    public int					nRightFootValue;

    /**
     * \if ENGLISH_LANG
     *  Test Result,{@link EM_ESD_RESULT}
     * \else
     *  测试结果,{@link EM_ESD_RESULT}
     * \endif
     */
    public int					emEsdResult;

}
