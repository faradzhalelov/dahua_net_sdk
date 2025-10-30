package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *  AutoScan config NET_EM_CFG_AUTOSCAN
 * \else
 * 自动线扫设置
 * \endif
 */
public class NET_CFG_AUTOSCAN_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The number of pAutoScanInfos user malloc
     * \else
     * 用户分配的pAutoScanInfos内存的个数
     * \endif
     */
    public int						nMaxScanInfoNum;

    /**
     * \if ENGLISH_LANG
     *  AutoScan information
     * \else
     * 线扫信息
     * \endif
     */
    public NET_AUTOSCAN_INFO[]  pAutoScanInfos;
    /**
     * \if ENGLISH_LANG
     * The actual number of pAutoScanInfos it must < MaxScanInfoNum
     * \else
     * 实际获取/设置的配置的个数，必须小于nMaxScanInfoNum
     * \endif
     */
    public int						nRetScanInfoNum;
    public NET_CFG_AUTOSCAN_INFO(int nMaxScanInfoNum){
        this.nMaxScanInfoNum = nMaxScanInfoNum;
        pAutoScanInfos = new NET_AUTOSCAN_INFO[nMaxScanInfoNum];
        for(int i = 0; i < nMaxScanInfoNum; i++) {
            pAutoScanInfos[i] = new NET_AUTOSCAN_INFO();
        }
    }

}
