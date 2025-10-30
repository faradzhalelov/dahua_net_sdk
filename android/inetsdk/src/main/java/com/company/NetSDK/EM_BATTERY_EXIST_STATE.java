package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * battery in-place status
 * \else
 * 电池在位状态
 * \endif
 */
public class EM_BATTERY_EXIST_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unkown
	 * \else
	 * 未知
	 * \endif
	 */
	public final static int 	EM_BATTERY_EXIST_STATE_UNKNOWN = 0 ;
	
	/**
	 * \if ENGLISH_LANG
	 * battery in-place
	 * \else
	 * 电池在位
	 * \endif
	 */
	public final static int    	EM_BATTERY_EXIST_STATE_EXIST   = 1 ;
	
	/**
	 * \if ENGLISH_LANG
	 * battery lost
	 * \else
	 * 电池丢失
	 * \endif
	 */
	public final static int     EM_BATTERY_EXIST_STATE_MISSING = 2 ; 
}
