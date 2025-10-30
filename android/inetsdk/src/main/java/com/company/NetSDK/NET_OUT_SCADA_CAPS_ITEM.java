package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Monitor control and data collection device spot chart path type capacity info
 * \else
 * 监测控制和数据采集设备类型能力信息
 * \endif
 */
public class NET_OUT_SCADA_CAPS_ITEM implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * device type
     * \else
     * 设备类型
     * \endif
     */
    public byte[]               szDevType = new byte[FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * valid device name number
     * \else
     * 有效设备名称个数
     * \endif
     */
    public int                  nValidName;

    /**
     * \if ENGLISH_LANG
     * unique device names
     * \else
     * 设备名称, 唯一标示设备
     * \endif
     */
    public byte[][]             szDevName = new byte[FinalVar.MAX_NET_SCADA_CAPS_NAME][FinalVar.SDK_COMMON_STRING_32];
}
