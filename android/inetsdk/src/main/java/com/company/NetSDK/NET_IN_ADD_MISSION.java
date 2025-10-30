package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief CLIENT_AddMission()port input parameter
 * \else
 * @brief CLIENT_AddMission()接口输入参数
 * \endif
 */
public class NET_IN_ADD_MISSION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * task name
     * \else
     * 任务名称
     * \endif
     */
    public byte szTitle[] = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * task ID
     * \else
     * 任务ID
     * \endif
     */
    public byte szMissionID[] = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * replay content
     * \else
     * 回复内容
     * \endif
     */
    public byte szComment[] = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * feedback type after adding
     * \else
     * 添加后反馈类型
     * \endif
     */
    public int emFeedBack;

    /**
     * \if ENGLISH_LANG
     * message type,{@link NET_MISSION_MESSAGE_TYPE}
     * \else
     * 消息类型,{@link NET_MISSION_MESSAGE_TYPE}
     * \endif
     */
    public int emMessageType;

    /**
     * \if ENGLISH_LANG
     * FALSE, szComment is walid, TRUE, szCommentEx is valid
     * \else
     * FALSE时，szComment有效；TRUE时，szCommentEx有效
     * \endif
     */
    public boolean bComment;

    /**
     * \if ENGLISH_LANG
     * replay content, no null
     * \else
     * 回复内容，不可以为空
     * \endif
     */
    public byte szCommentEx[] = new byte[FinalVar.SDK_COMMON_STRING_2048];

    /**
     * \if ENGLISH_LANG
     * In which several channels are superimposed, Supports multi-channel simultaneous stacking
     * \else
     * 在哪几个通道进行叠加，支持多通道同时叠加
     * \endif
     */
    public int nChannel[] = new int[FinalVar.MAX_CHANNEL_COUNT];

    /**
     * \if ENGLISH_LANG
     * Overlay display duration, Unit:second; 0 indicates that it has been stacked until the next time
     * \else
     * 叠加显示时长，0表示一直叠加至下一次协议下发，其它数字表示显示时长，单位秒
     * \endif
     */
    public int nDuration;

    /**
     * \if ENGLISH_LANG
     * nChannel length
     * \else
     * nChannel实际长度
     * \endif
     */
    public int nCount;

    /**
     * \if ENGLISH_LANG
     * number of task content lists
     * \else
     * 任务内容列表个数
     * \endif
     */
    public int nHospitalAlarmsCount;

    /**
     * \if ENGLISH_LANG
     * task content list
     * \else
     * 任务内容列表
     * \endif
     */
    public NET_HOSPITAL_ALARM_DATA stuHospitalAlarms[] = new NET_HOSPITAL_ALARM_DATA[64];

    /**
     * \if ENGLISH_LANG
     *  Basic data of police vehicles, emMessage Type=22 valid
     * \else
     *  警车基础数据,emMessageType=22有效
     * \endif
     */
    public NET_POLICE_VEHICLE_DATA					stuPoliceVehicleData = new NET_POLICE_VEHICLE_DATA();

    public NET_IN_ADD_MISSION() {
        for(int i = 0; i < 64; i ++){
            this.stuHospitalAlarms[i] = new NET_HOSPITAL_ALARM_DATA();
        }
    }
}