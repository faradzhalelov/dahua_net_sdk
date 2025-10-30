package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm fault state, {@link INetSDK#QueryDevState} corresponding to command {@link FinalVar#SDK_DEVSTATE_ALARM_FAULT_STATE}
 * \else
 * 报警故障状态, {@link INetSDK#QueryDevState} 对应命令 {@link FinalVar#SDK_DEVSTATE_ALARM_FAULT_STATE}
 * \endif
 */
public class NET_ALARM_FAULT_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Input parameter
	 * \else
	 * 输入参数
	 * \endif
	 */
	public NET_IN_ALARM_FAULT_STATE stuIn   = new NET_IN_ALARM_FAULT_STATE();
	
	/**
	 * \if ENGLISH_LANG
	 * Output parameter
	 * \else
	 * 输出参数
	 * \endif
	 */
	public NET_OUT_ALARM_FAULT_STATE stuOut = new NET_OUT_ALARM_FAULT_STATE();
}

