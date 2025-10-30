package com.company.NetSDK;

import java.io.Serializable;

public class GPS_POINT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * longitude
	 * \else
	 * 经度(单位是百万分之度，范围0-360度)如东经120.178274度表示为300178274
	 * \endif
	 */
	public int         dwLongitude; 
	
	/**
	 * \if ENGLISH_LANG
	 * latidude
	 * \else
	 * 纬度(单位是百万分之度，范围0-180度)如北纬30.183382度表示为120183382
	 * \endif
	 */
	public int         dwLatidude; 
}
