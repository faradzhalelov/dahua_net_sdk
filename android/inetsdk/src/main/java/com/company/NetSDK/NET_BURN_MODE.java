package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Burning mode
 * \else
 * 刻录模式 
 * \endif
 */
public class NET_BURN_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * sync
	 * \else
	 * 同步
	 * \endif
	 */
	public static final int BURN_MODE_SYNC 		= 0 ;
	
	/**
	 * \if ENGLISH_LANG
	 * turn
	 * \else
	 * 轮流
	 * \endif
	 */
	public static final int BURN_MODE_TURN 	= 1	;
	
	/**
	 * \if ENGLISH_LANG
	 * cycle
	 * \else
	 * 循环
	 * \endif
	 */
	public static final int BURN_MODE_CYCLE 	= 2 ;
}
