package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  input of get card info
 * \else
 *  获取卡片信息入参
 * \endif
 */
public class NET_IN_ACCESS_CARD_SERVICE_GET implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  get number
     * \else
     * 查询的数量
     * \endif
     */
    public int     nCardNum;

    /**
     * \if ENGLISH_LANG
     *  card No
     * \else
     * 卡号
     * \endif
     */
    public byte     szCardNo[][] = new byte[100][32];

}
