package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Event type EVENT_IVS_ELEVATOR_ALARM Indicates data block description
 * \else
 * @brief 事件类型 EVENT_IVS_ELEVATOR_ALARM(电梯异常报警)对应的数据块描述信息
 * \endif
 */
public class NET_DEV_EVENT_ELEVATOR_ALARM_INFO implements Serializable {
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
     *  0: pulse,1: start, 2: stop
     * \else
     *  0:脉冲,1:开始, 2:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  Extend the protocol field
     * \else
     *  扩展协议字段
     * \endif
     */
    public NET_EVENT_INFO_EXTEND					stuEventInfoEx = new NET_EVENT_INFO_EXTEND();

    /**
     * \if ENGLISH_LANG
     *  Time when the event occurred
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					stuUTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  Event number, which uniquely identifies an event
     * \else
     *  事件编号，用来唯一标志一个事件
     * \endif
     */
    public int					nEventID;

    /**
     * \if ENGLISH_LANG
     *  Event name
     * \else
     *  事件名称 
     * \endif
     */
    public byte					szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  The alarm type triggered by the current event
     * \else
     *  当前事件触发的报警类型
     * \endif
     */
    public byte					szAlarmType[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Relative event timestamp, in milliseconds
     * \else
     *  相对事件时间戳,单位毫秒
     * \endif
     */
    public double					dbPTS;

    /**
     * \if ENGLISH_LANG
     *  Abnormal use of overspeed, maximum acceleration, m/s ^ 2
     * \else
     *  超速异常使用，最大加速度 ，m/s^2
     * \endif
     */
    public double					dbMaxAccel;

    /**
     * \if ENGLISH_LANG
     *  Abnormal use of overspeed, maximum speed m/s
     * \else
     *  超速异常使用，最大速度 m/s
     * \endif
     */
    public double					dbMaxSpeed;

    /**
     * \if ENGLISH_LANG
     *  Abnormal use of overspeed, maximum speed m/s
     * \else
     *  超速异常使用，当前速度（必须大于最大速度）m/s
     * \endif
     */
    public double					dbSpeed;

    /**
     * \if ENGLISH_LANG
     *  Abnormal use of overspeed, current acceleration m/s ^ 2
     * \else
     *  超速异常使用，当前加速度 m/s^2
     * \endif
     */
    public double					dbAccel;

    /**
     * \if ENGLISH_LANG
     *  Non level stop elevator use, floor name, lower floor. If there are no floors below that display "Bottom"
     * \else
     *  非平层停梯使用，楼层名称，下方楼层。如果下方没有楼层显示"Bottom"
     * \endif
     */
    public byte					szUnderFloor[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Non level stop elevator use, floor name, upper floor. If there are no floors above that display "Top"
     * \else
     *  非平层停梯使用，楼层名称，上方楼层。如果上方没有楼层显示"Top"
     * \endif
     */
    public byte					szUpFloor[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Abnormal temperature usage, current temperature, in degrees Celsius
     * \else
     *  温度异常使用，当前温度，单位摄氏度 
     * \endif
     */
    public int					nCurrentTemperature;

    /**
     * \if ENGLISH_LANG
     *  The preset point number triggered by the event, starting from 1, where 0 indicates that the preset point is unknown
     * \else
     *  事件触发的预置点号，从1开始，0表示预置点未知
     * \endif
     */
    public int					nPresetID;

    /**
     * \if ENGLISH_LANG
     *  Peripheral Data
     * \else
     *  外设数据
     * \endif
     */
    public double					dbPeripheralData;

    /**
     * \if ENGLISH_LANG
     *  Peripheral Address
     * \else
     *  外设地址
     * \endif
     */
    public int					nPeripheralAddress;

}