package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Work clothes detection
 * \else
 * 工作服检测
 * \endif
 */
public class NET_WORK_CLOTHES implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Whether to detect work clothes
     * \else
     * 是否检测工作服
     * \endif
     */
    public boolean                        bEnbale;

    /**
     * \if ENGLISH_LANG
     * Whether to wear work clothes
     * \else
     * 是否穿着工作服
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
     * Work clothes color,,valid by DetectColor is true,{@link EM_WORKCLOTHES_COLOR_TYPE}
     * \else
     * 工作服颜色，DetectColor为 true 时有效,{@link EM_WORKCLOTHES_COLOR_TYPE}
     * \endif
     */
    public int   emColor;
}
