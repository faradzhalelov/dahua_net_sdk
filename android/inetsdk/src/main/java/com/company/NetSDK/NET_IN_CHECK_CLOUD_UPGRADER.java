package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input parameter about Check Cloud Upgrader
 * \else
 * 检查是否有可用升级包 入参
 * \endif
 */
public class NET_IN_CHECK_CLOUD_UPGRADER implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Check Way, 0-Direct connect server, 1-Through proxy server, 2-Get the results of cache detection
     * \else
     * 检测路径, 0-直连升级服务器检测, 1-通过代理服务器检测, 2-获取缓存的检测结果
     * \endif
     */
    public int  nWay;

    /**
     * \if ENGLISH_LANG
     * Proxy server, when way==1 proxy is valid
     * \else
     * 代理服务器地址, way==1时有意义
     * \endif
     */
    public NET_PROXY_SERVER_INFO     stProxy = new NET_PROXY_SERVER_INFO();
}
