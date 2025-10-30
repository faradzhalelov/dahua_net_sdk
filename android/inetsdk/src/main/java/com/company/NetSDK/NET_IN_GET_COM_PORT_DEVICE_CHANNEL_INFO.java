package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetComPortDeviceChannelInfo}'s interface input param(get the device channel info on com port)
 * \else
 * 接口{@link INetSDK#GetComPortDeviceChannelInfo}，获取设备COM端口连接的设备通道信息(入参)
 * \endif
 */
public class NET_IN_GET_COM_PORT_DEVICE_CHANNEL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * device type, refer to {@link EM_COM_PORT_DEVICE_TYPE}
     * \else
     * 设备类型, 参考 {@link EM_COM_PORT_DEVICE_TYPE}
     * \endif
     */
    public int      emDeviceType;
}
