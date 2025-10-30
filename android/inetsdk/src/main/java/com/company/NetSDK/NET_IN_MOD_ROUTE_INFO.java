package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_ModRouteInfo Input parameters
 * \else
 * @brief CLIENT_ModRouteInfo 入参
 * \endif
 */
public class NET_IN_MOD_ROUTE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Modify the previous routing information
     * \else
     *  修改之前的路由信息
     * \endif
     */
    public NET_ROUTE_INFO					stuOldRouteInfo = new NET_ROUTE_INFO();

    /**
     * \if ENGLISH_LANG
     *  The routing information that will take effect after modification
     * \else
     *  修改之后将生效的路由信息
     * \endif
     */
    public NET_ROUTE_INFO					stuNewRouteInfo = new NET_ROUTE_INFO();

}