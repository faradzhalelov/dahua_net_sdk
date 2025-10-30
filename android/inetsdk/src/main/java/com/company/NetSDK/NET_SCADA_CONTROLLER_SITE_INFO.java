package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Controller information
 * \else
 * 控制器配置信息
 * \endif
 */
public class NET_SCADA_CONTROLLER_SITE_INFO implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * IP address
     * \else
     * IP地址
     * \endif
     */
    public byte[]			 szIPAddress = new byte[64];

    /**
     * \if ENGLISH_LANG
     * Device name
     * \else
     * 设备名称
     * \endif
     */
    public byte[]			 szDevName = new byte[64];

    /**
     * \if ENGLISH_LANG
     * Port
     * \else
     * 端口
     * \endif
     */
    public int			     nPort;

    /**
     * \if ENGLISH_LANG
     * Device ID
     * \else
     * 设备ID
     * \endif
     */
    public byte[]			 szDeviceID = new byte[32];

    @Override
    public String toString() {
        return "szIPAddress=" + new String(szIPAddress).trim() + "\n" +
                "szDevName=" + new String(szDevName).trim() + "\n" +
                "nPort=" + nPort + "\n" +
                "szDeviceID=" +new String(szDeviceID).trim();
    }
}
