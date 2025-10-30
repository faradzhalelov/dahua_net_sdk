package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * access to physical link state input param
 * \else
 * 获取物理链路状态输入结构体
 * \endif
 */
public class NET_IN_NETAPP_LINK_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The network card name
     * \else
     * 网卡名
     * \endif
     */
    public byte[]		szEthName = new byte[FinalVar.SDK_MAX_ETH_NAME];
}
