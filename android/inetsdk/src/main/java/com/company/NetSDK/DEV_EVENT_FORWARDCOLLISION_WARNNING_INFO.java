package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief Corresponding to data block description of event type EVENT_IVS_FORWARDCOLLISION_WARNNING(forwad collision warnning)
 * \else
 * @brief 事件类型 EVENT_IVS_FORWARDCOLLISION_WARNNING(前向碰撞预警) 对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_FORWARDCOLLISION_WARNNING_INFO implements Serializable {
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
    public int nChannelID;

    /**
     * \if ENGLISH_LANG
     * Event ID
     * \else
     * 事件ID
     * \endif
     */
    public int nEventID;

    /**
     * \if ENGLISH_LANG
     * Evnet name
     * \else
     * 事件名称
     * \endif
     */
    public byte szName[] = new byte[FinalVar.SDK_EVENT_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Timestamp (in milliseconds)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double PTS;

    /**
     * \if ENGLISH_LANG
     * Time for the event occurred
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Event action, 0: Pulse, 1: Start, 2: Stop
     * \else
     * 0:脉冲 1:开始 2:停止
     * \endif
     */
    public int nAction;

    /**
     * \if ENGLISH_LANG
     * GPS info
     * \else
     * GPS信息
     * \endif
     */
    public NET_GPS_STATUS_INFO stuGPSStatusInfo = new NET_GPS_STATUS_INFO();

    /**
     * \if ENGLISH_LANG
     * Driver ID
     * \else
     * 司机ID
     * \endif
     */
    public byte szDriverID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * ftp path for assocated video
     * \else
     * 违章关联视频FTP上传路径
     * \endif
     */
    public byte szVideoPath[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * Number of multiple video information associated with violation
     * \else
     * 违章关联的多个视频信息个数
     * \endif
     */
    public int nRelatingVideoInfoNum;

    /**
     * \if ENGLISH_LANG
     * Multiple video information arrays associated with violations, supporting up to 16 videos
     * \else
     * 违章关联的多个视频信息数组，最多支持16个视频
     * \endif
     */
    public NET_RELATING_VIDEO_INFO stuRelatingVideoInfo[] = new NET_RELATING_VIDEO_INFO[16];

    /**
     * \if ENGLISH_LANG
     * Object type, 1: person, 2: vehicle, 17: non motor vehicle
     * \else
     * 物体类型, 1:人, 2:车, 17:非机动车
     * \endif
     */
    public int nObjectType;

    /**
     * \if ENGLISH_LANG
     * Horizontal Distance, Unit meter
     * \else
     * 横向距离, 单位米
     * \endif
     */
    public float fHorizontalDistance;

    /**
     * \if ENGLISH_LANG
     * Parallel Distance, Unit meter
     * \else
     * 纵向距离, 单位米
     * \endif
     */
    public float fParallelDistance;

    /**
     * \if ENGLISH_LANG
     * Alarm target upper left corner coordinate X
     * \else
     * 报警目标左上角坐标X
     * \endif
     */
    public int nTargetCoordsX;

    /**
     * \if ENGLISH_LANG
     * Alarm target upper left corner coordinate Y
     * \else
     * 报警目标左上角坐标Y
     * \endif
     */
    public int nTargetCoordsY;

    /**
     * \if ENGLISH_LANG
     * Alarm target coordinates, high
     * \else
     * 报警目标坐标, 高
     * \endif
     */
    public int nTargetCoordsHeight;

    /**
     * \if ENGLISH_LANG
     * Alarm target coordinates, width
     * \else
     * 报警目标坐标, 宽
     * \endif
     */
    public int nTargetCoordsWidth;

    public DEV_EVENT_FORWARDCOLLISION_WARNNING_INFO() {
        for (int i = 0; i < 16; i++) {
            this.stuRelatingVideoInfo[i] = new NET_RELATING_VIDEO_INFO();
        }
    }
}