package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Fatigue Driving Alarm, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_TIREDDRIVE}
 * \else
 * 疲劳驾驶报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_TIREDDRIVE}
 * \endif
 */
public class ALARM_TIREDDRIVE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * struct size
	 * \else
	 * 0:开始 1:停止
	 * \endif
	 */
	public int               nAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:stop 1:start
	 * \else
	 * 持续驾驶时间，单位分钟
	 * \endif
	 */
	public int               nDriveTime;
	
 	/**
	 * \if ENGLISH_LANG
	 * drive time, unit:minute
	 * \else
	 * 事件发生时间
	 * \endif
	 */
	public NET_TIME          stTime = new NET_TIME();
}
