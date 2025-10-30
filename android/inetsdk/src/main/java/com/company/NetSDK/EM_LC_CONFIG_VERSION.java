package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Supported config version
 * \else
 * 支持灯光配置的版本
 * \endif
 */
public class EM_LC_CONFIG_VERSION implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知
     * \endif
     */
    public static final int EM_LC_CONFIG_VERSION_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Default:Lighting
     * \else
     * 使用Lighting配置，默认
     * \endif
     */
    public static final int EM_LC_CONFIG_VERSION_LIGHTING = 1;

    /**
     * \if ENGLISH_LANG
     * Lighting_V2
     * \else
     * 使用Lighting_V2配置
     * \endif
     */
    public static final int EM_LC_CONFIG_VERSION_LIGHTING_V2 = 2;

}
