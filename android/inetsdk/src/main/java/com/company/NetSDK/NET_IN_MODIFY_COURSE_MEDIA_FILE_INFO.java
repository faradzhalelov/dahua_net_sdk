package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_ModifyCoureMediaFile Enters the interface
 * \else
 * @brief CLIENT_ModifyCoureMediaFile 接口入参
 * \endif
 */
public class NET_IN_MODIFY_COURSE_MEDIA_FILE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The valid number of id array of the course video file, which is also the valid number of the course video description information,
     * \else
     * 课程录像文件id号数组有效个数,同时也是课程视频描述信息有效个数，
     * \endif
     */
    public int					nIdNum;

    /**
     * \if ENGLISH_LANG
     * id number of the course video file (must be applied by the user, the size is sizeof(int)*nIdNum)
     * \else
     * 课程录像文件id号(需由用户申请，大小为sizeof(int)*nIdNum)
     * \endif
     */
    public int[]					pnId;

    /**
     * \if ENGLISH_LANG
     * Course video description (Required by users. sizeof(NET_MEDIA_FILE_COURSE_INFO)*nIdNum)
     * \else
     * 课程视频描述信息(需由用户申请，大小为sizeof(NET_MEDIA_FILE_COURSE_INFO)*nIdNum)
     * \endif
     */
    public NET_MEDIA_FILE_COURSE_INFO[]					pstuCourseInfo;

    public NET_IN_MODIFY_COURSE_MEDIA_FILE_INFO(int nIdNum) {
        this.nIdNum = nIdNum;
        this.pnId = new int[nIdNum];
        this.pstuCourseInfo = new NET_MEDIA_FILE_COURSE_INFO[nIdNum];
        for(int i = 0; i < nIdNum; i ++){
            this.pstuCourseInfo[i] = new NET_MEDIA_FILE_COURSE_INFO();
        }
    }

}