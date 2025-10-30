package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetAlarmRegionInfo} emType is  NET_EM_GET_ALARMREGION_INFO_ARMMODE input param
 * \else
 * 获取布防模式 输入参数。此时{@link INetSDK#GetAlarmRegionInfo}的emType参数为NET_EM_GET_ALARMREGION_INFO_ARMMODE
 * \endif
 */
public class NET_IN_GET_ALARMMODE implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public int dwSize;
}
