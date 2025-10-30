package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Course reocrd compression type
 * \else
 * 课程录像压缩类型
 * \endif
 */
public class EM_COURSE_RECORD_COMPRESSION_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_COURSE_RECORD_COMPRESSION_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * H.264(default)
     * \else
     * H.264 默认值
     * \endif
     */
    public static final int EM_COURSE_RECORD_COMPRESSION_TYPE_H264 = 1;

    /**
     * \if ENGLISH_LANG
     * H.265
     * \else
     * H.265
     * \endif
     */
    public static final int EM_COURSE_RECORD_COMPRESSION_TYPE_H265 = 2;

}
