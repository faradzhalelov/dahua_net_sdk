package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of hard braking, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_HARD_BRAKING}
 * \else
 * 急刹车报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_HARD_BRAKING}
 * \endif
 */
public class ALARM_HARD_BRAKING implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * current time
	 * \else
	 * 当前时间
	 * \endif
	 */
	public NET_TIME        stuCurTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * latidude(millionth degree,0-180)
	 * \else
	 * 纬度(单位是百万分之度，范围0-180度)如北纬30.183382度表示为120183382
	 * \endif
	 */
	public int           dwLatidude;
	
 	/**
	 * \if ENGLISH_LANG
	 * longitude(millionth degree, 0-360)
	 * \else
	 * 经度(单位是百万分之度，范围0-360度)如东经120.178274度表示为300178274
	 * \endif
	 */
	public int           dwLongitude;
	
 	/**
	 * \if ENGLISH_LANG
	 * driver id
	 * \else
	 * 驾驶员ID
	 * \endif
	 */
	public byte            szDriverNo[] = new byte[FinalVar.SDK_VEHICLE_DRIVERNO_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * current speed
	 * \else
	 * 当前速度
	 * \endif
	 */
	public int           dwCurSpeed;
}
