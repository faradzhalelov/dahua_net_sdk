package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Work pants state
 * \else
 * @brief 工作裤穿戴状态
 * \endif
 */
public class EM_WORKPANTS_STATE implements Serializable {
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
    public static final int					EM_WORKPANTS_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  not wear
     * \else
     *  没有
     * \endif
     */
    public static final int					EM_WORKPANTS_STATE_NOTWEAR = 1;

    /**
     * \if ENGLISH_LANG
     *  wear
     * \else
     *  有
     * \endif
     */
    public static final int					EM_WORKPANTS_STATE_WEAR = 2;

}