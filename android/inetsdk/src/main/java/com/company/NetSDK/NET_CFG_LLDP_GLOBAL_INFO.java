package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief LLDPConfig Global Configuration, corresponding to NET_EM_CFG_LLDP_GLOBAL
 * \else
 * @brief LLDPConfig 全局配置, 对应 NET_EM_CFG_LLDP_GLOBAL
 * \endif
 */
public class NET_CFG_LLDP_GLOBAL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether to enable LLDPConfig global configuration
     * \else
     *  是否开启LLDPConfig全局配置
     * \endif
     */
    public boolean					bEnable;

}