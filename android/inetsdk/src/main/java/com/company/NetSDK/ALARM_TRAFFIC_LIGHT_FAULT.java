package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * traffic light fault alarm, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_TRAFFIC_LIGHT_FAULT}
 * \else
 * 交通灯故障报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_TRAFFIC_LIGHT_FAULT}
 * \endif
 */
public class ALARM_TRAFFIC_LIGHT_FAULT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * alarm time
	 * \else
	 * 报警发生时间
	 * \endif
	 */
	public NET_TIME           stTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * info number
	 * \else
	 * 故障信息数
	 * \endif
	 */
	public int                nInfoNumber;
	
 	/**
	 * \if ENGLISH_LANG
	 * info
	 * \else
	 * 交通灯故障信息
	 * \endif
	 */
	public LIGHT_INFO         stLightInfo[] = new LIGHT_INFO[8];
	
	public ALARM_TRAFFIC_LIGHT_FAULT() {
		for (int i = 0; i < 8; i++) {
			stLightInfo[i] = new LIGHT_INFO();
		}
	}
}
