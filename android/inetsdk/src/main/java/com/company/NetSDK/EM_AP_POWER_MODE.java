package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * power mode
 * \else
 * 功率模式
 * \endif
 */
public class EM_AP_POWER_MODE implements Serializable{
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
	public static final int EM_AP_POWER_MODE_UNKNOWN = 0;                           
	
	/**
	 * \if ENGLISH_LANG
	 * Low
	 * \else
	 * Low
	 * \endif
	 */
	public static final int EM_AP_POWER_MODE_LOW = 1;                                 
	
	/**
	 * \if ENGLISH_LANG
	 * Middle
	 * \else
	 * Middle
	 * \endif
	 */
	public static final int EM_AP_POWER_MODE_MIDDLE = 2;                              
	
	/**
	 * \if ENGLISH_LANG
	 * High
	 * \else
	 * High
	 * \endif
	 */
	public static final int EM_AP_POWER_MODE_HIGH = 3;                               
}
