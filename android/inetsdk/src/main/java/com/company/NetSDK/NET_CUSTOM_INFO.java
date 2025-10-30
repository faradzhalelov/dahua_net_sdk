package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Cargo Channel Info
 * \else
 * 货物通道信息
 * \endif
 */
public class NET_CUSTOM_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Cargo Channel Num
     * \else
     * 货物通道个数
     * \endif
     */
    public int                 nCargoChannelNum;

    /**
     * \if ENGLISH_LANG
     * Cargo Coverage Rate
     * \else
     * 货物覆盖率
     * \endif
     */
    float fCoverageRate[] = new float[FinalVar.MAX_CARGO_CHANNEL_NUM];
}
