package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief  Objcet anomaly detection event Corresponding to data block description of event type EVENT_IVS_ANYTHING_DETECT
 * \else
 * @brief 事件类型 EVENT_IVS_OBJECT_ABNORMAL 目标异常检测事件 对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_OBJECT_ABNORMAL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  Event action 0:pulse 1:start 2:stop
     * \else
     *  0-脉冲 1-开始 2-结束
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
     *  Time stamp(unit:ms)
     * \else
     *  时间戳(单位:毫秒)
     * \endif
     */
    public double					PTS;

    /**
     * \if ENGLISH_LANG
     *  Event occur time
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
     *  Panoramic information
     * \else
     *  全景大图信息
     * \endif
     */
    public NET_EVENT_IMAGE_OFFSET_INFO					stuSceneImage = new NET_EVENT_IMAGE_OFFSET_INFO();

    /**
     * \if ENGLISH_LANG
     *  Event class type,{@link EM_CLASS_TYPE}
     * \else
     *  智能事件所属大类,{@link EM_CLASS_TYPE}
     * \endif
     */
    public int					emClassType;

    /**
     * \if ENGLISH_LANG
     *  Area ID(a preset point can correspond to multiple area IDs)
     * \else
     *  区域ID(一个预置点可以对应多个区域ID)
     * \endif
     */
    public short					nAreaID;

    /**
     * \if ENGLISH_LANG
     *  Preset point number, starting from 1
     * \else
     *  预置点编号,从1开始
     * \endif
     */
    public short					nPresetID;

    /**
     * \if ENGLISH_LANG
     *  Object info
     * \else
     *  目标信息
     * \endif
     */
    public NET_OBJECT_INFO					stuObjectInfo[] = new NET_OBJECT_INFO[64];

    /**
     * \if ENGLISH_LANG
     *  Object info num
     * \else
     *  目标信息个数
     * \endif
     */
    public int					nObjectInfoNum;

    /**
     * \if ENGLISH_LANG
     *  Abnormal object,{@link EM_ABNORMAL_OBJECT_TYPE}
     * \else
     *  目标类型,{@link EM_ABNORMAL_OBJECT_TYPE}
     * \endif
     */
    public int					emObjectType;

    /**
     * \if ENGLISH_LANG
     *  Abnormal type,{@link EM_OBJECT_ABNORMAL_TYPE}
     * \else
     *  异常行为,{@link EM_OBJECT_ABNORMAL_TYPE}
     * \endif
     */
    public int					emAbnormalType;

    public DEV_EVENT_OBJECT_ABNORMAL_INFO() {
        for(int i = 0; i < stuObjectInfo.length; i ++){
            stuObjectInfo[i] = new NET_OBJECT_INFO();
        }
    }
}