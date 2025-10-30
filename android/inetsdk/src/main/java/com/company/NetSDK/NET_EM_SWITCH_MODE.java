package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * switch mode
 * \else
 * 切换模式
 * \endif
 */
public class NET_EM_SWITCH_MODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  do not switch, use day time config
     * \else
     *  不切换，总是使用白天配置
     * \endif
     */
    public static final int					NET_EM_SWITCH_MODE_WIGHT = 0;

    /**
     * \if ENGLISH_LANG
     *  switch by brightness
     * \else
     *  根据亮度切换
     * \endif
     */
    public static final int					NET_EM_SWITCH_MODE_LIGHT = 1;

    /**
     * \if ENGLISH_LANG
     *  switch by time
     * \else
     *  根据时间切换
     * \endif
     */
    public static final int					NET_EM_SWITCH_MODE_TIME = 2;

    /**
     * \if ENGLISH_LANG
     *  do not switch, use night config
     * \else
     *  不切换，总是使用夜晚配置
     * \endif
     */
    public static final int					NET_EM_SWITCH_MODE_NIGHT = 3;

    /**
     * \if ENGLISH_LANG
     *  use normal config
     * \else
     *  使用普通配置
     * \endif
     */
    public static final int					NET_EM_SWITCH_MODE_NORMAL = 4;

    /**
     * \if ENGLISH_LANG
     *  Press the state of ICR (double filter switcher) to switch between day and night
     * \else
     *  按ICR(双滤光片切换器)的状态切换日夜
     * \endif
     */
    public static final int					NET_EM_SWITCH_MODE_ICR = 5;

}