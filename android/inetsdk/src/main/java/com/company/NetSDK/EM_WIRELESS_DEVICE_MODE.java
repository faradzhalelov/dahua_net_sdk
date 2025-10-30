package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Wireless Device Mode
 * \else
 * 无线设备工作模式
 * \endif
 */
public class EM_WIRELESS_DEVICE_MODE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Unknown mode
	 * \else
	 * 模式未识别
	 * \endif
	 */
	public static final int EM_WIRELESS_DEVICE_MODE_UNKNOWN = 0;                
	
	/**
	 * \if ENGLISH_LANG
	 * Normal
	 * \else
	 * Normal 普通模式
	 * \endif
	 */
	public static final int EM_WIRELESS_DEVICE_MODE_NORMAL = 1;                      
	
	/**
	 * \if ENGLISH_LANG
	 * Polling. It only to be valid when {@link NET_CODEID_INFO#emType} is {@link NET_WIRELESS_DEVICE_TYPE#NET_WIRELESS_DEVICE_TYPE_REMOTECONTROL}
	 * \else
	 * Polling 巡检模式 只有{@link NET_CODEID_INFO#emType} 是 {@link NET_WIRELESS_DEVICE_TYPE#NET_WIRELESS_DEVICE_TYPE_REMOTECONTROL}时才能处于巡检模式
	 * \endif
	 * @see NET_CODEID_INFO
	 */
	public static final int EM_WIRELESS_DEVICE_MODE_POLLING = 2;                    
}
