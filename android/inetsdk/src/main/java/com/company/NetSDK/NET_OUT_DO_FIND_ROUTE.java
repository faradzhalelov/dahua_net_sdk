package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_DoFindRoute Output parameters
 * \else
 * @brief CLIENT_DoFindRoute 接口输出参数
 * \endif
 */
public class NET_OUT_DO_FIND_ROUTE implements Serializable {
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

    public NET_OUT_DO_FIND_ROUTE() {
        for(int i = 0; i < 256; i ++){
            stuRouteInfo[i] = new NET_ROUTE_INFO();
        }
    }
}