package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#SetAlarmRegionInfo} emType is NET_EM_SET_ALARMREGION_INFO_ARMMODE input param
 * \else
 * 设置布防模式 输入参数。此时{@link INetSDK#SetAlarmRegionInfo}的emType参数为NET_EM_SET_ALARMREGION_INFO_ARMMODE
 * \endif
 */
public class NET_IN_SET_ALARMMODE implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * arm type @link EM_ARM_TYPE}
	 * \else
	 * 布撤防类型 {@link EM_ARM_TYPE}
	 * \endif
	 */
	public int     emArmType;

	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * 密码
	 * \endif
	 */
	public byte            szPwd[] = new byte[256];

	/**
	 * \if ENGLISH_LANG
	 * area number
	 * \else
	 * 区域的个数
	 * \endif
	 */
	public int             nAreaNum;

	/**
	 * \if ENGLISH_LANG
	 * area id
	 * \else
	 * 区域号
	 * \endif
	 */
	public int             arrAreas[] = new int[FinalVar.MAX_AREA_NUMBER];
}
