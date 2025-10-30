package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief course information
 * \else
 * @brief 课程信息
 * \endif
 */
public class NET_MEDIA_FILE_COURSE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Course name
     * \else
     * 课程名称
     * \endif
     */
    public byte					szCourseName[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * Teacher name
     * \else
     * 教师名称
     * \endif
     */
    public byte					szTeacherName[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * Video introduction
     * \else
     * 视频简介
     * \endif
     */
    public byte					szIntroduction[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Locked status: 1- Not locked,2- locked
     * \else
     * 锁定状态,1-非锁定,2-锁定
     * \endif
     */
    public int					nLockState;

    /**
     * \if ENGLISH_LANG
     * Upload status: 1. Not uploaded 2. Uploading 3. Uploaded
     * \else
     * 上传状态：1.未上传 2.上传中 3.已上传
     * \endif
     */
    public int					nUploadType;

    /**
     * \if ENGLISH_LANG
     * Course start time
     * \else
     * 课程开始时间
     * \endif
     */
    public NET_TIME					stuStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * End time of the course
     * \else
     * 课程结束时间
     * \endif
     */
    public NET_TIME					stuEndTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * Interaction ID
     * \else
     * 互动ID
     * \endif
     */
    public byte					szVideoConferenceId[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * Whether the meeting is the creator. The value of the meeting creator field is 1, and the value of the non-meeting creator field is 0
     * \else
     * 是否会议创建人，会议创建人字段赋值为1，非会议创建人字段赋值为0
     * \endif
     */
    public int					nVideoConferenceCreator;

}