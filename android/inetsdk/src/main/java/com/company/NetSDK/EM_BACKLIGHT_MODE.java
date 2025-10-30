package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *
 * \else
 * 背光补偿模式，当背光模式为Backlight时有效
 * \endif
 */
public class EM_BACKLIGHT_MODE implements Serializable {
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
    public static final int EM_BACKLIGHT_UNKONW = 0;

    /**
     * \if ENGLISH_LANG
     * default
     * \else
     * 默认模式
     * \endif
     */
    public static final int EM_BACKLIGHT_DEFAULT = 1;

    /**
     * \if ENGLISH_LANG
     * region
     * \else
     * 自定义区域模式
     * \endif
     */
    public static final int EM_BACKLIGHT_REGION = 2;
}
