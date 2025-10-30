package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Warning line event (Corresponding to event  SDK_EVENT_CROSSLINE_DETECTION)
 * \else
 * 警戒线事件(对应事件 SDK_EVENT_CROSSLINE_DETECTION)
 * \endif
 */
public class ALARM_EVENT_CROSSLINE_INFO implements Serializable {
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
    public int nChannelID;

    /**
     * \if ENGLISH_LANG
     * Time stamp (Unit is ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double PTS;

    /**
     * \if ENGLISH_LANG
     * Event occurrence time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Event ID
     * \else
     * 事件ID
     * \endif
     */
    public int nEventID;

    /**
     * \if ENGLISH_LANG
     * Event operation. 0=pulse event.1=continious event begin. 2=continuous event stop
     * \else
     * 事件动作,0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public int nEventAction;

    /**
     * \if ENGLISH_LANG
     * Intrusion direction
     * \else
     * 入侵方向
     * \endif
     */
    public int emCrossDirection;

    /**
     * \if ENGLISH_LANG
     * Triggered amount
     * \else
     * 规则被触发生次数
     * \endif
     */
    public int nOccurrenceCount;

    /**
     * \if ENGLISH_LANG
     * Event type
     * \else
     * 事件级别
     * \endif
     */
    public int nLevel;

    /**
     * \if ENGLISH_LANG
     * Target information detection enablement
     * \else
     * 是否检测到物体信息
     * \endif
     */
    public boolean bIsObjectInfo;

    /**
     * \if ENGLISH_LANG
     * Object information detected
     * \else
     * 检测到的物体信息
     * \endif
     */
    public SDK_MSG_OBJECT stuObject = new SDK_MSG_OBJECT();

    /**
     * \if ENGLISH_LANG
     * Actually returns multiple detected object information
     * \else
     * 实际返回多个检测到的物体信息
     * \endif
     */
    public int nRetObjectNum;

    /**
     * \if ENGLISH_LANG
     * Multiple detected object information
     * \else
     * 多个检测到的物体信息
     * \endif
     */
    public SDK_MSG_OBJECT stuObjects[] = new SDK_MSG_OBJECT[FinalVar.MAX_TARGET_OBJECT_NUM];

    public ALARM_EVENT_CROSSLINE_INFO() {
        for(int i = 0; i < FinalVar.MAX_TARGET_OBJECT_NUM; i ++){
            stuObjects[i] = new SDK_MSG_OBJECT();
        }
    }

    public ALARM_EVENT_CROSSLINE_INFO(int nRetObjectNum) {
        this.nRetObjectNum = nRetObjectNum;
        for(int i = 0; i < nRetObjectNum; i ++){
            stuObjects[i] = new SDK_MSG_OBJECT();
        }
    }
}
