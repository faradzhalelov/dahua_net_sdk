package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm transmission event, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_PROFILE_ALARM_TRANSMIT}
 * \else
 * 报警传输事件,对应 {@link INetSDK#StartListenEx}，命令为{@link FinalVar#SDK_ALARM_PROFILE_ALARM_TRANSMIT}
 * \endif
 */
public class ALARM_PROFILE_ALARM_TRANSMIT_INFO implements Serializable {
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
    public int                             nChannelID;

    /**
     * \if ENGLISH_LANG
     * 0:Start 1:Stop
     * \else
     * 0:开始 1:停止
     * \endif
     */
    public int                             nAction;

    /**
     * \if ENGLISH_LANG
     * time-to-event
     * \else
     * 事件发生时间
     * \endif
     */
    public NET_TIME                        stuTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * Sensor Type,{@link NET_SENSE_METHOD}
     * \else
     * 传感器类型，{@link NET_SENSE_METHOD}
     * \endif
     */
    public int                emSenseMethod;

    /**
     * \if ENGLISH_LANG
     * Alarm users, to distinguish
     * \else
     * 报警用户,用于区分
     * \endif
     */
    public byte                            szUserID[] = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * The type of alarm source device,{@link EM_ALARM_TRANSMIT_DEV_SRC_TYPE}
     * \else
     * 报警源设备的类型,{@link EM_ALARM_TRANSMIT_DEV_SRC_TYPE}
     * \endif
     */
    public int  emDevSrcType;

    /**
     * \if ENGLISH_LANG
     * alarm transmit alarm type,{@link EM_ALARM_TRANSMIT_ALARM_TYPE}
     * \else
     * 报警类型,{@link EM_ALARM_TRANSMIT_ALARM_TYPE}
     * \endif
     */
    public int    emAlarmType;

}
