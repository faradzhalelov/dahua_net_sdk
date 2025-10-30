package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * work pants info
 * \else
 * 工作裤检测
 * \endif
 */
public class NET_WORK_PANTS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Whether to detect work pants
     * \else
     * 是否检测工作裤
     * \endif
     */
    public boolean                        bEnbale;

    /**
     * \if ENGLISH_LANG
     * Whether wear work pants
     * \else
     * 是否穿着工作裤
     * \endif
     */
    public boolean                        bWeared;

    /**
     * \if ENGLISH_LANG
     * Whether to specify the detection color
     * \else
     * 是否指定检测颜色
     * \endif
     */
    public boolean                        bDetectColor;

    /**
     * \if ENGLISH_LANG
     * Work pants color, valid when bDetectColor is true,{@link EM_WORKCLOTHES_COLOR_TYPE}
     * \else
     * 工作裤颜色，bDetectColor 为 true 时有效,{@link EM_WORKCLOTHES_COLOR_TYPE}
     * \endif
     */
    public int   emColor;
}
