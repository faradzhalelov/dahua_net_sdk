package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  output of get card info
 * \else
 *  获取卡片信息出参
 * \endif
 */
public class NET_OUT_ACCESS_CARD_SERVICE_GET implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  max return number
     * \else
     * 查询返回的最大数量
     * \endif
     */
    public int     nMaxRetNum;

    /**
     * \if ENGLISH_LANG
     *  card info
     * \else
     * 卡片信息,内存由用户申请释放，申请大小不小于nCardNum*sizeof(NET_ACCESS_CARD_INFO);                                                                           // 返回个数同NET_IN_ACCESS_CARD_SERVICE_GET中nCardNum
     * \endif
     */
    public NET_ACCESS_CARD_INFO[]     pCardInfo;

    /**
     * \if ENGLISH_LANG
     *  error code,return number is nCardNum in NET_IN_ACCESS_CARD_SERVICE_GET
     * \else
     * 查询失败时，对应查询的每一项的结果,返回个数同NET_IN_ACCESS_CARD_SERVICE_GET中nCardNum
     * \endif
     */
    public int     pFailCode[];

    public NET_OUT_ACCESS_CARD_SERVICE_GET(int nMaxRetNum) {
        this.nMaxRetNum = nMaxRetNum;
        pFailCode = new int[nMaxRetNum];
        pCardInfo = new NET_ACCESS_CARD_INFO[nMaxRetNum];
        for(int i = 0; i < nMaxRetNum; i ++){
            this.pCardInfo[i] = new NET_ACCESS_CARD_INFO();
        }
    }
}
