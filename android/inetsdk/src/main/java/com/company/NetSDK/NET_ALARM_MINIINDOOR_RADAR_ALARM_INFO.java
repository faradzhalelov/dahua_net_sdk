package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Mini Radar alarm event(corresponding to SDK_ALARM_MINIINDOOR_RADAR_ALARM)
 * \else
 * @brief Mini雷达报警事件(对应 SDK_ALARM_MINIINDOOR_RADAR_ALARM)
 * \endif
 */
public class NET_ALARM_MINIINDOOR_RADAR_ALARM_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel ID
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  Event Action 0:Pulse 1:Start 2:Stop
     * \else
     *  事件动作, 1:开始 2:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  Event Name
     * \else
     *  事件名称
     * \endif
     */
    public byte					szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Event category
     * \else
     *  事件所属大类
     * \endif
     */
    public byte					szClass[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Event ID
     * \else
     *  事件编号，用来唯一标志一个事件
     * \endif
     */
    public int					nEventID;

    /**
     * \if ENGLISH_LANG
     *  Time of event
     * \else
     *  事件发生的时间,单位秒
     * \endif
     */
    public NET_TIME_EX					stuUTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  Timestamp (unit milliseconds)
     * \else
     *  时间戳(单位是毫秒)
     * \endif
     */
    public double					dbPTS;

    /**
     * \if ENGLISH_LANG
     *  Event time in milliseconds
     * \else
     *  UTC时间对应的毫秒数
     * \endif
     */
    public int					nUTCMS;

    /**
     * \if ENGLISH_LANG
     *  Abnormal breathing (vital signs radar use)
     * \else
     *  呼吸异常(生命体征雷达使用)
     * \endif
     */
    public boolean					bBreatheAbnormal;

    /**
     * \if ENGLISH_LANG
     *  Abnormal heartbeat (vital signs radar use)
     * \else
     *  心跳异常(生命体征雷达使用)
     * \endif
     */
    public boolean					bHeartBeatAbnormal;

    /**
     * \if ENGLISH_LANG
     *  Abnormal out of bed (vital signs radar use)
     * \else
     *  在离床异常(生命体征雷达使用)
     * \endif
     */
    public boolean					bAFBStatusAbnormal;

    /**
     * \if ENGLISH_LANG
     *  Fall alarm (indoor radar)
     * \else
     *  跌倒报警(室内雷达)
     * \endif
     */
    public boolean					bFallAlarm;

    /**
     * \if ENGLISH_LANG
     *  Abnormal number of people (indoor radar)
     * \else
     *  人数异常(室内雷达)
     * \endif
     */
    public boolean					bNumAbnormal;

}
