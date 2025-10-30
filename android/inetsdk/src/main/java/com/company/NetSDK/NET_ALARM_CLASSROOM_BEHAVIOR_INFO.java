package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Event type SDK_ALARM_CLASSROOM_BEHAVIOR_INFO Corresponding information
 * \else
 * @brief 事件类型 SDK_ALARM_CLASSROOM_BEHAVIOR_INFO (课堂行为分析事件) 对应的数据块描述信息
 * \endif
 */
public class NET_ALARM_CLASSROOM_BEHAVIOR_INFO implements Serializable {
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
     *  0: Pulse,1: start, 2: stop
     * \else
     *  0:脉冲 1:开始 2:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  Extend the protocol field
     * \else
     *  事件公共扩展字段结构体
     * \endif
     */
    public NET_EVENT_INFO_EXTEND					stuEventInfoEx = new NET_EVENT_INFO_EXTEND();

    /**
     * \if ENGLISH_LANG
     *  Time when the event occurred
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					stuUTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  RuleID
     * \else
     *  智能事件规则编号
     * \endif
     */
    public int					nRuleID;

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
     *  Event Class
     * \else
     *  智能事件所属大类
     * \endif
     */
    public byte					szClass[] = new byte[16];

    /**
     * \if ENGLISH_LANG
     *  Object ID
     * \else
     *  物体ID
     * \endif
     */
    public int					nObjectID;

    /**
     * \if ENGLISH_LANG
     *  Event ID
     * \else
     *  事件ID
     * \endif
     */
    public int					nEventID;

    /**
     * \if ENGLISH_LANG
     *  Sequence
     * \else
     *  帧序号
     * \endif
     */
    public int					nSequence;

    /**
     * \if ENGLISH_LANG
     *  Group ID
     * \else
     *  事件组ID
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
     *  一个事件组内的抓拍序号
     * \endif
     */
    public int					nIndexInGroup;

    /**
     * \if ENGLISH_LANG
     *  Preset ID
     * \else
     *  事件触发的预置点号
     * \endif
     */
    public int					nPresetID;

    /**
     * \if ENGLISH_LANG
     *  Detect Region Num
     * \else
     *  规则检测区域顶点数
     * \endif
     */
    public int					nDetectRegionNum;

    /**
     * \if ENGLISH_LANG
     *  Detect Region
     * \else
     *  规则检测区域
     * \endif
     */
    public NET_POINT_EX					stuDetectRegion[] = new NET_POINT_EX[20];

    /**
     * \if ENGLISH_LANG
     *  Preset Name
     * \else
     *  事件触发的预置点名称
     * \endif
     */
    public byte					szPresetName[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  Classroom Action
     * \else
     *  课堂行为动作
     * \endif
     */
    public byte					szClassroomAction[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  Serial UUID
     * \else
     *  智能物体全局唯一物体标识
     * \endif
     */
    public byte					szSerialUUID[] = new byte[22];

    /**
     * \if ENGLISH_LANG
     *  Align Bytes
     * \else
     *  用于字节对齐 
     * \endif
     */
    public byte					szAlign[] = new byte[2];

    /**
     * \if ENGLISH_LANG
     *  Bounding Box
     * \else
     *  包围盒
     * \endif
     */
    public NET_RECT_EX					stuBoundingBox = new NET_RECT_EX();

    /**
     * \if ENGLISH_LANG
     *  Scene Image
     * \else
     *  底图信息
     * \endif
     */
    public SCENE_IMAGE_INFO					stuSceneImage = new SCENE_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     *  Face Image
     * \else
     *  小图信息
     * \endif
     */
    public FACE_IMAGE_INFO					stuFaceImage = new FACE_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     *  Face Attributes
     * \else
     *  属性
     * \endif
     */
    public NET_FACE_ATTRIBUTE_EX					stuFaceAttributes = new NET_FACE_ATTRIBUTE_EX();

    public NET_ALARM_CLASSROOM_BEHAVIOR_INFO() {
        for (int i = 0; i < stuDetectRegion.length; i++) {
            stuDetectRegion[i] = new NET_POINT_EX();
        }
    }
}