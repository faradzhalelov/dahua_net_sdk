package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * video statistical subtotal
 * \else
 * 视频统计小计信息
 * \endif
 */
public class NET_VIDEOSTAT_SUBTOTAL implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 *  count since device operation
	 * \else
	 *  设备运行后人数统计总数
	 * \endif
	 */
	public int					nTotal;

	/**
	 * \if ENGLISH_LANG
	 *  count in the last hour
	 * \else
	 *  小时内的总人数
	 * \endif
	 */
	public int					nHour;

	/**
	 * \if ENGLISH_LANG
	 *  count for today
	 * \else
	 *  当天的总人数, 不可手动清除
	 * \endif
	 */
	public int					nToday;

	/**
	 * \if ENGLISH_LANG
	 *  count for today, on screen display
	 * \else
	 *  统计人数, 用于OSD显示, 可手动清除
	 * \endif
	 */
	public int					nOSD;

	/**
	 * \if ENGLISH_LANG
	 *  The total number of non-motorized vehicles after the equipment is running, and the total number will continue to accumulate after restarting
	 * \else
	 *  设备运行后非机动车统计总数,重启后从上次总数开始继续累加
	 * \endif
	 */
	public int					nTotalNonMotor;

	/**
	 * \if ENGLISH_LANG
	 *  Total number of non-motor vehicles in an hour
	 * \else
	 *  小时内的总非机动车数量
	 * \endif
	 */
	public int					nHourNonMotor;

	/**
	 * \if ENGLISH_LANG
	 *  The total number of non-motorized vehicles on the day (natural day)
	 * \else
	 *  当天的总非机动车数(自然天)
	 * \endif
	 */
	public int					nTodayNonMotor;

	/**
	 * \if ENGLISH_LANG
	 *  The total number of pigs after the equipment is running
	 * \else
	 *  设备运行后猪只统计总数,重启后从上次总数开始继续累加
	 * \endif
	 */
	public int					nTotalPig;

	/**
	 * \if ENGLISH_LANG
	 *  Total number of pigs in the hour
	 * \else
	 *  小时内的总猪只数量
	 * \endif
	 */
	public int					nHourPig;

	/**
	 * \if ENGLISH_LANG
	 *  Total pigs for the day
	 * \else
	 *  当天的总猪只数(自然天)
	 * \endif
	 */
	public int					nTodayPig;

	/**
	 * \if ENGLISH_LANG
	 *  It is dedicated to IPC. If the clearSectionStat operation is not performed, it is equivalent to the number of pigs in TodayPig
	 * \else
	 *  IPC专用，如果不执行clearSectionStat操作，等同于TodayPig猪只数。
	 * \endif
	 */
	public int					nTotalPigInTimeSection;

	@java.lang.Override
	public java.lang.String toString() {
		return "NET_VIDEOSTAT_SUBTOTAL{" +
				"nTotal=" + nTotal +
				", nHour=" + nHour +
				", nToday=" + nToday +
				", nOSD=" + nOSD +
				", nTotalNonMotor=" + nTotalNonMotor +
				", nHourNonMotor=" + nHourNonMotor +
				", nTodayNonMotor=" + nTodayNonMotor +
				", nTotalPig=" + nTotalPig +
				", nHourPig=" + nHourPig +
				", nTodayPig=" + nTodayPig +
				", nTotalPigInTimeSection=" + nTotalPigInTimeSection +
				'}';
	}
}
