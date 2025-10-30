package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  input of remove card info
 * \else
 *  删除指定卡号信息入参
 * \endif
 */
public class NET_IN_ACCESS_CARD_SERVICE_REMOVE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  remove number
     * \else
     * 删除的数量
     * \endif
     */
    public int     nCardNum;

    /**
     * \if ENGLISH_LANG
     *  card no
     * \else
     * 卡号
     * \endif
     */
    public byte     szCardNo[][] = new byte[100][32];

}
