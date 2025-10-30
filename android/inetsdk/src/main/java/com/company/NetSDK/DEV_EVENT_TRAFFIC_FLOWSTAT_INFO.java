package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Traffic flow information, the corresponding command {@link FinalVar#TYPE_CB_TRAFFICFLOWINFO}
 * \else
 * 交通流量统计事件, 对应命令 {@link FinalVar#TYPE_CB_TRAFFICFLOWINFO}
 * \endif
 */
public class DEV_EVENT_TRAFFIC_FLOWSTAT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * 事件名称
	 * \endif
	 */
	public byte                szName[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * time stamp(ms)
	 * \else
	 * 时间戳(单位是毫秒)
	 * \endif
	 */
	public double              PTS;

	/**
	 * \if ENGLISH_LANG
	 * occurrence time
	 * \else
	 * 事件发生的时间
	 * \endif
	 */
	public NET_TIME_EX         UTC = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * event id
	 * \else
	 * 事件ID
	 * \endif
	 */
	public int                 nEventID;

	/**
	 * \if ENGLISH_LANG
	 * channel number
	 * \else
	 * 通道总数
	 * \endif
	 */
	public int                 nLaneCnt;

	/**
	 * \if ENGLISH_LANG
	 * traffic flow state info
	 * \else
	 * 流量统计记录，是一个数组
	 * \endif
	 */
	public SDK_TRAFFICFLOWSTAT  stTrafficFlowStats[] = new SDK_TRAFFICFLOWSTAT[FinalVar.SDK_MAX_LANE_NUM];
	
	public DEV_EVENT_TRAFFIC_FLOWSTAT_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_LANE_NUM; i++) {
			stTrafficFlowStats[i] = new SDK_TRAFFICFLOWSTAT();
		}
	}
}
