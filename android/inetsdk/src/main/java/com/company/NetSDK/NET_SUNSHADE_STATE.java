package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * sun shade state
 * \else
 * 遮阳板状态
 * \endif
 */
public class NET_SUNSHADE_STATE implements  Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknow
     * \else
     * 未知
     * \endif
     */
    public static final int SS_NUKNOW_SUN_SHADE	= 0;

    /**
     * \if ENGLISH_LANG
     * WithSunShade
     * \else
     * 有遮阳板
     * \endif
     */
    public static final int SS_WITH_SUN_SHADE = 1;

    /**
     * \if ENGLISH_LANG
     * WithoutSunShade
     * \else
     * 无遮阳板
     * \endif
     */
    public static final int SS_WITHOUT_SUN_SHADE = 2;
}
