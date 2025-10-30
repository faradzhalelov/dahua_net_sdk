package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief danger grade
 * \else
 * @brief 危险等级
 * \endif
 */
public class EM_DANGER_GRADE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     * 未知
     * \endif
     */
    public static final int					EM_DANGER_GRADE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  normal
     * \else
     * 普通级别
     * \endif
     */
    public static final int					EM_DANGER_GRADE_NORMAL = 0;

    /**
     * \if ENGLISH_LANG
     *  warn
     * \else
     * 警示级别
     * \endif
     */
    public static final int					EM_DANGER_GRADE_WARN = 1;

    /**
     * \if ENGLISH_LANG
     *  danger
     * \else
     * 危险级别
     * \endif
     */
    public static final int					EM_DANGER_GRADE_DANGER = 2;

}