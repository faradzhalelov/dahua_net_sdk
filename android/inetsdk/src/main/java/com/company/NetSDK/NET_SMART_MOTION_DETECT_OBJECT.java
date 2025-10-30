package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Intelligent dynamic detection configuration
 * \else
 * 智能动态检测对象
 * \endif
 */
public class NET_SMART_MOTION_DETECT_OBJECT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Dynamic detection human enable
     * \else
     * 动态检测人使能
     * \endif
     */
    public boolean              bHuman;

    /**
     * \if ENGLISH_LANG
     * Dynamic detection vehicle enable
     * \else
     * 动态检测车使能
     * \endif
     */
    public boolean              bVehicle;

}
