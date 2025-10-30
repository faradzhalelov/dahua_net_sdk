package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device status
 * \else
 * 设备状态信息
 * \endif
 */
public class NET_SCADA_STATUS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Device type, refer to {@link EM_ALARM_SCADA_DEV_TYPE}
     * \else
     * 设备类型, 参考 {@link EM_ALARM_SCADA_DEV_TYPE}
     * \endif
     */
    public int					             emDevType;

    /**
     * \if ENGLISH_LANG
     * Count device
     * \else
     * 设备信息个数
     * \endif
     */
    public int								nDevInfoNum;

    /**
     * \if ENGLISH_LANG
     * Device information
     * \else
     * 设备信息
     * \endif
     */
    public NET_SCADA_DEV_INFO[]			stuDevInfo = new NET_SCADA_DEV_INFO[128];

    public NET_SCADA_STATUS_INFO() {
        for(int i = 0; i < 128; i++) {
            stuDevInfo[i] = new NET_SCADA_DEV_INFO();
        }
    }
}
