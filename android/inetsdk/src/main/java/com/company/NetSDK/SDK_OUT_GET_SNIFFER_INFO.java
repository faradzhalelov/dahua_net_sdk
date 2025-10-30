package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetSnifferInfo}GetSnifferInfo's interface output param
 * \else
 * {@link INetSDK#GetSnifferInfo}GetSnifferInfo 接口输入参数
 * \endif
 */
public class SDK_OUT_GET_SNIFFER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * array of Sniffer
     * \else
     * 抓包信息数组, 用户分配内存
     * \endif
     */
    public SDK_SNIFFER_INFO[]    pstuSniffers;

    /**
     * \if ENGLISH_LANG
     * size of array
     * \else
     * 抓包信息数组大小, 用户填写
     * \endif
     */
    public int                 nMaxSnifferCount;

    /**
     * \if ENGLISH_LANG
     * return count
     * \else
     * 返回的抓包信息数量
     * \endif
     */
    public int                 nRetSnifferCount;

    public SDK_OUT_GET_SNIFFER_INFO(int nMaxSnifferCount){
        this.nMaxSnifferCount = nMaxSnifferCount;
        pstuSniffers=new SDK_SNIFFER_INFO[nMaxSnifferCount];
        for(int i = 0; i < nMaxSnifferCount; ++i)
        {
            pstuSniffers[i] = new SDK_SNIFFER_INFO();
        }
    }
}
