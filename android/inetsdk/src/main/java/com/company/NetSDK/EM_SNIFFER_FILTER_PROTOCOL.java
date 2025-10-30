package com.company.NetSDK;

import java.io.Serializable;

/**
 * @author 47081
 * @version 1.0.0
 * @description 过滤协议类型
 * @date 2020/7/14
 */
public class EM_SNIFFER_FILTER_PROTOCOL implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 未知
     */
    public static final int EM_SNIFFER_FILTER_PROTOCOL_UNKNOWN=0;
    /**
     * TCP
     */
    public static final int EM_SNIFFER_FILTER_PROTOCOL_TCP=1;
    /**
     * UDP
     */
    public static final int EM_SNIFFER_FILTER_PROTOCOL_UDP=2;
}
