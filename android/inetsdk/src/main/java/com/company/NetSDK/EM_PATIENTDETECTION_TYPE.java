package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Patient Detection type
 * \else
 * 活动状态检测具体类型
 * \endif
 */
public class EM_PATIENTDETECTION_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知类型
     * \endif
     */
    public static final int EM_PATIENTDETECTION_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * cross region
     * \else
     * 警戒区域报警
     * \endif
     */
    public static final int EM_PATIENTDETECTION_TYPE_CROSS_REGION = 1;

    /**
     * \if ENGLISH_LANG
     * light off
     * \else
     * 病房电灯被熄灭
     * \endif
     */
    public static final int EM_PATIENTDETECTION_TYPE_LIGHT_OFF = 2;

    /**
     * \if ENGLISH_LANG
     * stop detection
     * \else
     * 撤防
     * \endif
     */
    public static final int EM_PATIENTDETECTION_TYPE_STOP_DETECTION = 3;

    /**
     * \if ENGLISH_LANG
     * start detection
     * \else
     * 开始布防
     * \endif
     */
    public static final int EM_PATIENTDETECTION_TYPE_START_DETECTION = 4;

    /**
     * \if ENGLISH_LANG
     * escape
     * \else
     * 逃跑
     * \endif
     */
    public static final int EM_PATIENTDETECTION_TYPE_ESCAPE = 5;

    /**
     * \if ENGLISH_LANG
     * release escape
     * \else
     * 解除逃离报警
     * \endif
     */
    public static final int EM_PATIENTDETECTION_TYPE_ESCAPE_RELEASE = 6;

}
