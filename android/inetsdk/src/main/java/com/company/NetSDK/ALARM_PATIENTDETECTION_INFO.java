package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Patient Detection Event, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_PATIENTDETECTION}
 * \else
 * 活动状态检测报警事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_PATIENTDETECTION}
 * \endif
 */
public class ALARM_PATIENTDETECTION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * event action,0 pulse,1 durable events begin, 2 durable events end
     * \else
     * 事件动作,0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束
     * \endif
     */
    public byte            bEventAction;

    /**
     * \if ENGLISH_LANG
     * detection type, refer to {@link EM_PATIENTDETECTION_TYPE}
     * \else
     * 活动状态检测具体类型, 取值参考 {@link EM_PATIENTDETECTION_TYPE}
     * \endif
     */
    public int            emDetectionType;

    /**
     * \if ENGLISH_LANG
     * alarm event time
     * \else
     * 报警事件发生的时间
     * \endif
     */
    public NET_TIME                 stuTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * reserved
     * \else
     * 预留字段
     * \endif
     */
    public byte[]                  byReserved = new byte[256];;

}
