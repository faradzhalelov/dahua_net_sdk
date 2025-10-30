package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Get Wireless Device Signal, Output Param,interface {@link INetSDK#ControlDeviceEx}, Command parameter{@link CtrlType#SDK_CTRL_LOWRATEWPAN_GETWIRELESSDEVSIGNAL}
 * \else
 * 获取无线设备信号强度, 出参, {@link INetSDK#ControlDeviceEx}接口的 {@link CtrlType#SDK_CTRL_LOWRATEWPAN_GETWIRELESSDEVSIGNAL}命令参数
 * \endif
 */
public class NET_OUT_CTRL_LOWRATEWPAN_GETWIRELESSDEVSIGNAL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Get Wireless Device Number
     * \else
     * 获取无线设备数量
     * \endif
     */
    public int                         nWirelessDevNum;

    /**
     * \if ENGLISH_LANG
     * Wireless Signal Strength
     * \else
     * 无线设备信号强度
     * \endif
     */
    public NET_WIRELESSDEVSIGNAL_INFO[]  stuDevSignal = new NET_WIRELESSDEVSIGNAL_INFO[FinalVar.SDK_MAX_WIRELESS_DEV_NUM];

    public NET_OUT_CTRL_LOWRATEWPAN_GETWIRELESSDEVSIGNAL() {
        for(int i = 0; i < FinalVar.SDK_MAX_WIRELESS_DEV_NUM; i++) {
            stuDevSignal[i] = new NET_WIRELESSDEVSIGNAL_INFO();
        }
    }
}
