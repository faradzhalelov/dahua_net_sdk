package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Wireless device power state
 * \else
 * 无线设备电量状态
 * \endif
 */
public class EM_WIRELESS_DEVICE_POWER_STATE implements Serializable{
	private static final long serialVersionUID = 1L; 
	
	/**
	 * \if ENGLISH_LANG
	 * Unknown type
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int EM_WIRELESS_DEVICE_POWER_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Normal
	 * \else
	 * 电量正常
	 * \endif
	 */
	public static final int EM_WIRELESS_DEVICE_POWER_NORMAL = 1;           
	
	/**
	 * \if ENGLISH_LANG
	 * Low
	 * \else
	 * 低电量
	 * \endif
	 */
	public static final int EM_WIRELESS_DEVICE_POWER_LOW = 2;    
}
