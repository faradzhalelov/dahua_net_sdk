package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Network Offline Statistics Query Condition
 * \else
 * @brief 断网统计数据查询条件
 * \endif
 */
public class NET_NET_OFFLINE_STATISTIC_CONDITION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of channels
     * \else
     *  通道数量
     * \endif
     */
    public int					nChannelsNum;

    /**
     * \if ENGLISH_LANG
     *  Channel array
     * \else
     *  通道数组
     * \endif
     */
    public int					nChannels[] = new int[1024];

    /**
     * \if ENGLISH_LANG
     *  Query channel, starting from 0. -1 represents querying all channels. If nChannels is assigned, it will take precedence.
     * \else
     *  查询通道，从0开始，-1表示查询所有通道，如果nChannels有赋值则以nChannels为准
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Query start time
     * \else
     *  查询开始时间
     * \endif
     */
    public NET_TIME					stuStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Query end time
     * \else
     *  询结束时间
     * \endif
     */
    public NET_TIME					stuEndTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Whether to use the RealUTC field
     * \else
     *  是否使用RealUTC字段
     * \endif
     */
    public boolean					bUseRealUTC;

    /**
     * \if ENGLISH_LANG
     *  Query start time in RealUTC
     * \else
     *  查询开始时间
     * \endif
     */
    public NET_TIME					stuStartTimeRealUTC = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Query end time in RealUTC
     * \else
     *  询结束时间
     * \endif
     */
    public NET_TIME					stuEndTimeRealUTC = new NET_TIME();

}