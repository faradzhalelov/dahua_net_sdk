package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * VTO device push record information query criteria
 * \else
 * VTO设备推送记录信息查询条件
 * \endif
 */
public class FIND_RECORD_ACCESS_MOBILE_PUSH_RESULT_INFO_CONDITION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Whether the query criteria by channel are valid, true: specify channel query, false: query all channels
     * \else
     * 按通道查询条件是否有效，TRUE:指定通道查询，FALSE:查询所有通道
     * \endif
     */
    public boolean              bValidChannel;
    /**
     * \if ENGLISH_LANG
     * App subscription channel
     * \else
     * App订阅通道
     * \endif
     */
    public int                   nChannel;

    /**
     * \if ENGLISH_LANG
     * Whether the query criteria by time is valid, true: query by specified time period, false: query all times
     * \else
     * 按时间查询条件是否有效，TRUE:指定时间段查询，FALSE:查询所有时间
     * \endif
     */
    public boolean              bValidTime;

    /**
     * \if ENGLISH_LANG
     * Start time(UTC time)
     * \else
     * 起始时间(UTC时间)
     * \endif
     */
    public int                   nStartTime;

    /**
     * \if ENGLISH_LANG
     * End time(UTC time)
     * \else
     * 结束时间(UTC时间)
     * \endif
     */
    public int                   nStopTime;

    /**
     * \if ENGLISH_LANG
     * Record type，refer to {@link EM_FIND_VTO_PUSH_RESULT_TYPE}
     * \else
     * 记录类型，参考{@link EM_FIND_VTO_PUSH_RESULT_TYPE}
     * \endif
     */
    public int                   emFindPushResultType;
}
