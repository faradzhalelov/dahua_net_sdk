package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Home key state 
 * \else
 * Home键状态
 * \endif
 */
public class NET_HOME_STATE implements Serializable {

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
	public final static int NET_HOME_STATE_UNKNOWN = 0;         
	
	/**
	 * \if ENGLISH_LANG
	 * unpressed 
	 * \else
	 * 未按下
	 * \endif
	 */
	public final static int NET_HOME_STATE_UNPRESSED = 1;       
	
	/**
	 * \if ENGLISH_LANG
	 * pressed  
	 * \else
	 * 按下
	 * \endif
	 */
	public final static int NET_HOME_STATE_PRESSED = 2;         
}
