package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding to interface {@link INetSDK#StartSearchDevicesEx} input parameter
 * \else
 * 对应接口 {@link INetSDK#StartSearchDevicesEx} 入参
 * \endif
 */
public class NET_IN_STARTSERACH_DEVICE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * local IP
     * \else
     * 发起搜索的本地IP
     * \endif
     */
    public byte[]                    szLocalIp = new byte[FinalVar.MAX_LOCAL_IP_LEN];

    /**
     * \if ENGLISH_LANG
     * search device call back
     * \else
     * 设备信息回调函数
     * \endif
     */
    public CB_fSearchDevicesCBEx      cbSearchDevices;

    /**
     * \if ENGLISH_LANG
     * send search type, refer to {@link EM_SEND_SEARCH_TYPE}
     * \else
     * 下发搜索类型(不填，默认全发), 参考 {@link EM_SEND_SEARCH_TYPE}
     * \endif
     */
    public int                       emSendType;

    /**
     * \if ENGLISH_LANG
     * search device call back
     * \else
     * 设备信息回调函数
     * \endif
     */
    public CB_fSearchDevicesCBTTLV      cbSearchDevicesTTLV;
}
