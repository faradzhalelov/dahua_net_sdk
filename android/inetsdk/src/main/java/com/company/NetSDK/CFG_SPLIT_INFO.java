package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief split project
 * \else
 * @brief 分割方案
 * \endif
 */
public class CFG_SPLIT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  split mode, through the CLIENT_GetSplitCaps interface to get,see emSplitMode
     * \else
     *  分割模式，通过CLIENT_GetSplitCaps接口获取，见emSplitMode
     * \endif
     */
    public int					emSplitMode;

    /**
     * \if ENGLISH_LANG
     *  applied for CFG_SPLIT_CHANNEL_INFO number of memory,such as 16 channels,nMaxChannels = 16,SPLITMODE_4 mode,in order is divided into four groups
     * \else
     *  申请内存CFG_SPLIT_CHANNEL_INFO个数,比如有16个通道，nMaxChannels就是16，SPLITMODE_4模式，则按顺序依次分为4组
     * \endif
     */
    public int					nMaxChannels;

    /**
     * \if ENGLISH_LANG
     *  parsing the return channel number,need to packaging to send the channel number
     * \else
     *  解析返回通道个数,要封装发送的通道个数
     * \endif
     */
    public int					nReturnChannels;

    /**
     * \if ENGLISH_LANG
     *  split channel info
     * \else
     *  分割通道信息
     * \endif
     */
    public CFG_SPLIT_CHANNEL_INFO[]					pSplitChannels;

    public CFG_SPLIT_INFO(int nMaxChannels, int nMaxSmallChannels) {
        this.nMaxChannels = nMaxChannels;
        this.pSplitChannels = new CFG_SPLIT_CHANNEL_INFO[nMaxChannels];
        for(int i = 0; i < nMaxChannels; i ++){
            this.pSplitChannels[i] = new CFG_SPLIT_CHANNEL_INFO(nMaxSmallChannels);
        }
    }
}