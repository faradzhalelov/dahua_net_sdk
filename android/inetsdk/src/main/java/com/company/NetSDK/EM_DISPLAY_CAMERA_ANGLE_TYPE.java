package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the display type of camera angle
 * \else
 * 摄像头安装角度显示方式
 * \endif
 */
public class EM_DISPLAY_CAMERA_ANGLE_TYPE implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown type
     * \else
     * 未知的显示方式
     * \endif
     */
    public static final int EM_DISPLAY_CAMERA_ANGLE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * "NUM" config according to the angle(default)
     * \else
     * 按角度值配置(默认)
     * \endif
     */
    public static final int EM_DISPLAY_CAMERA_ANGLE_NUM = 1;

    /**
     * \if ENGLISH_LANG
     * "Mode"  config according to the mode
     * \else
     * 按模式配置，0~20展示为顶装,21~90展示为斜装，配置时按60下发
     * \endif
     */
    public static final int EM_DISPLAY_CAMERA_ANGLE_MODE = 2;
}
