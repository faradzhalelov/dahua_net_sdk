package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Bitstream type
 * \else
 * 码流类型
 * \endif
 */
public class NET_RTMP_MANAGER_RECORD_STREAM implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Video file path 
     * \else
     *  录像文件路径 
     * \endif
     */
    public byte					szFilePath[] = new byte[260];

    /**
     * \if ENGLISH_LANG
     *  video start time
     * \else
     *  录像开始时间
     * \endif
     */
    public byte					szStartTime[] = new byte[20];

    /**
     * \if ENGLISH_LANG
     *  录video stop time
     * \else
     *  录像结束时间
     * \endif
     */
    public byte					szEndTime[] = new byte[20];

    /**
     * \if ENGLISH_LANG
     *  channel id
     * \else
     *  通道号
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Code stream type. It is the main code stream by default
     * \else
     *  码流类型，默认为主码流
     * \endif
     */
    public int					emStreamType;

}
