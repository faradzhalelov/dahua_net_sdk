package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief glasses detection rule alarm type
 * \else
 * @brief 眼镜检测规则中报警类型
 * \endif
 */
public class EM_GLASSES_RULE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  the unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_GLASSES_RULE_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  No glasses
     * \else
     *  无眼镜
     * \endif
     */
    public static final int					EM_GLASSES_RULE_TYPE_NO_GLASSES = 0;

    /**
     * \if ENGLISH_LANG
     *  sunglasses
     * \else
     *  太阳镜
     * \endif
     */
    public static final int					EM_GLASSES_RULE_TYPE_SUN_GLASSES = 1;

    /**
     * \if ENGLISH_LANG
     *  black-rimmed glasses
     * \else
     *  黑框眼镜
     * \endif
     */
    public static final int					EM_GLASSES_RULE_TYPE_BLACK_RIMMED_GLASSES = 2;

    /**
     * \if ENGLISH_LANG
     *  half-rimmed glasses
     * \else
     *  半框眼镜
     * \endif
     */
    public static final int					EM_GLASSES_RULE_TYPE_HALF_RIMMED_GLASSES = 3;

    /**
     * \if ENGLISH_LANG
     *  his rimless glasses
     * \else
     *  无框眼镜
     * \endif
     */
    public static final int					EM_GLASSES_RULE_TYPE_RIMLESS_GLASSES = 4;

    /**
     * \if ENGLISH_LANG
     *  ordinary glasses
     * \else
     *  普通眼镜
     * \endif
     */
    public static final int					EM_GLASSES_RULE_TYPE_NORMAL_GLASSES = 5;

    /**
     * \if ENGLISH_LANG
     *  Industrial goggles
     * \else
     *  工业护目镜
     * \endif
     */
    public static final int					EM_GLASSES_RULE_TYPE_INDUSTRIAL_SAFETY_GLASSES = 6;

}