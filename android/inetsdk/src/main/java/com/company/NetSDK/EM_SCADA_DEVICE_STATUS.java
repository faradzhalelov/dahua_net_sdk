package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device status
 * \else
 * 设备状态
 * \endif
 */
public class EM_SCADA_DEVICE_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知
     * \endif
     */
    public static final int EM_SCADA_DEVICE_STATUS_KNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * normal
     * \else
     * 正常
     * \endif
     */
    public static final int EM_SCADA_DEVICE_STATUS_NORMAL = 0;

    /**
     * \if ENGLISH_LANG
     * alarm
     * \else
     * 报警
     * \endif
     */
    public static final int EM_SCADA_DEVICE_STATUS_ALARM = 1;

    /**
     * \if ENGLISH_LANG
     * offline
     * \else
     * 离线
     * \endif
     */
    public static final int EM_SCADA_DEVICE_STATUS_OFFLINE = 2;
}
