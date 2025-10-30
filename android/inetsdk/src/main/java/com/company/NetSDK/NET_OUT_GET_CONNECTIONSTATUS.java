package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetAlarmRegionInfo} emType is NET_EM_GET_ALARMREGION_INFO_ZONECONNECTIONSSTATUS output param
 * \else
 * 获取防区连接状态 输出参数。此时{@link INetSDK#GetAlarmRegionInfo}的emType参数为NET_EM_GET_ALARMREGION_INFO_ZONECONNECTIONSSTATUS
 * \endif
 */
public class NET_OUT_GET_CONNECTIONSTATUS implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * zone number
	 * \else
	 * 防区个数
	 * \endif
	 */
	public int                             nZoneRet;

	/**
	 * \if ENGLISH_LANG
	 * zone state false:offline true:online
	 * \else
	 * 防区在线状态false:离线 true:在线
	 * \endif
	 */
	public boolean                            arrZoneStates[] = new boolean[FinalVar.MAX_ZONE_NUMBER];
}
