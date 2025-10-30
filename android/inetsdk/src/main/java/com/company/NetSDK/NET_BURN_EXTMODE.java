package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Extension Burning mode
 * \else
 * 刻录模式 扩展
 * \endif
 */

public class NET_BURN_EXTMODE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * unknown
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int BURN_EXTMODE_UNKNOWN = 0;				
	
	/**
	 * \if ENGLISH_LANG
	 * Normal Burning
	 * \else
	 * 正常刻录
	 * \endif
	 */
	public static final int BURN_EXTMODE_NORMAL = 1;                 
	
	/**
	 * \if ENGLISH_LANG
	 * Nodist Burning
	 * \else
	 * 无盘刻录
	 * \endif
	 */
	public static final int BURN_EXTMODE_NODISK = 2;                     
}
