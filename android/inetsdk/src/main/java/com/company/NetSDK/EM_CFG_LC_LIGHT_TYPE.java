package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * light type
 * \else
 * 灯类型
 * \endif
 */
public class EM_CFG_LC_LIGHT_TYPE implements Serializable {
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
    public static final int EM_CFG_LC_LIGHT_TYPEUNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Infrared
     * \else
     * 红外灯
     * \endif
     */
    public static final int EM_CFG_LC_LIGHT_TYPE_INFRAREDLIGHT = 1;

    /**
     * \if ENGLISH_LANG
     * White
     * \else
     * 白光灯
     * \endif
     */
    public static final int EM_CFG_LC_LIGHT_TYPE_WIHTELIGHT = 2;

    /**
     * \if ENGLISH_LANG
     * Laser
     * \else
     * 激光灯
     * \endif
     */
    public static final int EM_CFG_LC_LIGHT_TYPE_LASERLIGHT = 3;

    /**
     * \if ENGLISH_LANG
     * AIMixLight
     * \else
     * 智能混光灯(根据智能ID切换红外和白光灯)
     * \endif
     */
    public static final int EM_CFG_LC_LIGHT_TYPE_AIMIXLIGHT = 4;

    /**
     * \if ENGLISH_LANG
     * PilotLight
     * \else
     * 指示灯
     * \endif
     */
    public static final int EM_CFG_LC_LIGHT_TYPE_PILOTLIGHT = 5;
}

