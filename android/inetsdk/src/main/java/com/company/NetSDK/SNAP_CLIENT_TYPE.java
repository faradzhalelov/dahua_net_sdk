package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Capture client type
 * \else
 * 抓拍客户端类型
 * \endif
 */
public class SNAP_CLIENT_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Corresponding to "Common" type, the default type
	 * \else
	 * 对应"Common"类型, 默认类型
	 * \endif
	 */
	public static final int SNAP_CLIENT_TYPE_COMMON = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * Correspondence "ParkingSpace" type, parking
	 * \else
	 * 对应"ParkingSpace"类型, 停车场
	 * \endif
	 */
	public static final int SNAP_CLIENT_TYPE_PARKINGSPACE = 1; 
}
