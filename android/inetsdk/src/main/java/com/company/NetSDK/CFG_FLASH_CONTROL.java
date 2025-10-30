package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Flashlight control
 * \else
 * 闪光灯配置
 * \endif
 */
public class CFG_FLASH_CONTROL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Working mode, 0-flash prohibited, 1- always flash, 2- automatic flash
	 * \else
	 * 工作模式，0-禁止闪光，1-始终闪光，2-自动闪光
	 * \endif
	 */
	public byte				byMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Working value,0-0us, 1-64us, 2-128us, 3-192...15-960us 
	 * \else
	 * 工作值, 0-0us, 1-64us, 2-128us, 3-192...15-960us
	 * \endif
	 */
	public byte				byValue;
	
	/**
	 * \if ENGLISH_LANG
	 * Trigger mode, 0-low level, 1- high level, 2- upper edge 3- lower edge
	 * \else
	 * 触发模式, 0-低电平 1-高电平 2-上升沿 3-下降沿
	 * \endif
	 */
	public byte				byPole;
	
	/**
	 * \if ENGLISH_LANG
	 * Brightness pre-set value range (0~100)
	 * \else
	 * 亮度预设值  区间0~100
	 * \endif
	 */
	public byte                byPreValue;
	
	/**
	 * \if ENGLISH_LANG
	 * Duty ratio, 0~100  
	 * \else
	 * 占空比, 0~100
	 * \endif
	 */
	public byte				byDutyCycle;
	
	/**
	 * \if ENGLISH_LANG
	 * Frenquency multiple, 0~10 
	 * \else
	 * 倍频, 0~10
	 * \endif
	 */
	public byte				byFreqMultiple;
}
