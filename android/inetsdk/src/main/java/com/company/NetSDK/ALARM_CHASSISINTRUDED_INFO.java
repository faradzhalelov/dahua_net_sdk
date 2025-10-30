package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Vandal-proof Alarm Event, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_CHASSISINTRUDED}
 * \else
 * 防拆报警事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_CHASSISINTRUDED}
 * \endif
 */
public class ALARM_CHASSISINTRUDED_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 0: start 1: stop
	 * \else
	 * 0:开始 1:停止
	 * \endif
	 */
	public int                 nAction;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Time
	 * \else
	 * 报警事件发生的时间
	 * \endif
	 */
	public NET_TIME            stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                 nChannelID;
}
