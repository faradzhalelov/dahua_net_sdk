package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetAlarmRegionInfo} emType is NET_EM_GET_ALARMREGION_INFO_OUTPUTSTATE} input param
 * \else
 * 获取输出状态 输入参数。此时{@link INetSDK#GetAlarmRegionInfo}的emType参数为NET_EM_GET_ALARMREGION_INFO_OUTPUTSTATE
 * \endif
 */
public class NET_IN_GET_OUTPUT_STATE implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel type {@link EM_OUTPUT_TYPE}
	 * \else
	 * 通道类型 {@link EM_OUTPUT_TYPE}
	 * \endif
	 */
	public int            emType;
}
