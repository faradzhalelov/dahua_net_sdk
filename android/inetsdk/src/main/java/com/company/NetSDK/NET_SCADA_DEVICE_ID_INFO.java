package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * scada device id info
 * \else
 * 监测设备信息
 * \endif
 */
public class NET_SCADA_DEVICE_ID_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * device id
     * \else
     * 设备id
     * \endif
     */
    public byte[]                 szDeviceID = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * device name
     * \else
     * 设备名称
     * \endif
     */
    public byte[]                 szDevName = new byte[FinalVar.SDK_COMMON_STRING_64];
}
