package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The structure of the wireless alarm capability
 * \else
 * 无线报警能力结构体
 * \endif
 */
public class SDK_WIRELESS_ALARM_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support the 
	 * \else
	 * 是否支持
	 * \endif
	 */
	public boolean		bSupport;
	
	/**
	 * \if ENGLISH_LANG
	 * Number of alarm inputs 
	 * \else
	 * 输入个数
	 * \endif
	 */
	public int			nAlarmInCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Number of alarm output 
	 * \else
	 * 输出个数
	 * \endif
	 */
	public int			nAlarmOutCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The number of the remote control 
	 * \else
	 * 遥控器个数
	 * \endif
	 */
	public int			nRemoteAddrCount;
}
