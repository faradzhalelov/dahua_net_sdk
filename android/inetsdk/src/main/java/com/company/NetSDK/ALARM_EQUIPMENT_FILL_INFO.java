package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Light CompensationDevice Fault Alarm, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_EQUIPMENT_FILL_ALARM_EX}
 * \else
 * 补光设备故障报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_EQUIPMENT_FILL_ALARM_EX}
 * \endif
 */
public class ALARM_EQUIPMENT_FILL_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Vehicle Lane No. 
	 * \else
	 * 车道号
	 * \endif
	 */
	public int                 nDriveWayID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Occuring Time 
	 * \else
	 * 报警发生时间
	 * \endif
	 */
	public NET_TIME            stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Status，0 Means Fault Recovery，1 Means Fault Occurs 
	 * \else
	 * 设备状态，0表示故障恢复，1表示发生故障
	 * \endif
	 */
	public int                 nState;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Channel No. 
	 * \else
	 * 报警的通道号
	 * \endif
	 */
	public int                 dwChannel;
}
