package com.company.NetSDK;

/**
 * Created by 29875 on 2019/8/5.
 */
public class NET_OUT_GET_DEV_WIFI_LIST {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * the number of searched wifi devices
     * \else
     * 搜索到的无线设备个数
     * \endif
     */
    public int                    nWlanDevCount;

    /**
     * \if ENGLISH_LANG
     * spot chart path info
     * \else
     * 搜索到的无线设备信息
     * \endif
     */
    public SDKDEV_WLAN_DEVICE_EX[]            stuWlanDev = new SDKDEV_WLAN_DEVICE_EX[FinalVar.MAX_WLAN_DEVICE_NUM];

    public NET_OUT_GET_DEV_WIFI_LIST() {
        for(int i = 0; i < FinalVar.MAX_WLAN_DEVICE_NUM; i++) {
            stuWlanDev[i] = new SDKDEV_WLAN_DEVICE_EX();
        }
    }

}
