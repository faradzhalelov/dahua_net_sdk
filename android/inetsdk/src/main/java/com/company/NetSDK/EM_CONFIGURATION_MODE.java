package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief UPnP configuration mode
 * \else
 * @brief UPnP配置模式
 * \endif
 */
public class EM_CONFIGURATION_MODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown mode
     * \else
     *  未知模式
     * \endif
     */
    public static final int					EM_CONFIGURATION_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  manual mode
     * \else
     *  手动配置
     * \endif
     */
    public static final int					EM_CONFIGURATION_MANUAL = 0;

    /**
     * \if ENGLISH_LANG
     *  automatic mode
     * \else
     *  自动配置
     * \endif
     */
    public static final int					EM_CONFIGURATION_AUTO = 1;

}
