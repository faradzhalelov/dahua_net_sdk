package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Battery Voltage Overlow Alarm, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_BATTERYLOWPOWER}
 * \else
 * 电池电压过低报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_BATTERYLOWPOWER}
 * \endif
 */
public class ALARM_BATTERYLOWPOWER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0:Start 1:Stop 
	 * \else
	 * 0:开始 1:停止
	 * \endif
	 */
	public int               nAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * Surplus Power %，Unit%
	 * \else
	 * 剩余电量百分比，单位%
	 * \endif
	 */
	public int               nBatteryLeft;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event Time 
	 * \else
	 * 事件发生时间
	 * \endif
	 */
	public NET_TIME          stTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * channel no. Mark sub-device battery. Begins with 0.
	 * \else
	 * 通道号, 标识子设备电池, 从0开始
	 * \endif
	 */
	public int               nChannelID;
}
