package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Exam plan
 * \else
 * @brief 考试计划
 * \endif
 */
public class NET_EXAM_RECORDING_PLAN_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Candidate's name, encoded in UTF8
     * \else
     *  考生姓名，采用UTF8编码
     * \endif
     */
    public byte					szName[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  Candidate number
     * \else
     *  考号
     * \endif
     */
    public byte					szNumber[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  Number of camera IPs
     * \else
     *  摄像头IP个数
     * \endif
     */
    public int					nCameraIPNum;

    /**
     * \if ENGLISH_LANG
     *  Camera IP array
     * \else
     *  摄像头IP数组
     * \endif
     */
    public byte					szCameraIP[][] = new byte[8][32];

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
     *  Reserved bytes
     * \else
     *  保留字节
     * \endif
     */
    public byte					szResvered[] = new byte[256];

}
