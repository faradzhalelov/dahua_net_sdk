package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of speed limit, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_SPEED_LIMIT}
 * \else
 * 限速报警或路口限速报警 , 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_SPEED_LIMIT}
 * \endif
 */
public class ALARM_SPEED_LIMIT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * alarm type oLowerSpeed, UpperSpeed	
	 * \else
	 * 限速报警类别：LowerSpeed, UpperSpeed
	 * \endif
	 */
	public byte                szType[] = new byte[FinalVar.SDK_SPEEDLIMIT_TYPE_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * limit speed KM/H 
	 * \else
	 * 限速 单位KM/H 
	 * \endif
	 */
	public int                 iSpeedLimit;
	
 	/**
	 * \if ENGLISH_LANG
	 * speed KM/H
	 * \else
	 * 速度 单位KM/H
	 * \endif
	 */
	public int                 iSpeed;
	
 	/**
	 * \if ENGLISH_LANG
	 * crossing ID
	 * \else
	 * 路口序列号
	 * \endif
	 */
	public byte                szCrossingID[] = new byte[FinalVar.SDK_MAX_CROSSING_ID];
	
 	/**
	 * \if ENGLISH_LANG
	 * longitude(millionth degree, 0-360)
	 * \else
	 * 经度(单位是百万分之度，范围0-360度)如东经120.178274度表示为300178274
	 * \endif
	 */
	public int                 dwLongitude;
	
 	/**
	 * \if ENGLISH_LANG
	 * latidude(millionth degree,0-180)
	 * \else
	 * 纬度(单位是百万分之度，范围0-180度)如北纬30.183382度表示为120183382
	 * \endif
	 */
	public int                 dwLatidude;
	
 	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * 报警发生时间
	 * \endif
	 */
	public SDKDEVTIME          stTime = new SDKDEVTIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * 0-in real time,1-to fill 
	 * \else
	 * 0-实时 1-补传 
	 * \endif
	 */
	public byte                bOffline;
}
