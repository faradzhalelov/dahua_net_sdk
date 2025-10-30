package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * NET_TIME_EX1
 * \else
 * NET_TIME_EX1
 * \endif
 */
public class NET_TIME_EX1 implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

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

}
