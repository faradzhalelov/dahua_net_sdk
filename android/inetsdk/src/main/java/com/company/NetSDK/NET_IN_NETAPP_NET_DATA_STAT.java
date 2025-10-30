package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * statistics for protocol stack input param
 * \else
 * 获取协议栈统计数据输入结构体
 * \endif
 */
public class NET_IN_NETAPP_NET_DATA_STAT implements Serializable {
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
