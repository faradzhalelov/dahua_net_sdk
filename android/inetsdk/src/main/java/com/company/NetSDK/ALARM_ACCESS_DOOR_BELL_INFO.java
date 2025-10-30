package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  Door bell, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_ACCESS_DOOR_BELL}
 * \else
 *  门锁响铃事件, 对应接口{@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_ACCESS_DOOR_BELL}
 * \endif
 */
public class ALARM_ACCESS_DOOR_BELL_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * 通道号
	 * \endif
	 */
	public int nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * event occurrence time
	 * \else
	 * 事件发生的时间
	 * \endif
	 */
	public NET_TIME_EX  stuTime = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Access control name
	 * \else
	 * 门禁名称
	 * \endif
	 */
	public byte[]  szName = new byte[FinalVar.SDK_MAX_NAME_LEN];
	/**
	 * \if ENGLISH_LANG
	 * Serial number of wireless device
	 * \else
	 * 无线配件序列号
	 * \endif
	 */
	public byte[]  szWirelessDevSN = new byte[FinalVar.MAX_COMMON_STRING_32];

}
