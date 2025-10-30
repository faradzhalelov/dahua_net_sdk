package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * P/T movement status of gimbal
 * \else
 * 云台P/T运动状态
 * \endif
 */
public class EM_SDK_PTZ_PAN_TILT_STATUS implements Serializable {
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
    public static final int EM_SDK_PTZ_PAN_TILT_STATUS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Idle state
     * \else
     * 空闲状态
     * \endif
     */
    public static final int EM_SDK_PTZ_PAN_TILT_STATUS_IDLE = 1;

    /**
     * \if ENGLISH_LANG
     * Movement status
     * \else
     * 运动状态
     * \endif
     */
    public static final int EM_SDK_PTZ_PAN_TILT_STATUS_MOVING = 2;

}
