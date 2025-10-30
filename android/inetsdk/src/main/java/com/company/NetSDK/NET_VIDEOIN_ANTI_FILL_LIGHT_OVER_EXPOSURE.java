package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief ANTI_FILL_LIGHT_OVER_EXPOSURE
 * \else
 * @brief 防补光过曝配置
 * \endif
 */
public class NET_VIDEOIN_ANTI_FILL_LIGHT_OVER_EXPOSURE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  ModeNum
     * \else
     *  场景个数
     * \endif
     */
    public int					nModeNum;

    /**
     * \if ENGLISH_LANG
     *  Mode Starting from element 0, they respectively represent Daytime, Nighttime, Normal, Front Light, Moderate Backlight, Strong Backlight, Low Illumination, and Custom.
     * \else
     *  场景 元素0开始分别表示 白天、夜晚、普通、顺光、一般逆光、强逆光、低照度、自定义
     * \endif
     */
    public NET_VIDEOIN_ANTI_FILL_LIGHT_OVER_EXPOSURE_SCENE					stuMode[] = new NET_VIDEOIN_ANTI_FILL_LIGHT_OVER_EXPOSURE_SCENE[32];

    public NET_VIDEOIN_ANTI_FILL_LIGHT_OVER_EXPOSURE(){
        for(int i = 0; i < stuMode.length; i++) {
            stuMode[i] = new NET_VIDEOIN_ANTI_FILL_LIGHT_OVER_EXPOSURE_SCENE();
        }
    }
}