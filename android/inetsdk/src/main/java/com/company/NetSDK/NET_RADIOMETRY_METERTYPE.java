package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* ARGtemp_meas mode type
* \else
* 测温模式的类型
* \endif
*/
public class NET_RADIOMETRY_METERTYPE implements Serializable{

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
	public static final int NET_RADIOMETRY_METERTYPE_UNKNOWN = 0;
	
	 /**
	 * \if ENGLISH_LANG
	 * spot
	 * \else
	 * 点
	 * \endif
	 */
	public static final int NET_RADIOMETRY_METERTYPE_SPOT = 1;                     
	
	 /**
	 * \if ENGLISH_LANG
	 * line
	 * \else
	 * 线
	 * \endif
	 */
	public static final int NET_RADIOMETRY_METERTYPE_LINE = 2;                     
	
	 /**
	 * \if ENGLISH_LANG
	 * area
	 * \else
	 * 区域
	 * \endif
	 */
	public static final int NET_RADIOMETRY_METERTYPE_AREA = 3;                      
}
