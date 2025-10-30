package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Work pants attribute
 * \else
 * @brief 工作裤属性
 * \endif
 */
public class NET_WORKPANTS_ATTRIBUTE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  work pants state,{@link EM_WORKPANTS_STATE}
     * \else
     *  工作裤穿戴状态,{@link EM_WORKPANTS_STATE}
     * \endif
     */
    public int					emWorkPantsState;

    /**
     * \if ENGLISH_LANG
     *  work pants color,{@link EM_CLOTHES_COLOR}
     * \else
     *  工作裤颜色,{@link EM_CLOTHES_COLOR}
     * \endif
     */
    public int					emWorkPantsColor;

}