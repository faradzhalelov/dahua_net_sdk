package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * alarm event type SDK_ALARM_SMARTMOTION_HUMAN (smart video motion detection event about human) corresponding data description info
 * \else
 * 报警事件类型SDK_ALARM_SMARTMOTION_HUMAN(智能视频移动侦测事件(人))对应的数据描述信息
 * \endif
 */
public class ALARM_SMARTMOTION_HUMAN_INFO implements Serializable {
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
    public int nChannelID;

    /**
     * \if ENGLISH_LANG
     * event occurrence time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * timestamp (unit is millisecond)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double PTS;

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
     * event action, 0 means pulse event, 1 means continuous event begin, 2 means continuous event end;
     * \else
     * 事件动作,0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public int nEventAction;

    /**
     * \if ENGLISH_LANG
     * region info of smart motion detection
     * \else
     * 智能动检区域信息
     * \endif
     */
    public NET_MOTIONDETECT_REGION_INFO stuSmartRegion[] = new NET_MOTIONDETECT_REGION_INFO[32];

    /**
     * \if ENGLISH_LANG
     * count of smart motion detection region
     * \else
     * 智能动检区域个数
     * \endif
     */
    public int nSmartRegionNum;

    /**
     * \if ENGLISH_LANG
     * count of smart motion detection objects about human
     * \else
     * 智能动检(人)对象个数
     * \endif
     */
    public int nHumanObjectNum;

    /**
     * \if ENGLISH_LANG
     * object info of smart motion detection about human
     * \else
     * 智能动检(人)对象信息
     * \endif
     */
    public NET_SMARTDETECT_HUMAN_OBJECT stuHumanObject[] = new NET_SMARTDETECT_HUMAN_OBJECT[64];

    public ALARM_SMARTMOTION_HUMAN_INFO() {
        for(int i = 0; i < 32; i ++){
            stuSmartRegion[i] = new NET_MOTIONDETECT_REGION_INFO();
        }
        for(int i = 0; i < 64; i ++){
            stuHumanObject[i] = new NET_SMARTDETECT_HUMAN_OBJECT();
        }
    }
}
