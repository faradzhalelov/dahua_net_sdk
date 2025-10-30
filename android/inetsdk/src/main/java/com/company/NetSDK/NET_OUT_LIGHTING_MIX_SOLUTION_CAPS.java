package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output param, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_LIGHTINGCONTROL_CAPS}
 * \else
 * 出参, 对应接口 {@link INetSDK#GetDevCaps},对应命令 {@link FinalVar#NET_LIGHTINGCONTROL_CAPS}
 * \endif
 */
public class NET_OUT_LIGHTING_MIX_SOLUTION_CAPS implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Does it support soft light two color capability
     * \else
     * 是否支持柔光双色能力
     * \endif
     */
    public boolean                bSupport;

    /**
     * \if ENGLISH_LANG
     * Effective number of emmode
     * \else
     * emMode 有效个数
     * \endif
     */
    public int                     nRetModeNum;

    /**
     * \if ENGLISH_LANG
     * Supplementary light scheme,refer to{@link EM_LIGHTING_SCHEME_MODE}
     * \else
     * 补光灯方案,具体参考{@link EM_LIGHTING_SCHEME_MODE}
     * \endif
     */
    public int emMode[] = new int[10];

    /**
     * \if ENGLISH_LANG
     * Effective under the intelligent light compensation scheme indicates the delay range of infrared
     * white light switching to prevent switching back and forth from affecting the life and experience, unit: second range [0,300]
     * \else
     * 智能补光方案下生效 表示红外白光切换延时范围，防止来回切换影响寿命和体验,单位：秒 范围[0,300]
     * \endif
     */
    public int                 nAIMixLightSwitchDelayRange[] = new int[2];

}
