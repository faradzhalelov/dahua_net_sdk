package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief FireProofClothes state
 * \else
 * @brief 是否穿着防火衣
 * \endif
 */
public class EM_FIREPROOF_CLOTHES_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_FIREPROOF_CLOTHES_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  not FireProofClothes
     * \else
     *  没有穿着防火衣
     * \endif
     */
    public static final int					EM_FIREPROOF_CLOTHES_STATE_NO = 1;

    /**
     * \if ENGLISH_LANG
     *  FireProofClothes
     * \else
     *  有穿着防火衣
     * \endif
     */
    public static final int					EM_FIREPROOF_CLOTHES_STATE_YES = 2;

    /**
     * \if ENGLISH_LANG
     *  There is no hat of the specified color 
     * \else
     *  不存在指定颜色的防火衣
     * \endif
     */
    public static final int					EM_FIREPROOF_CLOTHES_STATE_NOEXIT = 3;

}