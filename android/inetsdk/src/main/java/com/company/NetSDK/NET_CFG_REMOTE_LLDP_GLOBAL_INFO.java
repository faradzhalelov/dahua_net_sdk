package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief LLDP Global configuration , corresponding to NET_EM_CFG_REMOTE_LLDP_GLOBAL
 * \else
 * @brief LLDP 全局配置开关, 对应 NET_EM_CFG_REMOTE_LLDP_GLOBAL
 * \endif
 */
public class NET_CFG_REMOTE_LLDP_GLOBAL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Current channel LLDP configuration enabled
     * \else
     *  当前通道LLDP配置使能
     * \endif
     */
    public boolean					bEnable;

}