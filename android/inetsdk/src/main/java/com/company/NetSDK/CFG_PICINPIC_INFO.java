package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief picinpic project
 * \else
 * @brief 画中画方案
 * \endif
 */
public class CFG_PICINPIC_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  applied for CFG_SPLIT_INFO number of memory,the value through the CLIENT_GetSplitCaps interface to get,see nModeCount
     * \else
     *  内存申请的CFG_SPLIT_INFO个数,最大值通过CLIENT_GetSplitCaps接口获取，见nModeCount
     * \endif
     */
    public int					nMaxSplit;

    /**
     * \if ENGLISH_LANG
     *  parsing for actual use or encapsulation send CFG_SPLIT_INFO number
     * \else
     *  解析得到实际使用的或封装发送的CFG_SPLIT_INFO个数
     * \endif
     */
    public int					nReturnSplit;

    /**
     * \if ENGLISH_LANG
     *  split project
     * \else
     *  分割方案
     * \endif
     */
    public CFG_SPLIT_INFO[]					pSplits;

    public CFG_PICINPIC_INFO(int nMaxSplit, int nMaxChannels, int nMaxSmallChannels) {
        this.nMaxSplit = nMaxSplit;
        this.pSplits = new CFG_SPLIT_INFO[nMaxSplit];
        for(int i = 0; i < nMaxSplit; i ++){
            pSplits[i] = new CFG_SPLIT_INFO(nMaxChannels, nMaxSmallChannels);
        }
    }
}