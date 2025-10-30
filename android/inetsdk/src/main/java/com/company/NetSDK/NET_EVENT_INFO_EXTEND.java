package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Event public field extension structure: This structure is only used for common field expansion of common alarm event type (without graph alarm event type) and intelligent alarm event type (with graph alarm event type)
 * \else
 * @brief 事件公共字段扩展结构体: 该结构体仅用于 普通报警事件类型(不带图报警事件类型) 和 智能报警事件类型(带图报警事件类型) 的公共字段扩展使用
 * \endif
 */
public class NET_EVENT_INFO_EXTEND implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether RealUTC is valid, when bRealUTC is TRUE, use stuRealUTC, otherwise the stuRealUTC field is invalid (use the event occurrence time/event trigger time (UTC) field in the original event structure)
     * \else
     *  RealUTC 是否有效，bRealUTC 为 TRUE 时，用 stuRealUTC，否则 stuRealUTC 字段无效(用原事件结构体中的 事件发生时间/事件触发时间(UTC) 字段)
     * \endif
     */
    public boolean					bRealUTC;

    /**
     * \if ENGLISH_LANG
     *  The time when the event occurred (standard UTC time (without time zone daylight saving time offset)), due to the difference in the use of the UTC time of the event between product lines, RealUTC is added as the standard UTC time, and the platform receives The first priority of event parsing is RealUTC, followed by UTC.
     * \else
     *  事件发生的时间(标准UTC时间(不带时区夏令时偏差)), 由于事件的UTC时间在产品线之间使用的差异性, 故增加RealUTC作为标准UTC时间, 平台在收到事件解析首优先级是RealUTC, 其次是UTC.
     * \endif
     */
    public NET_TIME_EX					stuRealUTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  is enable EventsType
     * \else
     *  事件类型是否有效
     * \endif
     */
    public boolean					bIsEventsTypeValid;

    /**
     * \if ENGLISH_LANG
     *  Event type: This parameter is valid when bIsEventsTypeValid is TRUE. 0: normal capture event. 1: Email linkage capture event.
     * \else
     *  事件类型, bIsEventsTypeValid为TRUE时有效, 0:正常抓图事件, 1:邮件联动抓图事件(图片通过第二路抓图码流上来，和正常抓图的图片可以不一样)
     * \endif
     */
    public int					szEventsType;
}
