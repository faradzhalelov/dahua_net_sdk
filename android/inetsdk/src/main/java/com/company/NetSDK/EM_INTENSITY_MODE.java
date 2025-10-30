package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the mode of intensity, only valid when the VideoInBacklight mode is SSA
 * \else
 * SSA对比度调节模式,当背光模式为SSA时有效
 * \endif
 */
public class EM_INTENSITY_MODE implements Serializable {
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
    public static final int EM_INTENSITY_UNKNOW = 0;

    /**
     * \if ENGLISH_LANG
     * unable
     * \else
     * 关闭
     * \endif
     */
    public static final int EM_INTENSITY_DISABLE = 1;

    /**
     * \if ENGLISH_LANG
     * auto
     * \else
     * 自动
     * \endif
     */
    public static final int EM_INTENSITY_AUTO = 2;

    /**
     * \if ENGLISH_LANG
     * manual
     * \else
     * 手动
     * \endif
     */
    public static final int EM_INTENSITY_MANUAL = 3;
}
