package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Examination room video query results ( CLIENT_FindNextFileEx + SDK_FILE_QUERY_EXAM )
 * \else
 * @brief 考场录像查询结果 ( CLIENT_FindNextFileEx + SDK_FILE_QUERY_EXAM )
 * \endif
 */
public class NET_MEDIAFILE_EXAM_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel ID
     * \else
     *  通道号从0开始,-1表示查询所有通道
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  Starting time
     * \else
     *  开始时间    
     * \endif
     */
    public NET_TIME					stuStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  End Time
     * \else
     *  结束时间
     * \endif
     */
    public NET_TIME					stuEndTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Candidate name
     * \else
     *  考生姓名
     * \endif
     */
    public byte					szName[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  Candidate test number
     * \else
     *  考生考号
     * \endif
     */
    public byte					szNumber[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  Camera IP
     * \else
     *  摄像头IP
     * \endif
     */
    public byte					szCameraIP[] = new byte[32];

}
