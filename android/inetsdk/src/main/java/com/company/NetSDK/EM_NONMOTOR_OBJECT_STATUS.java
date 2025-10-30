package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * things/objects status
 * \else
 * 事件/物体状态
 * \endif
 */
public class EM_NONMOTOR_OBJECT_STATUS implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未识别
     * \endif
     */
    public static final int EM_NONMOTOR_OBJECT_STATUS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * no
     * \else
     * 否
     * \endif
     */
    public static final int EM_NONMOTOR_OBJECT_STATUS_NO = 1;

    /**
     * \if ENGLISH_LANG
     * yes
     * \else
     * 是
     * \endif
     */
    public static final int EM_NONMOTOR_OBJECT_STATUS_YES = 2;
}
