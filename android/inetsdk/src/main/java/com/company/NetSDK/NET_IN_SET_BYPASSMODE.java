package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#SetAlarmRegionInfo} emType is NET_EM_SET_ALARMREGION_INFO_BYPASSMODE} input param
 * \else
 * 设置旁路状态 输入参数。此时{@link INetSDK#SetAlarmRegionInfo}的emType参数为NET_EM_SET_ALARMREGION_INFO_BYPASSMODE
 * \endif
 */
public class NET_IN_SET_BYPASSMODE implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * 密码
	 * \endif
	 */
	public byte                      szPwd[] = new byte[256];

	/**
	 * \if ENGLISH_LANG
	 * bypass mode {@link EM_BYPASSMODE_TYPE}
	 * \else
	 * 旁路模式 {@link EM_BYPASSMODE_TYPE}
	 * \endif
	 */
	public int        emType;

	/**
	 * \if ENGLISH_LANG
	 * zone number
	 * \else
	 * 防区个数
	 * \endif
	 */
	public int                       nZoneNum;

	/**
	 * \if ENGLISH_LANG
	 * zone id
	 * \else
	 * 防区号
	 * \endif
	 */
	public int                       arrZones[] = new int[FinalVar.MAX_ZONE_NUMBER];
}
