package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Ptz link type
 * \else
 * 联动类型
 * \endif
 */
public class EM_PTZ_LINK_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * none
     * \else
     * none
     * \endif
     */
    public static final int EM_PTZ_LINK_TYPE_NONE = 0;

    /**
     * \if ENGLISH_LANG
     * "Preset"
     * \else
     * "Preset" 联动预置点
     * \endif
     */
    public static final int EM_PTZ_LINK_TYPE_PRESET = 1;

    /**
     * \if ENGLISH_LANG
     * "Tour"
     * \else
     * "Tour" 联动巡航
     * \endif
     */
    public static final int EM_PTZ_LINK_TYPE_TOUR = 2;

    /**
     * \if ENGLISH_LANG
     * "Pattern"
     * \else
     * "Pattern" 联动模式
     * \endif
     */
    public static final int EM_PTZ_LINK_TYPE_PATTERN = 3;

    /**
     * \if ENGLISH_LANG
     * "Zoom"
     * \else
     * "Zoom" 联动变倍
     * \endif
     */
    public static final int EM_PTZ_LINK_TYPE_ZOOM = 4;

    /**
     * \if ENGLISH_LANG
     * "SingleScene"
     * \else
     * "SingleScene" 联动智能单场景
     * \endif
     */
    public static final int EM_PTZ_LINK_TYPE_SINGLESCENE = 5;

    /**
     * \if ENGLISH_LANG
     * "QuickFocus"
     * \else
     * "QuickFocus" 热成像云台联动快速定位
     * \endif
     */
    public static final int EM_PTZ_LINK_TYPE_QUICKFOCUS = 6;
}
