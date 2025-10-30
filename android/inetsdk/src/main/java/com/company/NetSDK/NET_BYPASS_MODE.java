package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Bypass Status Type
 * \else
 * 旁路状态类型
 * \endif
 */
public class NET_BYPASS_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown Status
	 * \else
	 * 未知状态
	 * \endif
	 */
	public static final int NET_BYPASS_MODE_UNKNOW = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Bypass
	 * \else
	 * 旁路
	 * \endif
	 */
	public static final int NET_BYPASS_MODE_BYPASS = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Normal
	 * \else
	 * 正常
	 * \endif
	 */
	public static final int NET_BYPASS_MODE_NORMAL = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Isolate
	 * \else
	 * 隔离
	 * \endif
	 */
	public static final int NET_BYPASS_MODE_ISOLATED = 3;
}
