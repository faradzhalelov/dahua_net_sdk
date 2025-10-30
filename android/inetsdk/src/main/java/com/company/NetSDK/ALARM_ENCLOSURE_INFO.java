package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Electronic Fence Alarm, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_ENCLOSURE}
 * \else
 * 电子围栏报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_ENCLOSURE}
 * \endif
 */
public class ALARM_ENCLOSURE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Effective Electronic Fence Types Number 
	 * \else
	 * 有效电子围栏类型个数
	 * \endif
	 */
	public int           nTypeNumber;
	
 	/**
	 * \if ENGLISH_LANG
	 * Electronic Fence Type, refer to {@link ENCLOSURE_TYPE}
	 * \else
	 * 电子围栏类型,取值参考 {@link ENCLOSURE_TYPE}
	 * \endif
	 */
	public byte          bType[] = new byte[16];
	
 	/**
	 * \if ENGLISH_LANG
	 * The Effective Alarm Types Number 
	 * \else
	 * 有效报警类型个数
	 * \endif
	 */
	public int           nAlarmTypeNumber;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Types, refer to {@link ENCLOSURE_ALARM_TYPE}
	 * \else
	 * 报警类型, 取值参考 {@link ENCLOSURE_ALARM_TYPE}
	 * \endif
	 */
	public byte          bAlarmType[] = new byte[16];
	
 	/**
	 * \if ENGLISH_LANG
	 * Driver Job Number 
	 * \else
	 * 司机工号
	 * \endif
	 */
	public byte          szDriverId[] = new byte[FinalVar.SDK_VEHICLE_DRIVERNO_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Electronic FenceID 
	 * \else
	 * 电子围栏ID
	 * \endif
	 */
	public int          unEnclosureId;
	
 	/**
	 * \if ENGLISH_LANG
	 * Speed Limit，Unit km/h 
	 * \else
	 * 限速，单位km/h
	 * \endif
	 */
	public int          unLimitSpeed;
	
 	/**
	 * \if ENGLISH_LANG
	 * Current Speed 
	 * \else
	 * 当前速度
	 * \endif
	 */
	public int          unCurrentSpeed;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Occuring time 
	 * \else
	 * 报警发生时间
	 * \endif
	 */
	public NET_TIME      stAlarmTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * Longitude(Unit is 1/1,000,000°，Ranges From 0-360°)As East Longitude120.178274°Means 300178274 
	 * \else
	 * 经度(单位是百万分之度，范围0-360度)如东经120.178274度表示为300178274
	 * \endif
	 */
	public int         dwLongitude;
	
 	/**
	 * \if ENGLISH_LANG
	 * Latitude(Unit is 1/1,000,000°，Ranges From0-180°)As North Latitude 30.183382°Means120183382 
	 * \else
	 * 纬度(单位是百万分之度，范围0-180度)如北纬30.183382度表示为120183382
	 * \endif
	 */
	public int         dwLatidude;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0-live 1-send 
	 * \else
	 * 0-实时 1-补传 
	 * \endif
	 */
	public byte          bOffline;
}
