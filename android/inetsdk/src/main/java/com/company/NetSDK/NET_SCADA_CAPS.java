package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Monitor control and data collection device spot chart path capacity info, {@link INetSDK#QueryDevState} corresponding to command {@link FinalVar#SDK_DEVSTATE_SCADA_CAPS}
 * \else
 * 监测控制和数据采集设备能力信息, {@link INetSDK#QueryDevState} 对应命令 {@link FinalVar#SDK_DEVSTATE_SCADA_CAPS}
 * \endif
 */
public class NET_SCADA_CAPS implements Serializable {
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
    public NET_IN_SCADA_CAPS       stuIn = new NET_IN_SCADA_CAPS();

    /**
     * \if ENGLISH_LANG
     * search result
     * \else
     * 查询结果
     * \endif
     */
    public NET_OUT_SCADA_CAPS      stuOut = new NET_OUT_SCADA_CAPS();
}
