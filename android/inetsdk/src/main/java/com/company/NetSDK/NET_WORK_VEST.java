package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Work  vest detection
 * \else
 * 马甲检测
 * \endif
 */
public class NET_WORK_VEST implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Whether to detect work vest
     * \else
     * 是否检测马甲
     * \endif
     */
    public boolean                        bEnbale;

    /**
     * \if ENGLISH_LANG
     * Whether to wear work vest
     * \else
     * 是否穿着马甲
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
     * Work vest color, valid when DetectColor is true,valid when DetectColor is true,{@link EM_WORKCLOTHES_COLOR_TYPE}
     * \else
     * 马甲颜色，DetectColor为 true 时有效,{@link EM_WORKCLOTHES_COLOR_TYPE}
     * \endif
     */
    public int   emColor;
}
