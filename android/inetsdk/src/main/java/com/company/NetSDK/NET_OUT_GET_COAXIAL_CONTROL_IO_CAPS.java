package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output param, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_COAXIAL_CONTROL_IO_CAPS}
 * \else
 * 出参, 对应接口 {@link INetSDK#GetDevCaps},对应命令 {@link FinalVar#NET_COAXIAL_CONTROL_IO_CAPS}
 * \endif
 */
public class NET_OUT_GET_COAXIAL_CONTROL_IO_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  whether support control light
     * \else
     *  是否支持白光灯
     * \endif
     */
    public boolean					bSupportControlLight;

    /**
     * \if ENGLISH_LANG
     *  whether support control specker audio
     * \else
     *  是否支持speaker音频外放
     * \endif
     */
    public boolean					bSupportControlSpeaker;

    /**
     * \if ENGLISH_LANG
     *  Does it support full-color white light
     * \else
     *  是否支持全彩白光灯
     * \endif
     */
    public boolean					bSupportControlFullcolorLight;

    /**
     * \if ENGLISH_LANG
     *  Does it support super fill lighting
     * \else
     *  是否支持超级补光
     * \endif
     */
    public boolean					bSupportControlSuperLight;

    /**
     * \if ENGLISH_LANG
     *  Whether intelligent dual light full-color white light is supported
     * \else
     *  是否支持智能双光全彩白光灯
     * \endif
     */
    public boolean					bSupportControlIntelliLight;

    /**
     * \if ENGLISH_LANG
     *  Whether intelligent audio warning is supported
     * \else
     *  是否支持智能音频警戒
     * \endif
     */
    public boolean					bSupportControlIntelliSpeaker;

    /**
     * \if ENGLISH_LANG
     *  Does it support Cayenne white and blue lights
     * \else
     *  是否支持卡宴白蓝灯
     * \endif
     */
    public boolean					bSupportControlWhiteBlueLight;
}
