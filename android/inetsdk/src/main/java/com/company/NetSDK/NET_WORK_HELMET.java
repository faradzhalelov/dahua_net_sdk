package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Work Helmet detection
 * \else
 * 安全帽检测
 * \endif
 */
public class NET_WORK_HELMET implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Whether to detect work helmet
     * \else
     * 是否检测安全帽
     * \endif
     */
    public boolean                        bEnbale;

    /**
     * \if ENGLISH_LANG
     * Whether to wear work helmet
     * \else
     * 是否穿戴安全帽
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
     * Work helmet color, valid when DetectColor is true,{@link EM_WORKCLOTHES_COLOR_TYPE}
     * \else
     * 安全帽颜色，DetectColor为 true 时有效,{@link EM_WORKCLOTHES_COLOR_TYPE}
     * \endif
     */
    public int   emColor;
}
