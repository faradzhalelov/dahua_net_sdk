package com.company.NetSDK;

import java.io.Serializable;

/**
 * Created by 32200 on 2018-11-28.
 */
public class NET_CLOUD_UPGRADER_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Package URL
     * \else
     * 升级包下载地址(代理升级需要)
     * \endif
     */
    public byte                   szPackageURL[] = new byte[FinalVar.MAX_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * Package ID
     * \else
     * 升级包ID
     * \endif
     */
    public byte                   szPackageID[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * Check Sum
     * \else
     * 升级包的SHA-256校验和
     * \endif
     */
    public byte                   szCheckSum[] = new byte[FinalVar.MAX_COMMON_STRING_64];

}
