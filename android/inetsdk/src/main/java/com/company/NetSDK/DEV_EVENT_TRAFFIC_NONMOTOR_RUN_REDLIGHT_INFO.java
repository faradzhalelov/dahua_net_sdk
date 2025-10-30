package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of  {@link FinalVar#EVENT_IVS_TRAFFIC_NONMOTOR_RUN_REDLIGHT} 's data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_TRAFFIC_NONMOTOR_RUN_REDLIGHT} (非机动车闯红灯)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_TRAFFIC_NONMOTOR_RUN_REDLIGHT_INFO implements Serializable {
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
     * 0:Pulse
     * \else
     * 0:脉冲事件
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
     * Sequence
     * \else
     * 视频帧序号
     * \endif
     */
    public int									nSequence;

    /**
     * \if ENGLISH_LANG
     * Lane id
     * \else
     * 车道号
     * \endif
     */
    public int									nLane;

    /**
     * \if ENGLISH_LANG
     * Non-motor information
     * \else
     * 非机动车
     * \endif
     */
    public VA_OBJECT_NONMOTOR					stuNonMotor = new VA_OBJECT_NONMOTOR();

    /**
     * \if ENGLISH_LANG
     * Common information
     * \else
     * 公共信息
     * \endif
     */
    public EVENT_COMM_INFO						stCommInfo = new EVENT_COMM_INFO();

    /**
     * \if ENGLISH_LANG
     * event file info
     * \else
     * 事件对应文件信息
     * \endif
     */
    public SDK_EVENT_FILE_INFO                  stuFileInfo = new SDK_EVENT_FILE_INFO();

}
