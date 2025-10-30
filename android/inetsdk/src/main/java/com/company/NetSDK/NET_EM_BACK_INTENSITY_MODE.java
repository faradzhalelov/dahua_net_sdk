package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the mode of Intensity
 * \else
 * 场景自适应对比度强度调节模式
 * \endif
 */
public class NET_EM_BACK_INTENSITY_MODE implements Serializable {
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
    public static final int NET_EM_INTENSITY_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Unable
     * \else
     * 关闭
     * \endif
     */
    public static final int NET_EM_INTENSITY_OFF = 1;

    /**
     * \if ENGLISH_LANG
     * AutoIntensity
     * \else
     * 自动
     * \endif
     */
    public static final int NET_EM_INTENSITY_AUTO = 2;

    /**
     * \if ENGLISH_LANG
     * ManualIntensity
     * \else
     * 手动
     * \endif
     */
    public static final int NET_EM_INTENSITY_MANUAL = 3;
}
