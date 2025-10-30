package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Get Wireless Device Signal, Input Param,interface {@link INetSDK#ControlDeviceEx}, Command parameter{@link CtrlType#SDK_CTRL_LOWRATEWPAN_GETWIRELESSDEVSIGNAL}
 * \else
 * 获取无线设备信号强度, 入参, {@link INetSDK#ControlDeviceEx}接口的 {@link CtrlType#SDK_CTRL_LOWRATEWPAN_GETWIRELESSDEVSIGNAL}命令参数
 * \endif
 */
public class NET_IN_CTRL_LOWRATEWPAN_GETWIRELESSDEVSIGNAL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Begin index number,starting from 0
     * \else
     * 开始的索引号，从0开始
     * \endif
     */
    public int                         nStartIndex;

    /**
     * \if ENGLISH_LANG
     * Get DevState Number,The value <= the nMaxPageSize value of the capacity
     * \else
     * 本次获取的设备状态条数，此值小于等于能力集中 nMaxPageSize 字段的值
     * \endif
     */
    public int                         nDevStateNum;
}
