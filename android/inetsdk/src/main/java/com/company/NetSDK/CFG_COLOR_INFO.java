package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Picture Color Info
 * \else
 * 画面颜色属性
 * \endif
 */
public class CFG_COLOR_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Brightness,0-100 
	 * \else
	 * 亮度(0-100)
	 * \endif
	 */
	public int					nBrightness;				

	/**
	 * \if ENGLISH_LANG
	 * Contrast,0-100 
	 * \else
	 * 对比度(0-100)
	 * \endif
	 */
	public int					nContrast;					

	/**
	 * \if ENGLISH_LANG
	 * Saturation,0-100 
	 * \else
	 * 饱和度(0-100)
	 * \endif
	 */
	public int					nSaturation;				

	/**
	 * \if ENGLISH_LANG
	 * Hue,0-100 
	 * \else
	 * 色度(0-100)
	 * \endif
	 */
	public int					nHue;						

	/**
	 * \if ENGLISH_LANG
	 * Gain,0-100 
	 * \else
	 * 增益(0-100)
	 * \endif
	 */
	public int					nGain;						

	/**
	 * \if ENGLISH_LANG
	 * Gain Enable 
	 * \else
	 * 增益使能
	 * \endif
	 */
	public boolean				bGainEn;					
}
