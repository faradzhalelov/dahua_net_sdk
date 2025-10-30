package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief the describe of EVENT_IVS_SMOKEDETECTION's data
 * \else
 * @brief 事件类型EVENT_IVS_SMOKEDETECTION(烟雾报警事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_SMOKE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * ChannelId
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
    public byte szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Rule ID, used to indicate which rule triggers the event. The default value is 0
     * \else
     * 规则编号,用于标示哪个规则触发的事件，缺省时默认为0
     * \endif
     */
    public int nRuleID;

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
     * the event happen time
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
     * have being detected object
     * \else
     * 检测到的物体
     * \endif
     */
    public SDK_MSG_OBJECT stuObject = new SDK_MSG_OBJECT();

    /**
     * \if ENGLISH_LANG
     * event file info
     * \else
     * 事件对应文件信息
     * \endif
     */
    public SDK_EVENT_FILE_INFO stuFileInfo = new SDK_EVENT_FILE_INFO();

    /**
     * \if ENGLISH_LANG
     * Event action,0 means pulse event,1 means continuous event's begin,2means continuous event's end;
     * \else
     * 事件动作,0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public byte bEventAction;

    /**
     * \if ENGLISH_LANG
     * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
     * \else
     * 图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
     * \endif
     */
    public byte byImageIndex;

    /**
     * \if ENGLISH_LANG
     * flag(by bit),see NET_RESERVED_COMMON
     * \else
     * 抓图标志(按位),具体见NET_RESERVED_COMMON
     * \endif
     */
    public int dwSnapFlagMask;

    /**
     * \if ENGLISH_LANG
     * event trigger accumilated times
     * \else
     * 事件触发累计次数
     * \endif
     */
    public int nOccurrenceCount;

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
     * ptz coordinate and zoom
     * \else
     * 云台的坐标和放大倍数
     * \endif
     */
    public PTZ_SPACE_UNIT stuPtzPosition = new PTZ_SPACE_UNIT();

    /**
     * \if ENGLISH_LANG
     * Whether stuSceneImage is valid
     * \else
     * stuSceneImage 是否有效
     * \endif
     */
    public boolean bSceneImage;

    /**
     * \if ENGLISH_LANG
     * Global scene iamge
     * \else
     * 全景广角图
     * \endif
     */
    public SCENE_IMAGE_INFO_EX stuSceneImage = new SCENE_IMAGE_INFO_EX();

    /**
     * \if ENGLISH_LANG
     * vehicle info
     * \else
     * 车身信息
     * \endif
     */
    public SDK_MSG_OBJECT stuVehicle = new SDK_MSG_OBJECT();

    /**
     * \if ENGLISH_LANG
     * Trigger type,{@link EM_TRIGGER_TYPE}
     * \else
     * 触发类型,{@link EM_TRIGGER_TYPE}
     * \endif
     */
    public int emTriggerType;

    /**
     * \if ENGLISH_LANG
     * Used to mark capture frames
     * \else
     * 标记抓拍帧
     * \endif
     */
    public int nMark;

    /**
     * \if ENGLISH_LANG
     * Data source address of the video analysis
     * \else
     * 视频分析的数据源地址
     * \endif
     */
    public int nSource;

    /**
     * \if ENGLISH_LANG
     * Video analysis frame number
     * \else
     * 视频分析帧序号
     * \endif
     */
    public int nFrameSequence;

    /**
     * \if ENGLISH_LANG
     * Traffic vehicle info
     * \else
     * 交通车辆信息
     * \endif
     */
    public DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO stTrafficCar = new DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO();

    /**
     * \if ENGLISH_LANG
     * public info
     * \else
     * 公共信息
     * \endif
     */
    public EVENT_COMM_INFO stuCommInfo = new EVENT_COMM_INFO();

    /**
     * \if ENGLISH_LANG
     * Capture process,{@link EM_CAPTURE_PROCESS_END_TYPE}
     * \else
     * 抓拍过程,{@link EM_CAPTURE_PROCESS_END_TYPE}
     * \endif
     */
    public int emCaptureProcess;

    /**
     * \if ENGLISH_LANG
     * The lateral field of view angle of the current alarm channel, unit: degree, the actual angle is multiplied by 100
     * \else
     * 当前报警通道的横向视场角,单位：度，实际角度乘以100
     * \endif
     */
    public int nCurChannelHFOV;

    /**
     * \if ENGLISH_LANG
     * The vertical field of view angle of the current alarm channel, unit: degree, the actual angle is multiplied by 100
     * \else
     * 当前报警通道的垂直视场角,单位：度，实际角度乘以100
     * \endif
     */
    public int nCurChannelVFOV;

    /**
     * \if ENGLISH_LANG
     * GPS Info
     * \else
     * 设备的GPS坐标
     * \endif
     */
    public NET_GPS_INFO_EX stuGPS = new NET_GPS_INFO_EX();

    /**
     * \if ENGLISH_LANG
     * Number of smoke detection points
     * \else
     * 烟雾检测点个数
     * \endif
     */
    public int nObjectCount;

    /**
     * \if ENGLISH_LANG
     * Smoke detection point information
     * \else
     * 烟雾检测点信息
     * \endif
     */
    public SDK_MSG_OBJECT_EX2 stuObjects[] = new SDK_MSG_OBJECT_EX2[16];

    /**
     * \if ENGLISH_LANG
     * smoke color,{@link EM_SMOKE_COLOR}
     * \else
     * 烟雾颜色,{@link EM_SMOKE_COLOR}
     * \endif
     */
    public int emSmokeColor[] = new int[16];

    /**
     * \if ENGLISH_LANG
     * smoke color number
     * \else
     * 烟雾颜色有效个数
     * \endif
     */
    public int nSmokeColorNum;

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

    public DEV_EVENT_SMOKE_INFO() {
        this.nImageInfoNum = 0;
        this.pstuImageInfo = new NET_IMAGE_INFO_EX2[0];
        for (int i = 0; i < 16; i++) {
            this.stuObjects[i] = new SDK_MSG_OBJECT_EX2();
        }
    }

    public DEV_EVENT_SMOKE_INFO(int nImageInfoNum) {
        this.nImageInfoNum = nImageInfoNum;
        this.pstuImageInfo = new NET_IMAGE_INFO_EX2[nImageInfoNum];
        for (int i = 0; i < 16; i++) {
            this.stuObjects[i] = new SDK_MSG_OBJECT_EX2();
        }
        for (int i = 0; i < nImageInfoNum; i++) {
            this.pstuImageInfo[i] = new NET_IMAGE_INFO_EX2();
        }
    }
}
