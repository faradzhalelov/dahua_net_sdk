package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Types
 * \else
 * 报警类型
 * \endif
 */
public class ENCLOSURE_ALARM_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Drive In
	 * \else
	 * 驶入
	 * \endif
	 */
	public static final int ENCLOSURE_ALARM_DRIVEIN = 0;
	
 	/**
	 * \if ENGLISH_LANG
	 * Drive Out
	 * \else
	 * 驶出
	 * \endif
	 */
	public static final int ENCLOSURE_ALARM_DRIVEOUT = 1;
	
 	/**
	 * \if ENGLISH_LANG
	 * Overspeed
	 * \else
	 * 超速
	 * \endif
	 */
	public static final int ENCLOSURE_ALARM_OVERSPEED = 2;
	
 	/**
	 * \if ENGLISH_LANG
	 * Overspeed Disapper
	 * \else
	 * 超速消失
	 * \endif
	 */
	public static final int ENCLOSURE_ALARM_SPEEDCLEAR = 3;
}
