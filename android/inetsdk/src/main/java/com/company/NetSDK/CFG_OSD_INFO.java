package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * OSD info
 * \else
 * OSD信息
 * \endif
 */
public class CFG_OSD_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Dsiplay Ability 
	 * \else
	 * 能力
	 * \endif
	 */
	public boolean				abShowEnable;

	/**
	 * \if ENGLISH_LANG
	 * Foreground Color 
	 * \else
	 * 前景颜色
	 * \endif
	 */
	public CFG_RGBA				stuFrontColor = new CFG_RGBA();				

	/**
	 * \if ENGLISH_LANG
	 * Background Color 
	 * \else
	 * 背景颜色
	 * \endif
	 */
	public CFG_RGBA				stuBackColor = new CFG_RGBA();				

	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 矩形区域
	 * \endif
	 */
	public CFG_RECT				stuRect = new CFG_RECT();					

	/**
	 * \if ENGLISH_LANG
	 * Rectangle Area 
	 * \else
	 * 显示使能
	 * \endif
	 */
	public boolean				bShowEnable;				
}
