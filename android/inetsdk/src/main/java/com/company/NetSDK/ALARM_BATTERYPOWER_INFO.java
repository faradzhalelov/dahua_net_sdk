package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * battery scheduled notice event, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_BATTERYPOWER_EVENT}
 * \else
 * 电池电量定时通知事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_BATTERYPOWER_EVENT}
 * \endif
 */
public class ALARM_BATTERYPOWER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * battery no.
	 * \else
	 * 电池序号
	 * \endif
	 */
	public int 		  nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * event time
	 * \else
	 * 事件时间
	 * \endif
	 */
	public NET_TIME   stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * battery percentage
	 * \else
	 * 电池电量百分比
	 * \endif
	 */
	public int        nPercent;
}
