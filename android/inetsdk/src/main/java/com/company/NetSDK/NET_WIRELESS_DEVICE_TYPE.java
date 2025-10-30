package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The Device type of Wireless
 * \else
 * 无线设备类型
 * \endif
 */
public class NET_WIRELESS_DEVICE_TYPE implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown type
	 * \else
	 * 未知类型
	 * \endif
	 */
	public static final int 	NET_WIRELESS_DEVICE_TYPE_UNKNOWN = 0;               
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless Keyboard
	 * \else
	 * 无线键盘
	 * \endif
	 */
	public static final int	    NET_WIRELESS_DEVICE_TYPE_KEYBOARD = 1;          
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless defence area
	 * \else
	 * 无线防区 
	 * \endif
	 */
	public static final int	    NET_WIRELESS_DEVICE_TYPE_DEFENCE = 2;           
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless remote control
	 * \else
	 * 无线遥控 
	 * \endif
	 */
	public static final int	    NET_WIRELESS_DEVICE_TYPE_REMOTECONTROL = 3;     
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless door sensor
	 * \else
	 * 无线门磁 
	 * \endif
	 */
	public static final int	    NET_WIRELESS_DEVICE_TYPE_MAGNETOMER = 4;        

	/**
	 * \if ENGLISH_LANG
	 * Wireless alarm bell
	 * \else
	 * 无线警号
	 * \endif
	 */
	public static final int	    NET_WIRELESS_DEVICE_TYPE_ALARMBELL = 5;  
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless switcher
	 * \else
	 * 无线插座
	 * \endif
	 */
	public static final int	    NET_WIRELESS_DEVICE_TYPE_SWITCHER = 6;  
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless smart lock
	 * \else
	 * 无线智能锁
	 * \endif
	 */
	public static final int     NET_WIRELESS_DEVICE_TYPE_SMARTLOCK = 7;

	/**
	 * \if ENGLISH_LANG
	 *  Wireless Repeater
	 * \else
	 * 无线中继器
	 * \endif
	 */
	public static final int     NET_WIRELESS_DEVICE_TYPE_REPEATER = 8;
}
