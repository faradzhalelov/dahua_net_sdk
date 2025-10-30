package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief IVS event type EVENT_IVS_MAN_NUM_DETECTION(the statistics of people in stereo vision event)data description
 * \else
 * @brief 事件类型EVENT_IVS_MAN_NUM_DETECTION(立体视觉区域内人数统计事件)对应数据块描述信息
 * \endif
 */
public class DEV_EVENT_MANNUM_DETECTION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel ID
     * \else
     * 通道号
     * \endif
     */
    public int nChannelID;

    /**
     * \if ENGLISH_LANG
     * event name
     * \else
     * 事件名称
     * \endif
     */
    public byte szName[] = new byte[FinalVar.SDK_EVENT_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * PTS(ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double PTS;

    /**
     * \if ENGLISH_LANG
     * time of occurrence
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * event ID
     * \else
     * 事件ID
     * \endif
     */
    public int nEventID;

    /**
     * \if ENGLISH_LANG
     * event action, 0: Pulse, 1: Start, 2: Stop
     * \else
     * 0:脉冲 1:开始 2:停止
     * \endif
     */
    public int nAction;

    /**
     * \if ENGLISH_LANG
     * number of regional personnet list
     * \else
     * 区域人员列表数量
     * \endif
     */
    public int nManListCount;

    /**
     * \if ENGLISH_LANG
     * list of petsons within the region
     * \else
     * 区域内人员列表
     * \endif
     */
    public MAN_NUM_LIST_INFO stuManList[] = new MAN_NUM_LIST_INFO[FinalVar.MAX_MAN_LIST_COUNT];

    /**
     * \if ENGLISH_LANG
     * intelli comm info
     * \else
     * 智能事件公共信息
     * \endif
     */
    public EVENT_INTELLI_COMM_INFO stuIntelliCommInfo = new EVENT_INTELLI_COMM_INFO();

    /**
     * \if ENGLISH_LANG
     * Area ID(a preset point can correspond to multiple area IDs)
     * \else
     * 区域ID(一个预置点可以对应多个区域ID)
     * \endif
     */
    public int nAreaID;

    /**
     * \if ENGLISH_LANG
     * previous number of man
     * \else
     * 变化前人数
     * \endif
     */
    public int nPrevNumber;

    /**
     * \if ENGLISH_LANG
     * current number of man
     * \else
     * 当前人数
     * \endif
     */
    public int nCurrentNumber;

    /**
     * \if ENGLISH_LANG
     * Event source ID. The application scenario is different analysis of the same object or the same picture, resulting in the same sourceid of multiple events
     * \else
     * 事件关联ID。应用场景是同一个物体或者同一张图片做不同分析，产生的多个事件的SourceID相同
     * \endif
     */
    public byte szSourceID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * rule name
     * \else
     * 规则名称
     * \endif
     */
    public byte szRuleName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Detection mode,{@link EM_EVENT_DETECT_TYPE}
     * \else
     * 检测模式,{@link EM_EVENT_DETECT_TYPE}
     * \endif
     */
    public int emDetectType;

    /**
     * \if ENGLISH_LANG
     * Alert number
     * \else
     * 实际触发报警的人数
     * \endif
     */
    public int nAlertNum;

    /**
     * \if ENGLISH_LANG
     * Alarm type. 0: unknown, 1: from normal to abnormal, 2: from abnormal to normal
     * \else
     * 报警类型. 0:未知, 1:从人数正常到人数异常, 2:从人数异常到人数正常
     * \endif
     */
    public int nAlarmType;

    /**
     * \if ENGLISH_LANG
     * Image information array
     * \else
     * 图片信息数组
     * \endif
     */
    public NET_IMAGE_INFO_EX2[] pstuImageInfo;

    /**
     * \if ENGLISH_LANG
     * Number of picture information
     * \else
     * 图片信息个数
     * \endif
     */
    public int nImageInfoNum;

    /**
     * \if ENGLISH_LANG
     * Event public extension field structure
     * \else
     * 事件公共扩展字段结构体
     * \endif
     */
    public NET_EVENT_INFO_EXTEND stuEventInfoEx = new NET_EVENT_INFO_EXTEND();

    /**
     * \if ENGLISH_LANG
     * The number of vertices in the detection area
     * \else
     * 检测区个数
     * \endif
     */
    public int nDetectRegionNum;

    /**
     * \if ENGLISH_LANG
     * Detection area,[0,8191]
     * \else
     * 检测区
     * \endif
     */
    public NET_POINT_EX stuDetectRegion[] = new NET_POINT_EX[20];

    /**
     * \if ENGLISH_LANG
     * reserved
     * \else
     * 保留字节
     * \endif
     */
    public byte szReversed[] = new byte[700];

    public DEV_EVENT_MANNUM_DETECTION_INFO() {
        for (int i = 0; i < FinalVar.MAX_MAN_LIST_COUNT; i++) {
            this.stuManList[i] = new MAN_NUM_LIST_INFO();
        }
        for (int i = 0; i < 20; i++) {
            this.stuDetectRegion[i] = new NET_POINT_EX();
        }
    }

    public DEV_EVENT_MANNUM_DETECTION_INFO(int nImageInfoNum) {
        this.nImageInfoNum = nImageInfoNum;
        pstuImageInfo = new NET_IMAGE_INFO_EX2[nImageInfoNum];
        for (int i = 0; i < FinalVar.MAX_MAN_LIST_COUNT; i++) {
            this.stuManList[i] = new MAN_NUM_LIST_INFO();
        }
        for (int i = 0; i < 20; i++) {
            this.stuDetectRegion[i] = new NET_POINT_EX();
        }
        for (int i = 0; i < nImageInfoNum; i++) {
            this.pstuImageInfo[i] = new NET_IMAGE_INFO_EX2();
        }
    }
}