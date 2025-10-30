package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Indicates the status of glasses related properties
 * \else
 * @brief 呼吸面罩相关属性状态信息
 * \endif
 */
public class NET_BREATHING_MASK_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Respirator test results, 0: unknown, 1: non compliant, 2: compliant
     * \else
     *  呼吸面罩检测结果, 0:未知，1:不合规，2:合规
     * \endif
     */
    public int					nHasLegalBreathingMask;

    /**
     * \if ENGLISH_LANG
     *  Whether wearing a breathing mask, 0: unknown 1: no 2: yes
     * \else
     *  是否有穿着呼吸面罩, 0: 未知 1: 没有 2: 有 
     * \endif
     */
    public int					nHasBreathingMask;

}