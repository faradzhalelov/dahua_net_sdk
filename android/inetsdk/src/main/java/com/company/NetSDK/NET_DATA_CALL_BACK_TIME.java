package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Timestamp
 * \else
 * @brief 时间戳
 * \endif
 */
public class NET_DATA_CALL_BACK_TIME implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Year
     * \else
     *  年
     * \endif
     */
    public int					dwYear;

    /**
     * \if ENGLISH_LANG
     *  Month
     * \else
     *  月
     * \endif
     */
    public int					dwMonth;

    /**
     * \if ENGLISH_LANG
     *  Da
     * \else
     *  日
     * \endif
     */
    public int					dwDay;

    /**
     * \if ENGLISH_LANG
     *  Hour
     * \else
     *  时
     * \endif
     */
    public int					dwHour;

    /**
     * \if ENGLISH_LANG
     *  Minute
     * \else
     *  分
     * \endif
     */
    public int					dwMinute;

    /**
     * \if ENGLISH_LANG
     *  Second
     * \else
     *  秒
     * \endif
     */
    public int					dwSecond;

    /**
     * \if ENGLISH_LANG
     *  Millisecond
     * \else
     *  毫秒
     * \endif
     */
    public int					dwMillisecond;

    /**
     * \if ENGLISH_LANG
     *  pts
     * \else
     *  pts 时间戳
     * \endif
     */
    public int					dwPTS;

    /**
     * \if ENGLISH_LANG
     *  dts
     * \else
     *  dts 时间戳
     * \endif
     */
    public int					dwDTS;

}