package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm arm disarm state info
 * \else
 * 报警布撤防状态信息
 * \endif
 */
public class ALARM_ARM_DISARM_STATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Arm-disarm,0 means disarm,1 means arm, 2 means ForceOn
	 * \else
	 * 布撤防状态，0表示撤防，1表示布防，2表示强制布防
	 * \endif
	 */
	public byte                bState;
}
