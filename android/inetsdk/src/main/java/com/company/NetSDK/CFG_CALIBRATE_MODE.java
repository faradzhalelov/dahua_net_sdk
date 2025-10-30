package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * fish eye mode
 * \else
 * 鱼眼矫正模式
 * \endif
 */
public class CFG_CALIBRATE_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * unknown mode 
	 * \else
	 * 未知模式 
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_UNKOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * original image mode
	 * \else
	 * 原始图像模式
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_ORIGIAL = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * config mode
	 * \else
	 * 配置模式
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_CONFIG = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * panorama mode
	 * \else
	 * 全景模式
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_PANORAMA = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * dual panorama mode
	 * \else
	 * 双全景模式
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_DOUBLEPANORAMA = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * 1+3 mode￡¨one original fish eyeimage plus 3 EPtz images￡?
	 * \else
	 * 1+3模式（一个原始鱼眼图像加3个EPtz图像）
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_ORIGIALPLUSTHREEEPTZREGION = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * single image EPtz mode￡¨only one EPtz image￡?
	 * \else
	 * 单画面EPtz模式（只有一个EPtz画面）
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_SINGLE = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * 4 image mode￡¨4 EPtz control images￡?
	 * \else
	 * 4画面模式（4个EPtz控制画面）
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_FOUREPTZREGION = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * normal mode
	 * \else
	 * 普通模式
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_NORMAL = 8;
}
