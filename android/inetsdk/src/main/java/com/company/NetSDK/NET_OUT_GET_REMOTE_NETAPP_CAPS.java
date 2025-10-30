package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetRemoteNetAppCaps output parameters
 * \else
 * @brief CLIENT_GetRemoteNetAppCaps 接口输出参数
 * \endif
 */
public class NET_OUT_GET_REMOTE_NETAPP_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Support LLDP
     * \else
     *  支持LLDP
     * \endif
     */
    public boolean					bLLDPPoint;

    /**
     * \if ENGLISH_LANG
     *  Network access priority capability
     * \else
     *  网络访问优先级能力
     * \endif
     */
    public NET_NET_ACCESS_PRIORITY_INFO					stuNetAccessPriority = new NET_NET_ACCESS_PRIORITY_INFO();

    /**
     * \if ENGLISH_LANG
     *  Whether 3G module is supported
     * \else
     *  是否支持3G模块
     * \endif
     */
    public boolean					b3G;

    /**
     * \if ENGLISH_LANG
     *  Whether the iEEE 802.1X function is supported
     * \else
     *  是否支持IEEE 802.1X功能
     * \endif
     */
    public boolean					bIEEE802_1X;

    /**
     * \if ENGLISH_LANG
     *  Whether the VPN function is supported
     * \else
     *  是否支持VPN功能
     * \endif
     */
    public boolean					bVPN;

    /**
     * \if ENGLISH_LANG
     *  Number of lists supported by Wifi function
     * \else
     *  Wifi功能支持列表个数
     * \endif
     */
    public int					nWifiCount;

    /**
     * \if ENGLISH_LANG
     *  Wifi function supports list, "Client": supports access to wireless router networking, "AP": supports access as a hot spot for other devices, "WPS": Wifiencrypt function, connects with router through button,
     * \else
     *  Wifi功能支持列表, "Client": 支持接入无线路由联网, "AP": 支持作为热点供其它设备接入, "WPS": Wifi加密功能，和路由器通过按钮的方式对接, 
     * \endif
     */
    public byte					szWifi[][] = new byte[32][32];

    /**
     * \if ENGLISH_LANG
     *  Whether the mobile push notification function is supported
     * \else
     *  是否支持手机推送功能
     * \endif
     */
    public boolean					bSupportedMobilePush;

    /**
     * \if ENGLISH_LANG
     *  Whether HTTPS function is supported
     * \else
     *  是否支持HTTPS功能
     * \endif
     */
    public boolean					bSupportHTTPS;

    /**
     * \if ENGLISH_LANG
     *  Range of supported connections
     * \else
     *  支持连接数的范围
     * \endif
     */
    public int					nConnectionRange[] = new int[2];

    /**
     * \if ENGLISH_LANG
     *  Whether support sending anonymous mail
     * \else
     *  是否支持发送匿名邮件
     * \endif
     */
    public boolean					bSupportAnonymityEmail;

    /**
     * \if ENGLISH_LANG
     *  Number of supported download type lists
     * \else
     *  支持的下载类型列表个数
     * \endif
     */
    public int					nSupportDownloadSpeedCount;

    /**
     * \if ENGLISH_LANG
     *  Supported download types list, "High", "Normal"
     * \else
     *  支持的下载类型列表, "High", "Normal"
     * \endif
     */
    public byte					szSupportDownloadSpeed[][] = new byte[32][32];

    /**
     * \if ENGLISH_LANG
     *  Number of supported network adapter type lists
     * \else
     *  支持的网卡类型列表个数
     * \endif
     */
    public int					nSupportNetCardListCount;

    /**
     * \if ENGLISH_LANG
     *  Supported network adapter types list, Standard, Manager, Extend, Normal
     * \else
     *  支持的网卡类型列表, Standard, Manager, Extend, Normal
     * \endif
     */
    public byte					szSupportNetCardList[][] = new byte[32][32];

    /**
     * \if ENGLISH_LANG
     *  band width throttling capability, In: read, Out: write, InOut: read write
     * \else
     *  带宽限制能力, In: 读, Out: 写, InOut: 读写
     * \endif
     */
    public byte					szBandWidthLimit[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  The maximum number of network adapters that can be bound. -1: Unknown. 0: Multiple network adapter bindings are not supported. 1: One bond can be configured. 2: Two bonds can be configured.
     * \else
     *  支持绑定的最大网卡个数, -1:未知,  0: 不支持多网卡绑定, 1: 支持配置一个bond, 2: 支持配置两个bond
     * \endif
     */
    public int					nBond;

    /**
     * \if ENGLISH_LANG
     *  Whether the device search uses only private protocol
     * \else
     *  设备搜索是否只使用私有协议
     * \endif
     */
    public boolean					bDeviceDiscoveryPrivate;

    /**
     * \if ENGLISH_LANG
     *  Whether the link equalization function is supported
     * \else
     *  是否支持链路均衡功能
     * \endif
     */
    public boolean					bSupportLinkAgg;

    /**
     * \if ENGLISH_LANG
     *  Whether support P2P
     * \else
     *  是否支持P2P
     * \endif
     */
    public boolean					bP2PSupport;

    /**
     * \if ENGLISH_LANG
     *  Network adapter mode list
     * \else
     *  网卡模式列表
     * \endif
     */
    public NET_NET_MODE_LIST					stuNetModeList = new NET_NET_MODE_LIST();

    /**
     * \if ENGLISH_LANG
     *  Whether to support the display of MTU setting interface
     * \else
     *  是否支持显示MTU设置界面
     * \endif
     */
    public boolean					bIsSupportSetMtu;

    /**
     * \if ENGLISH_LANG
     *  Whether the mail attachment supports multiple snapshots of the second snapshot stream
     * \else
     *  邮件附件是否支持第二路抓图码流的多张抓图
     * \endif
     */
    public boolean					bSupportEmailPics;

    /**
     * \if ENGLISH_LANG
     *  The number of modules supported for network diagnosis in the current version
     * \else
     *  当前版本支持进行网络诊断的模块个数
     * \endif
     */
    public int					nNetworkModulesCount;

    /**
     * \if ENGLISH_LANG
     *  Current version supports modules for network diagnosis: "Config", "DHCPinternet protocol version 4 (IPv4)", "DNS Internet protocol version 4 (IPv4)",  "Routeinternet protocol version 4 (IPv4) ", "Conflictinternet protocol version 4 (IPv4) "
     * \else
     *  当前版本支持进行网络诊断的模块："Config", "DHCPIPv4", "DNSIPv4", "RouteIPv4", "ConflictIPv4"
     * \endif
     */
    public byte					szNetworkModules[][] = new byte[32][32];

}