package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * query scada device IDs, {@link INetSDK#QueryDevState} corresponding to command {@link FinalVar#SDK_DEVSTATE_SCADA_DEVICE_LIST}
 * \else
 * 获取当前主机所接入的外部设备ID, {@link INetSDK#QueryDevState} 对应命令 {@link FinalVar#SDK_DEVSTATE_SCADA_DEVICE_LIST}
 * \endif
 */
public class NET_SCADA_DEVICE_LIST implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * count of NET_SCADA_DEVICE_ID_INFO in pstuDeviceIDInfo
     * \else
     * 用户分配的结构体个数
     * \endif
     */
    public int                          nMax;

    /**
     * \if ENGLISH_LANG
     * returned count of NET_SCADA_DEVICE_ID_INFO from device, may be larger than nMax
     * \else
     * 设备实际返回的有效结构体个数
     * \endif
     */
    public int                          nRet;

    /**
     * \if ENGLISH_LANG
     * scada device id info, user allocates the memory,apply to sizeof({@link NET_SCADA_DEVICE_ID_INFO})*nMax
     * \else
     * 监测设备信息,用户分配内存,大小为sizeof({@link NET_SCADA_DEVICE_ID_INFO})*nMax
     * \endif
     */
    public NET_SCADA_DEVICE_ID_INFO[]   pstuDeviceIDInfo;

    public NET_SCADA_DEVICE_LIST() {
        this.nMax = 1;
        pstuDeviceIDInfo = new NET_SCADA_DEVICE_ID_INFO[1];
        pstuDeviceIDInfo[0] = new NET_SCADA_DEVICE_ID_INFO();
    }

    /**
     * @param nMax 用户分配的结构体最大个数
     */
    public NET_SCADA_DEVICE_LIST(int nMax) {
        this.nMax = nMax;

        if(nMax > 0) {
            pstuDeviceIDInfo = new NET_SCADA_DEVICE_ID_INFO[nMax];

            for(int i = 0; i < nMax; i++) {
                pstuDeviceIDInfo[i] = new NET_SCADA_DEVICE_ID_INFO();
            }
        }
    }
}
