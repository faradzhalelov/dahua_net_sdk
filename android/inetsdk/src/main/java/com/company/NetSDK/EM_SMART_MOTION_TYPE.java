package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Smart motion detection type
 * \else
 * 智能动检检测类型
 * \endif
 */
public class EM_SMART_MOTION_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_SMART_MOTION_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * human
     * \else
     * 人体
     * \endif
     */
    public static final int EM_SMART_MOTION_HUMAN = 1;

    /**
     * \if ENGLISH_LANG
     * vehicle
     * \else
     * 机动车
     * \endif
     */
    public static final int EM_SMART_MOTION_VEHICLE = 2;

}
