package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Get video statistic summary info structure
 * \else
 * @brief 获取视频统计摘要信息结构体
 * \endif
 */
public class CFG_VIDEOSATA_SUMMARY_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * Statistics Channel ID
     * \else
     * 统计通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     * rule name
     * \else
     * 规则名称
     * \endif
     */
    public byte					szRuleName[] = new byte[FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * statistic time, converse to UTC
     * \else
     * 统计时间，转换到UTC
     * \endif
     */
    public CFG_NET_TIME_EX					stuStatTime = new CFG_NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Go to total
     * \else
     * 进入总计
     * \endif
     */
    public int					nEnteredTotal;

    /**
     * \if ENGLISH_LANG
     * Entered in current today
     * \else
     * 今天进入总计
     * \endif
     */
    public int					nEnteredToday;

    /**
     * \if ENGLISH_LANG
     * Entered in current month
     * \else
     * 本月进入总计
     * \endif
     */
    public int					nEnteredMonth;

    /**
     * \if ENGLISH_LANG
     * Entered in current year
     * \else
     * 今年进入总计
     * \endif
     */
    public int					nEnteredYear;

    /**
     * \if ENGLISH_LANG
     * Max Entered daily
     * \else
     * 每日最大进入总计
     * \endif
     */
    public int					nEnteredDaily;

    /**
     * \if ENGLISH_LANG
     * Exited total
     * \else
     * 出去总计
     * \endif
     */
    public int					nExitedTotal;

    /**
     * \if ENGLISH_LANG
     * Exited in today
     * \else
     * 今天出去总计
     * \endif
     */
    public int					nExitedToday;

    /**
     * \if ENGLISH_LANG
     * Exited in current month
     * \else
     * 本月出去总计
     * \endif
     */
    public int					nExitedMonth;

    /**
     * \if ENGLISH_LANG
     * Exited in current year
     * \else
     * 今年出去总计
     * \endif
     */
    public int					nExitedYear;

    /**
     * \if ENGLISH_LANG
     * Max exited daily
     * \else
     * 每日最大出去总计
     * \endif
     */
    public int					nExitedDaily;

    /**
     * \if ENGLISH_LANG
     * Average total(excluding 0)
     * \else
     * 平均所有保有统计(除去零值)
     * \endif
     */
    public int					nAvgTotal;

    /**
     * \if ENGLISH_LANG
     * Average in current today
     * \else
     * 平均今天保有统计
     * \endif
     */
    public int					nAvgToday;

    /**
     * \if ENGLISH_LANG
     * Average in current month
     * \else
     * 平均本月保有统计
     * \endif
     */
    public int					nAvgMonth;

    /**
     * \if ENGLISH_LANG
     * Average in current year         
     * \else
     * 平均今年保有统计         
     * \endif
     */
    public int					nAvgYear;

    /**
     * \if ENGLISH_LANG
     * Max in total(excluding 0)
     * \else
     * 最大所有保有统计(除去零值)
     * \endif
     */
    public int					nMaxTotal;

    /**
     * \if ENGLISH_LANG
     * Max in today
     * \else
     * 最大今天保有统计
     * \endif
     */
    public int					nMaxToday;

    /**
     * \if ENGLISH_LANG
     * Max in current month
     * \else
     * 最大本月保有统计
     * \endif
     */
    public int					nMaxMonth;

    /**
     * \if ENGLISH_LANG
     * Max in current year
     * \else
     * 最大今年保有统计
     * \endif
     */
    public int					nMaxYear;

    /**
     * \if ENGLISH_LANG
     * Inside sub total
     * \else
     * 区域内人数
     * \endif
     */
    public int					nInsideSubTotal;

    /**
     * \if ENGLISH_LANG
     * Rule type，{@link EM_CFG_RULE_TYPE}
     * \else
     * 规则类型，{@link EM_CFG_RULE_TYPE}
     * \endif
     */
    public int					emRuleType;

    /**
     * \if ENGLISH_LANG
     * The count of peoples left
     * \else
     * 离开人员的数量
     * \endif
     */
    public int					nRetExitManNum;

    /**
     * \if ENGLISH_LANG
     * The stay time of the peoples left
     * \else
     * 离开人员的滞留时间信息
     * \endif
     */
    public CFG_EXITMAN_STAY_STAT					stuExitManStayInfo[] = new CFG_EXITMAN_STAY_STAT[FinalVar.MAX_EXITMAN_NUM];

    /**
     * \if ENGLISH_LANG
     *  Entered Total Pig Number
     * \else
     *  设备运行后猪只统计总数,重启后从上次总数开始继续累加
     * \endif
     */
    public int					nEnteredTotalPig;

    /**
     * \if ENGLISH_LANG
     *  Entered Hour Pig Number
     * \else
     *  小时内的总猪只数量
     * \endif
     */
    public int					nEnteredHourPig;

    /**
     * \if ENGLISH_LANG
     *  Entered Today Pig Number
     * \else
     *  当天的总猪只数(自然天)
     * \endif
     */
    public int					nEnteredTodayPig;

    /**
     * \if ENGLISH_LANG
     *  Entered Total Pig In TimeSection Number
     * \else
     *  IPC专用，如果不执行clearSectionStat操作，等同于TodayPig猪只数
     * \endif
     */
    public int					nEnteredTotalPigInTimeSection;

    /**
     * \if ENGLISH_LANG
     *  Exited Total Pig Number
     * \else
     *  设备运行后猪只统计总数,重启后从上次总数开始继续累加
     * \endif
     */
    public int					nExitedTotalPig;

    /**
     * \if ENGLISH_LANG
     *  Exited Hour Pig Number
     * \else
     *  小时内的总猪只数量
     * \endif
     */
    public int					nExitedHourPig;

    /**
     * \if ENGLISH_LANG
     *  Exited Today Pig Number
     * \else
     *  当天的总猪只数(自然天)
     * \endif
     */
    public int					nExitedTodayPig;

    /**
     * \if ENGLISH_LANG
     *  Exited Total Pig In TimeSection Number
     * \else
     *  IPC专用，如果不执行clearSectionStat操作，等同于TodayPig猪只数
     * \endif
     */
    public int					nExitedTotalPigInTimeSection;

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
     *  Inside Pig Stay Stat Count
     * \else
     *  猪只离开滞留时间信息个数
     * \endif
     */
    public int					nInsidePigStayStatCount;

    /**
     * \if ENGLISH_LANG
     *  Inside Pig Stay Stat Info 
     * \else
     *  猪只离开滞留时间信息
     * \endif
     */
    public CFG_PIG_STAY_STAT					stuInsidePigStayStatInfo[] = new CFG_PIG_STAY_STAT[32];

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
     *  Automatically reset the number of people during the time period (IPC only, if the clearSectionStat operation is not performed, it is equivalent to the number of people on Today)
     * \else
     *  自动清零时间段内的人数（IPC专用，如果不执行clearSectionStat操作，等同于Today人数）
     * \endif
     */
    public int					nEnteredTotalInTimeSection;

    /**
     * \if ENGLISH_LANG
     *  Automatically reset the number of people during the time period (IPC only, if the clearSectionStat operation is not performed, it is equivalent to the number of people on Today)
     * \else
     *  自动清零时间段内的人数（IPC专用，如果不执行clearSectionStat操作，等同于Today人数）
     * \endif
     */
    public int					nExitedTotalInTimeSection;

    public CFG_VIDEOSATA_SUMMARY_INFO() {
        for(int i = 0; i < stuExitManStayInfo.length; i ++){
            stuExitManStayInfo[i] = new CFG_EXITMAN_STAY_STAT();
        }
        for(int i = 0; i < stuInsidePigStayStatInfo.length; i ++){
            stuInsidePigStayStatInfo[i] = new CFG_PIG_STAY_STAT();
        }
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "CFG_VIDEOSATA_SUMMARY_INFO{" +
                "nChannelID=" + nChannelID +
                ", szRuleName=" + new String(szRuleName).trim() +
                ", stuStatTime=" + stuStatTime +
                ", nEnteredTotal=" + nEnteredTotal +
                ", nEnteredToday=" + nEnteredToday +
                ", nEnteredMonth=" + nEnteredMonth +
                ", nEnteredYear=" + nEnteredYear +
                ", nEnteredDaily=" + nEnteredDaily +
                ", nExitedTotal=" + nExitedTotal +
                ", nExitedToday=" + nExitedToday +
                ", nExitedMonth=" + nExitedMonth +
                ", nExitedYear=" + nExitedYear +
                ", nExitedDaily=" + nExitedDaily +
                ", nAvgTotal=" + nAvgTotal +
                ", nAvgToday=" + nAvgToday +
                ", nAvgMonth=" + nAvgMonth +
                ", nAvgYear=" + nAvgYear +
                ", nMaxTotal=" + nMaxTotal +
                ", nMaxToday=" + nMaxToday +
                ", nMaxMonth=" + nMaxMonth +
                ", nMaxYear=" + nMaxYear +
                ", nInsideSubTotal=" + nInsideSubTotal +
                ", emRuleType=" + emRuleType +
                ", nRetExitManNum=" + nRetExitManNum +
                ", nEnteredTotalPig=" + nEnteredTotalPig +
                ", nEnteredHourPig=" + nEnteredHourPig +
                ", nEnteredTodayPig=" + nEnteredTodayPig +
                ", nEnteredTotalPigInTimeSection=" + nEnteredTotalPigInTimeSection +
                ", nExitedTotalPig=" + nExitedTotalPig +
                ", nExitedHourPig=" + nExitedHourPig +
                ", nExitedTodayPig=" + nExitedTodayPig +
                ", nExitedTotalPigInTimeSection=" + nExitedTotalPigInTimeSection +
                ", nInsideTotalPig=" + nInsideTotalPig +
                ", nInsidePigStayStatCount=" + nInsidePigStayStatCount +
                ", nInsideTodayPig=" + nInsideTodayPig +
                ", nEnteredTotalInTimeSection=" + nEnteredTotalInTimeSection +
                ", nExitedTotalInTimeSection=" + nExitedTotalInTimeSection +
                '}';
    }
}