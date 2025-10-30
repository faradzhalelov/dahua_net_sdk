package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#SetAlarmRegionInfo} emType is NET_EM_SET_ALARMREGION_INFO_OUTPUTSTATE input param
 * \else
 * 设置输出状态 输入参数。此时{@link INetSDK#SetAlarmRegionInfo}的emType参数为NET_EM_SET_ALARMREGION_INFO_OUTPUTSTATE
 * \endif
 */
public class NET_IN_SET_OUTPUT_STATE implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * output type {@link EM_OUTPUT_TYPE}
	 * \else
	 * 输出类型 {@link EM_OUTPUT_TYPE}
	 * \endif
	 */
	public int							emType;

	/**
	 * \if ENGLISH_LANG
	 * emType= EM_OUTPUT_TYPE_SIREN: siren emType= EM_OUTPUT_TYPE_ALARMOUT: channel id
	 * \else
	 * emType= EM_OUTPUT_TYPE_SIREN时表示警号号 emType= EM_OUTPUT_TYPE_ALARMOUT时表示通道号
	 * \endif
	 */
	public int 						nChannel;

	/**
	 * \if ENGLISH_LANG
	 * output action false:close true:open
	 * \else
	 * 输出动作false:关闭true:打开
	 * \endif
	 */
	public boolean					action;
}
