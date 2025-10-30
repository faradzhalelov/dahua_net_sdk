package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Network Card Mode List
 * \else
 * @brief 网卡模式列表
 * \endif
 */
public class NET_NET_MODE_LIST implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of network transmission mode lists
     * \else
     *  网络传输模式列表个数
     * \endif
     */
    public int					nEth0Count;

    /**
     * \if ENGLISH_LANG
     *  List of network transmission modes
     * \else
     *  网络传输模式列表
     * \endif
     */
    public byte					szEth0[][] = new byte[32][32];

}