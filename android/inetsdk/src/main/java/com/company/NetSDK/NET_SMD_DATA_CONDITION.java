package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief Query condition
 * \else
 * @brief 查询条件
 * \endif
 */
public class NET_SMD_DATA_CONDITION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel number, - 1 means to query all channels
     * \else
     * 通道号,-1表示查询所有通道
     * \endif
     */
    public int nChannel;

    /**
     * \if ENGLISH_LANG
     * Number of channel number arrays, The nChannel field is valid when it is 0, and the nChannels field is valid when it is not 0
     * \else
     * 通道号数组数量,为0时nChannel字段有效，非0时nChannels字段有效
     * \endif
     */
    public int nChannelNum;

    /**
     * \if ENGLISH_LANG
     * Channel number array, starting from 0, there must be at least one Channel and Channels field, which generally should not exist at all. If both exist, Channels shall prevail
     * \else
     * 通道号数组，从0开始Channel与Channels字段至少需要有一个，一般不应该都存在，如果都存在，以Channels为准
     * \endif
     */
    public int nChannels[] = new int[128];

    /**
     * \if ENGLISH_LANG
     * SMD record type
     * \else
     * 需要查询的SMD录像类型
     * \endif
     */
    public int[] emSmdRecordType = new int[8];

    /**
     * \if ENGLISH_LANG
     * Number of SMD record type
     * \else
     * 需要查询的SMD录像类型个数
     * \endif
     */
    public int nSmdRecordTypeNum;

    /**
     * \if ENGLISH_LANG
     * Query Sort Method
     * \else
     * 查询排序方式
     * \endif
     */
    public int emOrder;

    /**
     * \if ENGLISH_LANG
     * Start time
     * \else
     * 开始时间
     * \endif
     */
    public NET_TIME stuStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * End time
     * \else
     * 结束时间
     * \endif
     */
    public NET_TIME stuEndTime = new NET_TIME();

}
