package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of {@link FinalVar#EVENT_IVS_WATER_LEVEL_DETECTION}'s data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_WATER_LEVEL_DETECTION} (水位检测事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_WATER_LEVEL_DETECTION_INFO implements Serializable {
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
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     * Event action, 0: Pulse, 1: Start, 2: Stop
     * \else
     * 事件动作,0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     * Evnet name
     * \else
     * 事件名称
     * \endif
     */
    public char[]               szName = new char[FinalVar.MAX_EVENT_NAME];

    /**
     * \if ENGLISH_LANG
     * Timestamp (in milliseconds)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double					PTS;

    /**
     * \if ENGLISH_LANG
     * Time for the event occurred
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX					UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Event ID
     * \else
     * 事件ID
     * \endif
     */
    public int					nEventID;

    /**
     * \if ENGLISH_LANG
     * Event corresponding to file information
     * \else
     * 事件对应文件信息
     * \endif
     */
    public SDK_EVENT_FILE_INFO					stuFileInfo;

    /**
     * \if ENGLISH_LANG
     * Intelligent common information
     * \else
     * 智能事件公共信息
     * \endif
     */
    public EVENT_INTELLI_COMM_INFO					stuIntelliCommInfo;

    /**
     * \if ENGLISH_LANG
     * Preset name
     * \else
     * 预置点名称
     * \endif
     */
    public char[]					szPresetName = new char[64];

    /**
     * \if ENGLISH_LANG
     * Object ID
     * \else
     * 智能物体全局唯一物体标识
     * \endif
     */
    public char[]					szObjectUUID = new char[48];

    /**
     * \if ENGLISH_LANG
     * Event type
     * \else
     * 事件数据类型
     * \endif
     */
    public NET_EM_EVENT_DATA_TYPE					emEventType;

    /**
     * \if ENGLISH_LANG
     * Water level status
     * \else
     * 水位状态
     * \endif
     */
    public NET_EM_WATER_LEVEL_STATUS					emStatus;

    /**
     * \if ENGLISH_LANG
     * Ruler of water level
     * \else
     * 水位尺
     * \endif
     */
    public NET_WATER_RULER					stuWaterRuler;

    /**
     * \if ENGLISH_LANG
     * Original image information
     * \else
     * 原始图
     * \endif
     */
    public NET_INTELLIGENCE_IMAGE_INFO					stuOriginalImage;

    /**
     * \if ENGLISH_LANG
     * Scene image information
     * \else
     * 球机变到最小倍下的抓图
     * \endif
     */
    public NET_INTELLIGENCE_IMAGE_INFO					stuSceneImage;

}
