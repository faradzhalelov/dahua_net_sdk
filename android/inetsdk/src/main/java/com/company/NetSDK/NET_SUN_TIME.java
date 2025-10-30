package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * roughly time of sunrise or sunset
 * \else
 * 大致日出/日落时间
 * \endif
 */
public class NET_SUN_TIME implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  hour
     * \else
     *  时
     * \endif
     */
    public int					nHour;

    /**
     * \if ENGLISH_LANG
     *  minute
     * \else
     *  分
     * \endif
     */
    public int					nMinute;

    /**
     * \if ENGLISH_LANG
     *  second
     * \else
     *  秒
     * \endif
     */
    public int					nSecond;

    public void setTime(int nHour,int nMinute, int nSecond) {
        this.nHour = nHour;
        this.nMinute = nMinute;
        this.nSecond = nSecond;
    }

    @Override
    public String toString() {
        return "("+String.format("%02d", nHour)+":"+String.format("%02d", nMinute)+":"+String.format("%02d", nSecond)+")";
    }
}