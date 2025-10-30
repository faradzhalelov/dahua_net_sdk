package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of {@link FinalVar#EVENT_ALARM_SMARTMOTION_HUMAN}'s data
 * \else
 * 事件类型 {@link FinalVar#EVENT_ALARM_SMARTMOTION_HUMAN} (智能视频移动侦测事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_SMARTMOTION_HUMAN_INFO implements Serializable {
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
     * event action, 0:pulse, 1:start, 2:stop;
     * \else
     * 1:开始 2:停止
     * \endif
     */
    public int                             nAction;

    /**
     * \if ENGLISH_LANG
     * event name
     * \else
     * 事件名称
     * \endif
     */
    public byte                            szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * PTS
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double                          PTS;

    /**
     * \if ENGLISH_LANG
     * UTC
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX                     UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * event ID
     * \else
     * 事件ID
     * \endif
     */
    public int                            nEventID;

    /**
     * \if ENGLISH_LANG
     * region info of smart motion detection
     * \else
     * 智能动检区域信息
     * \endif
     */
    public NET_MOTIONDETECT_REGION_INFO    stuSmartRegion[] = new NET_MOTIONDETECT_REGION_INFO[32];

    /**
     * \if ENGLISH_LANG
     * count of smart motion detection region
     * \else
     * 智能动检区域个数
     * \endif
     */
    public int                            nSmartRegionNum;

    /**
     * \if ENGLISH_LANG
     * count of smart motion detection objects about human
     * \else
     * 智能动检(人)对象个数
     * \endif
     */
    public int                            nHumanObjectNum;

    /**
     * \if ENGLISH_LANG
     * object info of smart motion detection about human
     * \else
     * 智能动检(人)对象信息
     * \endif
     */
    public NET_SMARTDETECT_HUMAN_OBJECT    stuHumanObject[] = new NET_SMARTDETECT_HUMAN_OBJECT[64];

    public DEV_EVENT_SMARTMOTION_HUMAN_INFO(){
        for(int i = 0; i < 32; ++i)
        {
            stuSmartRegion[i] = new NET_MOTIONDETECT_REGION_INFO();
        }
        for(int j = 0; j < 64; ++j)
        {
            stuHumanObject[j] = new NET_SMARTDETECT_HUMAN_OBJECT();
        }
    }
}
