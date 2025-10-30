package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Picture Color Attribute
 * \else
 * 画面颜色属性
 * \endif
 */
public class SDK_COLOR_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Scehdule
	 * \else
	 * 时间表
	 * \endif
	 */
	public SDK_TSECT			stSect = new SDK_TSECT();

	/**
	 * \if ENGLISH_LANG
	 * Brightness; 0-100 
	 * \else
	 * 亮度；0-100
	 * \endif
	 */
	public byte				byBrightness;			

	/**
	 * \if ENGLISH_LANG
	 * Contrast; 0-100 
	 * \else
	 * 对比度；0-100
	 * \endif
	 */
	public byte				byContrast;				

	/**
	 * \if ENGLISH_LANG
	 * Saturation; 0-100 
	 * \else
	 * 饱和度；0-100
	 * \endif
	 */
	public byte				bySaturation;			

	/**
	 * \if ENGLISH_LANG
	 * Hue 
	 * \else
	 * 色度；0-100
	 * \endif
	 */
	public byte				byHue;					

	/**
	 * \if ENGLISH_LANG
	 * gain 
	 * \else
	 * 增益使能
	 * \endif
	 */
	public byte				byGainEn;				

	/**
	 * \if ENGLISH_LANG
	 * gain:0-100 
	 * \else
	 * 增益；0-100
	 * \endif
	 */
	public byte				byGain;					

	/**
	 * \if ENGLISH_LANG
	 * value 0-100 
	 * \else
	 * 伽马值 0-100
	 * \endif
	 */
	public byte				byGamma;                
}
