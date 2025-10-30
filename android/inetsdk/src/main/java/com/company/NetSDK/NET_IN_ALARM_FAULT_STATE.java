package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Failure Status, Input Parameter
 * \else
 * 报警故障状态, 输入参数
 * \endif
 */
public class NET_IN_ALARM_FAULT_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Type to search, refer to {@link EM_ALARM_FAULT_STATE_TYPE}
	 * \else
	 * 待查询的类型, 取值参考 {@link EM_ALARM_FAULT_STATE_TYPE}
	 * \endif
	 */
	public int  emType;
}
