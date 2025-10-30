package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * EM_PRC_NETAPP_TYPE_GET_DIAL_INFO output param
 * \else
 * EM_PRC_NETAPP_TYPE_GET_DIAL_INFO 出参
 * \endif
 */
public class NET_OUT_NETAPP_GET_DIAL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Dial-up IP address
     * \else
     *  拨号IP地址
     * \endif
     */
    public byte					szIP[] = new byte[48];

    /**
     * \if ENGLISH_LANG
     *  Subnet mask
     * \else
     *  子网掩码
     * \endif
     */
    public byte					szSubnetMask[] = new byte[40];

    /**
     * \if ENGLISH_LANG
     *  Default gateway
     * \else
     *  默认网关
     * \endif
     */
    public byte					szDefaultGateway[] = new byte[40];

    /**
     * \if ENGLISH_LANG
     *  DNS servers
     * \else
     *  DNS服务器地址
     * \endif
     */
    public byte					szDnsServers[][] = new byte[2][40];

    /**
     * \if ENGLISH_LANG
     *  IPv6 address
     * \else
     *  拨号IPv6地址
     * \endif
     */
    public byte					szIPv6Address[] = new byte[48];

    /**
     * \if ENGLISH_LANG
     *  IPv6 default gateway
     * \else
     *  Pv6默认网关
     * \endif
     */
    public byte					szIPv6DefaultGateway[] = new byte[40];

    /**
     * \if ENGLISH_LANG
     *  IPv6 prefix [1~128]
     * \else
     *  IPv6网络前缀 [1~128]
     * \endif
     */
    public int					nIPv6Prefix;

    /**
     * \if ENGLISH_LANG
     *  IPv6 DNS servers
     * \else
     *  IPv6 DNS服务器地址
     * \endif
     */
    public byte					szIPv6DnsServers[][] = new byte[2][40];

    /**
     * \if ENGLISH_LANG
     *  IPv6 link local address
     * \else
     *  IPv6链路本地地址
     * \endif
     */
    public byte					szIPv6LinkLocalAddress[] = new byte[48];

    /**
     * \if ENGLISH_LANG
     *  vendor of 3G network
     * \else
     *  服务提供商 3G网络使用
     * \endif
     */
    public byte					szVendor[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  network ，{@link EM_NET_NETWORK_CARD_TYPE}
     * \else
     *  网络类型，{@link EM_NET_NETWORK_CARD_TYPE}
     * \endif
     */
    public int					emNetwork;

}