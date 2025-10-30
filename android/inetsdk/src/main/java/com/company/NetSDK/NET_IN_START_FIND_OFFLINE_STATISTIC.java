package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Input parameter for the CLIENT_StartFindOfflineStatistic interface
 * \else
 * @brief CLIENT_StartFindOfflineStatistic 接口入参
 * \endif
 */
public class NET_IN_START_FIND_OFFLINE_STATISTIC implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Query condition
     * \else
     *  查询条件
     * \endif
     */
    public NET_NET_OFFLINE_STATISTIC_CONDITION					stuCondition = new NET_NET_OFFLINE_STATISTIC_CONDITION();

}