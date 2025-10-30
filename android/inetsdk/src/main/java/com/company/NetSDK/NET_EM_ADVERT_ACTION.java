package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * advert action 
 * \else
 *  广告播放
 * \endif
 */

public class NET_EM_ADVERT_ACTION implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public static final int NET_EM_ADVERT_ACTION_UNKNOWN	= 0;
	
	/**
	 * \if ENGLISH_LANG
	 *start
	 * \else
	 *开始
	 * \endif
	 */
	public static final int NET_EM_ADVERT_ACTION_START      = 1;
	
	/**
	 * \if ENGLISH_LANG
	 *stop
	 * \else
	 *停止
	 * \endif
	 */
	public static final int NET_EM_ADVERT_ACTION_STOP       = 2;			
}
