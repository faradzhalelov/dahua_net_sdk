package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * the describe of {@link FinalVar#EVENT_ALARM_LE_HEADDETECTION}'s data
 * \else
 * 事件类型 {@link FinalVar#EVENT_ALARM_LE_HEADDETECTION} (LC人头检测事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_LE_HEADDETECTION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * ChannelId
     * \else
     * 通道号
     * \endif
     */
    public int                 nChannelID;

    /**
     * \if ENGLISH_LANG
     * Event action,1 means continuous event's begin,2means continuous event's end;
     * \else
     * 事件动作,,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public int                nAction;

    /**
     * \if ENGLISH_LANG
     * event name
     * \else
     * 事件名称
     * \endif
     */
    public byte                szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * PTS(ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double              PTS;

    /**
     * \if ENGLISH_LANG
     * the event happen time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX         UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * event ID
     * \else
     * 事件ID
     * \endif
     */
    public int                 nEventID;
}
