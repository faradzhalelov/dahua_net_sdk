package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * AD Zone Type
 * \else
 * 防区类型
 * \endif
 */
public class NET_DEFENCEAREA_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown AD Zone
	 * \else
	 * 未知类型防区
	 * \endif
	 */
	public static final int NET_DEFENCEAREA_TYPE_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * On/Off AD Zone
	 * \else
	 * 开关量防区
	 * \endif
	 */
	public static final int NET_DEFENCEAREA_TYPE_ALARM = 1;
}
