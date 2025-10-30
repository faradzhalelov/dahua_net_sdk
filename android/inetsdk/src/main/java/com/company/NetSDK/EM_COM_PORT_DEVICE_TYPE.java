package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the device type on com port
 * \else
 * 设备串口连接的设备类型
 * \endif
 */
public class EM_COM_PORT_DEVICE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知的
     * \endif
     */
    public static final int EM_COM_PORT_DEVICE_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * ptz
     * \else
     * ptz
     * \endif
     */
    public static final int EM_COM_PORT_DEVICE_TYPE_PTZ = 1;

    /**
     * \if ENGLISH_LANG
     * GPS
     * \else
     * GPS
     * \endif
     */
    public static final int EM_COM_PORT_DEVICE_TYPE_GPS = 2;

    /**
     * \if ENGLISH_LANG
     * alarm keyboard
     * \else
     * 报警键盘
     * \endif
     */
    public static final int EM_COM_PORT_DEVICE_TYPE_ALARMKEYBOARD = 3;

    /**
     * \if ENGLISH_LANG
     * Exalarm box
     * \else
     * 扩展报警盒子
     * \endif
     */
    public static final int EM_COM_PORT_DEVICE_TYPE_EXALARMBOX = 4;
}
