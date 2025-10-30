package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Asynchronism search device call
 * \else
 * 异步搜索设备回调
 * \endif
 */
public interface CB_fSearchDevicesCBEx {
    /**
     * \if ENGLISH_LANG
     * @param lSearchHandle search handle
     * @param pDevNetInfo   device info
     * \else
     * @param lSearchHandle 设备搜索句柄
     * @param pDevNetInfo    设备信息
     * \endif
     */
     void invoke(long lSearchHandle, DEVICE_NET_INFO_EX2 pDevNetInfo);

}
