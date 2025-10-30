package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Sub System Status, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_ALARMSUBSYSTEM_STATE}
 * \else
 * 报警子系统状态, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_ALARMSUBSYSTEM_STATE}
 * \endif
 */
public class NET_ALARM_SUBSYSTEM_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Valid Sub System Number
	 * \else
	 * 有效子系统个数
	 * \endif
	 */
	public int		nMaxAlarmSubSystem;
	
	/**
	 * \if ENGLISH_LANG
	 * Sub System Status Info, refer to {@link EM_ALARM_SUBSYSTEM_STATE_TYPE}
	 * \else
	 * 子系统状态信息, 取值参考 {@link EM_ALARM_SUBSYSTEM_STATE_TYPE}
	 * \endif
	 */
	public int emState[] = new int[FinalVar.SDK_MAX_ALARM_SUBSYSTEM_NUM];  
}
