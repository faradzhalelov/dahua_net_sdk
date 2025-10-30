package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input parameter about Execute Cloud Upgrader
 * \else
 * 检查是否有可用升级包 入参
 * \endif
 */
public class NET_IN_EXECUTE_CLOUD_UPGRADER implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * New Version
     * \else
     * 上一次check得到的新版本号
     * \endif
     */
    public byte                   szNewVersion[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * Check Way, 0-Direct connect server, 1-Through proxy server
     * \else
     * 检测路径, 0-直连升级服务器检测, 1-通过代理服务器检测
     * \endif
     */
    public int                    nWay;

    /**
     * \if ENGLISH_LANG
     * Proxy server, when way==1 proxy is valid
     * \else
     * 代理服务器地址, nWay==1时有意义
     * \endif
     */
    public NET_PROXY_SERVER_INFO     stProxy = new NET_PROXY_SERVER_INFO();

    /**
     * \if ENGLISH_LANG
     * Cloud Upgrader Info
     * \else
     * 升级包信息
     * \endif
     */
    public NET_CLOUD_UPGRADER_INFO     stInfo = new NET_CLOUD_UPGRADER_INFO();

}
