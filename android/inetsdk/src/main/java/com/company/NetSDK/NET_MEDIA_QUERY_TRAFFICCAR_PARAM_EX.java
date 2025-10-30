package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief The corresponding search criteria of  SDK_MEDIA_QUERY_TRAFFICCARtypedef struct parameter extension
 * \else
 * @brief SDK_MEDIA_QUERY_TRAFFICCAR对应的查询条件 参数扩展
 * \endif
 */
public class NET_MEDIA_QUERY_TRAFFICCAR_PARAM_EX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Violation code
     * \else
     *  违法代码
     * \endif
     */
    public byte					szViolationCode[] = new byte[16];

    /**
     * \if ENGLISH_LANG
     *  Nationality, 2 bytes, in line with ISO3166 specification
     * \else
     *  国籍，2字节，符合ISO3166规范
     * \endif
     */
    public byte					szCountry[] = new byte[4];

    /**
     * \if ENGLISH_LANG
     *  TRUE means only send stuStartTimeRealUTC and stuEndTimeRealUTC (do not send StartTime, EndTime), FALSE means only send StartTime, EndTime (do not send stuStartTimeRealUTC and stuEndTimeRealUTC)
     * \else
     *  为TRUE表示仅下发stuStartTimeRealUTC和stuEndTimeRealUTC(不下发StartTime, EndTime), 为FALSE表示仅下发StartTime, EndTime(不下发stuStartTimeRealUTC和stuEndTimeRealUTC)
     * \endif
     */
    public boolean					bOnlySupportRealUTC;

    /**
     * \if ENGLISH_LANG
     *  UTC start time (standard UTC time), paired with stuEndTimeRealUTC, mutually exclusive with (StartTime, EndTime)
     * \else
     *  UTC开始时间(标准UTC时间), 与stuEndTimeRealUTC配对使用，与(StartTime, EndTime)互斥
     * \endif
     */
    public NET_TIME					stuStartTimeRealUTC = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  UTC end time (standard UTC time), paired with stuStartTimeRealUTC, mutually exclusive with (StartTime, EndTime)
     * \else
     *  UTC结束时间(标准UTC时间), 与stuStartTimeRealUTC配对使用，与(StartTime, EndTime)互斥
     * \endif
     */
    public NET_TIME					stuEndTimeRealUTC = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * Plate code
     * \else
     * 车牌代码
     * \endif
     */
    public byte					szPlateCode[] = new byte[16];

    /**
     * \if ENGLISH_LANG
     *  TRUE means only send stuStartTimeRealUTC and stuEndTimeRealUTC (do not send StartTime, EndTime), FALSE means only send StartTime, EndTime (do not send stuStartTimeRealUTC and stuEndTimeRealUTC)
     * \else
     *  为TRUE表示仅下发stuStartTimeRealUTC和stuEndTimeRealUTC(不下发StartTime, EndTime), 为FALSE表示仅下发StartTime, EndTime(不下发stuStartTimeRealUTC和stuEndTimeRealUTC)
     * \endif
     */
    public boolean					bUseViolationCode;

    /**
     * \if ENGLISH_LANG
     *  TRUE means only send stuStartTimeRealUTC and stuEndTimeRealUTC (do not send StartTime, EndTime), FALSE means only send StartTime, EndTime (do not send stuStartTimeRealUTC and stuEndTimeRealUTC)
     * \else
     *  为TRUE表示仅下发stuStartTimeRealUTC和stuEndTimeRealUTC(不下发StartTime, EndTime), 为FALSE表示仅下发StartTime, EndTime(不下发stuStartTimeRealUTC和stuEndTimeRealUTC)
     * \endif
     */
    public boolean					bUseCountry;

    /**
     * \if ENGLISH_LANG
     *  TRUE means only send stuStartTimeRealUTC and stuEndTimeRealUTC (do not send StartTime, EndTime), FALSE means only send StartTime, EndTime (do not send stuStartTimeRealUTC and stuEndTimeRealUTC)
     * \else
     *  为TRUE表示仅下发stuStartTimeRealUTC和stuEndTimeRealUTC(不下发StartTime, EndTime), 为FALSE表示仅下发StartTime, EndTime(不下发stuStartTimeRealUTC和stuEndTimeRealUTC)
     * \endif
     */
    public boolean					bUsePlateCode;
}