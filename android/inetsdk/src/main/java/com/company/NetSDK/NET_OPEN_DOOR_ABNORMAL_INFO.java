package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief Door opening status abnormal alarm
 * \else
 * @brief 开门状态异常报警
 * \endif
 */
public class NET_OPEN_DOOR_ABNORMAL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The alarm in the state of opening the door is within the specified time period. When the door reaches nLongtime within the specified time period, an alarm will be generated
     * \else
     * 开门状态的报警指定时间段，在指定时间段开门达到nLongTime，产生报警
     * \endif
     */
    public NET_CFG_TIME_SCHEDULE stuODTimeSection = new NET_CFG_TIME_SCHEDULE();

    /**
     * \if ENGLISH_LANG
     * Opening time too long / min
     * \else
     * 开门过长时间/min
     * \endif
     */
    public int nLongTime;

}