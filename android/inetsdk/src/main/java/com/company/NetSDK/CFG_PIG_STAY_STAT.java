package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Pig stay stat info
 * \else
 * @brief 猪只离开滞留时间信息
 * \endif
 */
public class CFG_PIG_STAY_STAT implements Serializable {
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
    public CFG_NET_TIME					stuEnterTime = new CFG_NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Exit Time
     * \else
     *  猪只离开区域的时间
     * \endif
     */
    public CFG_NET_TIME					stuExitTime = new CFG_NET_TIME();

}