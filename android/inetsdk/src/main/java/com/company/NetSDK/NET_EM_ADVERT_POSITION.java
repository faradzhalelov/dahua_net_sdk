package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * advert position 
 * \else
 *  广告位置
 * \endif
 */

public class NET_EM_ADVERT_POSITION implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public static final int NET_EM_ADVERT_POSITION_UNKNOWN	= 0;
	
	/**
	 * \if ENGLISH_LANG
	 *top
	 * \else
	 *顶部
	 * \endif
	 */
	public static final int NET_EM_ADVERT_POSITION_TOP      = 1;			
	
	/**
	 * \if ENGLISH_LANG
	 *middle
	 * \else
	 *中间
	 * \endif
	 */
	public static final int NET_EM_ADVERT_POSITION_MIDDLE   = 2;		
	
	/**
	 * \if ENGLISH_LANG
	 *bottom
	 * \else
	 *底部
	 * \endif
	 */
	public static final int NET_EM_ADVERT_POSITION_BOTTOM 	= 3;	

}
