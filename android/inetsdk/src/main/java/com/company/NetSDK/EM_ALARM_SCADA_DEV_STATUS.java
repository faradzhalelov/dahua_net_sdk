package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device status
 * \else
 * 设备状态
 * \endif
 */
public class EM_ALARM_SCADA_DEV_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * .unknow
     * \else
     * 未知
     * \endif
     */
    public static final int EM_ALARM_SCADA_DEV_STATUS_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * .normal
     * \else
     * 正常
     * \endif
     */
    public static final int EM_ALARM_SCADA_DEV_STATUS_NORMAL = 0;

    /**
     * \if ENGLISH_LANG
     * .alarm
     * \else
     * 报警
     * \endif
     */
    public static final int EM_ALARM_SCADA_DEV_STATUS_ALARM = 1;

    /**
     * \if ENGLISH_LANG
     * offline
     * \else
     * 离线
     * \endif
     */
    public static final int EM_ALARM_SCADA_DEV_STATUS_OFFLINE = 2;
}
