package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video statistical summary
 * \else
 * 视频统计摘要信息
 * \endif
 */
public class NET_VIDEOSTAT_SUMMARY implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                     nChannelID;

	/**
	 * \if ENGLISH_LANG
	 * Rule name
	 * \else
	 * 规则名称
	 * \endif
	 */
	public byte                    szRuleName[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * Time of this statistics
	 * \else
	 * 统计时间
	 * \endif
	 */
	public NET_TIME_EX             stuTime = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * Subtotal for the entered
	 * \else
	 * 进入小计
	 * \endif
	 */
	public NET_VIDEOSTAT_SUBTOTAL  stuEnteredSubtotal = new NET_VIDEOSTAT_SUBTOTAL();

	/**
	 * \if ENGLISH_LANG
	 * Subtotal for the exited
	 * \else
	 * 出去小计
	 * \endif
	 */
	public NET_VIDEOSTAT_SUBTOTAL  stuExitedSubtotal = new NET_VIDEOSTAT_SUBTOTAL();

	/**
	 * \if ENGLISH_LANG
	 * Total number of people in the area
	 * \else
	 * 区域内人数
	 * \endif
	 */
	public int					nInsidePeopleNum;

	/**
	 * \if ENGLISH_LANG
	 * Rule type {@link EM_RULE_TYPE}
	 * \else
	 * 规则类型 {@link EM_RULE_TYPE}
	 * \endif
	 */
	public int			      emRuleType;

	/**
	 * \if ENGLISH_LANG
	 * The count of peoples left
	 * \else
	 * 离开的人数个数
	 * \endif
	 */
	public int				  nRetExitManNum;

	/**
	 * \if ENGLISH_LANG
	 * The stay time of the peoples left
	 * \else
	 * 离开人员的滞留时间信息
	 * \endif
	 */
	public NET_EXITMAN_STAY_STAT	stuExitManStayInfo[] = new NET_EXITMAN_STAY_STAT[FinalVar.MAX_EXIT_MAN_NUM];

	/**
	 * \if ENGLISH_LANG
	 *  Plan ID,Speed Dome use,start from
	 * \else
	 *  计划ID,仅球机有效,从1开始
	 * \endif
	 */
	public int					nPlanID;

	/**
	 * \if ENGLISH_LANG
	 *  Area ID(a preset point can correspond to multiple area IDs)
	 * \else
	 *  区域ID(一个预置点可以对应多个区域ID)
	 * \endif
	 */
	public int					nAreaID;

	/**
	 * \if ENGLISH_LANG
	 *  Total number of people current day in the area
	 * \else
	 *  当天区域内总人数
	 * \endif
	 */
	public int					nCurrentDayInsidePeopleNum;

	/**
	 * \if ENGLISH_LANG
	 *  Total number of non-motor vehicles in the area
	 * \else
	 *  区域内非机动车总数
	 * \endif
	 */
	public int					nInsideTotalNonMotor;

	/**
	 * \if ENGLISH_LANG
	 *  Number of non-motorized vehicles on the day
	 * \else
	 *  当天的非机动车数
	 * \endif
	 */
	public int					nInsideTodayNonMotor;

	/**
	 * \if ENGLISH_LANG
	 *  Number of non-motor vehicles stranded
	 * \else
	 *  非机动车的滞留个数
	 * \endif
	 */
	public int					nRetNonMotorNum;

	/**
	 * \if ENGLISH_LANG
	 *  Information on the detention time of non-motor vehicles
	 * \else
	 *  非机动车的滞留时间信息
	 * \endif
	 */
	public NET_NONMOTOR_STAY_STAT					stuNonMotorStayStat[] = new NET_NONMOTOR_STAY_STAT[FinalVar.MAX_EXIT_MAN_NUM];

	/**
	 * \if ENGLISH_LANG
	 *  Inside Total Pig Number
	 * \else
	 *  区域内猪只数
	 * \endif
	 */
	public int					nInsideTotalPig;

	/**
	 * \if ENGLISH_LANG
	 *  Pig Stay Stat Count
	 * \else
	 *  猪只离开滞留时间信息个数
	 * \endif
	 */
	public int					nPigStayStatCount;

	/**
	 * \if ENGLISH_LANG
	 *  Pig Stay Stat Info
	 * \else
	 *  猪只离开滞留时间信息
	 * \endif
	 */
	public NET_PIG_STAY_STAT					stuPigStayStatInfo[] = new NET_PIG_STAY_STAT[32];

	/**
	 * \if ENGLISH_LANG
	 *  Inside Today Pig Number
	 * \else
	 *  当天的猪只数
	 * \endif
	 */
	public int					nInsideTodayPig;

	/**
	 * \if ENGLISH_LANG
	 *  Passed Subtotal Info
	 * \else
	 *  经过小计
	 * \endif
	 */
	public NET_PASSED_SUBTOTAL_INFO					stuPassedSubtotal = new NET_PASSED_SUBTOTAL_INFO();

	public NET_VIDEOSTAT_SUMMARY() {
		for (int i = 0; i < stuExitManStayInfo.length; ++i) {
            stuExitManStayInfo[i] = new NET_EXITMAN_STAY_STAT();
		}
		for ( int i = 0; i < stuNonMotorStayStat.length; i ++) {
			stuNonMotorStayStat[i] = new NET_NONMOTOR_STAY_STAT();
		}
		for ( int i = 0; i < stuPigStayStatInfo.length; i ++) {
			stuPigStayStatInfo[i] = new NET_PIG_STAY_STAT();
		}
	}
}
