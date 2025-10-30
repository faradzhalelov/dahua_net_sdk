package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Acupick mode configuration, corresponding to NET_EM_CFG_ACUPICK_MODE
 * \else
 * @brief Acupick模式配置, 对应枚举 NET_EM_CFG_ACUPICK_MODE
 * \endif
 */
public class NET_CFG_ACUPICK_MODE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Mode, 0: Local video streaming mode, 1: Front end image stream is extracted by the local device, meaningful when Enable is true
     * \else
     *  模式，0 ：本机视频流方式，1：前端图片流由本机提取方式，在Enable为true时有意义
     * \endif
     */
    public int					nMode;

    /**
     * \if ENGLISH_LANG
     *  Identify the type of intelligence used for feature extraction target generation, 0: unknown, 1: structured intelligence
     * \else
     *  标识用于特征提取目标产生的智能类型，0：未知，1：结构化智能
     * \endif
     */
    public int					nDetectType;

    /**
     * \if ENGLISH_LANG
     *  Can Acupick feature extraction be enabled
     * \else
     *  是否使能Acupick的特征提取
     * \endif
     */
    public boolean					bEnable;

}