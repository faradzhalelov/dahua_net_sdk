package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_QueryRecordFileEx input param
 * \else
 * @brief CLIENT_QueryRecordFileEx 接口输入参数
 * \endif
 */
public class NET_IN_QUERY_RECORD_FILE_EX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelId;

    /**
     * \if ENGLISH_LANG
     *  Record File Type,{@link EM_QUERY_RECORD_TYPE}
     * \else
     *  查询的录像类型，{@link EM_QUERY_RECORD_TYPE}
     * \endif
     */
    public int					emRecordFileType;

    /**
     * \if ENGLISH_LANG
     *  Start Time
     * \else
     *  开始时间
     * \endif
     */
    public NET_TIME					stuStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  End Time
     * \else
     *  结束时间
     * \endif
     */
    public NET_TIME					stuEndTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  CardID
     * \else
     *  卡号
     * \endif
     */
    public String 					pszCardID;

    /**
     * \if ENGLISH_LANG
     *  Whether to query by time
     * \else
     *  是否按照时间查询
     * \endif
     */
    public boolean					bTime;

}
