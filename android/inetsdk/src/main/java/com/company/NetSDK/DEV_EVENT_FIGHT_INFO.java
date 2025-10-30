package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief the describe of EVENT_IVS_FIGHTDETECTION's data
 * \else
 * @brief 事件类型EVENT_IVS_FIGHTDETECTION(斗殴事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_FIGHT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * ChannelId
     * \else
     * 通道号
     * \endif
     */
    public int nChannelID;

    /**
     * \if ENGLISH_LANG
     * event name
     * \else
     * 事件名称
     * \endif
     */
    public byte szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * PTS(ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double PTS;

    /**
     * \if ENGLISH_LANG
     * the event happen time
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
     * have being detected object number
     * \else
     * 检测到的物体个数
     * \endif
     */
    public int nObjectNum;

    /**
     * \if ENGLISH_LANG
     * have being detected object list
     * \else
     * 检测到的物体列表
     * \endif
     */
    public SDK_MSG_OBJECT stuObjectIDs[] = new SDK_MSG_OBJECT[FinalVar.SDK_MAX_OBJECT_LIST];

    /**
     * \if ENGLISH_LANG
     * event file info
     * \else
     * 事件对应文件信息
     * \endif
     */
    public SDK_EVENT_FILE_INFO stuFileInfo = new SDK_EVENT_FILE_INFO();

    /**
     * \if ENGLISH_LANG
     * Event action,0 means pulse event,1 means continuous event's begin,2means continuous event's end;
     * \else
     * 事件动作,0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public byte bEventAction;

    /**
     * \if ENGLISH_LANG
     * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
     * \else
     * 图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
     * \endif
     */
    public byte byImageIndex;

    /**
     * \if ENGLISH_LANG
     * detect region point
     * \else
     * 规则检测区域顶点数
     * \endif
     */
    public int nDetectRegionNum;

    /**
     * \if ENGLISH_LANG
     * detect region
     * \else
     * 规则检测区域
     * \endif
     */
    public SDK_POINT DetectRegion[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_REGION_NUM];

    /**
     * \if ENGLISH_LANG
     * flag(by bit),see NET_RESERVED_COMMON
     * \else
     * 抓图标志(按位),具体见NET_RESERVED_COMMON
     * \endif
     */
    public int dwSnapFlagMask;

    /**
     * \if ENGLISH_LANG
     * the source device's index,-1 means data in invalid
     * \else
     * 事件源设备上的index,-1表示数据无效
     * \endif
     */
    public int nSourceIndex;

    /**
     * \if ENGLISH_LANG
     * the source device's sign(exclusive),field said local device does not exist or is empty
     * \else
     * 事件源设备唯一标识,字段不存在或者为空表示本地设备
     * \endif
     */
    public byte szSourceDevice[] = new byte[FinalVar.MAX_PATH];

    /**
     * \if ENGLISH_LANG
     * event trigger accumilated times
     * \else
     * 事件触发累计次数
     * \endif
     */
    public int nOccurrenceCount;

    /**
     * \if ENGLISH_LANG
     * intelli comm info
     * \else
     * 智能事件公共信息
     * \endif
     */
    public EVENT_INTELLI_COMM_INFO stuIntelliCommInfo = new EVENT_INTELLI_COMM_INFO();

    /**
     * \if ENGLISH_LANG
     * Extension info
     * \else
     * 扩展信息
     * \endif
     */
    public NET_EXTENSION_INFO stuExtensionInfo = new NET_EXTENSION_INFO();

    /**
     * \if ENGLISH_LANG
     * Event source ID. The application scenario is different analysis of the same object or the same picture, resulting in the same sourceid of multiple events
     * \else
     * 事件关联ID。应用场景是同一个物体或者同一张图片做不同分析，产生的多个事件的SourceID相同
     * \endif
     */
    public byte szSourceID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Action Type
     * \else
     * 动作类型
     * \endif
     */
    public int emActionType;

    /**
     * \if ENGLISH_LANG
     * Panoramic wide-angle map
     * \else
     * 全景广角图
     * \endif
     */
    public SCENE_IMAGE_INFO stuSceneImage = new SCENE_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     * Image information array
     * \else
     * 图片信息数组
     * \endif
     */
    public NET_IMAGE_INFO_EX2[] pstuImageInfo;

    /**
     * \if ENGLISH_LANG
     * Number of picture information
     * \else
     * 图片信息个数
     * \endif
     */
    public int nImageInfoNum;

    public DEV_EVENT_FIGHT_INFO() {
        for (int i = 0; i < FinalVar.SDK_MAX_OBJECT_LIST; i++) {
            this.stuObjectIDs[i] = new SDK_MSG_OBJECT();
        }
        for (int i = 0; i < FinalVar.SDK_MAX_DETECT_REGION_NUM; i++) {
            this.DetectRegion[i] = new SDK_POINT();
        }
        this.nImageInfoNum = 0;
        this.pstuImageInfo = new NET_IMAGE_INFO_EX2[0];
    }

    public DEV_EVENT_FIGHT_INFO(int nImageInfoNum) {
        for (int i = 0; i < FinalVar.SDK_MAX_OBJECT_LIST; i++) {
            this.stuObjectIDs[i] = new SDK_MSG_OBJECT();
        }
        for (int i = 0; i < FinalVar.SDK_MAX_DETECT_REGION_NUM; i++) {
            this.DetectRegion[i] = new SDK_POINT();
        }
        this.nImageInfoNum = nImageInfoNum;
        this.pstuImageInfo = new NET_IMAGE_INFO_EX2[nImageInfoNum];
        for (int i = 0; i < nImageInfoNum; i++) {
            this.pstuImageInfo[i] = new NET_IMAGE_INFO_EX2();
        }
    }
}
