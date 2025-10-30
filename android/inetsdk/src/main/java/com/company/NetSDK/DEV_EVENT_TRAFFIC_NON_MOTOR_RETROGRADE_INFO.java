package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Corresponding to data block description of event type  EVENT_IVS_TRAFFIC_NON_MOTOR_RETROGRADE(Traffic non motor retrograde)
 * \else
 * 事件类型 EVENT_IVS_TRAFFIC_NON_MOTOR_RETROGRADE(非机动车逆行事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_TRAFFIC_NON_MOTOR_RETROGRADE_INFO implements Serializable {
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
     *  0:pulse
     * \else
     *  0:脉冲事件
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
     *  File info
     * \else
     *  事件对应文件信息
     * \endif
     */
    public SDK_EVENT_FILE_INFO					stuFileInfo = new SDK_EVENT_FILE_INFO();

    /**
     * \if ENGLISH_LANG
     *  Time stamp(ms)
     * \else
     *  时间戳(单位是毫秒)
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
     *  Rule ID, used to indicate which rule triggers the event. The default value is 0
     * \else
     *  规则编号,用于标示哪个规则触发的事件，缺省时默认为0
     * \endif
     */
    public int					nRuleID;

    /**
     * \if ENGLISH_LANG
     *  Trigger type
     * \else
     *  触发类型
     * \endif
     */
    public int					emTriggerLine;

    /**
     * \if ENGLISH_LANG
     *  Mark capture frame
     * \else
     *  标记抓拍帧
     * \endif
     */
    public int					nMark;

    /**
     * \if ENGLISH_LANG
     *  Data source address of video analysis
     * \else
     *  视频分析的数据源地址
     * \endif
     */
    public int					nSource;

    /**
     * \if ENGLISH_LANG
     *  Video analysis frame No
     * \else
     *  视频分析帧序号
     * \endif
     */
    public int					nFrameSequence;

    /**
     * \if ENGLISH_LANG
     *  Lane ID
     * \else
     *  车道号
     * \endif
     */
    public int					nLaneID;

    /**
     * \if ENGLISH_LANG
     *   Vehicle speed???ìo???§?Unit: km / h)						
     * \else
     *  车速(单位:km/h)							
     * \endif
     */
    public int					nSpeed;

    /**
     * \if ENGLISH_LANG
     *  Capture process
     * \else
     *  抓拍过程
     * \endif
     */
    public int					emCaptureProcess;

    /**
     * \if ENGLISH_LANG
     *  Common info
     * \else
     *  公共信息
     * \endif
     */
    public EVENT_COMM_INFO					stuCommInfo = new EVENT_COMM_INFO();

    /**
     * \if ENGLISH_LANG
     *  Non-motor info enable
     * \else
     *  是否有非机动车信息
     * \endif
     */
    public int					bNonMotorInfoEx;

    /**
     * \if ENGLISH_LANG
     *  Non-motor information
     * \else
     *  非机动车信息
     * \endif
     */
    public VA_OBJECT_NONMOTOR					stuNonMotor = new VA_OBJECT_NONMOTOR();

    /**
     * \if ENGLISH_LANG
     *  flag(by bit),see NET_RESERVED_COMMON    
     * \else
     *  抓图标志(按位),具体见NET_RESERVED_COMMON    
     * \endif
     */
    public int					dwSnapFlagMask;

    /**
     * \if ENGLISH_LANG
     *  picture resolution
     * \else
     *  对应图片的分辨率
     * \endif
     */
    public SDK_RESOLUTION_INFO					stuResolution = new SDK_RESOLUTION_INFO();

}
