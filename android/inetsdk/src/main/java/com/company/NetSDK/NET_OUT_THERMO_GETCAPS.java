package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * output paramer, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_THERMO_GRAPHY_CAPS}
 * \else
 * 出参, 对应接口 {@link INetSDK#GetDevCaps},对应命令 {@link FinalVar#NET_THERMO_GRAPHY_CAPS}
 * \endif
 */
public class NET_OUT_THERMO_GETCAPS implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * supported preset mode mask
     * \else
     * 支持的预置模式掩码
     * \endif
     */
    public int   dwModes;

    /**
     * \if ENGLISH_LANG
     * preset colorization mode mask, Bitwise representation
     * \else
     * 预置着色模式掩码  颜色依次如下,按位表示
     *	//	""White Hot"
     *	//	""Black Hot"
     *	//	""Fusion"
     *	//	"Rainbow"
     * 	//	"Globow"
     * 	//	"Ironbow1"
     * 	//	"Ironbow2"
     * 	//	"Sepia"
     * 	//	"Color1"
     * 	//	"Color2"
     * 	//	"Icefire"
     * 	//	"Rain"
     * 	//	"Red Hot"
     * 	//	"Green Hot"
     * 	//	"Spring"
     * 	//	"Summer"
     * 	//	"Winter"
     * 	//	"Autumn"
     * 	//	"Alarm"
     * \endif
     */
    public int   dwColorization;

    /**
     * \if ENGLISH_LANG
     * preset ROI mode mask
     * \else
     * 预置感兴趣区域模式掩码
     * \endif
     */
    public int   dwROIModes;

    /**
     * \if ENGLISH_LANG
     * brightness ability
     * \else
     * 亮度相关能力
     * \endif
     */
    public RANGE  stBrightness = new RANGE();

    /**
     * \if ENGLISH_LANG
     * sharpness ability
     * \else
     * 锐度相关能力
     * \endif
     */
    public RANGE  stSharpness = new RANGE();

    /**
     * \if ENGLISH_LANG
     * zoom ability
     * \else
     * 倍数相关能力
     * \endif
     */
    public RANGE  stEZoom = new RANGE();

    /**
     * \if ENGLISH_LANG
     * Gamma ability
     * \else
     * 伽马相关能力
     * \endif
     */
    public RANGE  stThermographyGamma = new RANGE();

    /**
     * \if ENGLISH_LANG
     * optimize parameter ability
     * \else
     * 优化参数相关能力
     * \endif
     */
    public RANGE  stSmartOptimizer = new RANGE();

    /**
     * \if ENGLISH_LANG
     * flat field correction ability
     * \else
     * 平场聚焦校准相关能力
     * \endif
     */
    public NET_FFCPERIOD_RANGE  stFFCPeriod = new NET_FFCPERIOD_RANGE();

}
