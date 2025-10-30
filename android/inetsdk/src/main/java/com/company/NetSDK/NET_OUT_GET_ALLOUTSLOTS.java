package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetAlarmRegionInfo} emType is NET_EM_GET_ALARMREGION_INFO_ALLOUTSLOTS output param
 * \else
 * 获取所有报警输出 输出参数。此时{@link INetSDK#GetAlarmRegionInfo}的emType参数为NET_EM_GET_ALARMREGION_INFO_ALLOUTSLOTS
 * \endif
 */
public class NET_OUT_GET_ALLOUTSLOTS implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * local alarm output number, max:2
	 * \else
	 * 本地报警输出数量，最多2个
	 * \endif
	 */
	public int                             nLocol;

	/**
	 * \if ENGLISH_LANG
	 * wired alarm output number, max:80
	 * \else
	 * 扩展有线报警输出数量，最多80个
	 * \endif
	 */
	public int                             nWired;
}
