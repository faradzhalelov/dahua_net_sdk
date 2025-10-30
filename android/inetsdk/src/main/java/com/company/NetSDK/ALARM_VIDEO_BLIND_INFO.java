package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief alarm of video blind, (Corresponding to event SDK_ALARM_VIDEOBLIND)
 * \else
 * @brief 事件类型SDK_ALARM_VIDEOBLIND(视频遮挡事件)对应的数据块描述信息
 * \endif
 */
public class ALARM_VIDEO_BLIND_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Event operation. 1=start. 2=stop
     * \else
     * 事件动作,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  channel
     * \else
     * 通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  Time stamp (Unit is ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double					dbPTS;

    /**
     * \if ENGLISH_LANG
     *  Event occurrence time 
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX					stuTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  Event ID
     * \else
     * 事件ID
     * \endif
     */
    public int					nEventID;

    /**
     * \if ENGLISH_LANG
     *  Start time,it is Reported when nAction is 2
     * \else
     * 开始时间,nAction为2时上报此字段
     * \endif
     */
    public NET_TIME_EX					stuStartTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  GPS information
     * \else
     * GPS信息
     * \endif
     */
    public NET_GPS_STATUS_INFO					stuGPS = new NET_GPS_STATUS_INFO();

    /**
     * \if ENGLISH_LANG
     *  Event public extension field structure
     * \else
     * 事件公共扩展字段结构体
     * \endif
     */
    public NET_EVENT_INFO_EXTEND					stuEventInfoEx = new NET_EVENT_INFO_EXTEND();

}