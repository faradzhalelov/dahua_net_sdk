package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Each external alarm of passenger Flow statistics Config
 * \else
 * @brief 控制每路外部报警是否开启对应的客流统计功能的客流统计配置
 * \endif
 */
public class NET_PASSENGER_FLOW_STAT_PASSENGER_FLOW implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * / The video channel starts with -1, where -1 indicates that the channel is not configured
     * \else
     * / 视频通道从-1开始，-1表示未配置通道
     * \endif
     */
    public int					nChannel;

}