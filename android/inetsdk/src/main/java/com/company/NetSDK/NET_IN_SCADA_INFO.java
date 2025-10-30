package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SCADA monitor spot search criteria
 * \else
 * SCADA监测点位查询条件
 * \endif
 */
public class NET_IN_SCADA_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * spot type to search, refer to {@link EM_NET_SCADA_POINT_TYPE}
     * \else
     * 待查询的点位类型, 参考 {@link EM_NET_SCADA_POINT_TYPE}
     * \endif
     */
    public int              emPointType;
}
