package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * wifi install info config,,corresponding to NET_EM_CFG_WIFI_INSTALL_PARAM
 * \else
 * 设备安装信息配置, 对应枚举 NET_EM_CFG_WIFI_INSTALL_PARAM
 * \endif
 */
public class NET_CFG_WIFI_INSTALL_PARAM implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Country/area
     * \else
     * 国家/地区, 2字节大写格式，符合ISO3166规范
     * \endif
     */
    public byte[]                 szCountry = new byte[4];

    /**
     * \if ENGLISH_LANG
     * 安装模式,参考EM_MOUNT_MODE
     * \else
     * Mount mode,refer to EM_MOUNT_MODE
     * \endif
     */
    public int                 emMountMode;
}
