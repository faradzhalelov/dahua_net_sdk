package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Monitor control and data collection device spot chart path info, {@link INetSDK#QueryDevState} corresponding to command {@link FinalVar#SDK_DEVSTATE_SCADA_POINT_LIST}
 * \else
 * 监测控制和数据采集设备的点位表信息, {@link INetSDK#QueryDevState} 对应命令 {@link FinalVar#SDK_DEVSTATE_SCADA_POINT_LIST}
 * \endif
 */
public class NET_SCADA_POINT_LIST_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * search criteria
     * \else
     * 查询条件
     * \endif
     */
    public NET_IN_SCADA_POINT_LIST_INFO    stuIn = new NET_IN_SCADA_POINT_LIST_INFO();

    /**
     * \if ENGLISH_LANG
     * search result
     * \else
     * 查询结果
     * \endif
     */
    public NET_OUT_SCADA_POINT_LIST_INFO   stuOut = new NET_OUT_SCADA_POINT_LIST_INFO();
}
