package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Screen switch
 * \else
 * 屏幕切换开关
 * \endif
 */
public class EM_SCREEN_SWITCH_TYPE  implements Serializable {
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
    public static final int EM_SCREEN_SWITCH_TYPE_UNKNOWN  		  = -1;

    /**
     * \if ENGLISH_LANG
     * LCOS screen (eyepiece)
     * \else
     * LCOS屏（目镜）
     * \endif
     */
    public static final int EM_SCREEN_SWITCH_TYPE_LCOS  		  = 0;

    /**
     * \if ENGLISH_LANG
     * P system external screen
     * \else
     * P制外接屏
     * \endif
     */
    public static final int EM_SCREEN_SWITCH_TYPE_P  		  = 1;

    /**
     * \if ENGLISH_LANG
     * N system external screen
     * \else
     * N制外接屏
     * \endif
     */
    public static final int EM_SCREEN_SWITCH_TYPE_N  		  = 2;
}
