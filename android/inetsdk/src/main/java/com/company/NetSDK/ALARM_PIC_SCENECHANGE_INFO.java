package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief the describe of SDK_ALARM_SCENNE_CHANGE_ALARM's data
 * \else
 * @brief  场景变更事件 StartListen(对应事件 SDK_ALARM_SCENNE_CHANGE_ALARM)
 * \endif
 */
public class ALARM_PIC_SCENECHANGE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel ID
     * \else
     * 通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  Continuous event action: 1 means start,2 means stop;
     * \else
     * 持续型事件动作,  1表示开始, 2表示停止
     * \endif
     */
    public int					nEventAction;

    /**
     * \if ENGLISH_LANG
     *  PTS(ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double					dbPTS;

    /**
     * \if ENGLISH_LANG
     *  The event happen time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX					stuUTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  event ID
     * \else
     * 事件ID
     * \endif
     */
    public int					nEventID;

}