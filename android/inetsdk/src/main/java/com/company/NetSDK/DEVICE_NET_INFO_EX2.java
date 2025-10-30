package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding to interface {@link INetSDK#StartSearchDevicesEx}
 * \else
 * 对应接口 {@link INetSDK#StartSearchDevicesEx}
 * \endif
 */
public class DEVICE_NET_INFO_EX2 implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * device net info
     * \else
     * 设备信息结构体
     * \endif
     */
    public DEVICE_NET_INFO_EX	  stuDevInfo = new DEVICE_NET_INFO_EX();

    /**
     * \if ENGLISH_LANG
     * local ip
     * \else
     * 搜索到设备的本地IP地址
     * \endif
     */
    public byte[]                szLocalIP = new byte[FinalVar.MAX_LOCAL_IP_LEN];

    /**
     * \if ENGLISH_LANG
     *  Device subtype
     * \else
     *  设备子类型
     * \endif
     */
    public byte					szDeviceSubClass[] = new byte[16];

    /**
     * \if ENGLISH_LANG
     *  SID
     * \else
     *  SID信息
     * \endif
     */
    public byte					szSID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * 	Main-Sub roles of devices in transmission products
     * \else
     * 	传输产品中设备的主从角色
     * \endif
     */
    public byte					byRole;

}
