package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device added support channel subscription event collection
 * \else
 * 设备新增支持按通道订阅的事件集合
 * \endif
 */
public class NET_SUPPORT_CHANNEL_SUBSCRIBE_EVENT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Is the profilealarmtransmit event supported
     * \else
     * 是否支持 ProfileAlarmTransmit事件
     * \endif
     */
    public boolean					bIsSupportProfileAlarmTransmit;

    /**
     * \if ENGLISH_LANG
     *　Is this the callnoanswered event
     * \else
     * 是否支持 CallNoAnswered 事件
     * \endif
     */
    public boolean					bIsSupportCallNoAnswered;
}
