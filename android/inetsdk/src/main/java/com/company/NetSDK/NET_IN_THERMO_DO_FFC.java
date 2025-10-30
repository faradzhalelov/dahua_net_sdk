package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_ControlDeviceEx port SDK_CTRL_THERMO_DO_FFC command to input parameter
 * \else
 * @brief CLIENT_ControlDeviceEx 接口 SDK_CTRL_THERMO_DO_FFC 命令入参
 * \endif
 */
public class NET_IN_THERMO_DO_FFC implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel number(binocular thermal camera filling in thermal channel:1)
     * \else
     *  通道号（双目热成像相机填写热成像通道1）;
     * \endif
     */
    public int					nChannel;

}