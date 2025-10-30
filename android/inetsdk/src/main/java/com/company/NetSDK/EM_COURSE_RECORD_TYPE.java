package com.company.NetSDK;

import java.io.Serializable;



/**
 * \if ENGLISH_LANG
 * course record  type
 * \else
 * 课程录像类型
 * \endif
 */
public class EM_COURSE_RECORD_TYPE implements Serializable {

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
    public final static int EM_COURSE_RECORD_TYPE_UNKNOWN              = -1;
    /**
     * \if ENGLISH_LANG
     * all type
     * \else
     * 全部录像类型
     * \endif
     */
    public final static int EM_COURSE_RECORD_TYPE_ALL              = 0;

    /**
     * \if ENGLISH_LANG
     * guided broadcast type
     * \else
     * 导播录像类型
     * \endif
     */
    public final static int EM_COURSE_RECORD_TYPE_GUIDED_BROADCAST            = 1;

    /**
     * \if ENGLISH_LANG
     * Interaction
     * \else
     * 互动录像类型
     * \endif
     */
    public final static int EM_COURSE_RECORD_TYPE_GUIDED_INTERACTION    = 2;

}
