package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetAlarmRegionInfo} emType is NET_EM_GET_ALARMREGION_INFO_AREASTATUS output param
 * \else
 * 获取区域状态 输出参数。此时{@link INetSDK#GetAlarmRegionInfo}的emType参数为NET_EM_GET_ALARMREGION_INFO_AREASTATUS
 * \endif
 */
public class NET_OUT_GET_AREAS_STATUS implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * area size
	 * \else
	 * 区域个数
	 * \endif
	 */
	public int                   nAreaRet;

	/**
	 * \if ENGLISH_LANG
	 * area status
	 * \else
	 * 区域防区异常状态信息
	 * \endif
	 */
	public NET_AREA_STATUS       stuAreaStatus[] = new NET_AREA_STATUS[FinalVar.MAX_AREA_NUMBER];

	public NET_OUT_GET_AREAS_STATUS() {
		for (int i = 0; i < stuAreaStatus.length; ++i) {
			stuAreaStatus[i] = new NET_AREA_STATUS();
		}
	}
}
