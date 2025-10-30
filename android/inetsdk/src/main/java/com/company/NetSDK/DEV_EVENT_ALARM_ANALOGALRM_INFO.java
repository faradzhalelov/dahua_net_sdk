package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief Alarm event type EVENT_ALARM_ANALOGALARM(analog alarm channel alarm),
 * \else
 * @brief 报警事件类型 EVENT_ALARM_ANALOGALARM(模拟量报警通道报警),
 * \endif
 */
public class DEV_EVENT_ALARM_ANALOGALRM_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * (video)channel no.
     * \else
     * (视频)通道号
     * \endif
     */
    public int nChannelID;

    /**
     * \if ENGLISH_LANG
     * analog alarm channel name
     * \else
     * 模拟量报警通道名称
     * \endif
     */
    public byte szName[] = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * time stamp(unit is ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double PTS;

    /**
     * \if ENGLISH_LANG
     * event time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * event ID
     * \else
     * 事件ID
     * \endif
     */
    public int nEventID;

    /**
     * \if ENGLISH_LANG
     * event corresponding file info
     * \else
     * 事件对应文件信息
     * \endif
     */
    public SDK_EVENT_FILE_INFO stuFileInfo = new SDK_EVENT_FILE_INFO();

    /**
     * \if ENGLISH_LANG
     * analog alarm channel no.
     * \else
     * 模拟量报警通道号
     * \endif
     */
    public int nIndex;

    /**
     * \if ENGLISH_LANG
     * sensor type,{@link NET_SENSE_METHOD}
     * \else
     * 传感器类型,{@link NET_SENSE_METHOD}
     * \endif
     */
    public int emSensor;

    /**
     * \if ENGLISH_LANG
     * data status, -1:unknown,0:normal,1:invalid data(over meansure),
     * \else
     * 数据状态, -1:未知,0:正常,1:数据无效(超过量程),
     * \endif
     */
    public int nStatus;

    /**
     * \if ENGLISH_LANG
     * detector value
     * \else
     * 探测器数值
     * \endif
     */
    public float fValue;

    /**
     * \if ENGLISH_LANG
     * data collection time(UTC)
     * \else
     * 数据采集时间(UTC)
     * \endif
     */
    public NET_TIME stuCollectTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * snapshotmark(by bit), see NET_RESERVED_COMMON
     * \else
     * 抓图标志(按位),具体见NET_RESERVED_COMMON
     * \endif
     */
    public int dwSnapFlagMask;

    /**
     * \if ENGLISH_LANG
     * event action, 0 means impulse event,1 means continuous event start,2 means continuous event end;
     * \else
     * 事件动作,0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public byte bEventAction;

    /**
     * \if ENGLISH_LANG
     * Unit of sensor value,{@link NET_TEMPERATURE_UNIT}
     * \else
     * 传感器数值单位,{@link NET_TEMPERATURE_UNIT}
     * \endif
     */
    public int emTemperatureUnit;

}
