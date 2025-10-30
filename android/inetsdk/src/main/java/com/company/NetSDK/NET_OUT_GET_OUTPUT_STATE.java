package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetAlarmRegionInfo} emType is NET_EM_GET_ALARMREGION_INFO_OUTPUTSTATE output param
 * \else
 * 获取输出状态 输出参数。此时{@link INetSDK#GetAlarmRegionInfo}的emType参数为NET_EM_GET_ALARMREGION_INFO_OUTPUTSTATE
 * \endif
 */
public class NET_OUT_GET_OUTPUT_STATE implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * state number
	 * \else
	 * 状态个数
	 * \endif
	 */
	public int                             nStateRet;

	/**
	 * \if ENGLISH_LANG
	 * state false:close  true:open
	 * \else
	 * 状态false:关闭true打开
	 * \endif
	 */
	public boolean                            arrStates[] = new boolean[FinalVar.MAX_ZONE_NUMBER];
}
