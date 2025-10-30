package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * platform info
 * \else
 * 平台信息
 * \endif
 */
public class NET_VSP_GAVI_PLATFORM_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * platform code,refer to {@link EM_VSP_GAVI_PLATFORM_CODE}
     * \else
     * 平台码，参考{@link EM_VSP_GAVI_PLATFORM_CODE}
     * \endif
     */
    public int	emPlatformCode;

    /**
     * \if ENGLISH_LANG
     * platform name
     * \else
     * 平台名称
     * \endif
     */
    public byte						szPlatformName[] = new byte[128];

}
