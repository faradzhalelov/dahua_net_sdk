package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Corresponding to data block description of event type EVENT_IVS_WORKCLOTHES_DETECT (work clothes(helmet/clothes)detection)
 * \else
 * @brief 事件类型EVENT_IVS_WORKCLOTHES_DETECT(工装(安全帽/工作服等)检测事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_WORKCLOTHES_DETECT_INFO implements Serializable {
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
     *  Event action, 0: Pulse, 1: Start, 2: Stop
     * \else
     *  0:脉冲 1:开始 2:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  Event name
     * \else
     *  事件名称
     * \endif
     */
    public byte					szName[] = new byte[128];

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
     *  Event ID
     * \else
     *  事件ID
     * \endif
     */
    public int					nEventID;

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
     *  Rule ID
     * \else
     *  智能事件规则编号，用于标示哪个规则触发的事件
     * \endif
     */
    public int					nRuleID;

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
     *  Event group ID,A detection of multiple workclothes detectionat the same nGroupID
     * \else
     *  事件组ID，一次检测的多个nGroupID相同
     * \endif
     */
    public int					nGroupID;

    /**
     * \if ENGLISH_LANG
     *  the captured workclothes number within an event group,A detection of multiple workclothes detection at the same nCountInGroup
     * \else
     *  一个事件组内的抓拍张数,一次检测的多个nCountInGroup相同
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
     *  Scene image info
     * \else
     *  全景大图信息
     * \endif
     */
    public SCENE_IMAGE_INFO					stuSceneImage = new SCENE_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     *  image info
     * \else
     *  小图信息
     * \endif
     */
    public HUMAN_IMAGE_INFO					stuHumanImage = new HUMAN_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     *  Helmet attribute
     * \else
     *  安全帽属性
     * \endif
     */
    public NET_HELMET_ATTRIBUTE					stuHelmetAttribute = new NET_HELMET_ATTRIBUTE();

    /**
     * \if ENGLISH_LANG
     *  Work clothes attribute
     * \else
     *  工作服属性
     * \endif
     */
    public NET_WORKCLOTHES_ATTRIBUTE					stuWorkClothesAttribute;

    /**
     * \if ENGLISH_LANG
     *  Work pants attribute
     * \else
     *  工作裤颜色
     * \endif
     */
    public NET_WORKPANTS_ATTRIBUTE					stuWorkPantsAttribute = new NET_WORKPANTS_ATTRIBUTE();

    /**
     * \if ENGLISH_LANG
     *  Unstandard alarm type 0-unknown 1-Protective clothing no standard 2: Work clothes no standard 3:Helmet no standard 4:Work clothes and Helmet no standard
     * \else
     *  不规范报警类型 0-未知 1-防护服不规范 2: 工作服不规范3:安全帽不规范4:安全帽和工作服不规范
     * \endif
     */
    public int					nAlarmType;

    /**
     * \if ENGLISH_LANG
     *  Event source ID. When the same object or the same image is analyzed differently, the source ID of multiple events generated is the same
     * \else
     *  事件关联ID。应用场景是同一个物体或者同一张图片做不同分析，产生的多个事件的SourceID相同
     * \endif
     */
    public byte					szSourceID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Rule type of work clothes(helmet/clothes)detection
     * \else
     *  报警规则类型
     * \endif
     */
    public int					emRuleType;

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
     *  Normal hat related attribute status information
     * \else
     *  普通帽子相关属性状态信息
     * \endif
     */
    public NET_NORMALHAT_ATTRIBUTE					stuNormalHat = new NET_NORMALHAT_ATTRIBUTE();

    /**
     * \if ENGLISH_LANG
     *  Mask related attribute status information
     * \else
     *  口罩相关属性状态信息
     * \endif
     */
    public NET_MASK_ATTRIBUTE					stuMask = new NET_MASK_ATTRIBUTE();

    /**
     * \if ENGLISH_LANG
     *  Apron related attribute status information
     * \else
     *  围裙相关属性状态信息
     * \endif
     */
    public NET_APRON_ATTRIBUTE					stuApron = new NET_APRON_ATTRIBUTE();

    /**
     * \if ENGLISH_LANG
     *  Glove related attribute status information
     * \else
     *  手套相关属性状态信息
     * \endif
     */
    public NET_GLOVE_ATTRIBUTE					stuGlove = new NET_GLOVE_ATTRIBUTE();

    /**
     * \if ENGLISH_LANG
     *  Boot related attribute status information
     * \else
     *  靴子相关属性状态信息
     * \endif
     */
    public NET_BOOT_ATTRIBUTE					stuBoot = new NET_BOOT_ATTRIBUTE();

    /**
     * \if ENGLISH_LANG
     *  Shoe cover related attribute status information
     * \else
     *  鞋套相关属性状态信息
     * \endif
     */
    public NET_SHOESCOVER_ATTRIBUTE					stuShoesCover = new NET_SHOESCOVER_ATTRIBUTE();

    /**
     * \if ENGLISH_LANG
     *  No hat related attribute status information
     * \else
     *  无帽子相关属性状态信息
     * \endif
     */
    public NET_NOHAT_ATTRIBUTE					stuNoHat = new NET_NOHAT_ATTRIBUTE();

    /**
     * \if ENGLISH_LANG
     *  Relevant attribute status information of protective mask
     * \else
     *  防护面罩相关属性状态信息
     * \endif
     */
    public NET_PROHELMET_ATTRIBUTE					stuProhelmet = new NET_PROHELMET_ATTRIBUTE();

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
     *  Relevant attribute status information of fireproof clothing
     * \else
     *  防火衣相关属性状态信息
     * \endif
     */
    public NET_FIREPROOF_CLOTHES					stuFireProofClothes = new NET_FIREPROOF_CLOTHES();

    /**
     * \if ENGLISH_LANG
     *  object info data   
     * \else
     *  物体信息数据  
     * \endif
     */
    public SDK_MSG_OBJECT_EX2[]					pstObjectInfo;

    /**
     * \if ENGLISH_LANG
     *  object info number
     * \else
     *  物体信息数
     * \endif
     */
    public int					nObjectNum;

    /**
     * \if ENGLISH_LANG
     *  Glasses info
     * \else
     *  眼镜相关属性状态信息
     * \endif
     */
    public NET_GLASSES_RELATED_INFO					stuGlassesInfo = new NET_GLASSES_RELATED_INFO();

    /**
     * \if ENGLISH_LANG
     *  Status information of respiratory mask related attributes
     * \else
     *  呼吸面罩相关属性状态信息
     * \endif
     */
    public NET_BREATHING_MASK_INFO					stuBreathingMaskInfo = new NET_BREATHING_MASK_INFO();

    /**
     * \if ENGLISH_LANG
     *  Relevant attribute status information of protective clothing
     * \else
     *  防护服相关属性状态信息
     * \endif
     */
    public NET_PROTECTIVE_SUIT_INFO					stuProtectiveSuitInfo = new NET_PROTECTIVE_SUIT_INFO();

    /**
     * \if ENGLISH_LANG
     *  Status information of uniform related attributes
     * \else
     *  制服相关属性状态信息
     * \endif
     */
    public NET_UNIFORM_INFO					stuUniformInfo = new NET_UNIFORM_INFO();

    /**
     * \if ENGLISH_LANG
     *  Status information of relevant properties of safety ropes
     * \else
     *  安全绳相关属性状态信息
     * \endif
     */
    public NET_SAFETY_ROPE_INFO					stuSafetyRopeInfo = new NET_SAFETY_ROPE_INFO();

    /**
     * \if ENGLISH_LANG
     *  Safety belt related attribute status information
     * \else
     *  安全带相关属性状态信息
     * \endif
     */
    public NET_SAFE_BELT_INFO					stuSafeBeltInfo = new NET_SAFE_BELT_INFO();

    /**
     * \if ENGLISH_LANG
     *  Reflective vest related attribute status information
     * \else
     *  反光背心相关属性状态信息
     * \endif
     */
    public NET_VEST_INFO					stuVestInfo = new NET_VEST_INFO();

    /**
     * \if ENGLISH_LANG
     *  Safety shoes info
     * \else
     *  劳保鞋相关属性状态信息
     * \endif
     */
    public NET_SAFETY_SHOES_INFO					stuSafetyShoesInfo = new NET_SAFETY_SHOES_INFO();

    /**
     * \if ENGLISH_LANG
     *  Wrist guard info
     * \else
     *  防割护腕相关属性状态信息
     * \endif
     */
    public NET_WRIST_GUARD_INFO					stuWristGuardInfo = new NET_WRIST_GUARD_INFO();

    /**
     * \if ENGLISH_LANG
     *  Legal Alarm Type, 0: Unknown, 1: Alarm if there are non compliant items, 2: Alarm only if all comply
     * \else
     *  报警方式, 0:未知, 1:有不合规项即报警 2:所有合规才报警
     * \endif
     */
    public int					nLegalAlarmType;

    /**
     * \if ENGLISH_LANG
     *  Has the Helmet attribute been reported
     * \else
     *  是否上报了Helmet属性
     * \endif
     */
    public boolean					bHelmet;

    /**
     * \if ENGLISH_LANG
     *  Has the Clothes attribute been reported
     * \else
     *  是否上报了Clothes属性
     * \endif
     */
    public boolean					bClothes;

    /**
     * \if ENGLISH_LANG
     *  Has the WorkPants attribute been reported
     * \else
     *  是否上报了WorkPants属性
     * \endif
     */
    public boolean					bWorkPants;

    /**
     * \if ENGLISH_LANG
     *  Has the NormalHat attribute been reported
     * \else
     *  是否上报了NormalHat属性
     * \endif
     */
    public boolean					bNormalHat;

    /**
     * \if ENGLISH_LANG
     *  Has the Mask attribute been reported
     * \else
     *  是否上报了Mask属性
     * \endif
     */
    public boolean					bMask;

    /**
     * \if ENGLISH_LANG
     *  Has the Apron attribute been reported
     * \else
     *  是否上报了Apron属性
     * \endif
     */
    public boolean					bApron;

    /**
     * \if ENGLISH_LANG
     *  Has the Glove attribute been reported
     * \else
     *  是否上报了Glove属性
     * \endif
     */
    public boolean					bGlove;

    /**
     * \if ENGLISH_LANG
     *  Has the Boot attribute been reported
     * \else
     *  是否上报了Boot属性
     * \endif
     */
    public boolean					bBoot;

    /**
     * \if ENGLISH_LANG
     *  Has the ShoesCover attribute been reported
     * \else
     *  是否上报了ShoesCover属性
     * \endif
     */
    public boolean					bShoesCover;

    /**
     * \if ENGLISH_LANG
     *  Has the NoHat attribute been reported
     * \else
     *  是否上报了NoHat属性
     * \endif
     */
    public boolean					bNoHat;

    /**
     * \if ENGLISH_LANG
     *  Has the Prohelmet attribute been reported
     * \else
     *  是否上报了Prohelmet属性
     * \endif
     */
    public boolean					bProhelmet;

    /**
     * \if ENGLISH_LANG
     *  Has the Glasses attribute been reported
     * \else
     *  是否上报了Glasses属性
     * \endif
     */
    public boolean					bGlasses;

    /**
     * \if ENGLISH_LANG
     *  Has the FireProofClothes attribute been reported
     * \else
     *  是否上报了FireProofClothes属性
     * \endif
     */
    public boolean					bFireProofClothes;

    /**
     * \if ENGLISH_LANG
     *  Has the ProtectiveSuit attribute been reported
     * \else
     *  是否上报了ProtectiveSuit属性
     * \endif
     */
    public boolean					bProtectiveSuit;

    /**
     * \if ENGLISH_LANG
     *  Has the Uniform attribute been reported
     * \else
     *  是否上报了Uniform属性
     * \endif
     */
    public boolean					bUniform;

    /**
     * \if ENGLISH_LANG
     *  Has the BreathingMask attribute been reported
     * \else
     *  是否上报了BreathingMask属性
     * \endif
     */
    public boolean					bBreathingMask;

    /**
     * \if ENGLISH_LANG
     *  Has the SafeBelt attribute been reported
     * \else
     *  是否上报了SafeBelt属性
     * \endif
     */
    public boolean					bSafeBelt;

    /**
     * \if ENGLISH_LANG
     *  Has the Vest attribute been reported
     * \else
     *  是否上报了Vest属性
     * \endif
     */
    public boolean					bVest;

    /**
     * \if ENGLISH_LANG
     *  Has the SafetyShoes attribute been reported
     * \else
     *  是否上报了SafetyShoes属性
     * \endif
     */
    public boolean					bSafetyShoes;

    /**
     * \if ENGLISH_LANG
     *  Has the WristGuard attribute been reported
     * \else
     *  是否上报了WristGuard属性
     * \endif
     */
    public boolean					bWristGuard;

    /**
     * \if ENGLISH_LANG
     *  Has the SafetyRope attribute been reported
     * \else
     *  是否上报了SafetyRope属性
     * \endif
     */
    public boolean					bSafetyRope;

    public DEV_EVENT_WORKCLOTHES_DETECT_INFO() {
        stuWorkClothesAttribute = new NET_WORKCLOTHES_ATTRIBUTE();
        for(int i = 0; i < 32; i ++) {
            stuImageInfo[i] = new NET_IMAGE_INFO_EX2();
        }
    }

    public DEV_EVENT_WORKCLOTHES_DETECT_INFO(int nObjectNum) {
        stuWorkClothesAttribute = new NET_WORKCLOTHES_ATTRIBUTE();
        for(int i = 0; i < 32; i ++) {
            stuImageInfo[i] = new NET_IMAGE_INFO_EX2();
        }
        this.nObjectNum = nObjectNum;
        this.pstObjectInfo = new SDK_MSG_OBJECT_EX2[nObjectNum];
        for(int i = 0; i < nObjectNum; i ++) {
            pstObjectInfo[i] = new SDK_MSG_OBJECT_EX2();
        }
    }

    public DEV_EVENT_WORKCLOTHES_DETECT_INFO(int nObjectNum, int nLinkGroupInfoNum) {
        stuWorkClothesAttribute = new NET_WORKCLOTHES_ATTRIBUTE(nLinkGroupInfoNum);
        for(int i = 0; i < 32; i ++) {
            stuImageInfo[i] = new NET_IMAGE_INFO_EX2();
        }
        this.nObjectNum = nObjectNum;
        this.pstObjectInfo = new SDK_MSG_OBJECT_EX2[nObjectNum];
        for(int i = 0; i < nObjectNum; i ++) {
            pstObjectInfo[i] = new SDK_MSG_OBJECT_EX2();
        }
    }
}