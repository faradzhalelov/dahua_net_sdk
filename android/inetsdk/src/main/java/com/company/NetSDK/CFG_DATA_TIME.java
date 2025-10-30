package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief  data time
 * \else
 * @brief  日期
 * \endif
 */
public class CFG_DATA_TIME implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  year
     * \else
     *  年
     * \endif
     */
    public int					dwYear;

    /**
     * \if ENGLISH_LANG
     *  month
     * \else
     *  月
     * \endif
     */
    public int					dwMonth;

    /**
     * \if ENGLISH_LANG
     *  day
     * \else
     *  日
     * \endif
     */
    public int					dwDay;

    /**
     * \if ENGLISH_LANG
     *  hour
     * \else
     *  时
     * \endif
     */
    public int					dwHour;

    /**
     * \if ENGLISH_LANG
     *  minute
     * \else
     *  分
     * \endif
     */
    public int					dwMinute;

    /**
     * \if ENGLISH_LANG
     *  second
     * \else
     *  秒
     * \endif
     */
    public int					dwSecond;

    /**
     * \if ENGLISH_LANG
     *  reserved
     * \else
     *  保留字段
     * \endif
     */
    public int					dwReserved[] = new int[2];

}