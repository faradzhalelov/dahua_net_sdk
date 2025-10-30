package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetSwitchPoEPortPower input parameters
 * \else
 * @brief CLIENT_GetSwitchPoEPortPower 入参
 * \endif
 */
public class NET_IN_GET_SWITCH_POE_PORT_POWER implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  PoE network card name
     * \else
     *  PoE网卡名
     * \endif
     */
    public byte					szName[] = new byte[16];

}