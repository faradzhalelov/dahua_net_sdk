package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Local Alarm Event, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_ALARM_EX2}, upgrade {@link FinalVar#SDK_ALARM_ALARM_EX}
 * \else
 * 本地报警事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_ALARM_EX2}, 对 {@link FinalVar#SDK_ALARM_ALARM_EX} 升级
 * \endif
 */
public class ALARM_ALARM_INFO_EX2 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                 nChannelID;
	
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
	 * Sensor Type, refer to {@link NET_SENSE_METHOD}
	 * \else
	 * 传感器类型, 取值参考 {@link NET_SENSE_METHOD}
	 * \endif
	 */
	public int                 emSenseType;

	/**
	 * \if ENGLISH_LANG
	 * Event handler
	 * \else
	 * 联动信息
	 * \endif
	 */
	public SDK_MSG_HANDLE_EX stuEventHandler = new SDK_MSG_HANDLE_EX();

	/**
	 * \if ENGLISH_LANG
	 * Defence area type,refer to {@link EM_NET_DEFENCE_AREA_TYPE}
	 * \else
	 * 防区类型,取值参考 {@link EM_NET_DEFENCE_AREA_TYPE}
	 * \endif
	 */
	public int                  emDefenceAreaType;

	/**
	 * \if ENGLISH_LANG
	 * Event ID
	 * \else
	 * 事件ID
	 * \endif
	 */
	public int						nEventID;

	/**
	 * \if ENGLISH_LANG
	 * channel name
	 * \else
	 * 通道名称
	 * \endif
	 */
	public byte[]    szName = new byte[FinalVar.SDK_COMMON_STRING_32];

	/**
	 * \if ENGLISH_LANG
	 * Event count
	 * \else
	 * 事件发生次数
	 * \endif
	 */
	public int					nCount;

	/**
	 * \if ENGLISH_LANG
	 * GPS info
	 * \else
	 * GPS信息
	 * \endif
	 */
	public  NET_GPS_STATUS_INFO stuGPS = new NET_GPS_STATUS_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  User ID
	 * \else
	 * 本地报警时登陆的用户ID
	 * \endif
	 */
	public byte[]			szUserID = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 *  User Nanme
	 * \else
	 * 本地报警时登陆的用户名
	 * \endif
	 */
	public byte[]			szUserName = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * device serial number
	 * \else
	 * 设备序列号
	 * \endif
	 */
	public byte[]			szSN = new byte[32];

}
