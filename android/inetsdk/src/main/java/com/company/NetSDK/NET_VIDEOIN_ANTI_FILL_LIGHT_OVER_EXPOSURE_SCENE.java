package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Anti-Overexposure Scenario with Supplementary Lighting
 * \else
 * @brief 防补光过曝场景
 * \endif
 */
public class NET_VIDEOIN_ANTI_FILL_LIGHT_OVER_EXPOSURE_SCENE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Priority Target Types with Anti-Overexposure Support for Supplementary Lighting   {@link EM_TATGET_MODE}
     * \else
     *  支持防补光过曝的优先目标类型    {@link EM_TATGET_MODE}
     * \endif
     */
    public int					emTargetMode;

}