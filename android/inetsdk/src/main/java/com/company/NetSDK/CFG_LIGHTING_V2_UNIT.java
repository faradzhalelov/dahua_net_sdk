package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Information of light's config
 * \else
 * 补光灯灵敏度配置信息单元
 * \endif
 */
public class CFG_LIGHTING_V2_UNIT implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;




    /**
     * \if ENGLISH_LANG
     * Light type,refer to {@link EM_CFG_LC_LIGHT_TYPE}
     * \else
     * 灯光类型，对应{@link EM_CFG_LC_LIGHT_TYPE}
     * \endif
     */
    public int      emLightType;

    /**
     * \if ENGLISH_LANG
     * Light mode,refer to {@link EM_CFG_LC_MODE}
     * \else
     * 灯光模式,对应 {@link EM_CFG_LC_MODE}
     * \endif
     */
    public int      emMode;
    /**
     * \if ENGLISH_LANG
     * Correction
     * \else
     * Correction
     * \endif
     */
    public int      nCorrection;
    /**
     * \if ENGLISH_LANG
     * Sensitive
     * \else
     * Sensitive
     * \endif
     */
    public int      nSensitive;
    /**
     * \if ENGLISH_LANG
     * Switch delay
     * \else
     * Switch delay
     * \endif
     */
    public int      nLightSwitchDelay;

    /**
     * \if ENGLISH_LANG
     * near light info
     * \else
     * 近光灯组信息
     * \endif
     */
    public NET_LIGHT_INFO[]      anNearLight = new NET_LIGHT_INFO[FinalVar.CFG_LC_LIGHT_COUNT];

    /**
     * \if ENGLISH_LANG
     * Number of near light
     * \else
     * 近光灯组信息个数
     * \endif
     */
    public int         nNearLightLen;

    /**
     * \if ENGLISH_LANG
     * mid light info
     * \else
     * 中光灯组信息
     * \endif
     */
    public NET_LIGHT_INFO[]      anMiddleLight = new NET_LIGHT_INFO[FinalVar.CFG_LC_LIGHT_COUNT];

    /**
     * \if ENGLISH_LANG
     * Number of mid light
     * \else
     * 中光灯组信息个数
     * \endif
     */
    public int         nMiddleLightLen;

    /**
     * \if ENGLISH_LANG
     * far light info
     * \else
     * 远光灯组信息
     * \endif
     */
    public NET_LIGHT_INFO[]      anFarLight = new NET_LIGHT_INFO[FinalVar.CFG_LC_LIGHT_COUNT];

    /**
     * \if ENGLISH_LANG
     * Number of far light
     * \else
     * 远光灯组信息个数
     * \endif
     */
    public int         nFarLightLen;

    /**
     * \if ENGLISH_LANG
     * The percentage of the upper limit brightness of the current white light relative to the maximum brightness of the white light is 0~100
     * \else
     * 当前白光灯上限亮度相对于白光灯最大亮度的百分比0~100
     * \endif
     */
    public int         nPercentOfMaxBrightness;

    /**
     * \if ENGLISH_LANG
     * It takes effect under the intelligent fill light scheme, which indicates the infrared white light switching delay to prevent the back and forth switching from affecting the life and experience. The unit second range is 0-300, and the default is 30s
     * \else
     * 智能补光方案下生效，表示红外白光切换延时，防止来回切换影响寿命和体验单位秒 范围0-300 默认30s
     * \endif
     */
    public int         nAIMixLightSwitchDelay;

    public CFG_LIGHTING_V2_UNIT()
    {
        for(int i = 0; i < FinalVar.CFG_LC_LIGHT_COUNT; i++)
        {
            anNearLight[i] = new NET_LIGHT_INFO();
            anMiddleLight[i] = new NET_LIGHT_INFO();
            anFarLight[i] = new NET_LIGHT_INFO();
        }
    }
}
