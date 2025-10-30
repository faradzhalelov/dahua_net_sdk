package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * TTLV异步搜索设备回调(pDevNetInfo内存由SDK内部申请释放)
 * \else
 * TTLV异步搜索设备回调(pDevNetInfo内存由SDK内部申请释放)
 * \endif
 */
public interface CB_fSearchDevicesCBTTLV {

    /**
     * \if ENGLISH_LANG
     * @param lSearchHandle search handle
     * @param pDevNetInfo   device info
     * \else
     * @param lSearchHandle 设备搜索句柄
     * @param pDevNetInfo    设备信息
     * \endif
     */
    void invoke(long lSearchHandle, DEVICE_NET_INFO_TTLV pDevNetInfo);
}
