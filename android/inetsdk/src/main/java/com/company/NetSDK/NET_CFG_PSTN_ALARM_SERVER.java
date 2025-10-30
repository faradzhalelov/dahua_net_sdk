package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Telephone alarm center linkage information
 * \else
 * 电话报警中心联动信息
 * \endif
 */
public class NET_CFG_PSTN_ALARM_SERVER implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Whether to report to the telephone alarm center
     * \else
     * 是否上报至电话报警中心
     * \endif
     */
    public boolean				bNeedReport;

    /**
     * \if ENGLISH_LANG
     * Number of telephone alarm servers
     * \else
     * 电话报警服务器个数
     * \endif
     */
    public int					    nServerCount;

    /**
     * \if ENGLISH_LANG
     * Reported by the alarm center
     * \else
     * 上报的报警中心下标
     * \endif
     */
    public byte[] 				    byDestination = new byte[FinalVar.CFG_MAX_PSTN_SERVER_NUM];
}
