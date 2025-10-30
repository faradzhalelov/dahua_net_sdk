package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Relay state Config
 * \else
 * 继电器状态配置
 * \endif
 */
public class NET_CFG_RELAY_STATE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Relay address
     * \else
     * 继电器地址
     * \endif
     */
    public int							nAddress;

    /**
     * \if ENGLISH_LANG
     * Relay state, refer to {@link EM_RELAY_STATE_TYPE}
     * \else
     * 继电器状态,参考 {@link EM_RELAY_STATE_TYPE}
     * \endif
     */
    public int							emState;
}
