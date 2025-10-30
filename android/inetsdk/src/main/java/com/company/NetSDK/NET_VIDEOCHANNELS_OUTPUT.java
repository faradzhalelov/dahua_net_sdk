package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output channel info
 * \else
 * 输出通道信息
 * \endif
 */
public class NET_VIDEOCHANNELS_OUTPUT implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * VGA output count in nVGA
     * \else
     * VGA输出个数
     * \endif
     */
    public int                     nVGACount;

    /**
     * \if ENGLISH_LANG
     * VGA output channel numbers
     * \else
     * VGA输出
     * \endif
     */
    public int                     nVGA[] = new int[128];

    /**
     * \if ENGLISH_LANG
     * TV output count in nTV
     * \else
     * TV输出个数
     * \endif
     */
    public int                     nTVCount;

    /**
     * \if ENGLISH_LANG
     * TV output channel numbers
     * \else
     * TV输出
     * \endif
     */
    public int                     nTV[] = new int[128];
}


