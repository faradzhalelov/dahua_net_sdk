package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Event type EVENT_IVS_TRAFFIC_DRIVER_NO_BELT (not wearing seat belt alarm event) corresponding data block description information
 * \else
 * @brief 事件类型 EVENT_IVS_TRAFFIC_DRIVER_NO_BELT (未系安全带报警事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_TRAFFIC_DRIVER_NO_BELT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel number
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  0: pulse, 1: start, 2: stop
     * \else
     *  0:脉冲,1:开始, 2:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  event name
     * \else
     *  事件名称
     * \endif
     */
    public byte					szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  relative event timestamp, (unit is milliseconds)
     * \else
     *  相对事件时间戳,(单位是毫秒)
     * \endif
     */
    public double					dbPTS;

    /**
     * \if ENGLISH_LANG
     *  Time when the event occurred
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					stuUTC = new NET_TIME_EX();

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
     *  GPS information
     * \else
     *  GPS信息
     * \endif
     */
    public NET_GPS_STATUS_INFO					stuGPSStatus = new NET_GPS_STATUS_INFO();

    /**
     * \if ENGLISH_LANG
     *  FTP upload path of violation related video
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
    public NET_RELATING_VIDEO_INFO					stuRelatingVideoInfo[] = new NET_RELATING_VIDEO_INFO[16];

    public DEV_EVENT_TRAFFIC_DRIVER_NO_BELT_INFO() {
        for(int i = 0; i < 16; i ++){
            this.stuRelatingVideoInfo[i] = new NET_RELATING_VIDEO_INFO();
        }
    }
}