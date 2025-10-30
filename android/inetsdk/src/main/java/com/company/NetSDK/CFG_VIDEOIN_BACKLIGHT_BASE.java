package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the basic configuration information of video in backlight
 * \else
 * 环境光线配置信息
 * \endif
 */
public class CFG_VIDEOIN_BACKLIGHT_BASE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * the mode of video in backlight, refer to {@link EM_VIDEOIN_BACKLIGHT_MODE}
     * \else
     * 背光模式, 参考 {@link EM_VIDEOIN_BACKLIGHT_MODE}
     * \endif
     */
    public int		         emMode;

    /**
     * \if ENGLISH_LANG
     * the mode of back light, only valid when the VideoInBacklight mode is back light
     * \else
     * 背光补偿模式, 参考 {@link EM_BACKLIGHT_MODE}，当 emMode == {@link EM_VIDEOIN_BACKLIGHT_MODE#EM_BACKLIGHT_BACKLIGHT}时有效
     * \endif
     */
    public int				 emBacklightMode;

    /**
     * \if ENGLISH_LANG
     * back light region, only valid when emBacklightMode == {@link EM_BACKLIGHT_MODE#EM_BACKLIGHT_REGION}
     * \else
     * 背光补偿区域，当 emBacklightMode == {@link EM_BACKLIGHT_MODE#EM_BACKLIGHT_REGION}时有效
     * \endif
     */
    public CFG_RECT		 stuBacklightRegion = new CFG_RECT();

    /**
     * \if ENGLISH_LANG
     * WideDynamic Range value, only valid when emMode == {@link EM_VIDEOIN_BACKLIGHT_MODE#EM_BACKLIGHT_WIDEDYNAMIC}
     * \else
     * 宽动态值，emMode == {@link EM_VIDEOIN_BACKLIGHT_MODE#EM_BACKLIGHT_WIDEDYNAMIC}时有效
     * \endif
     */
    public int				 nWideDynamicRange;

    /**
     * \if ENGLISH_LANG
     * GlareInhibition, only valid when emMode == {@link EM_VIDEOIN_BACKLIGHT_MODE#EM_BACKLIGHT_GLAREINHIBITION}
     * \else
     * 强光抑制，emMode == {@link EM_VIDEOIN_BACKLIGHT_MODE#EM_BACKLIGHT_GLAREINHIBITION}时有效
     * \endif
     */
    public int				 nGlareInhibition;

    /**
     * \if ENGLISH_LANG
     * Initensity Mode, only valid when emMode == {@link EM_VIDEOIN_BACKLIGHT_MODE#EM_BACKLIGHT_SSA}
     * \else
     * SSA对比度调节模式, 参考 {@link EM_INTENSITY_MODE}，emMode == {@link EM_VIDEOIN_BACKLIGHT_MODE#EM_BACKLIGHT_SSA} 时有效
     * \endif
     */
    public int				 emInitensityMode;

    /**
     * \if ENGLISH_LANG
     * Intensity value , only valid when emInitensityMode ==  {@link EM_INTENSITY_MODE#EM_INTENSITY_MANUAL}
     * \else
     * SSA手动调整强度值，emInitensityMode == {@link EM_INTENSITY_MODE#EM_INTENSITY_MANUAL} 时有效
     * \endif
     */
    public int				 nIntensity;
}
