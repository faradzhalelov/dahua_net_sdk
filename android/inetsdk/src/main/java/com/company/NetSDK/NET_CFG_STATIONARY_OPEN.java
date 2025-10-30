package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Gateway stationary open config
 * \else
 * @brief 道闸常开配置
 * \endif
 */
public class NET_CFG_STATIONARY_OPEN implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  enable
     * \else
     *  使能
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  stationary open time schedule
     * \else
     *  常开模式执行时间段
     * \endif
     */
    public NET_CFG_TIME_SCHEDULE					stTimeShecule = new NET_CFG_TIME_SCHEDULE();

}