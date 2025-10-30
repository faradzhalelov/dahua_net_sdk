package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief Corresponding to data block description of event type EVENT_IVS_VEHICLE_DISTANCE_NEAR (safe driving vehicle distance near)
 * \else
 * @brief 事件类型 EVENT_IVS_VEHICLE_DISTANCE_NEAR (安全驾驶车距过近报警事件) 对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_VEHICLE_DISTANCE_NEAR_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * action of event, 0 means pulse event,1 means continuous event's begin,2means continuous event's end
     * \else
     * 事件动作, 0表示脉冲事件, 1表示持续性事件开始, 2表示持续性事件结束;
     * \endif
     */
    public int nAction;

    /**
     * \if ENGLISH_LANG
     * time of  event occurrence
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX UTC = new NET_TIME_EX();

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
     * driver ID
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

    public DEV_EVENT_VEHICLE_DISTANCE_NEAR_INFO() {
        for (int i = 0; i < 16; i++) {
            this.stuRelatingVideoInfo[i] = new NET_RELATING_VIDEO_INFO();
        }
    }
}