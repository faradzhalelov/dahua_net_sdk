package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  alarm of traffic driver look around  Corresponding to {@link FinalVar#SDK_ALARM_TRAFFIC_DRIVER_LOOK_AROUND}
 * \else
 *  开车左顾右盼报警事件 对应 {@link FinalVar#SDK_ALARM_TRAFFIC_DRIVER_LOOK_AROUND}
 * \endif
 */
public class ALARM_TRAFFIC_DRIVER_LOOK_AROUND implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Event operation. 0=pulse event. 1=start. 2=stop
     * \else
     *  事件动作，0表示脉冲事件，1表示持续性事件    2表示持续性事件结束
     * \endif
     */
    public     int                   nAction;

    /**
     * \if ENGLISH_LANG
     *  Channel
     * \else
     *  通道号
     * \endif
     */
    public     int					            nChannelID;

    /**
     * \if ENGLISH_LANG
     *  Time stamp (Unit is ms)
     * \else
     *  时间戳 (单位是毫秒)
     * \endif
     */
    public     double				            dbPTS;

    /**
     * \if ENGLISH_LANG
     *  Event occurrence time
     * \else
     *  事件发生的时间
     * \endif
     */
    public     NET_TIME_EX			            stuTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  Event ID
     * \else
     *  事件ID
     * \endif
     */
    public     int					            nEventID;

    /**
     * \if ENGLISH_LANG
     *  GPS info
     * \else
     *  GPS信息
     * \endif
     */
    public      NET_GPS_STATUS_INFO				stuGPSStatus   =    new NET_GPS_STATUS_INFO();
}
