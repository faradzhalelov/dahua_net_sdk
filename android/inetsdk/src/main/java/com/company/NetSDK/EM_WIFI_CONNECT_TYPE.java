package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * WIFI connection mode
 * \else
 * WIFI 连接方式
 * \endif
 */
public class EM_WIFI_CONNECT_TYPE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknow
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int EM_WIFI_CONNECT_TYPE_UNKNOWN = 0;                               
	
	/**
	 * \if ENGLISH_LANG
	 * push button mode
	 * \else
	 * 按钮方式
	 * \endif
	 */
	public static final int EM_WIFI_CONNECT_TYPE_PUSH_BUTTON = 1;                           
	
	/**
	 * \if ENGLISH_LANG
	 * PINEnrollee mode
	 * \else
	 * PIN 码方式
	 * \endif
	 */
	public static final int EM_WIFI_CONNECT_TYPE_PIN_ENROLLEE = 2;                          
	
	/**
	 * \if ENGLISH_LANG
	 * PIN REG mode ,not supported now
	 * \else
	 * PIN REG方式 目前暂不支持
	 * \endif
	 */
	public static final int EM_WIFI_CONNECT_TYPE_PIN_REG = 3;                               
}
