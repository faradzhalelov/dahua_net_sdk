package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Conditional expression
 * \else
 * 条件表达式
 * \endif
 */
public class EM_CONDITIONEXPR implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public final static int EM_CONDITIONEXPR_UNKNWON              = 0;

    /**
     * \if ENGLISH_LANG
     * greater
     * \else
     * 大于
     * \endif
     */
    public final static int EM_CONDITIONEXPR_GREATER              = 1;

    /**
     * \if ENGLISH_LANG
     * less
     * \else
     * 小于
     * \endif
     */
    public final static int EM_CONDITIONEXPR_LESS              = 2;

    /**
     * \if ENGLISH_LANG
     * equal
     * \else
     * 等于
     * \endif
     */
    public final static int EM_CONDITIONEXPR_EQUAL              = 3;
}
