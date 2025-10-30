package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  Access method
 * \else
 * 	开锁方式
 * \endif
 */
public class NET_ACCESS_METHOD implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 *  Unknown
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int NET_ACCESS_METHOD_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 *  card
	 * \else
	 * 卡
	 * \endif
	 */
	public static final int NET_ACCESS_METHOD_CARD = 1;
	
	/**
	 * \if ENGLISH_LANG
	 *  password
	 * \else
	 * 密码
	 * \endif
	 */
	public static final int NET_ACCESS_METHOD_PASSWORD = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * fingerprint
	 * \else
	 * 信息
	 * \endif
	 */
	public static final int NET_ACCESS_METHOD_FINGERPRINT = 3;
	
	
}
