package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_StartFindRoute Input parameters
 * \else
 * @brief CLIENT_StartFindRoute 接口输入参数
 * \endif
 */
public class NET_IN_START_FIND_ROUTE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Protocol type, -1: unknown, 0: static, 1: OSPF, open shortest path first protocol, 2: Local, local routing, 3: direct routing, 4: dynamic routing, 5: effective routing
     * \else
     *  协议类型,-1:未知, 0:静态, 1:OSPF,开放的最短路径优先协议, 2:Local,本地路由, 3:直连路由, 4:动态路由, 5:生效路由
     * \endif
     */
    public int					nType;

}