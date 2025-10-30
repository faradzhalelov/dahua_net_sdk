package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Relevant attribute status information of fireproof clothing
 * \else
 * @brief 防火衣相关属性状态信息
 * \endif
 */
public class NET_FIREPROOF_CLOTHES implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether there is a FireProofClothes,{@link EM_FIREPROOF_CLOTHES_STATE}
     * \else
     *  是否穿着防火衣,{@link EM_FIREPROOF_CLOTHES_STATE}
     * \endif
     */
    public int					emHasFireProofClothes;

    /**
     * \if ENGLISH_LANG
     *  FireProofClothes color,{@link EM_CLOTHES_COLOR}
     * \else
     *  防火衣颜色,{@link EM_CLOTHES_COLOR}
     * \endif
     */
    public int					emFireProofClothesColor;

}