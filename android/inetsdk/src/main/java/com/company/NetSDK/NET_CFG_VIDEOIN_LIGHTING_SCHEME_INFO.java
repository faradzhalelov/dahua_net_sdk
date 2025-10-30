package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 灯光方案配置,Corresponding to {@link NET_EM_CFG_VIDEOIN_LIGHTING_SCHEME}
 * \else
 * 灯光方案配置,对应 {@link NET_EM_CFG_VIDEOIN_LIGHTING_SCHEME}
 * \endif
 */
public class NET_CFG_VIDEOIN_LIGHTING_SCHEME_INFO implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Number of lighting schemes
     * \else
     * 灯光方案个数
     * \endif
     */
    public int nModeNum;
    /**
     * \if ENGLISH_LANG
     * Lighting scheme elements 0 start to represent day, night, normal, smooth, normal backlight, strong backlight, low illuminance, custom,refer to{@link EM_LIGHTING_SCHEME_MODE}
     * \else
     * 灯光方案 元素0开始分别表示 白天、夜晚、普通、顺光、一般逆光、强逆光、低照度、自定义,具体参考{@link EM_LIGHTING_SCHEME_MODE}
     * \endif
     */
    public int[]   emMode = new int[8];
}
