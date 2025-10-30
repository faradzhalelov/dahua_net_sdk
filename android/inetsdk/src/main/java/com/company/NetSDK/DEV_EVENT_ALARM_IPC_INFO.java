package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of {@link FinalVar#EVENT_IVS_ALARM_IPC} data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_ALARM_IPC} (DVR/NVR设备上的IPC报警)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_ALARM_IPC_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * channel
     * \else
     * 通道号
     * \endif
     */
    public int                 			nChannelID;

    /**
     * \if ENGLISH_LANG
     * event name
     * \else
     * 事件名称
     * \endif
     */
    public byte                			szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Timestamp (in milliseconds)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double              			PTS;

    /**
     * \if ENGLISH_LANG
     * Time for the event occurred
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX         			UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Event ID
     * \else
     * 事件ID
     * \endif
     */
    public int                 			nEventID;

    /**
     * \if ENGLISH_LANG
     * Event action, 0: start, 1: stop
     * \else
     * 0:开始 1:停止
     * \endif
     */
    public int                             nAction;

}
