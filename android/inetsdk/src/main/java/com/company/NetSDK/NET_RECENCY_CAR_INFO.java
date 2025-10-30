package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* vehicle info type
* \else
* 车辆信息的类型
* \endif
*/
public class NET_RECENCY_CAR_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static final int   RECENCY_CAR_INFO_UNKNOW  = 0	;
	
	/**
	 * \if ENGLISH_LANG
	 * newest
	 * \else
	 * 最新
	 * \endif
	 */
	public static final int   RECENCY_CAR_INFOO_NEWEST = 1 	;
	
	/**
	 * \if ENGLISH_LANG
	 * oldest
	 * \else
	 * 最旧
	 * \endif
	 */
	public static final int   RECENCY_CAR_INFO_ODLEST  = 2  ;
}
