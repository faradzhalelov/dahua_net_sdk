package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_ModifyCoureMediaFile Outgoing interface parameter
 * \else
 * @brief CLIENT_ModifyCoureMediaFile 接口出参
 * \endif
 */
public class NET_OUT_MODIFY_COURSE_MEDIA_FILE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Failed course video file id number array size
     * \else
     * 失败课程录像文件id号数组大小
     * \endif
     */
    public int					nResultIdNum;

    /**
     * \if ENGLISH_LANG
     * Failed course video file ID, return -1, failed to modify, there is no such record in the database, return -2, failed to modify, upload or wait to upload, return the original ID, modify successfully,(need to be applied by the user, the size is sizeof(int)*nResultIdNum)
     * \else
     * 失败课程录像文件id号,返回-1,修改失败，数据库中无此记录,返回-2,修改失败，上传中或等待上传,返回原ID，修改成功,(需由用户申请，大小为sizeof(int)*nResultIdNum)
     * \endif
     */
    public int[]					pnResultId;

    /**
     * \if ENGLISH_LANG
     * Number of failed course video file ids actually returned
     * \else
     * 实际返回的失败课程录像文件id号数量
     * \endif
     */
    public int					nRetResultIdNum;

    public NET_OUT_MODIFY_COURSE_MEDIA_FILE_INFO(int nResultIdNum) {
        this.nResultIdNum = nResultIdNum;
        this.pnResultId = new int[nResultIdNum];
    }
}