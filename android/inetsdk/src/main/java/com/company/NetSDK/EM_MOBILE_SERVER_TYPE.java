package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Platform Type 
 * \else
 * 平台类型
 * \endif
 */
public class EM_MOBILE_SERVER_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int EM_MOBILE_SERVER_TYPE_UNKNOWN = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * Apple
	 * \else
	 * Apple
	 * \endif
	 */
	public static final int EM_MOBILE_SERVER_TYPE_APPLE = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * Android
	 * \else
	 * Android
	 * \endif
	 */
	public static final int EM_MOBILE_SERVER_TYPE_ANDROID = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * PRIVATE_CLOUD
	 * \else
	 * PRIVATE_CLOUD
	 * \endif
	 */
	public static final int EM_MOBILE_SERVER_TYPE_SDKCLOUD = 3; 
}
