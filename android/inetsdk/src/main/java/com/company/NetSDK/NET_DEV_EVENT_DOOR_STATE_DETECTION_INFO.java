package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief The description information of the data block corresponding to the event type EVENT_IVS_DOOR_STATE_DETECTION(Door opening and closing detection event)
 * \else
 * @brief 事件类型 EVENT_IVS_DOOR_STATE_DETECTION(开关门检测事件)对应的数据块描述信息
 * \endif
 */
public class NET_DEV_EVENT_DOOR_STATE_DETECTION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel ID
     * \else
     * 通道号
     * \endif
     */
    public int nChannelID;

    /**
     * \if ENGLISH_LANG
     * Event action 0:pulse,1:start, 2:stop
     * \else
     * 事件类型 0:脉冲,1:开始, 2:停止
     * \endif
     */
    public int nAction;

    /**
     * \if ENGLISH_LANG
     * Event Name
     * \else
     * 事件名称
     * \endif
     */
    public byte szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Category of intelligent events
     * \else
     * 智能事件所属大类
     * \endif
     */
    public byte szClass[] = new byte[16];

    /**
     * \if ENGLISH_LANG
     * Rule ID
     * \else
     * 智能事件规则编号
     * \endif
     */
    public int nRuleID;

    /**
     * \if ENGLISH_LANG
     * Group ID
     * \else
     * GroupID事件组ID，同一物体抓拍过程内GroupID相同
     * \endif
     */
    public int nGroupID;

    /**
     * \if ENGLISH_LANG
     * Count In Group
     * \else
     * CountInGroup一个事件组内的抓拍张数
     * \endif
     */
    public int nCountInGroup;

    /**
     * \if ENGLISH_LANG
     * Index In Group
     * \else
     * IndexInGroup一个事件组内的抓拍序号，从1开始
     * \endif
     */
    public int nIndexInGroup;

    /**
     * \if ENGLISH_LANG
     * Relative event timestamp in milliseconds
     * \else
     * 相对事件时间戳,(单位是毫秒)
     * \endif
     */
    public double dbPTS;

    /**
     * \if ENGLISH_LANG
     * Time of occurrence
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX stuUTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Time of occurrence in milliseconds
     * \else
     * 事件时间毫秒数
     * \endif
     */
    public int nUTCMS;

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
     * The preset point number triggered by the event. There is no such field from 1, indicating that the preset point is unknown
     * \else
     * 事件触发的预置点号，从1开始没有该字段，表示预置点未知
     * \endif
     */
    public int nPresetID;

    /**
     * \if ENGLISH_LANG
     * Number of detection areas
     * \else
     * 检测区个数
     * \endif
     */
    public int nDetectRegionNum;

    /**
     * \if ENGLISH_LANG
     * Detection area
     * \else
     * 检测区
     * \endif
     */
    public NET_POINT stuDetectRegion[] = new NET_POINT[20];

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
     * Alarm type: abnormal door status or abnormal door opening
     * \else
     * 报警类型 门状态异常或开门异常
     * \endif
     */
    public byte szAlarmType[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Door status abnormal alarm
     * \else
     * 门状态异常报警
     * \endif
     */
    public NET_DOOR_STATE_ABNORMAL_INFO stuDoorStateAbnormal = new NET_DOOR_STATE_ABNORMAL_INFO();

    /**
     * \if ENGLISH_LANG
     * Door opening status abnormal alarm
     * \else
     * 开门状态异常报警
     * \endif
     */
    public NET_OPEN_DOOR_ABNORMAL_INFO stuOpenDoorAbnormal = new NET_OPEN_DOOR_ABNORMAL_INFO();

    /**
     * \if ENGLISH_LANG
     * Detect object information of the target
     * \else
     * 检测目标的物体信息
     * \endif
     */
    public SDK_MSG_OBJECT[] pstuObjects;

    /**
     * \if ENGLISH_LANG
     * Number of object information detected by the target
     * \else
     * 检测目标的物体信息个数
     * \endif
     */
    public int nObjectsNum;

    public NET_DEV_EVENT_DOOR_STATE_DETECTION_INFO() {
        for (int i = 0; i < 20; i++) {
            this.stuDetectRegion[i] = new NET_POINT();
        }
    }

    public NET_DEV_EVENT_DOOR_STATE_DETECTION_INFO(int nObjectsNum) {
        this.nObjectsNum = nObjectsNum;
        pstuObjects = new SDK_MSG_OBJECT[nObjectsNum];

        for (int i = 0; i < 20; i++) {
            this.stuDetectRegion[i] = new NET_POINT();
        }
        for (int i = 0; i < nObjectsNum; i++) {
            this.pstuObjects[i] = new SDK_MSG_OBJECT();
        }
    }
}