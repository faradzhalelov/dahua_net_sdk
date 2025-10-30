package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * back mode
 * \else
 * 背光模式
 * \endif
 */
public class NET_EM_BACK_MODE implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * unknow
	 * \else
	 * 未知模式
	 * \endif
	 */
	public static final int NET_EM_BACKLIGHT_MODE_UNKNOW = 0;					
	
	/**
	 * \if ENGLISH_LANG
	 * off
	 * \else
	 * 关闭
	 * \endif
	 */
	public static final int NET_EM_BACKLIGHT_MODE_OFF = 1;						
	
	/**
	 * \if ENGLISH_LANG
	 * back light
	 * \else
	 * 背光补偿
	 * \endif
	 */
	public static final int NET_EM_BACKLIGHT_MODE_BACKLIGHT = 2;				
	
	/**
	 * \if ENGLISH_LANG
	 * widedynamic
	 * \else
	 * 宽动态
	 * \endif
	 */
	public static final int NET_EM_BACKLIGHT_MODE_WIDEDYNAMIC = 3;				
	
	/**
	 * \if ENGLISH_LANG
	 * glareinhibition
	 * \else
	 * 强光抑制
	 * \endif
	 */
	public static final int NET_EM_BACKLIGHT_MODE_GLAREINHIBITION = 4;			
	
	/**
	 * \if ENGLISH_LANG
	 * SSA
	 * \else
	 * 场景自适应
	 * \endif
	 */
	public static final int NET_EM_BACKLIGHT_MODE_SSA = 5;					
}
