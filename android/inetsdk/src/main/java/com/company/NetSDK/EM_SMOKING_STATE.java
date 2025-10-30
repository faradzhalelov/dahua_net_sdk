package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief smoking state
 * \else
 * @brief 是否抽烟
 * \endif
 */
public class EM_SMOKING_STATE implements Serializable {
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
    public static final int					EM_SMOKING_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  not smoking
     * \else
     *  未抽烟
     * \endif
     */
    public static final int					EM_SMOKING_NO = 1;

    /**
     * \if ENGLISH_LANG
     *  smoking
     * \else
     *  抽烟
     * \endif
     */
    public static final int					EM_SMOKING_YES = 2;

}