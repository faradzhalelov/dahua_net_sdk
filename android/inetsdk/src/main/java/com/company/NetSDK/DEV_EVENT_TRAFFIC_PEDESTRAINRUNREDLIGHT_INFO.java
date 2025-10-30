package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Data description info of the event type {@link FinalVar#EVENT_IVS_TRAFFIC_PEDESTRAINRUNREDLIGHT},(trafic-pedestrian redlight running
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_TRAFFIC_PEDESTRAINRUNREDLIGHT},(交通-行人闯红灯事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_TRAFFIC_PEDESTRAINRUNREDLIGHT_INFO implements  Serializable {
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
    public int                  nChannelID;

    /**
     * \if ENGLISH_LANG
     * Event name
     * \else
     * 事件名称
     * \endif
     */
    public byte[]               szName = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Time stamp (unit is ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double               PTS;

    /**
     * \if ENGLISH_LANG
     * Event occurrence time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX           UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Event ID
     * \else
     * 事件ID
     * \endif
     */
    public int                  nEventID;

    /**
     * \if ENGLISH_LANG
     * Corresponding lane No.
     * \else
     * 对应车道号
     * \endif
     */
    public int                  nLane;

    /**
     * \if ENGLISH_LANG
     * Pedestrian info
     * \else
     * 行人信息
     * \endif
     */
    public SDK_MSG_OBJECT        stuObject = new SDK_MSG_OBJECT();

    /**
     * \if ENGLISH_LANG
     * Corresponding file inof of the event
     * \else
     * 事件对应文件信息
     * \endif
     */
    public SDK_EVENT_FILE_INFO  stuFileInfo = new SDK_EVENT_FILE_INFO();

    /**
     * \if ENGLISH_LANG
     * Snap SN. Such as 3,2,1,1 means stop snap. 0= abnormal stop.
     * \else
     * 表示抓拍序号,如3,2,1,1表示抓拍结束,0表示异常结束
     * \endif
     */
    public int                  nSequence;

    /**
     * \if ENGLISH_LANG
     * Event operation. 0=pulse event. 1=continious event begin, 2=continuous event stop
     * \else
     * 事件动作,0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public byte                 bEventAction;

    /**
     * \if ENGLISH_LANG
     * Image SN. There can be several images at the same time (unit:second). Begins with 0.
     * \else
     * 图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
     * \endif
     */
    public byte                 byImageIndex;

    /**
     * \if ENGLISH_LANG
     * Snap mark (by byte), 0bit:"*",1bit:"Timing",2bit:"Manual",3bit:"Marked",4bit:"Event",5bit:"Mosaic",6bit:"Cutout".
     * \else
     * 抓图标志(按位), 0位:"*",1位:"Timing",2位:"Manual",3位:"Marked",4位:"Event",5位:"Mosaic",6位:"Cutout".
     * \endif
     */
    public int                  dwSnapFlagMask;

    /**
     * \if ENGLISH_LANG
     * Corresponding image resolution
     * \else
     * 对应图片的分辨率
     * \endif
     */
    public SDK_RESOLUTION_INFO  stuResolution = new SDK_RESOLUTION_INFO();

    /**
     * \if ENGLISH_LANG
     * Public info
     * \else
     * 公共信息
     * \endif
     */
    public EVENT_COMM_INFO      stCommInfo;

    public DEV_EVENT_TRAFFIC_PEDESTRAINRUNREDLIGHT_INFO() {
        this.stCommInfo = new EVENT_COMM_INFO();
    }

    public DEV_EVENT_TRAFFIC_PEDESTRAINRUNREDLIGHT_INFO(int nDriversNum) {
        this.stCommInfo = new EVENT_COMM_INFO(nDriversNum);
    }
}
