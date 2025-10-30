package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#StartFindSCADA} output parameter
 * \else
 * {@link INetSDK#StartFindSCADA} 接口出参
 * \endif
 */
public class NET_OUT_SCADA_START_FIND implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * total count matching the finding condition
     * \else
     * 符合查询条件的总数
     * \endif
     */
    public int                  dwTotalCount;
}
