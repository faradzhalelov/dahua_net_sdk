package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Track status of car
 * \else
 * 车辆跟踪状态
 * \endif
 */
public class DEV_EVENT_SNAPMANUAL implements Serializable {
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
     *  event file info
     * \else
     *  事件对应文件信息
     * \endif
     */
    public SDK_EVENT_FILE_INFO					stuFileInfo = new SDK_EVENT_FILE_INFO();

    /**
     * \if ENGLISH_LANG
     *  Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
     * \else
     *  图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
     * \endif
     */
    public byte					byImageIndex;

    /**
     * \if ENGLISH_LANG
     *  flag(by bit),see NET_RESERVED_COMMON 
     * \else
     *  抓图标志(按位),具体见 NET_RESERVED_COMMON    
     * \endif
     */
    public int					dwSnapFlagMask;

}
