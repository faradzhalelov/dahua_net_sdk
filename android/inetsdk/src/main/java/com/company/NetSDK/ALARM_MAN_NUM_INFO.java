package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of regional population statistics, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_MAN_NUM_DETECTION}
 * \else
 * 立体视觉区域内人数统计报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_MAN_NUM_DETECTION }
 * \endif
 */
public class ALARM_MAN_NUM_INFO implements Serializable {
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
    public int							nChannel;

    /**
     * \if ENGLISH_LANG
     * event action, 0: Pulse, 1: Start, 2: Stop
     * \else
     * 事件动作,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public int                         nAction;

    /**
     * \if ENGLISH_LANG
     * event ID
     * \else
     * 事件ID
     * \endif
     */
    public int					        nEventID;

    /**
     * \if ENGLISH_LANG
     * PTS(ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double				        dbPTS;

    /**
     * \if ENGLISH_LANG
     * time of occurrence
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX			        stuTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * number of regional personnet list
     * \else
     * 区域人员列表数量
     * \endif
     */
    public int							nManListCount;

    /**
     * \if ENGLISH_LANG
     * list of petsons within the region
     * \else
     * 区域内人员列表
     * \endif
     */
    public MAN_NUM_LIST_INFO			stuManList[] = new MAN_NUM_LIST_INFO[FinalVar.MAX_MAN_LIST_COUNT];

    /**
     * \if ENGLISH_LANG
     * event name
     * \else
     * 事件名称
     * \endif
     */
    public byte						szName[] = new byte[128];

    public ALARM_MAN_NUM_INFO(){
        for(int i = 0; i < FinalVar.MAX_MAN_LIST_COUNT; i ++){
            stuManList[i] = new MAN_NUM_LIST_INFO();
        }
    }

}
