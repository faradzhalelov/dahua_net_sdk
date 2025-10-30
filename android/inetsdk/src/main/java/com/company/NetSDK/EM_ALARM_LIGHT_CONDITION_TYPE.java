package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Warning light condition setting
 * \else
 * 警戒灯光条件设置
 * \endif
 */
public class EM_ALARM_LIGHT_CONDITION_TYPE implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知类型
     * \endif
     */
    public static final int EM_ALARM_LIGHT_CONDITION_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * According to the state of the image: the state of the image when the event occurs, the image judges whether the current scene needs to light up
     * \else
     * 根据图像的状态: 事件发生时取图像的状态，图像判断当前场景是否需要亮起灯光
     * \endif
     */
    public static final int EM_ALARM_LIGHT_CONDITION_BY_VIDEOSTATUS = 1;

    /**
     * \if ENGLISH_LANG
     * According to the time period
     * \else
     * 根据时间段
     * \endif
     */
    public static final int EM_ALARM_LIGHT_CONDITION_BY_TIME = 2;

    /**
     * \if ENGLISH_LANG
     * No additional conditions, event trigger to force light on
     * \else
     * 无附加条件、事件触发即强制灯光亮起
     * \endif
     */
    public static final int EM_ALARM_LIGHT_CONDITION_BY_FORCE = 3;
}
