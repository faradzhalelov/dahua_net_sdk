package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Supports maximum brightness adjustment
 * \else
 * @brief 亮度上限调节
 * \endif
 */
public class NET_BRIGHTNESSUPPERLIMIT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Supports maximum brightness adjustment
     * \else
     *  是否支持亮度上限调节
     * \endif
     */
    public boolean					bSupport;

    /**
     * \if ENGLISH_LANG
     * 	Which lights support maximum brightness adjustment  {@link EM_LC_LIGHT_TYPE}
     * \else
     * 	哪些灯光支持亮度上限调节  {@link EM_LC_LIGHT_TYPE}
     * \endif
     */
    public int					emLightType[] = new int[10];

    /**
     * \if ENGLISH_LANG
     *  The modes supported by white light lamps  {@link EM_LC_BRIGHTNESSUPPERLIMIT_MODE}
     * \else
     *  白光灯支持的模式  {@link EM_LC_BRIGHTNESSUPPERLIMIT_MODE}
     * \endif
     */
    public int					emWhiteLight[] = new int[10];

    /**
     * \if ENGLISH_LANG
     *  The modes supported by infrared lights  {@link EM_LC_BRIGHTNESSUPPERLIMIT_MODE}
     * \else
     *  红外灯支持的模式  {@link EM_LC_BRIGHTNESSUPPERLIMIT_MODE}
     * \endif
     */
    public int					emInfraredLight[] = new int[10];

    /**
     * \if ENGLISH_LANG
     *  The modes supported by laser lights   {@link EM_LC_BRIGHTNESSUPPERLIMIT_MODE}
     * \else
     *  激光灯支持的模式  {@link EM_LC_BRIGHTNESSUPPERLIMIT_MODE}
     * \endif
     */
    public int					emLaserLight[] = new int[10];

}