package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Flux alarm channel information, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_TRAFFIC_FLUX_STAT}
 * \else
 * 流量统计报警通道信息, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_TRAFFIC_FLUX_STAT}
 * \endif
 */
public class ALARM_TRAFFIC_FLUX_LANE_INFO implements Serializable {
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
	public NET_TIME            stuCurTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * lane number
	 * \else
	 * 车道号
	 * \endif
	 */
	public int                 nLane;
	
 	/**
	 * \if ENGLISH_LANG
	 * state:1-traffic jam, 2-traffic jam recover, 3-normal 4-break, 5-break recover
	 * \else
	 * 状态值：1-表示拥堵, 2-表示拥堵恢复, 3-表示正常, 4-表示中断, 5-表示中断恢复
	 * \endif
	 */
	public int                 nState;
	
 	/**
	 * \if ENGLISH_LANG
	 * flow value,unit:per/second
	 * \else
	 * 流量值，单位：辆/分
	 * \endif
	 */
	public int                 nFlow;
}
