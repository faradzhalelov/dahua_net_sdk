package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output param, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_LIGHTINGCONTROL_CAPS}
 * \else
 * 出参, 对应接口 {@link INetSDK#GetDevCaps},对应命令 {@link FinalVar#NET_LIGHTINGCONTROL_CAPS}
 * \endif
 */
public class NET_OUT_LIGHTINGCONTROL_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Is supported light control
     * \else
     * 是否支持灯光控制
     * \endif
     */
    public boolean								bSupport;

    /**
     * \if ENGLISH_LANG
     * supported light config version,refer to EM_LC_CONFIG_VERSION
     * \else
     * 支持的灯光配置版本,对应 EM_LC_CONFIG_VERSION
     * \endif
     */
    public int								emConfigVersion;

    /**
     * \if ENGLISH_LANG
     * 云台联动灯光信息
     * \else
     * 云台联动灯光信息
     * \endif
     */
    public NET_LINKING_DETAIL				stuLinkingDetail = new NET_LINKING_DETAIL();

    /**
     * \if ENGLISH_LANG
     * light type,refer to{@link EM_LC_LIGHT_TYPE}
     * \else
     * 灯光类型,对应 {@link EM_LC_LIGHT_TYPE}
     * \endif
     */
    public int								emLightType;


    /**
     * \if ENGLISH_LANG
     * complex light type,refer to{@link EM_LC_LIGHT_TYPE}
     * \else
     * 复合灯光类型,对应 {@link EM_LC_LIGHT_TYPE}
     * \endif
     */
    public int[]								anLightTypeComplex = new int[FinalVar.LC_LIGHT_TYPE_NUM];

    /**
     * \if ENGLISH_LANG
     * number of complex light type
     * \else
     * 复合灯光类型数量
     * \endif
     */
    public int								nLightTypeComplexLen;

    /**
     * \if ENGLISH_LANG
     * default mode,refer to{@link EM_LC_MODE}
     * \else
     * 默认支持的模式，参考{@link EM_LC_MODE}
     * \endif
     */
    public int								emDefaultMode;

    /**
     * \if ENGLISH_LANG
     * supported mode type,refer to{@link EM_LC_MODE}
     * \else
     * 支持的模式类型，参考{@link EM_LC_MODE}
     * \endif
     */
    public int[]								anModes = new int[FinalVar.LC_LIGHT_MODE_NUM];

    /**
     * \if ENGLISH_LANG
     * supported mode number
     * \else
     * 支持的模式数量
     * \endif
     */
    public int								nModesLen;
    /**
     * \if ENGLISH_LANG
     * complex light's information
     * \else
     * 复合灯模式信息
     * \endif
     */
    public NET_MODES_COMPLEX_LIGHT			stuModesComplex = new NET_MODES_COMPLEX_LIGHT();

    /**
     * \if ENGLISH_LANG
     * Does the composite lamp mode information support
     * \else
     * 是否支持复合灯模式信息
     * \endif
     */
    public boolean								bSupportModesComplex;

    /**
     * \if ENGLISH_LANG
     * AntiFillLightOverExposure
     * \else
     * 防补光过曝
     * \endif
     */
    public NET_ANTIFILLLIGHTOVEREXPOSURE					stuAntiFillLightOverExposure = new NET_ANTIFILLLIGHTOVEREXPOSURE();

    /**
     * \if ENGLISH_LANG
     * Brightness Upper Limit
     * \else
     * 亮度上限调节
     * \endif
     */
    public NET_BRIGHTNESSUPPERLIMIT					stuBrightnessUpperLimit = new NET_BRIGHTNESSUPPERLIMIT();
}
