package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Corresponding to data block description of event type EVENT_IVS_TRAFFIC_DRIVER_CHANGE (traffic driver change)
 * \else
 * @brief 事件类型 EVENT_IVS_TRAFFIC_DRIVER_CHANGE (驾驶员变更报警事件) 对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_TRAFFIC_DRIVER_CHANGE_INFO implements Serializable {
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
     *  action of event, 0 means pulse event,1 means continuous event's begin,2means continuous event's end
     * \else
     *  事件动作, 0表示脉冲事件, 1表示持续性事件开始, 2表示持续性事件结束
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  GPS info
     * \else
     *  GPS信息
     * \endif
     */
    public NET_GPS_STATUS_INFO					stuGPSStatusInfo = new NET_GPS_STATUS_INFO();

    /**
     * \if ENGLISH_LANG
     *  time of  event occurrence
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  previous driver ID
     * \else
     *  驾驶员更换前驾驶员ID
     * \endif
     */
    public byte					szPrevDriverID[] = new byte[FinalVar.MAX_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     *  current driver ID
     * \else
     *  驾驶员更换后驾驶员ID
     * \endif
     */
    public byte					szCurDriverID[] = new byte[FinalVar.MAX_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     *  ftp path for assocated video
     * \else
     *  违章关联视频FTP上传路径
     * \endif
     */
    public byte					szVideoPath[] = new byte[256];

}