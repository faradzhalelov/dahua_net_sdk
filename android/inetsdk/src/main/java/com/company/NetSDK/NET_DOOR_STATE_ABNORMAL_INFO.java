package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief Door status abnormal alarm
 * \else
 * @brief 门状态异常报警
 * \endif
 */
public class NET_DOOR_STATE_ABNORMAL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The alarm of door status is within the specified time period. If the door is opened or closed within the specified time period, it is abnormal and an alarm is generated
     * \else
     * 门状态的报警指定时间段，在指定时间段开门或关门为异常，产生报警
     * \endif
     */
    public NET_CFG_TIME_SCHEDULE stuDSTimeSection = new NET_CFG_TIME_SCHEDULE();

    /**
     * \if ENGLISH_LANG
     * The state of the door. The opening state is 1 and the closing state is 0
     * \else
     * 门的状态，开门状态1表示，关门状态0表示
     * \endif
     */
    public int nDoorState;

}