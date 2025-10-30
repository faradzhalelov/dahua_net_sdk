package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * DDNS config
 * \else
 * DDNS配置信息
 * \endif
 */
public class NET_DDNS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  DDNS server num
     * \else
     *  DDNS 服务器数量
     * \endif
     */
    public int					dwDdnsServerNum;

    /**
     * \if ENGLISH_LANG
     *    SDK_DDNS_SERVER_CFG
     * \else
     *    SDK_DDNS_SERVER_CFG
     * \endif
     */
    public SDK_DDNS_SERVER_CFG					stuDdnsServer[] = new SDK_DDNS_SERVER_CFG[FinalVar.SDK_MAX_DDNS_NUM];

    public NET_DDNS_INFO() {
        for(int i = 0; i < FinalVar.SDK_MAX_DDNS_NUM; i ++){
            this.stuDdnsServer[i] = new SDK_DDNS_SERVER_CFG();
        }
    }
}