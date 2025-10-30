package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_AddRouteInfo Input parameters
 * \else
 * @brief CLIENT_AddRouteInfo 入参
 * \endif
 */
public class NET_IN_ADD_ROUTE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Routing information
     * \else
     *  路由信息
     * \endif
     */
    public NET_ROUTE_INFO					stuRouteInfo = new NET_ROUTE_INFO();

}