package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Passed Subtotal Info
 * \else
 * @brief 经过小计信息
 * \endif
 */
public class NET_PASSED_SUBTOTAL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The total number of people after the equipment is running
     * \else
     *  设备运行后经过人数统计总数
     * \endif
     */
    public int					nTotal;

    /**
     * \if ENGLISH_LANG
     *  total number of people during the hour
     * \else
     *  小时内的总人数
     * \endif
     */
    public int					nHour;

    /**
     * \if ENGLISH_LANG
     *  The total number of people on the day (natural days)
     * \else
     *  当天的总人数(自然天)
     * \endif
     */
    public int					nToday;

    /**
     * \if ENGLISH_LANG
     *  IPC only, if the clearSectionStat operation is not performed, it is equivalent to the number of Today
     * \else
     *  IPC专用，如果不执行clearSectionStat操作，等同于Today人数
     * \endif
     */
    public int					nTotalInTimeSection;

}