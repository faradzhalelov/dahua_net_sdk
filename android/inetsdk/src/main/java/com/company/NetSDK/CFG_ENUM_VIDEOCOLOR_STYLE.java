package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * videocolor style
 * \else
 * 色彩风格
 * \endif
 */

public class CFG_ENUM_VIDEOCOLOR_STYLE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * unknow
	 * \else
	 * 未知
	 * \endif
	 */
    public static final int CFG_ENUM_VIDEOCOLOR_STYLE_UNKNOWN = 0;               
    
	/**
	 * \if ENGLISH_LANG
	 * gentle
	 * \else
	 * 柔和
	 * \endif
	 */
    public static final int CFG_ENUM_VIDEOCOLOR_STYLE_GENTLE = 1;                 
    
	/**
	 * \if ENGLISH_LANG
	 *standard
	 * \else
	 * 标准
	 * \endif
	 */
    public static final int CFG_ENUM_VIDEOCOLOR_STYLE_STANDARD = 2;               
    
	/**
	 * \if ENGLISH_LANG
	 * flamboyant
	 * \else
	 * 艳丽
	 * \endif
	 */
    public static final int CFG_ENUM_VIDEOCOLOR_STYLE_FLAMBOYANT = 3;             
}
