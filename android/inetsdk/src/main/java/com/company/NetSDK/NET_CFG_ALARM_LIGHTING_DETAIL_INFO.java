package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Detailed configuration of warning lights
 * \else
 * 警戒灯光详细配置
 * \endif
 */
public class NET_CFG_ALARM_LIGHTING_DETAIL_INFO implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Enable. If it is true, the lamp has warning function
     * \else
     * 使能，如果true，说明该灯有警戒功能
     * \endif
     */
    public boolean                bEnable;

    /**
     * \if ENGLISH_LANG
     * Light type,refer to{@link EM_ALARM_LIGHT_TYPE}
     * \else
     * 灯光类型,参考{@link EM_ALARM_LIGHT_TYPE}
     * \endif
     */
    public int emLightType;

    /**
     * \if ENGLISH_LANG
     * The time, in seconds, that a light stays on or blinks
     * \else
     * 灯光保持常亮或闪烁的时间，单位秒
     * \endif
     */
    public int                 nLightDuration;

    /**
     * \if ENGLISH_LANG
     * Brightness 0 ~ 100
     * \else
     * 亮度 0 ~ 100
     * \endif
     */
    public int                 nBrightness;

    /**
     * \if ENGLISH_LANG
     * Lighting conditions,{@link EM_ALARM_LIGHT_CONDITION_TYPE}
     * \else
     * 亮起条件,{@link EM_ALARM_LIGHT_CONDITION_TYPE}
     * \endif
     */
    public int emLightCondition;

}
