package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * report event of lowpower wireless, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_WIRELESSDEV_LOWPOWER }
 * \else
 * 无线设备低电量报警事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_WIRELESSDEV_LOWPOWER }
 * \endif
 */
public class ALARM_WIRELESSDEV_LOWPOWER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * lowpower event:true lowpower,false narmal, unknown Unknown,refer to NET_THREE_STATUS_BOOL
     * \else
     * 是否为低电量true低电量,false 电量正常,unknown未知,参考NET_THREE_STATUS_BOOL
     * \endif
     */
    public int emResult;

    /**
     * \if ENGLISH_LANG
     * event time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME    stuTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * wirelessdevice ID
     * \else
     * 无线设备ID
     * \endif
     */
    public int          nId;

    /**
     * \if ENGLISH_LANG
     * wirelessdevice type，refer to NET_WIRELESSDEV_LOWPOWER_TYPE
     * \else
     * 无线设备类型,参考NET_WIRELESSDEV_LOWPOWER_TYPE
     * \endif
     */
    public int          emType;

    /**
     * \if ENGLISH_LANG
     * wirelessdevice Serial Number
     * \else
     * 无线配件序列号
     * \endif
     */
    public byte[]       szSN = new byte[32];

    /**
     * \if ENGLISH_LANG
     * power percent
     * \else
     * 电量百分比
     * \endif
     */
    public float        fPercent;
}
