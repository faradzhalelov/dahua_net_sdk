package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* thermal ARGtemp_meas spot alarm condition
* \else
* 热成像测温点报警条件
* \endif
*/
public class NET_RADIOMETRY_ALARMCONTION implements Serializable {

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
	public final static int NET_RADIOMETRY_ALARMCONTION_UNKNOWN = 0;
	
	 /**
	 * \if ENGLISH_LANG
	 * below
	 * \else
	 * 小于
	 * \endif
	 */
	public final static int NET_RADIOMETRY_ALARMCONTION_BELOW = 1;          
	
	 /**
	 * \if ENGLISH_LANG
	 * equal
	 * \else
	 * 等于
	 * \endif
	 */
	public final static int NET_RADIOMETRY_ALARMCONTION_MATCH = 2;          
	
	 /**
	 * \if ENGLISH_LANG
	 * above
	 * \else
	 * 大于
	 * \endif
	 */
	public final static int NET_RADIOMETRY_ALARMCONTION_ABOVE = 3;          
}
