package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Monitor control and data collection device spot chart path info output parameter, search result
 * \else
 * 监测控制和数据采集设备的点位表路径信息输出参数, 查询结果
 * \endif
 */
public class NET_OUT_SCADA_POINT_LIST_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Valid spot chart path info number
     * \else
     * 有效点位表路径信息个数
     * \endif
     */
    public int                             nList;

    /**
     * \if ENGLISH_LANG
     * spot chart path info
     * \else
     * 点位表路径信息
     * \endif
     */
    public NET_SCADA_POINT_LIST[]            stuList = new NET_SCADA_POINT_LIST[FinalVar.MAX_SCADA_POINT_LIST_INFO_NUM];

    public NET_OUT_SCADA_POINT_LIST_INFO() {
        for(int i = 0; i < FinalVar.MAX_SCADA_POINT_LIST_INFO_NUM; i++) {
            stuList[i] = new NET_SCADA_POINT_LIST();
        }
    }
}
