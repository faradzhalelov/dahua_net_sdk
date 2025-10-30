package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of {@link FinalVar#EVENT_IVS_FLOATINGOBJECT_DETECTION}'s data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_FLOATINGOBJECT_DETECTION} (漂浮物检测事件) 对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_FLOATINGOBJECT_DETECTION_INFO implements Serializable {
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
     * The point list of rule detect region
     * \else
     * 规则检测区域
     * \endif
     */
    public SDK_POINT[]					DetectRegion = new SDK_POINT[FinalVar.SDK_MAX_DETECT_REGION_NUM];

    /**
     * \if ENGLISH_LANG
     * The point number of rule detect region
     * \else
     * 规则检测区域顶点数
     * \endif
     */
    public int					nDetectRegionNum;

    /**
     * \if ENGLISH_LANG
     * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
     * \else
     * 图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
     * \endif
     */
    public int					nImageIndex;

    /**
     * \if ENGLISH_LANG
     * snapshot mark (by bit), see NET_RESERVED_COMMON
     * \else
     * 抓图标志(按位),具体见NET_RESERVED_COMMON
     * \endif
     */
    public int					dwSnapFlagMask;

    /**
     * \if ENGLISH_LANG
     * the source device's index,-1 means data in invalid
     * \else
     * 事件源设备上的index,-1表示数据无效
     * \endif
     */
    public int					nSourceIndex;

    /**
     * \if ENGLISH_LANG
     * the source device's sign(exclusive),field said local device does not exist or is empty
     * \else
     * 事件源设备唯一标识,字段不存在或者为空表示本地设备
     * \endif
     */
    public char[]					szSourceDevice = new char[FinalVar.MAX_PATH];

    /**
     * \if ENGLISH_LANG
     * event trigger accumilated times
     * \else
     * 事件触发累计次数
     * \endif
     */
    public int					nOccurrenceCount;

    /**
     * \if ENGLISH_LANG
     * have being detected objects number
     * \else
     * 检测到的物体个数
     * \endif
     */
    public int					nObjectNum;

    /**
     * \if ENGLISH_LANG
     * have being detected objects
     * \else
     * 检测到的物体
     * \endif
     */
    public SDK_MSG_OBJECT[]					stuObjects = new SDK_MSG_OBJECT[FinalVar.HDBJ_MAX_OBJECTS_NUM];

    /**
     * \if ENGLISH_LANG
     * Intelli comm info
     * \else
     * 智能事件公共信息
     * \endif
     */
    public EVENT_INTELLI_COMM_INFO					stuIntelliCommInfo;

    /**
     * \if ENGLISH_LANG
     * Preset name
     * \else
     * 事件触发的预置名称
     * \endif
     */
    public char[]					szPresetName = new char[64];

    /**
     * \if ENGLISH_LANG
     * Is floating object exist
     * \else
     * 是否存在漂浮物
     * \endif
     */
    public boolean					bExistFloatingObject;

    /**
     * \if ENGLISH_LANG
     * Data type
     * \else
     * 事件数据类型
     * \endif
     */
    public NET_EM_EVENT_DATA_TYPE					emEventType;

    /**
     * \if ENGLISH_LANG
     * The current proportion of flotage(relative to detection area) Unit:%, Range[0, 100]
     * \else
     * 漂浮物当前占比（相对于检测区域）单位:%, 取值范围[0, 100]
     * \endif
     */
    public float					fCurrentRatio;

    /**
     * \if ENGLISH_LANG
     * The alarm threshold of proportion, Range[0, 100]
     * \else
     * 报警阈值。漂浮物相对于检测区域的占比, 取值范围[0, 100]
     * \endif
     */
    public float					fAlarmThreshold;

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

    /**
     * \if ENGLISH_LANG
     * Mask info of floating object
     * \else
     * 堆积物点阵图信息
     * \endif
     */
    public NET_FLOATINGOBJECT_MASK_INFO					stuObjectMaskInfo;

}
