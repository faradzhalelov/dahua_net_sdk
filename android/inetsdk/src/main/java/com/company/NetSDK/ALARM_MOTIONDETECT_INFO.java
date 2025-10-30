package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * video motion detection event, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_EVENT_MOTIONDETECT}
 * \else
 * 视频移动侦测事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_EVENT_MOTIONDETECT }
 * \endif
 */
public class ALARM_MOTIONDETECT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel number
     * \else
     * 通道号
     * \endif
     */
    public int              nChannelID;

    /**
     * \if ENGLISH_LANG
     * timestamp (unit is millisecond)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double              PTS;

    /**
     * \if ENGLISH_LANG
     * event occurrence time
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

    /**
     * \if ENGLISH_LANG
     * event action, 0 means pulse event, 1 means continuous event begin, 2 means continuous event end;
     * \else
     * 事件动作,0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public int                 nEventAction;
}
