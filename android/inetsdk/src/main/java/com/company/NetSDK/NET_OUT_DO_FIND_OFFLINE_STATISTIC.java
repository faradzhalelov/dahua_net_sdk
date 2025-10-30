package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Output parameter for the CLIENT_DoFindOfflineStatistic interface
 * \else
 * @brief CLIENT_DoFindOfflineStatistic 接口出参
 * \endif
 */
public class NET_OUT_DO_FIND_OFFLINE_STATISTIC implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of network offline statistics data information returned
     * \else
     *  返回的断网统计数据信息数量
     * \endif
     */
    public int					nOfflineStatisticInfoNum;

    /**
     * \if ENGLISH_LANG
     *  Network offline statistics data information
     * \else
     *  断网统计数据信息
     * \endif
     */
    public NET_NET_OFFLINE_STATISTIC_INFO					stuOfflineStatisticInfo[] = new NET_NET_OFFLINE_STATISTIC_INFO[1024];

    public NET_OUT_DO_FIND_OFFLINE_STATISTIC() {
        for(int i = 0; i < 1024; i ++) {
            this.stuOfflineStatisticInfo[i] = new NET_NET_OFFLINE_STATISTIC_INFO();
        }
    }
}