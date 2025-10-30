package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Query filters
 * \else
 * 查询过滤条件
 * \endif
 */
public class EM_FACERECOGNITION_FACE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknow
     * \else
     * 未知
     * \endif
     */
    public static final int EM_FACERECOGNITION_FACE_TYPE_UNKOWN = 0;

    /**
     * \if ENGLISH_LANG
     * All the faces
     * \else
     * 所有目标
     * \endif
     */
    public static final int EM_FACERECOGNITION_FACE_TYPE_ALL = 1;

    /**
     * \if ENGLISH_LANG
     * recognition success
     * \else
     * 识别成功
     * \endif
     */
    public static final int EM_FACERECOGNITION_FACE_TYPE_REC_SUCCESS = 2;

    /**
     * \if ENGLISH_LANG
     * recognition fail
     * \else
     * 识别失败
     * \endif
     */
    public static final int EM_FACERECOGNITION_FACE_TYPE_REC_FAIL = 3;
}
