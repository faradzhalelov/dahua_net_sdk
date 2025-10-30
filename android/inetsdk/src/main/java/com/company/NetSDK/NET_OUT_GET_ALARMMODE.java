package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetAlarmRegionInfo} emType is NET_EM_GET_ALARMREGION_INFO_ARMMODE output param
 * \else
 * 获取布防模式 输出参数。此时{@link INetSDK#GetAlarmRegionInfo}的emType参数为NET_EM_GET_ALARMREGION_INFO_ARMMODE
 * \endif
 */
public class NET_OUT_GET_ALARMMODE implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * arm state number
	 * \else
	 * 布撤防状态个数
	 * \endif
	 */
	public int                   nArmModeRet;

	/**
	 * \if ENGLISH_LANG
	 * arm mode information
	 * \else
	 * 布撤防信息
	 * \endif
	 */
	public NET_ARMMODE_INFO      stuArmMode[] = new NET_ARMMODE_INFO[FinalVar.MAX_AREA_NUMBER];

	/**
	 * \if ENGLISH_LANG
	 * arm state number
	 * \else
	 * 布撤防状态个数
	 * \endif
	 */
	public int                   nArmModeRetEx;

	/**
	 * \if ENGLISH_LANG
	 * arm mode information
	 * \else
	 * 布撤防信息
	 * \endif
	 */
	public NET_ARMMODE_INFO      stuArmModeEx[] = new NET_ARMMODE_INFO[FinalVar.MAX_AREA_NUMBER_EX];

	public NET_OUT_GET_ALARMMODE() {
		for (int i = 0; i < FinalVar.MAX_AREA_NUMBER; i++) {
			stuArmMode[i] = new NET_ARMMODE_INFO();
		}
		for (int i = 0; i < FinalVar.MAX_AREA_NUMBER_EX; ++i) {
			stuArmModeEx[i] = new NET_ARMMODE_INFO();
		}
	}
}
