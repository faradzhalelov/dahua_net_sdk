package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Abandoned object event (Corresponding to event DH_EVENT_LEFT_DETECTION) corresponding data block description information
 * \else
 * 物品遗留事件(对应事件 DH_EVENT_LEFT_DETECTION) 对应的数据块描述信息
 * \endif
 */
public class ALARM_EVENT_LEFT_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel No.
     * \else
     * 通道号
     * \endif
     */
    public int                 		nChannelID;

    /**
     * \if ENGLISH_LANG
     * Time stamp (Unit is ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double                 		PTS;

    /**
     * \if ENGLISH_LANG
     * Event occurrence time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX                 		UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Event ID
     * \else
     * 事件ID
     * \endif
     */
    public int                 		nEventID;

    /**
     * \if ENGLISH_LANG
     * Event operation. 0=pulse event.1=continues event begin. 2=continuous event stop
     * \else
     * 事件动作,0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public int                 		nEventAction;

    /**
     * \if ENGLISH_LANG
     * Rule triggered amount
     * \else
     * 规则被触发生次数
     * \endif
     */
    public int                 		nOccurrenceCount;

    /**
     * \if ENGLISH_LANG
     * Event type
     * \else
     * 事件级别
     * \endif
     */
    public int                 		nLevel;

    /**
     * \if ENGLISH_LANG
     * Event triggered preset period, starting from 1 (no unknown)
     * \else
     * 事件触发的预置点号，从1开始（没有表示未知）
     * \endif
     */
    public short                 		nPreserID;

    /**
     * \if ENGLISH_LANG
     * Preset name for event triggered
     * \else
     * 事件触发的预置名称
     * \endif
     */
    public byte                 		szPresetName[] = new byte[64];
}
