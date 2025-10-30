package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * uprade packege type
 * \else
 * 升级包类型
 * \endif
 */
public class EM_UPGRADE_PACKAGE_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknown
	 * \else
	 * 未知类型
	 * \endif
	 */
	public static final int EM_UPGRADE_PACKAGE_TYPE_UNKNOWN = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * uprade packege type
	 * \else
	 * regular
	 * \endif
	 */
	public static final int EM_UPGRADE_PACKAGE_TYPE_REGULAR = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * emergency
	 * \else
	 * 强制升级
	 * \endif
	 */
	public static final int EM_UPGRADE_PACKAGE_TYPE_EMERGENCY = 2; 
}
