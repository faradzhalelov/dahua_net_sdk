package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SCADA monitor spot search result
 * \else
 * SCADA监测点位查询结果
 * \endif
 */
public class NET_OUT_SCADA_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * valid spot chart number
     * \else
     * 有效点表个数
     * \endif
     */
    public int                       nPointInfoNum;

    /**
     * \if ENGLISH_LANG
     * spot chart info
     * \else
     * 点表信息
     * \endif
     */
    public NET_SCADA_POINT_INFO[]    stuPointInfo = new NET_SCADA_POINT_INFO[FinalVar.MAX_SCADA_POINT_INFO_NUM];

    public NET_OUT_SCADA_INFO() {
        for(int i = 0; i < FinalVar.MAX_SCADA_POINT_INFO_NUM; i++) {
            stuPointInfo[i] = new NET_SCADA_POINT_INFO();
        }
    }
}
