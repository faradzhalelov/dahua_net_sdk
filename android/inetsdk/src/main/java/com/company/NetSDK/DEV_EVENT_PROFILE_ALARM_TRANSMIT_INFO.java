package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event type  {@link FinalVar#EVENT_IVS_PROFILEALARMTRANSMIT} (profile alarm transmit)corresponding data profile alarm transmit info
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_PROFILEALARMTRANSMIT} (报警传输事件)对应数据块描述信息
 * \endif
 */
public class DEV_EVENT_PROFILE_ALARM_TRANSMIT_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel ID
     * \else
     * 通道号
     * \endif
     */
    public int                             nChannelID;

    /**
     * \if ENGLISH_LANG
     * Event ID
     * \else
     * 事件ID
     * \endif
     */
    public int                             nEventID;

    /**
     * \if ENGLISH_LANG
     * Event name
     * \else
     * 事件名称
     * \endif
     */
    public byte[]                             szName = new byte[128];

    /**
     * \if ENGLISH_LANG
     * PTS,Unit:ms
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double                             PTS;

    /**
     * \if ENGLISH_LANG
     * Action,0:start,1:stop
     * \else
     * 0:开始 1:停止
     * \endif
     */
    public int                             nAction;

    /**
     * \if ENGLISH_LANG
     * Event occur time
     * \else
     * 事件发生时间
     * \endif
     */
    public NET_TIME_EX                             stuTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Sense type,{@link NET_SENSE_METHOD}
     * \else
     *传感器类型,{@link NET_SENSE_METHOD}
     * \endif
     */
    public int                             emSenseMethod;

    /**
     * \if ENGLISH_LANG
     * Device source type,{@link EM_ALARM_TRANSMIT_DEV_SRC_TYPE}
     * \else
     * 报警源设备的类型,{@link EM_ALARM_TRANSMIT_DEV_SRC_TYPE}
     * \endif
     */
    public int                             emDevSrcType;

    /**
     * \if ENGLISH_LANG
     * User ID
     * \else
     * 报警用户,用于区分
     * \endif
     */
    public byte[]                             szUserID = new byte[FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * Alarm type,{@link EM_ALARM_TRANSMIT_ALARM_TYPE}
     * \else
     * 报警类型,{@link EM_ALARM_TRANSMIT_ALARM_TYPE}
     * \endif
     */
    public int                             emAlarmType;

}
