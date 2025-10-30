package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* tour status 
* \else
* 轮巡状态
* \endif
*/
public class NET_TOUR_STATUS implements Serializable {

	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * unknown
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int NET_TOUR_UNKNOWN = 0;                               
	
	 /**
	 * \if ENGLISH_LANG
	 * touring
	 * \else
	 * 轮巡中
	 * \endif
	 */
	public static final int NET_TOUR_START = 1;                                 
	
	 /**
	 * \if ENGLISH_LANG
	 * tour stop
	 * \else
	 * 轮巡停止
	 * \endif
	 */
	public static final int NET_TOUR_STOP = 2;                                
}
