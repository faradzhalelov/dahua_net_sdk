package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Human body ARGtemp_meas events information
 * \else
 * 人体测温检测事件信息
 * \endif
 */
public class DEV_EVENT_ANATOMY_TEMP_DETECT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel
     * \else
     * 通道号
     * \endif
     */
    public int                 nChannelID;

    /**
     * \if ENGLISH_LANG
     * Action,1:start 2:stop
     * \else
     * 1:开始 2:停止
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
    public byte          szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * timestamp,Unit:ms
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double                 PTS;

    /**
     * \if ENGLISH_LANG
     * event occur time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX          UTC = new NET_TIME_EX();

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
     *  Category of intelligent events,{@link EM_CLASS_TYPE}
     * \else
     * 智能事件所属大类,{@link EM_CLASS_TYPE}
     * \endif
     */
    public int                 emClassType;

    /**
     * \if ENGLISH_LANG
     * The preset point number triggered by the event starts from 1. If there is no such field, it means the preset point is unknown
     * \else
     * 事件触发的预置点号, 从1开始, 没有该字段,表示预置点未知
     * \endif
     */
    public int                 nPresetID;

    /**
     * \if ENGLISH_LANG
     * Temperature information of personnel in the area
     * \else
     * 区域内人员体温信息
     * \endif
     */
    public NET_MAN_TEMP_INFO          stManTempInfo = new NET_MAN_TEMP_INFO();

    /**
     * \if ENGLISH_LANG
     * Panorama of visible light
     * \else
     * 可见光全景图
     * \endif
     */
    public NET_VIS_SCENE_IMAGE          stVisSceneImage = new NET_VIS_SCENE_IMAGE();

    /**
     * \if ENGLISH_LANG
     * Thermal panorama
     * \else
     * 热成像全景图
     * \endif
     */
    public NET_THERMAL_SCENE_IMAGE          stThermalSceneImage = new NET_THERMAL_SCENE_IMAGE();

    /**
     * \if ENGLISH_LANG
     * Frame number
     * \else
     * 帧序号
     * \endif
     */
    public int                 nSequence;

    /**
     * \if ENGLISH_LANG
     * Event correlation ID
     * \else
     * 事件关联ID
     * \endif
     */
    public int                 nEventRelevanceID;

    /**
     * \if ENGLISH_LANG
     * whether has been target recognition
     * \else
     * 是否做过后智能的目标识别
     * \endif
     */
    public boolean                 bIsFaceRecognition;
}
