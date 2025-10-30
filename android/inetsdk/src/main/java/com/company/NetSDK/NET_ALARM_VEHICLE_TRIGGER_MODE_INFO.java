package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief Event type SDK_ALARM_VEHICLE_TRIGGER_MODE (Car Customization: Trigger Mode Event)Description of the data block
 * \else
 * @brief 事件类型 SDK_ALARM_VEHICLE_TRIGGER_MODE (触发模式事件)对应的数据块描述信息
 * \endif
 */
public class NET_ALARM_VEHICLE_TRIGGER_MODE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel ID
     * \else
     * 通道号
     * \endif
     */
    public int nChannelID;

    /**
     * \if ENGLISH_LANG
     * 0: Pulse,1: start, 2: stop
     * \else
     * 0:脉冲,1:开始, 2:停止
     * \endif
     */
    public int nAction;

    /**
     * \if ENGLISH_LANG
     * Expand the protocol field
     * \else
     * 扩展协议字段
     * \endif
     */
    public NET_EVENT_INFO_EXTEND stuEventInfoEx = new NET_EVENT_INFO_EXTEND();

    /**
     * \if ENGLISH_LANG
     * start time
     * \else
     * 开始时间
     * \endif
     */
    public NET_TIME_EX stuStartTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * stop time
     * \else
     * 结束时间
     * \endif
     */
    public NET_TIME_EX stuStopTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * url path
     * \else
     * Url路径
     * \endif
     */
    public byte szUrl[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * Basic data of police vehicles
     * \else
     * 警车基础数据
     * \endif
     */
    public NET_POLICE_VEHICLE_DATA stuPoliceVehicleData = new NET_POLICE_VEHICLE_DATA();

}