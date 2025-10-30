package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Optical Fiber Code Ability Alarm
 * \else
 * 光纤编码能力报警
 * \endif
 */
public class ALARM_FDDI_ALARM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Optical Fiber Amounts 
	 * \else
	 * 光纤数目
	 * \endif
	 */
	public int         nFDDINum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optical Fiber Alarm
	 * \else
	 * 光纤报警
	 * \endif
	 */
	public byte        bAlarm[] = new byte[256];
}
