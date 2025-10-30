package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetAlarmRegionInfo} emType is NET_EM_GET_ALARMREGION_INFO_ALARMCAPS output param
 * \else
 * 获取能力 输出参数。此时{@link INetSDK#GetAlarmRegionInfo}的emType参数为NET_EM_GET_ALARMREGION_INFO_ALARMCAPS
 * \endif
 */
public class NET_OUT_GET_ALARMCAPS implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * supported siren number
	 * \else
	 * 支持的警号数量
	 * \endif
	 */
	public int             nSiren;

	/**
	 * \if ENGLISH_LANG
	 * supported input alarm number
	 * \else
	 * 支持的报警输入数量
	 * \endif
	 */
	public int             nAlarmIn;

	/**
	 * \if ENGLISH_LANG
	 * supported output alarm number,max:82
	 * \else
	 * 支持的报警输出数量,最多82个
	 * \endif
	 */
	public int             nAlarmOut;

	/**
	 * \if ENGLISH_LANG
	 * supported remotecontrol number
	 * \else
	 * 支持的遥控器数量
	 * \endif
	 */
	public int             nRemoteControl;
}
