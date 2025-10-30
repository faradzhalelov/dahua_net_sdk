package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * the color config of video input
 * \else
 * 视频输入颜色配置
 * \endif
 */
public class NET_VIDEOIN_COLOR_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  config type, you need set the value wether set or get config
     * \else
     *  配置类型，获取和设置时都要指定
     * \endif
     */
    public int					emCfgType;

    /**
     * \if ENGLISH_LANG
     *  Brightness 0-100
     * \else
     *  亮度0-100
     * \endif
     */
    public int					nBrightness;

    /**
     * \if ENGLISH_LANG
     *  nContrast 0-100
     * \else
     *  对比度0-100
     * \endif
     */
    public int					nContrast;

    /**
     * \if ENGLISH_LANG
     *  Saturation 0-100
     * \else
     *  饱和度0-100
     * \endif
     */
    public int					nSaturation;

    /**
     * \if ENGLISH_LANG
     *  Gamma 0-100
     * \else
     *  伽马值0-100
     * \endif
     */
    public int					nGamma;

    /**
     * \if ENGLISH_LANG
     *  color style
     * \else
     *  色彩风格, {@link EM_COLOR_STYLE_TYPE}
     * \endif
     */
    public int					emColorStyle;

    /**
     * \if ENGLISH_LANG
     *  Tone value 0-100
     * \else
     *  色调值0-100
     * \endif
     */
    public int					nHue;

    /**
     * \if ENGLISH_LANG
     *  Colour Suppression Level Value 0-100
     * \else
     *  色彩抑制等级值0-100
     * \endif
     */
    public int					nChromaSuppress;

    /**
     * \if ENGLISH_LANG
     *  Time section
     * \else
     *  对应的时间段
     * \endif
     */
    public SDK_TSECT stuTimeSection = new SDK_TSECT();

}
