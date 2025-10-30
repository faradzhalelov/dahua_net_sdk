package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm IO control
 * \else
 * 报警控制类
 * \endif
 */
public class ALARM_CONTROL implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 端口序号
	 * \endif
	 */
	public short		index;
	
	/**
	 * \if ENGLISH_LANG
	 * Port status
	 * \else
	 * 端口状态
	 * \endif
	 */
	public short		state;
}
