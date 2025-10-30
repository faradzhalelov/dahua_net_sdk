package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Power Failure Event Type
 * \else
 * 电源故障事件类型
 * \endif
 */
public class EM_POWERFAULT_EVENT_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Power Down
	 * \else
	 * 电源掉电
	 * \endif
	 */
	public static final int EM_POWERFAULT_EVENT_LOST = 0;
}
