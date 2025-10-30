package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_ALARMBELL}
 * \else
 * 警号配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_ALARMBELL}
 * \endif
 */
public class CFG_ALARMBELL_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Duty cycle
	 * \else
	 * 警号输出持续时间, 单位: 分钟(0-99), 0 表示响一下就停止
	 * \endif
	 */
	public int nPersistentTime;
}
