package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Hardware Encryption Engine Library Path Configuration
 * \else
 * @brief 硬件加密引擎库路径配置
 * \endif
 */
public class NET_CONFIG_HARD_ENGINE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Hardware encryption engine library path
     * \else
     *  硬件加密引擎库路径
     * \endif
     */
    public byte					szHardEngine[] = new byte[FinalVar.MAX_PATH];

}