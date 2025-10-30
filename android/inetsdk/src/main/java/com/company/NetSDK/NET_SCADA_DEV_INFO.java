package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device information
 * \else
 * 设备信息
 * \endif
 */
public class NET_SCADA_DEV_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Device ID
     * \else
     * 设备ID
     * \endif
     */
    public byte[]						szDeviceID = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Device name
     * \else
     * 设备名称
     * \endif
     */
    public byte[]						szDeviceName = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Device status, refer to {@link EM_SCADA_DEVICE_STATUS}
     * \else
     * 设备状态, 参考 {@link EM_SCADA_DEVICE_STATUS}
     * \endif
     */
    public int		                   emDevStatus;
}
