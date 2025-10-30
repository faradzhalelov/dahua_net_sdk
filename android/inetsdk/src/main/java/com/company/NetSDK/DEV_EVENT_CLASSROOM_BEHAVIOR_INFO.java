package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief Corresponding to data block description of event type EVENT_IVS_CLASSROOM_BEHAVIOR (classroom dehavior detect)
 * \else
 * @brief 事件类型 EVENT_IVS_CLASSROOM_BEHAVIOR (课堂行为分析事件) 对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_CLASSROOM_BEHAVIOR_INFO implements Serializable {
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
     * Event action, 0: Pulse, 1: Start, 2: Stop
     * \else
     * 0:脉冲 1:开始 2:停止
     * \endif
     */
    public int nAction;

    /**
     * \if ENGLISH_LANG
     * Event name
     * \else
     * 事件名称
     * \endif
     */
    public byte szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Timestamp (in milliseconds)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double PTS;

    /**
     * \if ENGLISH_LANG
     * Time for the event occurred
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX UTC = new NET_TIME_EX();

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
     * Event corresponding to file information
     * \else
     * 事件对应文件信息
     * \endif
     */
    public SDK_EVENT_FILE_INFO stuFileInfo = new SDK_EVENT_FILE_INFO();

    /**
     * \if ENGLISH_LANG
     * Class type
     * \else
     * 智能事件所属大类
     * \endif
     */
    public int emClassType;

    /**
     * \if ENGLISH_LANG
     * Rule ID
     * \else
     * 智能事件规则编号，用于标示哪个规则触发的事件
     * \endif
     */
    public int nRuleID;

    /**
     * \if ENGLISH_LANG
     * Object ID
     * \else
     * 物体ID
     * \endif
     */
    public int nObjectID;

    /**
     * \if ENGLISH_LANG
     * Sequence
     * \else
     * 帧序号
     * \endif
     */
    public int nSequence;

    /**
     * \if ENGLISH_LANG
     * Classroom action
     * \else
     * 课堂行为动作
     * \endif
     */
    public int emClassroomAction;

    /**
     * \if ENGLISH_LANG
     * The point list of rule detect region
     * \else
     * 规则检测区域
     * \endif
     */
    public NET_POINT stuDetectRegion[] = new NET_POINT[FinalVar.SDK_MAX_DETECT_REGION_NUM];

    /**
     * \if ENGLISH_LANG
     * The point number of rule detect region
     * \else
     * 规则检测区域顶点数
     * \endif
     */
    public int nDetectRegionNum;

    /**
     * \if ENGLISH_LANG
     * Preset ID
     * \else
     * 事件触发的预置点号
     * \endif
     */
    public int nPresetID;

    /**
     * \if ENGLISH_LANG
     * Preset name
     * \else
     * 事件触发的预置点名称
     * \endif
     */
    public byte szPresetName[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * Serial UUID
     * \else
     * 智能物体全局唯一物体标识
     * \endif
     */
    public byte szSerialUUID[] = new byte[22];

    /**
     * \if ENGLISH_LANG
     * Bounding box
     * \else
     * 包围盒
     * \endif
     */
    public SDK_RECT stuBoundingBox = new SDK_RECT();

    /**
     * \if ENGLISH_LANG
     * Scene image
     * \else
     * 底图信息
     * \endif
     */
    public NET_INTELLIGENCE_IMAGE_INFO stuSceneImage = new NET_INTELLIGENCE_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     * image
     * \else
     * 小图信息
     * \endif
     */
    public NET_INTELLIGENCE_IMAGE_INFO stuFaceImage = new NET_INTELLIGENCE_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     * attributes
     * \else
     * 属性
     * \endif
     */
    public NET_FACE_ATTRIBUTE_EX stuFaceAttributes = new NET_FACE_ATTRIBUTE_EX();

    /**
     * \if ENGLISH_LANG
     * image information array
     * \else
     * 图片信息数组
     * \endif
     */
    public NET_IMAGE_INFO_EX2 stuImageInfo[] = new NET_IMAGE_INFO_EX2[32];

    /**
     * \if ENGLISH_LANG
     * Number of image information
     * \else
     * 图片信息个数
     * \endif
     */
    public int nImageInfoNum;

    public DEV_EVENT_CLASSROOM_BEHAVIOR_INFO() {
        for(int i = 0; i < FinalVar.SDK_MAX_DETECT_REGION_NUM; i ++){
            this.stuDetectRegion[i] = new NET_POINT();
        }
        for(int i = 0; i < 32; i ++){
            this.stuImageInfo[i] = new NET_IMAGE_INFO_EX2();
        }
    }
}