package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetSwitchPoEPortPower output parameters
 * \else
 * @brief CLIENT_GetSwitchPoEPortPower 出参
 * \endif
 */
public class NET_OUT_GET_SWITCH_POE_PORT_POWER implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of actual power consumption arrays for ports
     * \else
     *  端口实际功耗数组个数
     * \endif
     */
    public int					nListCount;

    /**
     * \if ENGLISH_LANG
     *  Actual power consumption array of ports, in watts
     * \else
     *  端口实际功耗数组,单位:瓦特
     * \endif
     */
    public double					dbList[] = new double[128];

}