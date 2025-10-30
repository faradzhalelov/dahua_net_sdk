package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output paramer, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_VIDEOIN_BACKLIGHT_CAPS}
 * \else
 * 出参, 对应接口 {@link INetSDK#GetDevCaps}, 对应命令{@link FinalVar#NET_VIDEOIN_BACKLIGHT_CAPS}
 * \endif
 */
public class NET_OUT_VIDEOIN_BACKLIGHT_CAPS implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * support setting bcaklight or not
     * \else
     * 是否支持背光设置能力
     * \endif
     */
    public boolean						bSupport;

    /**
     * \if ENGLISH_LANG
     * the actual count of black mode
     * \else
     * 背光模式实际支持数量
     * \endif
     */
    public int							nBackModeCount;

    /**
     * \if ENGLISH_LANG
     * the list of black mode,refer to {@link NET_EM_BACK_MODE}
     * \else
     * 支持的背光模式,参考{@link NET_EM_BACK_MODE}
     * \endif
     */
    public int			emBackMode[] = new int[FinalVar.MAX_MODE_COUNT];

    /**
     * \if ENGLISH_LANG
     * the actual count of black light mode
     * \else
     * 背光补偿模式实际支持数
     * \endif
     */
    public int							nBackLightModeCount;

    /**
     * \if ENGLISH_LANG
     * the list of black light mode,refer to {@link NET_EM_BLACKLIGHT_MODE}
     * \else
     * 支持的背光补偿模式,参考{@link NET_EM_BLACKLIGHT_MODE}
     * \endif
     */
    public int		emBackLightMode[] = new int[FinalVar.MAX_MODE_COUNT];

    /**
     * \if ENGLISH_LANG
     * support wide dynamic range or not
     * \else
     * 是否支持宽动态
     * \endif
     */
    public int							nWideDynamicRange;

    /**
     * \if ENGLISH_LANG
     * the count of SSA modes
     * \else
     * 场景自适应对比度强度调节支持的模式数量
     * \endif
     */
    public int							nSSAIntensity;

    /**
     * \if ENGLISH_LANG
     * the list of SSA modes,refer to {@link NET_EM_BACK_INTENSITY_MODE}
     * \else
     * 场景自适应对比度强度调节支持的模式,参考{@link NET_EM_BACK_INTENSITY_MODE}
     * \endif
     */
    public int	emIntensityMode[] = new int[FinalVar.MAX_MODE_COUNT];

    /**
     * \if ENGLISH_LANG
     * the list of glareInhibition modes,refer to {@link NET_EM_GLAREINHIBITION_MODE}
     * \else
     * 支持强光抑制模式的参数设置方式,参考{@link NET_EM_GLAREINHIBITION_MODE}
     * \endif
     */
    public int	emGlareInhibition[] = new int[FinalVar.MAX_MODE_COUNT];

    /**
     * \if ENGLISH_LANG
     * Number of strong light suppression modes supported{code}
     * \else
     * 支持的强光抑制模式个数
     * \endif
     */
    public int                        nGlareInhibition;

}
