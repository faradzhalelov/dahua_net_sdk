package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access point encryption mode
 * \else
 * AP加密方式
 * \endif
 */
public class EM_AP_DATA_ENCRYPT implements Serializable {
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
	public static final int EM_AP_DATA_ENCRYPT_UNKNOWN = 0;                     
	
	/**
	 * \if ENGLISH_LANG
	 * NONE
	 * \else
	 * NONE
	 * \endif
	 */
	public static final int EM_AP_DATA_ENCRYPT_NONE = 1;                              
	
	/**
	 * \if ENGLISH_LANG
	 * AUTO
	 * \else
	 * AUTO
	 * \endif
	 */
	public static final int EM_AP_DATA_ENCRYPT_AUTO = 2;                              
	
	/**
	 * \if ENGLISH_LANG
	 * SHARED
	 * \else
	 * SHARED
	 * \endif
	 */
	public static final int EM_AP_DATA_ENCRYPT_SHARED = 3;                            
	
	/**
	 * \if ENGLISH_LANG
	 * OPEN
	 * \else
	 * OPEN
	 * \endif
	 */
	public static final int EM_AP_DATA_ENCRYPT_OPEN = 4;                               
	
	/**
	 * \if ENGLISH_LANG
	 * TKIP
	 * \else
	 * TKIP
	 * \endif
	 */
	public static final int EM_AP_DATA_ENCRYPT_TKIP = 5;                              
	
	/**
	 * \if ENGLISH_LANG
	 * AES
	 * \else
	 * AES
	 * \endif
	 */
	public static final int EM_AP_DATA_ENCRYPT_AES = 6;                              
}
