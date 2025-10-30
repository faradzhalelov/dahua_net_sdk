package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of {@link FinalVar#EVENT_IVS_NONMOTOR_ENTRYING}'s data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_NONMOTOR_ENTRYING} (非机动车进入电梯)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_NONMOTOR_ENTRYING_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * channel id
     * \else
     * 通道号
     * \endif
     */
    public int									nChannelID;

    /**
     * \if ENGLISH_LANG
     * 1:Start 2:Stop
     * \else
     * 1:开始 2:停止
     * \endif
     */
    public int									nAction;

    /**
     * \if ENGLISH_LANG
     * event name
     * \else
     * 事件名称
     * \endif
     */
    public byte								szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Time stamp(ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double								PTS;

    /**
     * \if ENGLISH_LANG
     * Event occurred time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX							UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Event ID
     * \else
     * 事件ID
     * \endif
     */
    public int									nEventID;

    /**
     * \if ENGLISH_LANG
     * Rule ID
     * \else
     * 规则ID
     * \endif
     */
    public int									nRuleID;

    /**
     * \if ENGLISH_LANG
     * Sequence
     * \else
     * 视频帧序号
     * \endif
     */
    public int									nSequence;

    /**
     * \if ENGLISH_LANG
     * Class type,refer to {@link EM_CLASS_TYPE}
     * \else
     * 智能事件所属大类,对应类型{@link EM_CLASS_TYPE}
     * \endif
     */
    public int						emClassType;

    /**
     * \if ENGLISH_LANG
     * The number of objects
     * \else
     * 目标个数
     * \endif
     */
    public int									nObjectNum;

    /**
     * \if ENGLISH_LANG
     * The list of objects
     * \else
     * 非机动车目标
     * \endif
     */
    public VA_OBJECT_NONMOTOR					stuObjects[] = new VA_OBJECT_NONMOTOR[8];

    /**
     * \if ENGLISH_LANG
     * Scene image
     * \else
     * 全景广角图
     * \endif
     */
    public SCENE_IMAGE_INFO_EX					stuSceneImage = new SCENE_IMAGE_INFO_EX();

    public DEV_EVENT_NONMOTOR_ENTRYING_INFO(){
        for(int i = 0; i < 8; i++){
            stuObjects[i] = new VA_OBJECT_NONMOTOR();
        }
    }

}
