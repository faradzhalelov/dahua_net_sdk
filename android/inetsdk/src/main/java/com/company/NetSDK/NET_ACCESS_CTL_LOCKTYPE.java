package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Lock type
 * \else
 * 上锁方式
 * \endif
 */
public class NET_ACCESS_CTL_LOCKTYPE implements Serializable {

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
	public static final int NET_ACCESS_CTL_LOCKTYPE_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Dead bolt
	 * \else
	 * 方舌
	 * \endif
	 */
	public static final int NET_ACCESS_CTL_LOCKTYPE_DEADBOLT = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Stay bolt
	 * \else
	 * 呆舌
	 * \endif
	 */
	public static final int NET_ACCESS_CTL_LOCKTYPE_STAYBOLT = 2;
	
}
