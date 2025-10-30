package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Wireless remote configuration
 * \else
 * 无线遥控器配置
 * \endif
 */
public class SDK_WI_CONFIG_ROBOT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The address of the remote control
	 * \else
	 * 遥控器地址
	 * \endif
	 */
	public byte                address[] = new byte[FinalVar.ALARM_MAX_NAME];
	
	/**
	 * \if ENGLISH_LANG
	 * The name of the remote control
	 * \else
	 * 遥控器名称
	 * \endif
	 */
	public byte                name[] = new byte[FinalVar.ALARM_MAX_NAME];           // 遥控器名称
}
