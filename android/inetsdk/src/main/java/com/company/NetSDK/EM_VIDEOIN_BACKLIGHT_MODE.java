package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the mode of video in backlight
 * \else
 * 背光模式
 * \endif
 */
public class EM_VIDEOIN_BACKLIGHT_MODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知模式
     * \endif
     */
    public static final int EM_BACKLIGHT_UNKNOW = 0;

    /**
     * \if ENGLISH_LANG
     * off
     * \else
     * 关闭
     * \endif
     */
    public static final int EM_BACKLIGHT_OFF = 1;

    /**
     * \if ENGLISH_LANG
     * back light
     * \else
     * 背光补偿
     * \endif
     */
    public static final int EM_BACKLIGHT_BACKLIGHT = 2;

    /**
     * \if ENGLISH_LANG
     * GlareInhibition
     * \else
     * 强光抑制
     * \endif
     */
    public static final int EM_BACKLIGHT_GLAREINHIBITION = 3;

    /**
     * \if ENGLISH_LANG
     * WideDynamic
     * \else
     * 宽动态
     * \endif
     */
    public static final int EM_BACKLIGHT_WIDEDYNAMIC = 4;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 场景自适应
     * \endif
     */
    public static final int EM_BACKLIGHT_SSA = 5;
}
