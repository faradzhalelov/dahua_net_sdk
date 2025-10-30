package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Intelligent dynamic detection configuration
 * \else
 * 智能动态检测配置
 * \endif
 */
public class NET_CFG_SMART_MOTION_DETECT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Dynamic inspection enable, on: TRUE, off: FALSE
     * \else
     * 动检使能，开：TRUE 关：FALSE
     * \endif
     */
    public boolean              bEnable;

    /**
     * \if ENGLISH_LANG
     * Motion detection sensitivity level ， see  {@link EM_SMART_MOTION_DETECT_SENSITIVITY_LEVEL} note
     * \else
     * 动检敏感级别，详见 {@link EM_SMART_MOTION_DETECT_SENSITIVITY_LEVEL}说明
     * \endif
     */
    public int                  emMotionDetectSensitivityLevel;

    /**
     * \if ENGLISH_LANG
     * Intelligent dynamic detection configuration
     * \else
     * 智能动态检测对象
     * \endif
     */
    public NET_SMART_MOTION_DETECT_OBJECT stuMotionDetectObject = new NET_SMART_MOTION_DETECT_OBJECT();

}
