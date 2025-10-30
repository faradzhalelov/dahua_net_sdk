package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Reported Mini radar alarm point information
 * \else
 * @brief 上报的mini雷达报警点信息
 * \endif
 */
public class NET_MINI_RADAR_NOTIFY_ALARMPOINTINFO implements Serializable {
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

    /**
     * \if ENGLISH_LANG
     *  Number of mini radar alarm points
     * \else
     *  mini雷达报警点的数量
     * \endif
     */
    public int					nAlarmPointNum;

    /**
     * \if ENGLISH_LANG
     *  Mini radar alarm point information
     * \else
     *  mini雷达报警点信息
     * \endif
     */
    public NET_MINI_RADAR_ALARMPOINT_INFO					stuAlarmPoint[] = new NET_MINI_RADAR_ALARMPOINT_INFO[64];

    public NET_MINI_RADAR_NOTIFY_ALARMPOINTINFO() {
        for(int i = 0; i < 64; i ++){
            stuAlarmPoint[i] = new NET_MINI_RADAR_ALARMPOINT_INFO();
        }
    }
}
