package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * {@link INetSDK#QueryRecordCount} output parameter
 * \else
 * {@link INetSDK#QueryRecordCount} 出参
 * \endif
 */
public class NET_OUT_QUEYT_RECORD_COUNT_PARAM implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * device return record item
     * \else
     * 设备返回的记录条数
     * \endif
     */
    public int                      nRecordCount;
}
