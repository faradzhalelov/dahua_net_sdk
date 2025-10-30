package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * {@link INetSDK#QueryRecordCount} input parameter
 * \else
 * {@link INetSDK#QueryRecordCount} 入参
 * \endif
 */
public class NET_IN_QUEYT_RECORD_COUNT_PARAM implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * query handle
     * \else
     * 查询句柄
     * \endif
     */
    public long lFindeHandle;
}
