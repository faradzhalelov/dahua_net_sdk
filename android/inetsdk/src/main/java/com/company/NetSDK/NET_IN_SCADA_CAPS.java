package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Monitor control and data collection device spot chart path capacity info search criteria
 * \else
 * 监测控制和数据采集设备能力信息查询条件
 * \endif
 */
public class NET_IN_SCADA_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * search type, refer to {@link EM_NET_SCADA_CAPS_TYPE}
     * \else
     * 查询类型, 参考 {@link EM_NET_SCADA_CAPS_TYPE}
     * \endif
     */
    public int                  emType;
}
