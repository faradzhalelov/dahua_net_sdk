package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief SMD data info
 * \else
 * @brief 查询返回的记录信息
 * \endif
 */
public class NET_SMD_DATA_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel number, starting from 0
     * \else
     *  通道号,从0开始
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  SMD record type
     * \else
     *  录像类型
     * \endif
     */
    public int					emSmdRecordType;

    /**
     * \if ENGLISH_LANG
     *  Start time
     * \else
     *  开始时间    
     * \endif
     */
    public NET_TIME					stuStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  End time
     * \else
     *  结束时间
     * \endif
     */
    public NET_TIME					stuEndTime = new NET_TIME();

}
