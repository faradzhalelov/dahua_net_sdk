package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Describe the routing information in the routing table
 * \else
 * @brief 描述路由表中的路由信息
 * \endif
 */
public class NET_ROUTE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The destination network address for routing
     * \else
     *  路由的目的网络地址
     * \endif
     */
    public byte					szDestination[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  Mask length 
     * \else
     *  掩码长度
     * \endif
     */
    public int					nMaskLength;

    /**
     * \if ENGLISH_LANG
     *  Next hop network address for routing
     * \else
     *  路由的下一跳网络地址
     * \endif
     */
    public byte					szNextHop[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  Routing distance
     * \else
     *  路由距离
     * \endif
     */
    public int					nDistance;

    /**
     * \if ENGLISH_LANG
     *  Route out interface name
     * \else
     *  路由出接口名
     * \endif
     */
    public byte					szEgress[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Protocol type, 0: static, 1: OSPF, open shortest path first protocol, 2: Local, local routing, 3: direct routing, 4: dynamic routing
     * \else
     *  协议类型, 0:静态, 1:OSPF,开放的最短路径优先协议, 2:Local,本地路由, 3:直连路由, 4:动态路由
     * \endif
     */
    public int					nType;

}