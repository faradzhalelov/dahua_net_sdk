package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Monitor control and data collection device spot path info input parameter, search criteria
 * \else
 * 监测控制和数据采集设备的点位表路径信息输入参数, 查询条件
 * \endif
 */
public class NET_IN_SCADA_POINT_LIST_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Device type
     * \else
     * 设备类型
     * \endif
     */
    public byte[]             szDevType = new byte[FinalVar.SDK_COMMON_STRING_64];
}
