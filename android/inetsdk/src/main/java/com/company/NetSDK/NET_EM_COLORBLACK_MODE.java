package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * color to black
 * \else
 * 彩转黑模式
 * \endif
 */
public class NET_EM_COLORBLACK_MODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知
     * \endif
     */
    public static final int NET_EM_COLORBLACK_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * color
     * \else
     * 总是彩色
     * \endif
     */
    public static final int NET_EM_COLORBLACK_COLOR = 1;

    /**
     * \if ENGLISH_LANG
     * automatic switching based on brightness
     * \else
     * 根据亮度自动切换
     * \endif
     */
    public static final int NET_EM_COLORBLACK_BRIGHTNESS = 2;

    /**
     * \if ENGLISH_LANG
     * alawys black and white
     * \else
     * 总是黑白
     * \endif
     */
    public static final int NET_EM_COLORBLACK_BLACKWHITE = 3;

    /**
     * \if ENGLISH_LANG
     * photosensitive resistor
     * \else
     * 光敏电阻
     * \endif
     */
    public static final int NET_EM_COLORBLACK_PHOTORESISTOR = 4;

    /**
     * \if ENGLISH_LANG
     * switch accord to gain
     * \else
     * 根据增益切换
     * \endif
     */
    public static final int NET_EM_COLORBLACK_GAIN = 5;

    /**
     * \if ENGLISH_LANG
     * external alarm input
     * \else
     * 外部报警输入
     * \endif
     */
    public static final int NET_EM_COLORBLACK_ALARMINPUT = 6;

    /**
     * \if ENGLISH_LANG
     * external I/O input
     * \else
     * 外部IO输入
     * \endif
     */
    public static final int NET_EM_COLORBLACK_IO = 7;

}
