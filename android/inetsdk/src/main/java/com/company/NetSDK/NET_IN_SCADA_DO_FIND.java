package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#DoFindSCADA} input parameter
 * \else
 * {@link INetSDK#DoFindSCADA} 接口入参
 * \endif
 */
public class NET_IN_SCADA_DO_FIND implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * start number
     * \else
     * 起始序号
     * \endif
     */
    public int                       nStartNo;

    /**
     * \if ENGLISH_LANG
     * number to query
     * \else
     * 本次欲获得结果的个数
     * \endif
     */
    public int                       nCount;
}
