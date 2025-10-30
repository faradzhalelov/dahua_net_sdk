package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetAlarmRegionInfo} emType is NET_EM_GET_ALARMREGION_INFO_ALLINSLOTS output param
 * \else
 * 获取所有报警防区 输出参数。此时{@link INetSDK#GetAlarmRegionInfo}的emType参数为NET_EM_GET_ALARMREGION_INFO_ALLINSLOTS
 * \endif
 */
public class NET_OUT_GET_ALLINSLOTS implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * local zone number, max:8
	 * \else
	 * 本地防区数量,最多8个
	 * \endif
	 */
	public int                             nLocol;

	/**
	 * \if ENGLISH_LANG
	 * wired zone number,max:64
	 * \else
	 * 有线防区数量，最多64个
	 * \endif
	 */
	public int                             nWired;

	/**
	 * \if ENGLISH_LANG
	 * wireless zone number,max:64
	 * \else
	 * 无线防区数量，最多64个
	 * \endif
	 */
	public int                             nWireless;
}
