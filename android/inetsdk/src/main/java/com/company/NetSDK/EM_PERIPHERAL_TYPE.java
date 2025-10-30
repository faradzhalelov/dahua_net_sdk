package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Peripheral type
 * \else
 * 外设类型
 * \endif
 */
public class EM_PERIPHERAL_TYPE implements Serializable {
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
    public static final int EM_PERIPHERAL_NUKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * AsgController
     * \else
     * 闸机控制板
     * \endif
     */
    public static final int EM_PERIPHERAL_ASG_CONTROLLER = 1;

    /**
     * \if ENGLISH_LANG
     * AsgMotor
     * \else
     * 闸机电机驱动
     * \endif
     */
    public static final int EM_PERIPHERAL_ASG_MOTOR = 2;

    /**
     * \if ENGLISH_LANG
     * Security gate door controller
     * \else
     * 安检门门板控制器
     * \endif
     */
    public static final int EM_PERIPHERAL_SECURITYGATE_DOOR_CONTROLLER = 3;

    /**
     * \if ENGLISH_LANG
     * Infrared temperature unit
     * \else
     * 红外测温模块
     * \endif
     */
    public static final int EM_PERIPHERAL_INFRARED_TEMPERATURE_UNIT = 4;

    /**
     * \if ENGLISH_LANG
     * Asg voice
     * \else
     * 闸机语音模块
     * \endif
     */
    public static final int EM_PERIPHERAL_ASG_VOICE = 5;

    /**
     * \if ENGLISH_LANG
     * Asg reader
     * \else
     * 闸机读卡器
     * \endif
     */
    public static final int EM_PERIPHERAL_ASG_READER = 6;
}
