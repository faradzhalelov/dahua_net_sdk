package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Day and Night Algorithm Switching Mode
 * \else
 * 昼夜算法切换模式
 * \endif
 */
public class CFG_TIMEPERIOD_SWITCH_MODE implements Serializable{
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
	public static final int CFG_TIMEPERIOD_SWITCH_MODE_UNKNOWN		= 0;           
	
	/**
	 * \if ENGLISH_LANG
	 * By Color Switch 
	 * \else
	 * 通过色彩切换 
	 * \endif
	 */
	public static final int CFG_TIMEPERIOD_SWITCH_MODE_BYCOLOR		= 1;               
	
	/**
	 * \if ENGLISH_LANG
	 * By Brightness Switch
	 * \else
	 * 通过亮度切换
	 * \endif
	 */
	public static final int CFG_TIMEPERIOD_SWITCH_MODE_BYBRIGHTNESS = 2;            
	
	/**
	 * \if ENGLISH_LANG
	 * By Pos Switch
	 * \else
	 * 通过经纬度计算日出日落时间切换
	 * \endif
	 */
	public static final int CFG_TIMEPERIOD_SWITCH_MODE_BYPOS		= 3;			
}
