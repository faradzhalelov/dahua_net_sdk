package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access configuration of public security video and image information application system,Corresponding to {@link NET_EM_CFG_VSP_GAVI}
 * \else
 * 公安视频图像信息应用系统接入配置,对应 {@link NET_EM_CFG_VSP_GAVI}
 * \endif
 */
public class NET_CFG_VSP_GAVI_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Count of stuGaviInfo
     * \else
     * 注册平台个数
     * \endif
     */
    public int							nGaviInfoCount;

    /**
     * \if ENGLISH_LANG
     * Register info
     * \else
     * 注册平台信息
     * \endif
     */
    public NET_VSP_GAVI_INFO			stuGaviInfo[] = new NET_VSP_GAVI_INFO[16];

    /**
     * \if ENGLISH_LANG
     * stuPlatformInfo's count
     * \else
     * stuPlatformInfo个数
     * \endif
     */
    public int							nPlatformCount;

    /**
     * \if ENGLISH_LANG
     * platform info, unallowed to modify
     * \else
     * 接入平台范围信息，不允许修改
     * \endif
     */
    public NET_VSP_GAVI_PLATFORM_INFO  stuPlatformInfo[] = new NET_VSP_GAVI_PLATFORM_INFO[64];

    public NET_CFG_VSP_GAVI_INFO(int nChannelCount){
        for(int i = 0; i < 16; i++){
            stuGaviInfo[i] = new NET_VSP_GAVI_INFO(nChannelCount);
        }
        for(int i = 0; i < 64; i++){
            stuPlatformInfo[i] = new NET_VSP_GAVI_PLATFORM_INFO();
        }
    }


}
