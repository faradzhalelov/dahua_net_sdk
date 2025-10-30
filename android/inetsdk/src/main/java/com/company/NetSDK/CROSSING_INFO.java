package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Crossing information
 * \else
 * 路口信息
 * \endif
 */
public class CROSSING_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Crossing ID
	 * \else
	 * 路口序列号
	 * \endif
	 */
	public byte				szCrossingID[] = new byte[FinalVar.SDK_MAX_CROSSING_ID]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Latitude(0-180 Degree, 30.183382 degree==120183382)
	 * \else
	 * 纬度(单位是百万分之度，范围0-180度)如北纬30（.）183382度表示为120183382)
	 * \endif
	 */
	public int 				dwLatitude; 
	
	/**
	 * \if ENGLISH_LANG
	 * Longitude(0-360 Degree, 120.178274 degree==300178274)
	 * \else
	 * 经度(单位是百万分之度，范围0-360度) 如东经120（.）178274度表示为300178274）
	 * \endif
	 */
	public int				dwLongitude; 
	
	/**
	 * \if ENGLISH_LANG
	 * limit speed(KM/H)
	 * \else
	 * 路口限速值,单位Km/h 0表示不限速,其他表示限速值上限
	 * \endif
	 */
	public short			wSpeedLimit;
}
