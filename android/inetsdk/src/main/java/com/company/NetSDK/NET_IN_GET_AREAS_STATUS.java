package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetAlarmRegionInfo} emType is NET_EM_GET_ALARMREGION_INFO_AREASTATUS input param
 * \else
 * 获取区域状态 输入参数。此时{@link INetSDK#GetAlarmRegionInfo}的emType参数为NET_EM_GET_ALARMREGION_INFO_AREASTATUS
 * \endif
 */
public class NET_IN_GET_AREAS_STATUS implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * get area status type {@link EM_GET_AREASSTATUS_TYPE}
	 * \else
	 * 获取异常防区类型 {@link EM_GET_AREASSTATUS_TYPE}
	 * \endif
	 */
	public int     emType;
}
