package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Pig Stay Stat info
 * \else
 * @brief 猪只离开开滞留时间信息
 * \endif
 */
public class NET_PIG_STAY_STAT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Enter Time
     * \else
     *  猪只进入区域的时间
     * \endif
     */
    public NET_TIME					stuEnterTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Exit Time
     * \else
     *  猪只离开区域的时间
     * \endif
     */
    public NET_TIME					stuExitTime = new NET_TIME();

}