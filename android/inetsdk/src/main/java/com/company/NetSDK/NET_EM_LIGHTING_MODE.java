package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * logic channel
 * \else
 * 逻辑通道号
 * \endif
 */
public class NET_EM_LIGHTING_MODE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知模式
     * \endif
     */
    public static final int NET_EM_LIGHTING_UNKNOW = 0;

    /**
     * \if ENGLISH_LANG
     * manual
     * \else
     * 手动模式
     * \endif
     */
    public static final int NET_EM_LIGHTING_MANUAL = 1;

    /**
     * \if ENGLISH_LANG
     * auto
     * \else
     * 自动模式
     * \endif
     */
    public static final int NET_EM_LIGHTING_AUTO = 2;

    /**
     * \if ENGLISH_LANG
     * off
     * \else
     * 关闭模式
     * \endif
     */
    public static final int NET_EM_LIGHTING_OFF = 3;

    /**
     * \if ENGLISH_LANG
     * zoomprio
     * \else
     * 倍率优先模式
     * \endif
     */
    public static final int NET_EM_LIGHTING_ZOOMPRIO = 4;

    /**
     * \if ENGLISH_LANG
     * timing
     * \else
     * 定时模式，本模式时LightingSchedule配置生效
     * \endif
     */
    public static final int NET_EM_LIGHTING_TIMING = 5;

    /**
     * \if ENGLISH_LANG
     * smart light(only used by SD)
     * \else
     * 智能灯光模式(仅球机使用),如果在模式选择本模式，使用新加的SmartLighting配置
     * \endif
     */
    public static final int NET_EM_LIGHTING_SMARTLIGHT = 6;

    /**
     * \if ENGLISH_LANG
     * Multiple lights are supported, but only one light is used in manual mode, using the Manual Lighting configuration
     * \else
     * 支持多种灯光，但手动模式下只使用一种灯光，此时使用ManualLighting配置
     * \endif
     */
    public static final int NET_EM_LIGHTING_EXCLUSIVEMANUAL = 7;

    /**
     * \if ENGLISH_LANG
     * force lights on(need to keep state)
     * \else
     * 强制打开灯光
     * \endif
     */
    public static final int NET_EM_LIGHTING_FORCEON = 8;


}
