package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event type DH_ALARM_ANIMAL_DETECTION (Animal detection event) corresponding data block description information
 * \else
 * 事件类型DH_ALARM_ANIMAL_DETECTION (动物检测事件) 对应的数据块描述信息
 * \endif
 */
public class ALARM_ANIMAL_DETECTION_INFO implements Serializable {
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
    public int                 		nChannelID;

    /**
     * \if ENGLISH_LANG
     * action, 0: pulse, 1:start, 2:end
     * \else
     * 事件动作,0表示脉冲事件,1表示事件开始,2表示事件结束;
     * \endif
     */
    public int                 		nAction;

    /**
     * \if ENGLISH_LANG
     * Timestamp (unit is milliseconds)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double                 		dbPTS;

    /**
     * \if ENGLISH_LANG
     * event name
     * \else
     * 事件名称
     * \endif
     */
    public byte[]                 		szName = new byte[FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Time when the event occurred
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX                 		stuTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * The category to which the smart event belongs
     * \else
     * 智能事件所属大类
     * \endif
     */
    public int                 		emClassType;

    /**
     * \if ENGLISH_LANG
     * event ID
     * \else
     * 事件ID
     * \endif
     */
    public int                 		nEventID;

    /**
     * \if ENGLISH_LANG
     * Smart event rule number, used to indicate which rule triggered the event
     * \else
     * 智能事件规则编号，用于标示哪个规则触发的事件
     * \endif
     */
    public int                 		nRuleID;

    /**
     * \if ENGLISH_LANG
     * frame sequence number
     * \else
     * 帧序号
     * \endif
     */
    public int                 		nSequence;

    /**
     * \if ENGLISH_LANG
     * Panoramic wide-angle image
     * \else
     * 全景广角图
     * \endif
     */
    public NET_ANIMAL_SCENE_IMAGE_INFO                 		stuSceneImage = new NET_ANIMAL_SCENE_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     * animal statistics
     * \else
     * 动物统计信息
     * \endif
     */
    public NET_ANIMAL_OBJECTS_STATISTICS                 		stuObjectsStatistics = new NET_ANIMAL_OBJECTS_STATISTICS();

    /**
     * \if ENGLISH_LANG
     * Scene type under animal detection rules
     * \else
     * 动物检测规则下的场景类型
     * \endif
     */
    public int                 		emDetectionSceneType;
}
