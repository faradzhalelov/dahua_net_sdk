package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief devie class info
 * \else
 * @brief 设备类型信息
 * \endif
 */
public class CFG_DEVICE_CLASS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  device type, {@link NET_EM_DEVICE_TYPE}
     * \else
     *  设备类型, {@link NET_EM_DEVICE_TYPE}
     * \endif
     */
    public int					emDeviceType;

}