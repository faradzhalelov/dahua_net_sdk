package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Period of time to open the door
 * \else
 * 分时段开门
 * \endif
 */
public class CFG_DOOROPEN_TIMESECTION_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Period of time
     * \else
     * 时间段
     * \endif
     */
    public CFG_TIME_PERIOD stuTime = new CFG_TIME_PERIOD();

    /**
     * \if ENGLISH_LANG
     * Open doow method,refer to CFG_DOOR_OPEN_METHOD
     * \else
     * 开门模式，参考
     * \endif
     */
    public int             emDoorOpenMethod;

}
