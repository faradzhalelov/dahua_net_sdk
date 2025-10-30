package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  input of insert card
 * \else
 *  新增卡片信息入参
 * \endif
 */
public class NET_IN_ACCESS_CARD_SERVICE_INSERT implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  card number
     * \else
     * 用户信息数量
     * \endif
     */
    public int     nInfoNum;

    /**
     * \if ENGLISH_LANG
     *  card info
     * \else
     * 卡片信息,用户分配释放内存,大小为sizeof(NET_ACCESS_CARD_INFO)*nInfoNum
     * \endif
     */
    public NET_ACCESS_CARD_INFO[]     pCardInfo;

    public NET_IN_ACCESS_CARD_SERVICE_INSERT(int nInfoNum) {
        this.nInfoNum = nInfoNum;
        pCardInfo = new NET_ACCESS_CARD_INFO[nInfoNum];
        for(int i = 0; i < nInfoNum; i ++){
            this.pCardInfo[i] = new NET_ACCESS_CARD_INFO();
        }
    }
}

