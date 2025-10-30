package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Monitor control and data collection device spot chart path capacity info search result
 * \else
 * 监测控制和数据采集设备能力信息查询结果
 * \endif
 */
public class NET_OUT_SCADA_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * valid device type number
     * \else
     * 有效设备类型个数
     * \endif
     */
    public int                        nValidType;

    /**
     * \if ENGLISH_LANG
     * Max 16 types
     * \else
     * 最多16个类型
     * \endif
     */
    public NET_OUT_SCADA_CAPS_ITEM[]  stuItems = new NET_OUT_SCADA_CAPS_ITEM[FinalVar.MAX_NET_SCADA_CAPS_TYPE];

    public NET_OUT_SCADA_CAPS() {
        for(int i = 0; i < FinalVar.MAX_NET_SCADA_CAPS_TYPE; i++) {
            stuItems[i] = new NET_OUT_SCADA_CAPS_ITEM();
        }
    }
}
