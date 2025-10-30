package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DST Time
 * \else
 *  DST时间
 * \endif
 */
public class AV_CFG_DSTTime implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Year, 2000~2038
     * \else
     * 年, 2000~2038
     * \endif
     */
    public int			nYear;

    /**
     * \if ENGLISH_LANG
     *  Month, 1~12
     * \else
     * 月, 1~12
     * \endif
     */
    public int			nMonth;

    /**
     * \if ENGLISH_LANG
     * The week, 1-The 1st,2-The 2nd,...,-1-The last,0-calculate by date
     * \else
     * 第几周, 1-第一周,2-第二周,...,-1-最后一周,0-按日期计算
     * \endif
     */
    public int			nWeek;

    /**
     * \if ENGLISH_LANG
     * Week or date
     * \else
     * 星期几或日期; 按周计算时, 0-周日, 1-周一,..., 6-周六; 按日期算时, 表示几号, 1~31
     * \endif
     */
    public int			nDay;

    /**
     * \if ENGLISH_LANG
     * Hour
     * \else
     * 时
     * \endif
     */
    public int			nHour;

    /**
     * \if ENGLISH_LANG
     * Minute
     * \else
     * 分
     * \endif
     */
    public int			nMinute;

    @Override
    public String toString() {
        return "AV_CFG_DSTTime{" +
                "nYear=" + nYear +
                ", nMonth=" + nMonth +
                ", nWeek=" + nWeek +
                ", nDay=" + nDay +
                ", nHour=" + nHour +
                ", nMinute=" + nMinute +
                '}';
    }
}
