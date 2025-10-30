package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief The description of the data block corresponding to the event type  EVENT_IVS_DRIVE_BLIND_SPOT
 * \else
 * @brief 事件类型EVENT_IVS_DRIVE_BLIND_SPOT (盲区检测事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_BLIND_SPOT_DETECTION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel ID
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  Action, 0:pulse,1:start, 2:stop
     * \else
     *  0:脉冲,1:开始, 2:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  Event Name
     * \else
     *  事件名称
     * \endif
     */
    public byte					szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  PTS
     * \else
     *  时间戳(单位是毫秒)
     * \endif
     */
    public double					dbPTS;

    /**
     * \if ENGLISH_LANG
     *  UTC
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					stuUTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  EventID
     * \else
     *  事件ID
     * \endif
     */
    public int					nEventID;

    /**
     * \if ENGLISH_LANG
     *  Alarm Level
     * \else
     *  报警等级
     * \endif
     */
    public int					nAlarmLevel;

    /**
     * \if ENGLISH_LANG
     *  Number of target objects
     * \else
     *  目标物体个数
     * \endif
     */
    public int					nObjectNum;

    /**
     * \if ENGLISH_LANG
     *  Target object information
     * \else
     *  目标物体信息
     * \endif
     */
    public NET_BLIND_SPOT_DETECTION_OBJECT_INFO					stuObjectInfo[] = new NET_BLIND_SPOT_DETECTION_OBJECT_INFO[32];

    /**
     * \if ENGLISH_LANG
     *  ftp path for assocated video
     * \else
     *  违章关联视频FTP上传路径
     * \endif
     */
    public byte					szVideoPath[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     *  GPS info
     * \else
     *  GPS信息
     * \endif
     */
    public NET_GPS_STATUS_INFO					stuGPS = new NET_GPS_STATUS_INFO();

    /**
     * \if ENGLISH_LANG
     *  Total number of pedestrians/motor vehicles/non motor vehicles
     * \else
     *  行人/机动车/非机动车总数量
     * \endif
     */
    public int					nTargetCount;

    /**
     * \if ENGLISH_LANG
     *  Event Type, 0: Unknown, 1: Right Blind, 2: Left Blind, 3: Back Blind, 4: Front Blind
     * \else
     *  事件类型, 0:未知, 1:右盲, 2:左盲, 3:后盲, 4:前盲
     * \endif
     */
    public int					nEventType;

    public DEV_EVENT_BLIND_SPOT_DETECTION_INFO(){
        for (int i = 0; i < 32; i++) {
            this.stuObjectInfo[i] = new NET_BLIND_SPOT_DETECTION_OBJECT_INFO();
        }
    }

}