package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetComPortDeviceChannelInfo}'s interface output param(get the device channel info on com port)
 * \else
 * 接口{@link INetSDK#GetComPortDeviceChannelInfo}，获取设备COM端口连接的设备通道信息(出参)
 * \endif
 */
public class NET_OUT_GET_COM_PORT_DEVICE_CHANNEL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * device count(out param,include online and offline devices)
     * \else
     * 设备数目(出参,包括不在线和在线的)
     * \endif
     */
    public int                 nDeviceCount;

    /**
     * \if ENGLISH_LANG
     * max number of online device(in param)
     * \else
     * 在线的设备的最大个数(入参)
     * \endif
     */
    public int                 nMaxOnlineDeviceCount;

    /**
     * \if ENGLISH_LANG
     * online device number(out param)
     * \else
     * 设备返回的当前在线的设备数量(出参)
     * \endif
     */
    public int                 nRetOnlineDeviceCount;

    /**
     * \if ENGLISH_LANG
     * online device channel array(in param,alloc by user)
     * \else
     * 当前在线的设备的通道索引数组(入参,由用户申请释放内存)
     * \endif
     */
    public int[]                pOnlineChannel;

    public NET_OUT_GET_COM_PORT_DEVICE_CHANNEL_INFO(int nMaxOnlineDeviceCount) {
        this.nMaxOnlineDeviceCount = nMaxOnlineDeviceCount;
        pOnlineChannel = new int[nMaxOnlineDeviceCount];
    }
}
