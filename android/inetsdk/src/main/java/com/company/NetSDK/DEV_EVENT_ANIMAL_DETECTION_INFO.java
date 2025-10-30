package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of {@link FinalVar#EVENT_IVS_ANIMAL_DETECTION}'s data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_ANIMAL_DETECTION} (动物检测事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_ANIMAL_DETECTION_INFO implements Serializable {
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
    public int                 nChannelID;

    /**
     * \if ENGLISH_LANG
     * Event action, 0: Pulse, 1: Start, 2: Stop
     * \else
     * 0:脉冲 1:开始 2:停止
     * \endif
     */
    public int                 nAction;

    /**
     * \if ENGLISH_LANG
     * event name
     * \else
     * 事件名称
     * \endif
     */
    public byte                szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * PTS(ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double              PTS;

    /**
     * \if ENGLISH_LANG
     * the event happen time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX         UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * event ID
     * \else
     * 事件ID
     * \endif
     */
    public int                 nEventID;

    /**
     * \if ENGLISH_LANG
     * Rule ID
     * \else
     * 智能事件规则编号，用于标示哪个规则触发的事件
     * \endif
     */
    public int                 nRuleID;

    /**
     * \if ENGLISH_LANG
     * Frame sequence
     * \else
     * 帧序号
     * \endif
     */
    public int                 nSequence;

    /**
     * \if ENGLISH_LANG
     * Scene image information for Animal Detection
     * \else
     * 全景广角图
     * \endif
     */
    public NET_ANIMAL_SCENE_IMAGE_INFO  stuSceneImage = new NET_ANIMAL_SCENE_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     * Animal statistics
     * \else
     * 动物统计信息
     * \endif
     */
    public NET_ANIMAL_OBJECTS_STATISTICS  stuObjectsStatistics = new NET_ANIMAL_OBJECTS_STATISTICS();

    /**
     * \if ENGLISH_LANG
     * Event class,refer to {@Link EM_CLASS_TYPE}
     * \else
     * 智能事件所属大类,参考 {@Link EM_CLASS_TYPE}
     * \endif
     */
    public int                 emClassType;

    /**
     * \if ENGLISH_LANG
     * Scene types under animal detection rules,refer to {@Link EM_DETECTION_SCENE_TYPE}
     * \else
     * 动物检测规则下的场景类型,参考 {@Link EM_DETECTION_SCENE_TYPE}
     * \endif
     */
    public int                 emDetectionSceneType;

    /**
     * \if ENGLISH_LANG
     *  image information array
     * \else
     *  图片信息数组
     * \endif
     */
    public NET_IMAGE_INFO_EX2					stuImageInfo[] = new NET_IMAGE_INFO_EX2[32];

    /**
     * \if ENGLISH_LANG
     *  Number of image information
     * \else
     *  图片信息个数
     * \endif
     */
    public int					nImageInfoNum;

    /**
     * \if ENGLISH_LANG
     *  Object List Count
     * \else
     *  区域内目标列表个数
     * \endif
     */
    public int					nObjectListCount;

    /**
     * \if ENGLISH_LANG
     *  Object List Info
     * \else
     *  区域内目标列表
     * \endif
     */
    public NET_ANIMAL_OBJECT_LIST_INFO					stuObjectListInfo[] = new NET_ANIMAL_OBJECT_LIST_INFO[64];

    public DEV_EVENT_ANIMAL_DETECTION_INFO() {
        for(int i = 0; i < 32; i ++){
            stuImageInfo[i] = new NET_IMAGE_INFO_EX2();
        }
        for(int i = 0; i < 64; i ++){
            stuObjectListInfo[i] = new NET_ANIMAL_OBJECT_LIST_INFO();
        }
    }
}
