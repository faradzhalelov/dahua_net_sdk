package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Corresponding to data block description of event type EVENT_IVS_INFRAREDBLOCK(Event of infrared block)
 * \else
 * @brief 事件类型EVENT_IVS_INFRAREDBLOCK(红外阻断报警事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_INFRAREDBLOCK_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel ID
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  Event name
     * \else
     *  事件名称
     * \endif
     */
    public byte					szName[] = new byte[FinalVar.SDK_EVENT_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     *  Timestamp (in milliseconds)
     * \else
     *  时间戳(单位是毫秒)
     * \endif
     */
    public double					PTS;

    /**
     * \if ENGLISH_LANG
     *  Time for the event occurred
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
     *  GPS info
     * \else
     *  GPS信息
     * \endif
     */
    public NET_GPS_STATUS_INFO					stuGPSStatus = new NET_GPS_STATUS_INFO();

    /**
     * \if ENGLISH_LANG
     *  Driver ID
     * \else
     *  司机ID
     * \endif
     */
    public byte					szDriverID[] = new byte[32];

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
     *  Number of multiple video information associated with violation
     * \else
     *  违章关联的多个视频信息个数
     * \endif
     */
    public int					nRelatingVideoInfoNum;

    /**
     * \if ENGLISH_LANG
     *  Multiple video information arrays associated with violations, supporting up to 16 videos
     * \else
     *  违章关联的多个视频信息数组，最多支持16个视频
     * \endif
     */
    public NET_RELATING_VIDEO_INFO		stuRelatingVideoInfo[] = new NET_RELATING_VIDEO_INFO[16];

    public DEV_EVENT_INFRAREDBLOCK_INFO() {
        for (int i = 0; i < 16; i++) {
            this.stuRelatingVideoInfo[i] = new NET_RELATING_VIDEO_INFO();
        }
    }

}