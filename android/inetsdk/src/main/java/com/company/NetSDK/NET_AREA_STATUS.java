package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * area status
 * \else
 * 区域异常防区信息
 * \endif
 */
public class NET_AREA_STATUS implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * area id
	 * \else
	 * 区域号
	 * \endif
	 */
	public int               nArea;

	/**
	 * \if ENGLISH_LANG
	 * zone number
	 * \else
	 * 防区个数
	 * \endif
	 */
	public int               nZoneRet;

	/**
	 * \if ENGLISH_LANG
	 * zone status
	 * \else
	 * 防区异常状态
	 * \endif
	 */
	public NET_ZONE_STATUS   stuZoneStatus[] = new NET_ZONE_STATUS[FinalVar.MAX_ZONE_NUMBER];

	public NET_AREA_STATUS() {
		for (int i = 0; i < stuZoneStatus.length; ++i) {
			stuZoneStatus[i] = new NET_ZONE_STATUS();
		}
	}
}
