package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Corresponding to data block description of event type EVENT_IVS_HUMANTRAIT(Event of human trait)
 * \else
 * @brief 事件类型 EVENT_IVS_HUMANTRAIT(人体特征事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_HUMANTRAIT_INFO implements Serializable {
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
     *  Event name
     * \else
     *  事件名称
     * \endif
     */
    public byte					szName[] = new byte[FinalVar.SDK_EVENT_NAME_LEN];

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
     *  Timestamp (in milliseconds)
     * \else
     *  时间戳(单位是毫秒)
     * \endif
     */
    public double					PTS;

    /**
     * \if ENGLISH_LANG
     *  Time for the event occurred
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  1:Start 2:Stop
     * \else
     *  1:开始 2:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  Class type 
     * \else
     *  智能事件所属大类
     * \endif
     */
    public int					emClassType;

    /**
     * \if ENGLISH_LANG
     *  Event group ID,A detection of multiple human characteristics at the same nGroupID
     * \else
     *  事件组ID，一次检测的多个人体特征nGroupID相同
     * \endif
     */
    public int					nGroupID;

    /**
     * \if ENGLISH_LANG
     *  the captured human number within an event group,A detection of multiple human characteristics at the same nCountInGroup
     * \else
     *  一个事件组内的抓拍张数(人体个数),一次检测的多个人体特征nCountInGroup相同
     * \endif
     */
    public int					nCountInGroup;

    /**
     * \if ENGLISH_LANG
     *  capture Index of an event group,starting from 1
     * \else
     *  一个事件组内的抓拍序号，从1开始
     * \endif
     */
    public int					nIndexInGroup;

    /**
     * \if ENGLISH_LANG
     *  Human body image info
     * \else
     *  人体图片信息
     * \endif
     */
    public HUMAN_IMAGE_INFO					stuHumanImage = new HUMAN_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     *  Human Target image info
     * \else
     *  目标图片信息
     * \endif
     */
    public FACE_IMAGE_INFO					stuFaceImage = new FACE_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     *  Detect Object
     * \else
     *  检测到的人的信息
     * \endif
     */
    public int					emDetectObject;

    /**
     * \if ENGLISH_LANG
     *  Human attributes
     * \else
     *  人体属性
     * \endif
     */
    public HUMAN_ATTRIBUTES_INFO					stuHumanAttributes = new HUMAN_ATTRIBUTES_INFO();

    /**
     * \if ENGLISH_LANG
     *  Scene image info
     * \else
     *  全景大图信息
     * \endif
     */
    public SCENE_IMAGE_INFO					stuSceneImage = new SCENE_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     *  Target attribute
     * \else
     *  目标属性
     * \endif
     */
    public NET_FACE_ATTRIBUTE					stuFaceAttributes = new NET_FACE_ATTRIBUTE();

    /**
     * \if ENGLISH_LANG
     *  Target scene image
     * \else
     *  目标全景图
     * \endif
     */
    public FACE_SCENE_IMAGE					stuFaceSceneImage = new FACE_SCENE_IMAGE();

    /**
     * \if ENGLISH_LANG
     *  Extension info
     * \else
     *  扩展信息
     * \endif
     */
    public NET_EXTENSION_INFO					stuExtensionInfo = new NET_EXTENSION_INFO();

    /**
     * \if ENGLISH_LANG
     *  Extension event code which produce human trait
     * \else
     *  补充事件，表示当前人体特征是由该事件产生的
     * \endif
     */
    public NET_HUMANTRAIT_EXTENSION_INFO					stuHumanTrait = new NET_HUMANTRAIT_EXTENSION_INFO();

    /**
     * \if ENGLISH_LANG
     *  Position info of human feature data in binary data
     * \else
     *  人体特征值数据在二进制数据中的位置信息
     * \endif
     */
    public NET_HUMAN_FEATURE_VECTOR_INFO					stuHumanFeatureVectorInfo = new NET_HUMAN_FEATURE_VECTOR_INFO();

    /**
     * \if ENGLISH_LANG
     *  Human feature data version
     * \else
     *  人体特征值版本号
     * \endif
     */
    public int					emHumanFeatureVersion;

    /**
     * \if ENGLISH_LANG
     *  Position info of Target feature data in binary data
     * \else
     *  目标特征值数据在二进制数据中的位置信息
     * \endif
     */
    public NET_FACE_FEATURE_VECTOR_INFO					stuFaceFeatureVectorInfo = new NET_FACE_FEATURE_VECTOR_INFO();

    /**
     * \if ENGLISH_LANG
     *  Target feature data version
     * \else
     *  目标特征值版本号
     * \endif
     */
    public int					emFaceFeatureVersion;

    /**
     * \if ENGLISH_LANG
     *  Compliance flag 0: non-compliant, 1: compliant, compliance check is not turned on, there is no such field.  This field is obsolete
     * \else
     *  合规标记0：不合规，1：合规,没有开启合规检测，无此字段。     此字段已废弃
     * \endif
     */
    public int					nCompliantMark;

    /**
     * \if ENGLISH_LANG
     *  The number of attribute lists that determine whether they are compliant
     * \else
     *  判断是否合规的属性列表个数
     * \endif
     */
    public int					nCompliantDetailsNum;

    /**
     * \if ENGLISH_LANG
     *  A list of attributes to determine compliance, non-compliance detection reports non-compliance attribute fields, compliance detection reports compliant attribute fields, no compliance detection is enabled, no such field
     * \else
     *  判断是否合规的属性列表，不合规检测报不合规的属性字段，合规检测报合规的属性字段，没有开启合规检测，无此字段。
     * \endif
     */
    public int[]					emCompliantDetailType = new int[32];

    /**
     * \if ENGLISH_LANG
     *  The number of emHumanPostureType
     * \else
     *  关联的人体消息类型列表个数
     * \endif
     */
    public int					nHumanPostureTypeNum;

    /**
     * \if ENGLISH_LANG
     *  A list of The type of the Human Posture
     * \else
     * 关联的人体消息类型列表
     * \endif
     */
    public int[]					emHumanPostureType = new int[32];

    /**
     * \if ENGLISH_LANG
     *  Human body image info,when emHumanPostureType contains EM_HUMAN_POSTURE_ALONG_WITH_FACE, it is valid
     * \else
     * 与最优目标同画面的人体信息，emHumanPostureType包含EM_HUMAN_POSTURE_ALONG_WITH_FACE时有效
     * \endif
     */
    public HUMAN_IMAGE_INFO					stuAlongWithFaceHumanImage = new HUMAN_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     *  Scene image info,emHumanPostureType contains  EM_HUMAN_POSTURE_ALONG_WITH_FACE, it is valid
     * \else
     * 与最优目标同画面人体的全景图，emHumanPostureType包含EM_HUMAN_POSTURE_ALONG_WITH_FACE时有效
     * \endif
     */
    public SCENE_IMAGE_INFO					stuAlongWithFaceHumanSceneImage = new SCENE_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     *  Human attributes,emHumanPostureType contains EM_HUMAN_POSTURE_ALONG_WITH_FACE, it is valid
     * \else
     * 与最优目标同画面人体的属性，emHumanPostureType包含EM_HUMAN_POSTURE_ALONG_WITH_FACE时有效
     * \endif
     */
    public HUMAN_ATTRIBUTES_INFO					stuAlongWithFaceHumanAttributes = new HUMAN_ATTRIBUTES_INFO();

    /**
     * \if ENGLISH_LANG
     *  Is compliance testing enabled
     * \else
     *  是否开启合规检测
     * \endif
     */
    public boolean					bCompliantMarkEnable;

    /**
     * \if ENGLISH_LANG
     *  Position info of human feature data in binary data
     * \else
     *  人体特征值数据在二进制数据中的位置信息
     * \endif
     */
    public NET_HUMAN_FEATURE_VECTOR_INFO					stuAlongWithFaceHumanVectorInfo = new NET_HUMAN_FEATURE_VECTOR_INFO();

    /**
     * \if ENGLISH_LANG
     *  Human feature data version
     * \else
     *  人体特征值版本号
     * \endif
     */
    public int					emAlongWithFaceHumanVersion;

    /**
     * \if ENGLISH_LANG
     *  Compliance type: 0-non-compliant, 1-compliant, compliance check is not turned on, there is no such field
     * \else
     *  合规模式: 0-不合规，1-合规，没有开启合规检测，无此字段
     * \endif
     */
    public int					nCompliantMode;

    /**
     * \if ENGLISH_LANG
     *  1: non-compliant 2: compliant
     * \else
     *  1:不合规 2:合规
     * \endif
     */
    public int					nAlarmCompliance;

    /**
     * \if ENGLISH_LANG
     *  The video Sequence  When the target appears  
     * \else
     *  目标在视频中出现时的视频帧编号。视频帧编号只能在一个通道内表示唯一，且不连续。视频流时该值有效
     * \endif
     */
    public int					nStartSequence;

    /**
     * \if ENGLISH_LANG
     *  The video Sequence  When the target disappears  
     * \else
     *  目标在视频中消失时的视频帧编号。视频帧编号只能在一个通道内表示唯一，且不连续。视频流时该值有效。
     * \endif
     */
    public int					nEndSequence;

    /**
     * \if ENGLISH_LANG
     *  Imaging light type
     * \else
     *  图像成像光源类型
     * \endif
     */
    public int					emImageLightType;

    /**
     * \if ENGLISH_LANG
     *  Extension of  stuHumanAttributes
     * \else
     *  stuHumanAttributes 的扩展
     * \endif
     */
    public HUMAN_ATTRIBUTES_INFO_EX					stuHumanAttributesEx = new HUMAN_ATTRIBUTES_INFO_EX();

    /**
     * \if ENGLISH_LANG
     *  Extension of  stuAlongWithFaceHumanAttributes
     * \else
     *  stuAlongWithFaceHumanAttributes 的扩展
     * \endif
     */
    public HUMAN_ATTRIBUTES_INFO_EX					stuAlongWithFaceHumanAttributesEx = new HUMAN_ATTRIBUTES_INFO_EX();

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
     *  Global unique object identification of intelligent object
     * \else
     *  智能物体全局唯一物体标识
     * \endif
     */
    public byte					szObjectUUID[] = new byte[48];

    /**
     * \if ENGLISH_LANG
     *  Human feature data version-str
     * \else
     *  人体特征值版本号-字符串
     * \endif
     */
    public byte					szHumanFeatureVersion[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Target feature data version-str
     * \else
     *  目标特征值版本号-字符串
     * \endif
     */
    public byte					szFaceFeatureVersion[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Human feature data version-str
     * \else
     *  人体特征值版本号-字符串
     * \endif
     */
    public byte					szAlongWithFaceHumanVersion[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Event public extension field structure
     * \else
     *  事件公共扩展字段结构体
     * \endif
     */
    public NET_EVENT_INFO_EXTEND					stuEventInfoEx = new NET_EVENT_INFO_EXTEND();

    /**
     * \if ENGLISH_LANG
     *  Intelligent object global unique object identification
     * \else
     *  智能物体全局唯一物体标识
     * \endif
     */
    public byte					szSerialUUID[] = new byte[22];

    public DEV_EVENT_HUMANTRAIT_INFO() {
        for(int i = 0; i < 32; i ++) {
            this.stuImageInfo[i] = new NET_IMAGE_INFO_EX2();
        }
    }
}