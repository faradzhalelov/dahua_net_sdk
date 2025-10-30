package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Gain config
 * \else
 * 增益设置
 * \endif
 */
public class CFG_THERMO_GAIN implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * auto gain control [0-255] detailed value range depending on capacity
     * \else
     * 自动增益控制 [0-255]具体取值范围由能力决定
     * \endif
     */
    public int                         nAgc;

    /**
     * \if ENGLISH_LANG
     * max auto gain [0-255] detailed value range depending on capacity
     * \else
     * 最大自动增益 [0-255]具体取值范围由能力决定
     * \endif
     */
    public int                         nAgcMaxGain;

    /**
     * \if ENGLISH_LANG
     * gain balance, detailed value range depending on capacity
     * \else
     * 增益均衡 具体取值范围由能力决定
     * \endif
     */
    public int                         nAgcPlateau;
}
