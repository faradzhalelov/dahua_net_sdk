package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * thermal imaging config, single mode config
 * \else
 * 热成像配置，单个模式的配置
 * \endif
 */

public class CFG_THERMOGRAPHY_OPTION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * zoom
     * \else
     * 倍数
     * \endif
     */
    public int                         nEZoom;

    /**
     * \if ENGLISH_LANG
     * gamma value
     * \else
     * 伽马值
     * \endif
     */
    public int                         nThermographyGamma;

    /**
     * \if ENGLISH_LANG
     * pseudo-color, see NET_THERMO_COLORIZATION
     * \else
     * 伪彩色，见 NET_THERMO_COLORIZATION
     * \endif
     */
    public int                         nColorization;

    /**
     * \if ENGLISH_LANG
     * intelligent scene optimization indicator 0~100, detailed range depending on capacity
     * \else
     * 智能场景优化指数 0 ~100， 具体取值范围由能力决定
     * \endif
     */
    public int                         nSmartOptimizer;

    /**
     * \if ENGLISH_LANG
     * whether enable ROI, only ROI info will be included in statistics for AGC
     * \else
     * 是否开启感兴趣区域，只有感兴趣区域内的信息会被纳入统计用来做自动亮度调整（AGC）
     * \endif
     */
    public boolean                        bOptimizedRegion;

    /**
     * \if ENGLISH_LANG
     * ROI type, see NET_THERMO_ROI
     * \else
     * 感兴趣区域类型，见 NET_THERMO_ROI
     * \endif
     */
    public int                         nOptimizedROIType;

    /**
     * \if ENGLISH_LANG
     * region number
     * \else
     * 自定义区域个数
     * \endif
     */
    public int                         nCustomRegion;

    /**
     * \if ENGLISH_LANG
     * region, only valid when nOptimizedROIType is NET_THERMO_ROI_CUSTOM
     * \else
     * 自定义区域，仅在 nOptimizedROIType 为 NET_THERMO_ROI_CUSTOM 时有效
     * \endif
     */
    public CFG_RECT                    stCustomRegions[] = new CFG_RECT[64];

    /**
     * \if ENGLISH_LANG
     * Gain config on microtherm
     * \else
     * 温度异常下的增益设置
     * \endif
     */
    public CFG_THERMO_GAIN             stuLowTempGain = new CFG_THERMO_GAIN();

    /**
     * \if ENGLISH_LANG
     * gain mode, see CFG_THERMO_GAIN_MODE
     * \else
     * 增益模式，参见 CFG_THERMO_GAIN_MODE
     * \endif
     */
    public int                         nGainMode;

    /**
     * \if ENGLISH_LANG
     * auto gain setup, only valid when gain mode is CFG_THERMO_GAIN_MODE_AUTO
     * \else
     * 自动增益设置，只在增益模式为 CFG_THERMO_GAIN_MODE_AUTO 有效
     * \endif
     */
    public CFG_THERMO_AUTO_GAIN        stAutoGain = new CFG_THERMO_AUTO_GAIN();

    /**
     * \if ENGLISH_LANG
     * Gain config on high therm
     * \else
     * 温度异常下的增益设置
     * \endif
     */
    public CFG_THERMO_GAIN             stuHighTempGain = new CFG_THERMO_GAIN();

    /**
     * \if ENGLISH_LANG
     * Base brightness
     * \else
     * 基准亮度
     * \endif
     */
    public int                         nBaseBrightness;

    /**
     * \if ENGLISH_LANG
     * Stretch intensity
     * \else
     * 拉伸强度
     * \endif
     */
    public int                         nStretchIntensity;

    /**
     * \if ENGLISH_LANG
     * The area which will increase the contrast in this area,0~8192
     * \else
     * 区域增强位置,增加本区域与周边的对比度,8192坐标系
     * \endif
     */
    public CFG_RECT                    stuContrastRect = new CFG_RECT();

    public CFG_THERMOGRAPHY_OPTION(){
        for(int i = 0; i < 64; ++i){
            stCustomRegions[i] = new CFG_RECT();
        }
    }
}
