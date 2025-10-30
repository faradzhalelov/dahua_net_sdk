package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * alarm of non motor vehicle entering elevator, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_NONMOTOR_ENTRYING}
 * \else
 * 非机动车进入电梯事件信息, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_NONMOTOR_ENTRYING}
 * \endif
 */
public class ALARM_NONMOTOR_ENTRYING_INFO {
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
    public int									nChannelID;

    /**
     * \if ENGLISH_LANG
     * Event operation. 0=pulse. 1=start. 2=stop
     * \else
     * 事件动作,0表示脉冲事件,1表示事件开始,2表示事件结束;
     * \endif
     */
    public int                                 nAction;

    /**
     * \if ENGLISH_LANG
     * Time stamp (Unit is ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double                              dbPTS;

    /**
     * \if ENGLISH_LANG
     * Event occurrence time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX                         stuTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Event ID
     * \else
     * 事件ID
     * \endif
     */
    public int                                 nEventID;

    /**
     * \if ENGLISH_LANG
     * Sequence
     * \else
     * 视频帧序号
     * \endif
     */
    public int								nSequence;

    /**
     * \if ENGLISH_LANG
     * Object number
     * \else
     * 目标个数
     * \endif
     */
    public int									nObjectNum;

    /**
     * \if ENGLISH_LANG
     * Non motor objects
     * \else
     * 非机动车目标
     * \endif
     */
    public VA_OBJECT_NONMOTOR					stuObjects[] = new VA_OBJECT_NONMOTOR[8];

    public ALARM_NONMOTOR_ENTRYING_INFO(){
        for(int i = 0; i < 8; i++){
            stuObjects[i] = new VA_OBJECT_NONMOTOR();
        }
    }

}
