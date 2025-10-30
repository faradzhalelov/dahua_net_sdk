package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  output of update card info
 * \else
 *  更新卡片信息出参
 * \endif
 */
public class NET_OUT_ACCESS_CARD_SERVICE_UPDATE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  max return number,greater than nInfoNum in NET_IN_ACCESS_CARD_SERVICE_UPDATE
     * \else
     * 最大返回的用户信息数量,不小于NET_IN_ACCESS_CARD_SERVICE_UPDATE中nInfoNum
     * \endif
     */
    public int     nMaxRetNum;

    /**
     * \if ENGLISH_LANG
     *  error code,return number is nInfoNum in NET_IN_ACCESS_CARD_SERVICE_UPDATE
     * \else
     * 用户分配释放内存,插入失败时，对应插入的每一项的结果,返回个数同NET_IN_ACCESS_CARD_SERVICE_UPDATE中nInfoNum
     * \endif
     */
    public int     pFailCode[];

    public NET_OUT_ACCESS_CARD_SERVICE_UPDATE(int nMaxRetNum) {
        this.nMaxRetNum = nMaxRetNum;
        this.pFailCode = new int[nMaxRetNum];
    }
}
