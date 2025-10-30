package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetAlarmRegionInfo} emType isNET_EM_GET_ALARMREGION_INFO_ZONESTROUBLE output param
 * \else
 * 获取防区故障 输出参数。此时{@link INetSDK#GetAlarmRegionInfo}的emType参数为NET_EM_GET_ALARMREGION_INFO_ZONESTROUBLE
 * \endif
 */
public class NET_OUT_GET_ZONES_TROUBLE implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * zone number
	 * \else
	 * 故障防区个数
	 * \endif
	 */
	public int                             nZoneRet;

	/**
	 * \if ENGLISH_LANG
	 * trouble information
	 * \else
	 * 防区故障信息
	 * \endif
	 */
	public NET_ZONE_TROUBLE_INFO           stuTroubleInfo[] = new NET_ZONE_TROUBLE_INFO[FinalVar.MAX_ZONE_NUMBER];

	public NET_OUT_GET_ZONES_TROUBLE() {
		for (int i = 0; i < stuTroubleInfo.length; ++i) {
			stuTroubleInfo[i] = new NET_ZONE_TROUBLE_INFO();
		}
	}
}
