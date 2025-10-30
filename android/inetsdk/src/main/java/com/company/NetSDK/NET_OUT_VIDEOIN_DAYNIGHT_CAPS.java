package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output paramer, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_VIDEOIN_DAYNIGHT_CAPS}
 * \else
 * 出参, 对应接口 {@link INetSDK#GetDevCaps},对应命令 {@link FinalVar#NET_VIDEOIN_DAYNIGHT_CAPS}
 * \endif
 */
public class NET_OUT_VIDEOIN_DAYNIGHT_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * the ability to set night and day
     * \else
     * 球机机芯日夜设置能力
     * \endif
     */
    public boolean						bSupport;

    /**
     * \if ENGLISH_LANG
     * the actual counts of ICR type
     * \else
     * 实际支持的ICR切换类型个数
     * \endif
     */
    public int							nICRType;

    /**
     * \if ENGLISH_LANG
     * the list of ICR types,refer to {@link NET_EM_ICR_TYPE}
     * \else
     * ICR切换类型列表,参考{@link NET_EM_ICR_TYPE}
     * \endif
     */
    public int				emICRType[] = new int[FinalVar.MAX_MODE_COUNT];

    /**
     * \if ENGLISH_LANG
     * the actual counts of color to black mode
     * \else
     * 实际支持的彩转黑模式个数
     * \endif
     */
    public int							nColorBlackMode;

    /**
     * \if ENGLISH_LANG
     * the list of color to black modes,refer to {@link NET_EM_COLORBLACK_MODE}
     * \else
     * 支持的彩转黑模式列表,参考{@link NET_EM_COLORBLACK_MODE}
     * \endif
     */
    public int		emColorBlackMode[] = new int[FinalVar.MAX_MODE_COUNT];

    /**
     * \if ENGLISH_LANG
     * the min of color to black sensitivity
     * \else
     * 彩转黑灵敏度最小值
     * \endif
     */
    public int							nSensitivityRangeMin;

    /**
     * \if ENGLISH_LANG
     * the max of color to black sensitivity
     * \else
     * 彩转黑灵敏度最大值
     * \endif
     */
    public int							nSensitivityRangeMax;

    /**
     * \if ENGLISH_LANG
     * the min delay of dat and night switching
     * \else
     * 日夜模式切换延时最小值
     * \endif
     */
    public int							nDelayRangeMin;

    /**
     * \if ENGLISH_LANG
     * the max delay of dat and night switching
     * \else
     * 日夜模式切换延时最大值
     * \endif
     */
    public int							nDelayRangeMax;
}
