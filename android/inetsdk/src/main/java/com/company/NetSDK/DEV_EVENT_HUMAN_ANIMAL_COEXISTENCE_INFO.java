package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief The description information of the data block corresponding to the event type EVENT_IVS_HUMAN_ANIMAL_COEXISTENCE (Human Animal Coexistence event)
 * \else
 * @brief 事件类型 EVENT_IVS_HUMAN_ANIMAL_COEXISTENCE (人和动物检测事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_HUMAN_ANIMAL_COEXISTENCE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel ID
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  Event action 0:pulse,1:start, 2:stop
     * \else
     *  事件动作, 1:开始 2:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  Event Name
     * \else
     *  事件名称
     * \endif
     */
    public byte					szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Relative event timestamp in milliseconds
     * \else
     *  时间戳(单位是毫秒)
     * \endif
     */
    public double					dbPTS;

    /**
     * \if ENGLISH_LANG
     *  Time of occurrence
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					stuUTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  Time of occurrence in milliseconds
     * \else
     *  事件时间毫秒数
     * \endif
     */
    public int					nUTCMS;

    /**
     * \if ENGLISH_LANG
     *  Class Type,{@link EM_CLASS_TYPE}
     * \else
     *  智能事件所属大类,{@link EM_CLASS_TYPE}
     * \endif
     */
    public int					emClassType;

    /**
     * \if ENGLISH_LANG
     *  Rule ID
     * \else
     *  规则ID, 用于标示哪个规则触发的事件
     * \endif
     */
    public int					nRuleID;

    /**
     * \if ENGLISH_LANG
     *  Group ID
     * \else
     *  事件组ID，同一物体抓拍过程内GroupID相同
     * \endif
     */
    public int					nGroupID;

    /**
     * \if ENGLISH_LANG
     *  Count In Group
     * \else
     *  一个事件组内的抓拍张数
     * \endif
     */
    public int					nCountInGroup;

    /**
     * \if ENGLISH_LANG
     *  Index In Group
     * \else
     *  一个事件组内的抓拍序号, 从1开始
     * \endif
     */
    public int					nIndexInGroup;

    /**
     * \if ENGLISH_LANG
     *  EventID
     * \else
     *  事件ID
     * \endif
     */
    public int					nEventID;

    /**
     * \if ENGLISH_LANG
     *  PresetID, Starting from 1, 0 means invalid
     * \else
     *  事件触发的预置点号，从1开始, 0 表示无效
     * \endif
     */
    public int					nPresetID;

    /**
     * \if ENGLISH_LANG
     *  Alarm Type,{@link EM_HUMAN_ANIMAL_ALARM_TYPE}
     * \else
     *  事件报警类型,{@link EM_HUMAN_ANIMAL_ALARM_TYPE}
     * \endif
     */
    public int					emAlarmType;

    /**
     * \if ENGLISH_LANG
     *  Detection Scene Type,{@link EM_DETECTION_SCENE_TYPE}
     * \else
     *  场景类型,{@link EM_DETECTION_SCENE_TYPE}
     * \endif
     */
    public int					emDetectionSceneType;

}