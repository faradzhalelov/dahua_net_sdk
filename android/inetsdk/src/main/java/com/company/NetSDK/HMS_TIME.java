package com.company.NetSDK;

import java.io.Serializable;

public class HMS_TIME implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Hour
     * \else
     * 时
     * \endif
     */
    public int					dwHour;							// 时

    /**
     * \if ENGLISH_LANG
     * Minute
     * \else
     * 分
     * \endif
     */
    public int					dwMinute;

    /**
     * \if ENGLISH_LANG
     * Second
     * \else
     * 秒
     * \endif
     */
    public int					dwSecond;

    @Override
    public String toString() {
        return dwHour + ":" + dwMinute + ":" + dwSecond;
    }
}
