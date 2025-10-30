package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video input color config. Each input video has several corresponding color setups. 
 * \else
 * 视频输入颜色配置, 每个视频输入通道对应多个颜色配置
 * \endif
 */
public class AV_CFG_VideoColor implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Period
	 * \else
	 * 时间段
	 * \endif
	 */
	public AV_CFG_TimeSection	stuTimeSection = new AV_CFG_TimeSection();
	
	/**
	 * \if ENGLISH_LANG
	 * Brightness, 1~100
	 * \else
	 * 亮度, 0~100
	 * \endif
	 */
	public int			nBrightness;
	
	/**
	 * \if ENGLISH_LANG
	 * Contrastness, 1~100
	 * \else
	 * 对比度, 0~100
	 * \endif
	 */
	public int			nContrast;
	
	/**
	 * \if ENGLISH_LANG
	 * Saturation, 1~100
	 * \else
	 * 饱和度, 0~100
	 * \endif
	 */
	public int			nSaturation;
	
	/**
	 * \if ENGLISH_LANG
	 * Hue, 1~100
	 * \else
	 * 色调, 0~100
	 * \endif
	 */
	public int			nHue;
	
	/**
	 * \if ENGLISH_LANG
	 * plus, 0~100
	 * \else
	 * 增益, 0~100
	 * \endif
	 */
	public int			nGamma;
	
	/**
	 * \if ENGLISH_LANG
	 * constrain grade 0~100
	 * \else
	 * 色彩抑制等级 0~100
	 * \endif
	 */
    public int          nChromaSuppress;    
    
	/**
	 * \if ENGLISH_LANG
	 * color style, refer to {@link CFG_ENUM_VIDEOCOLOR_STYLE}
	 * \else
	 * 色彩风格, 取值参考 {@link CFG_ENUM_VIDEOCOLOR_STYLE}
	 * \endif
	 */
    public int          emColorStyle;             
}
