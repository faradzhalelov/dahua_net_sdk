package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * temperature unit
 * \else
 * 温度单位
 * \endif
 */
public class CFG_TEMPERATURE_UNIT implements Serializable {

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
	public final static int TEMPERATURE_UNIT_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Celsius
	 * \else
	 * 摄氏度
	 * \endif
	 */
	public final static int TEMPERATURE_UNIT_CENTIGRADE = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * Fahrenheit
	 * \else
	 * 华氏度
	 * \endif
	 */
	public final static int TEMPERATURE_UNIT_FAHRENHEIT = 2; 
}
