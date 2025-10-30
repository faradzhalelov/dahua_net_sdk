package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * item info in pos exchange
 * \else
 * POS交易中的商品清单信息
 * \endif
 */
public class NET_POS_ITEM_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * item name
     * \else
     * 商品名称
     * \endif
     */
    public byte[]				szItemName = new byte[FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * price
     * \else
     * 商品单价
     * \endif
     */
    public double				dbPrice;

    /**
     * \if ENGLISH_LANG
     * quantity
     * \else
     * 数量
     * \endif
     */
    public double				dbQuantity;

    /**
     * \if ENGLISH_LANG
     * amount
     * \else
     * 总价
     * \endif
     */
    public double				dbAmount;

    /**
     * \if ENGLISH_LANG
     * price unit
     * \else
     * 计价单位
     * \endif
     */
    public byte[]				szUnit = new byte[FinalVar.SDK_COMMON_STRING_8];
}
