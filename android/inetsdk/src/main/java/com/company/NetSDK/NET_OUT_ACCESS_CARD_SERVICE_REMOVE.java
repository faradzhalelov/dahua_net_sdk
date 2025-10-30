package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  output of remove card
 * \else
 *  删除指定卡号信息出参
 * \endif
 */
public class NET_OUT_ACCESS_CARD_SERVICE_REMOVE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  max retrun number,great than nCardNum in NET_IN_ACCESS_CARD_SERVICE_REMOVE
     * \else
     * 最大返回信息数量,不小于 NET_IN_ACCESS_CARD_SERVICE_REMOVE中nCardNum
     * \endif
     */
    public int     nMaxRetNum;

    /**
     * \if ENGLISH_LANG
     *  error code,return number is nCardNum in NET_IN_ACCESS_CARD_SERVICE_REMOVE
     * \else
     * 用户分配释放内存,插入失败时,对应删除的每一项的结果,返回个数同NET_IN_ACCESS_CARD_SERVICE_REMOVE中nCardNum
     * \endif
     */
    public int     pFailCode[];

    public NET_OUT_ACCESS_CARD_SERVICE_REMOVE(int nMaxRetNum) {
        this.nMaxRetNum = nMaxRetNum;
        this.pFailCode = new int[nMaxRetNum];
    }
}
