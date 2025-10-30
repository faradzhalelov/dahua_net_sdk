package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Wireless device online type
 * \else
 * 无线设备在线状态类型
 * \endif
 */
public class EM_WIRELESS_DEVICE_ONLINE_STATE implements Serializable{
	private static final long serialVersionUID = 1L; 
	
	/**
	 * \if ENGLISH_LANG
	 * Unknown type
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int EM_WIRELESS_DEVICE_STATE_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Out line
	 * \else
	 * 离线
	 * \endif
	 */
	public static final int EM_WIRELESS_DEVICE_STATE_OUTLINE = 1;           
	
	/**
	 * \if ENGLISH_LANG
	 * Online
	 * \else
	 * 在线
	 * \endif
	 */
	public static final int EM_WIRELESS_DEVICE_STATE_ONLINE = 2;           
}
