package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_DelRouteInfo Input parameters
 * \else
 * @brief CLIENT_DelRouteInfo 入参
 * \endif
 */
public class NET_IN_DEL_ROUTE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of routing information
     * \else
     *  路由信息个数
     * \endif
     */
    public int					nRouteInfoCount;

    /**
     * \if ENGLISH_LANG
     *  Routing information
     * \else
     *  路由信息
     * \endif
     */
    public NET_ROUTE_INFO					stuRouteInfo[] = new NET_ROUTE_INFO[256];

    public NET_IN_DEL_ROUTE_INFO() {
        for(int i = 0; i < 256; i ++){
            stuRouteInfo[i] = new NET_ROUTE_INFO();
        }
    }
}