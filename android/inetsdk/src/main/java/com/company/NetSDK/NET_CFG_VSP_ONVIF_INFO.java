package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ONVIF service configuration,{@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_VSP_ONVIF}
 * \else
 * ONVIF服务配置 对应枚举 {@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_VSP_ONVIF}
 * \endif
 */
public class NET_CFG_VSP_ONVIF_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Switch control
     * \else
     * 开关控制
     * \endif
     */
    public boolean bServiceStart;
}
