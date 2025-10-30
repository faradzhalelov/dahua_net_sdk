package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Wireless devices info
 * \else
 * 无线设备状态
 * \endif
 */
public class NET_WIRELESS_DEVICE_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	
	/**
	 * \if ENGLISH_LANG
	 * Device serial NO
	 * \else
	 * 无线设备序列号
	 * \endif
	 */
	public byte szSerialNumber[] = new byte[FinalVar.NET_WIRELESS_DEVICE_SERIAL_NUMBER_MAX_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Online state of device: 0-unknown, 1-outline, 2-online , refer to  {@link EM_WIRELESS_DEVICE_ONLINE_STATE}
	 * \else
	 * 无线设备在线状态,取值参考 {@link EM_WIRELESS_DEVICE_ONLINE_STATE}
	 * \endif
	 */
	public int emOnlineState;          
	
	/**
	 * \if ENGLISH_LANG
	 * Current power state of device: 0-unknown power, 1-normal power, 2-low power， refer to {@link EM_WIRELESS_DEVICE_POWER_STATE}
	 * \else
	 * 无线设备电量状态,取值参考 {@link EM_WIRELESS_DEVICE_POWER_STATE}
	 * \endif
	 */
	public int emPowerState;           
}
