package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * longitude latitude
 * \else
 * 经纬度
 * \endif
 */
public class SDKDEV_LONGI_LATI implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * preflag of longitude:N(north),S(south),W(west),E(east)
	 * \else
	 * 经度前置标志：N、S、W、E，分别表示北、南、西、东。
	 * \endif
	 */
	public byte                chPreLogi;

	/**
	 * \if ENGLISH_LANG
	 * preflag of latitude:N(north),S(south),W(west),E(east)
	 * \else
	 * 纬度前置标志：N、S、W、E，分别表示北、南、西、东。
	 * \endif
	 */
	public byte                chPreLati;

	/**
	 * \if ENGLISH_LANG
	 * longitude
	 * \else
	 * 经度
	 * \endif
	 */
	public double              dbLongitude;

	/**
	 * \if ENGLISH_LANG
	 * latitude
	 * \else
	 * 纬度
	 * \endif
	 */
	public double              dbLatitude;
}
