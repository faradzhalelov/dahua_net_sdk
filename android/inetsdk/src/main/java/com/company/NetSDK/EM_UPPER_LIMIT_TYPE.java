package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * upper limit type
 * \else
 * 人数越上限类型
 * \endif
 */
public class EM_UPPER_LIMIT_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int     EM_UPPER_LIMIT_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * EnterOver
     * \else
     * 进入越上限
     * \endif
     */
    public static final int     EM_UPPER_LIMIT_TYPE_ENTER_OVER = 1;

    /**
     * \if ENGLISH_LANG
     * ExitOver
     * \else
     * 出来越上限
     * \endif
     */
    public static final int     EM_UPPER_LIMIT_TYPE_EXIT_OVER = 2;

    /**
     * \if ENGLISH_LANG
     * InsideOver
     * \else
     * 内部越上限
     * \endif
     */
    public static final int     EM_UPPER_LIMIT_TYPE_INSIDE_OVER = 3;

}
