package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Arm/Disarm Mode
 * \else
 * 布撤防模式
 * \endif
 */
public class NET_ALARM_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int NET_ALARM_MODE_UNKNOWN = -1;
	
	/**
	 * \if ENGLISH_LANG
	 * Disarm
	 * \else
	 * 撤防
	 * \endif
	 */
	public static final int NET_ALARM_MODE_DISARMING = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Arm
	 * \else
	 * 布防
	 * \endif
	 */
	public static final int NET_ALARM_MODE_ARMING = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Enhanced Arm
	 * \else
	 * 强制布防
	 * \endif
	 */
	public static final int NET_ALARM_MODE_FORCEON = 2;
}
