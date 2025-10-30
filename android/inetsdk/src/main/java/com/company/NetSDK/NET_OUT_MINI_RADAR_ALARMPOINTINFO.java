package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Subscribe to the alarm point information output parameters of mini radar(Corresponding interface CLIENT_AttachMiniRadarAlarmPointInfo)
 * \else
 * @brief 订阅mini雷达的报警点信息出参(对应接口 CLIENT_AttachMiniRadarAlarmPointInfo)
 * \endif
 */
public class NET_OUT_MINI_RADAR_ALARMPOINTINFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Sid of the subscription                           
     * \else
     *  订阅的SID                           
     * \endif
     */
    public int					nSID;

}
