package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * external system info
 * \else
 * 外部系统信息
 * \endif
 */
public class NET_THERMO_SYSINFO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 序列号
     * \endif
     */
    public byte                szSerialNumber[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * serial number
     * \else
     * 软件版本
     * \endif
     */
    public byte                szSoftwareVersion[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * software version
     * \else
     * 固件版本
     * \endif
     */
    public byte                szFirmwareVersion[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * firmware version
     * \else
     * 库版本
     * \endif
     */
    public byte                szLibVersion[] = new byte[64];

}
