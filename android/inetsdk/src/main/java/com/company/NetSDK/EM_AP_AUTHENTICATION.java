package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Acess point authentication method
 * \else
 * AP认证方式
 * \endif
 */
public class EM_AP_AUTHENTICATION implements Serializable {
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
	public static final int EM_AP_AUTHENTICATION_UNKNOWN = 0;      
	
	/**
	 * \if ENGLISH_LANG
	 * OPEN
	 * \else
	 * OPEN
	 * \endif
	 */
	public static final int EM_AP_AUTHENTICATION_OPEN = 1;                            
	
	/**
	 * \if ENGLISH_LANG
	 * WEP
	 * \else
	 * WEP
	 * \endif
	 */
	public static final int EM_AP_AUTHENTICATION_WEP = 2;                            
	
	/**
	 * \if ENGLISH_LANG
	 * WPA PSK
	 * \else
	 * WPA PSK
	 * \endif
	 */
	public static final int EM_AP_AUTHENTICATION_WPAPSK = 3;                          
	
	/**
	 * \if ENGLISH_LANG
	 * WPA2 PSK
	 * \else
	 * WPA2 PSK
	 * \endif
	 */
	public static final int EM_AP_AUTHENTICATION_WPA2PSK = 4;                         
	
	/**
	 * \if ENGLISH_LANG
	 * WPA
	 * \else
	 * WPA
	 * \endif
	 */
	public static final int EM_AP_AUTHENTICATION_WPA = 5;                            
	
	/**
	 * \if ENGLISH_LANG
	 * WPA2
	 * \else
	 * WPA2
	 * \endif
	 */
	public static final int EM_AP_AUTHENTICATION_WPA2 = 6;                            
}
