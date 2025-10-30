package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Relevant attribute status information of protective clothing
 * \else
 * @brief 防护服相关属性状态信息
 * \endif
 */
public class NET_PROTECTIVE_SUIT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether wearing protective Suit, 0: Unknown, 1: None, 2: Yes, 3: No protective clothing of the specified color exists
     * \else
     *  是否有穿着防护服, 0: 未知, 1: 没有, 2: 有, 3:不存在指定颜色的防护服
     * \endif
     */
    public int					nHasProtectiveSuit;

    /**
     * \if ENGLISH_LANG
     *  Protective Suit Color,{@link EM_CLOTHES_COLOR}
     * \else
     *  防护服颜色,{@link EM_CLOTHES_COLOR}
     * \endif
     */
    public int					emProtectiveSuitColor;

}