package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * @brief  CLIENT_GetDeviceAllInfo 输出结构体
 * \endif
 */
public class NET_OUT_GET_DEVICE_AII_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Info count
     * \else
     *  信息的个数
     * \endif
     */
    public int					nInfoCount;

    /**
     * \if ENGLISH_LANG
     *  device storage info
     * \else
     *  设备存储信息
     * \endif
     */
    public NET_DEVICE_STORAGE_INFO					stuStorageInfo[] = new NET_DEVICE_STORAGE_INFO[8];

    public NET_OUT_GET_DEVICE_AII_INFO() {
        for(int i = 0; i < 8; i ++){
            this.stuStorageInfo[i] = new NET_DEVICE_STORAGE_INFO();
        }
    }
}
