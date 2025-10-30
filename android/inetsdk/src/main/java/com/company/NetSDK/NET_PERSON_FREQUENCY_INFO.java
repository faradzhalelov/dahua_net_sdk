package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * alarm frequency info
 * \else
 * 频次报警信息
 * \endif
 */
public class NET_PERSON_FREQUENCY_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  alarm Type
     * \else
     *  报警类型
     * \endif
     */
    public int					emAlarmType;

    /**
     * \if ENGLISH_LANG
     *  frequency
     * \else
     *  频次
     * \endif
     */
    public int					nTimes;


}
