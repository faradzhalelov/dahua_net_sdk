package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief The stay time of the peoples left
 * \else
 * @brief 离开人员的滞留时间信息
 * \endif
 */
public class CFG_EXITMAN_STAY_STAT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Time to enter the region
     * \else
     *  人员进入区域时间
     * \endif
     */
    public CFG_NET_TIME_EX					stuEnterTime = new CFG_NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  Time to exit the region
     * \else
     *  人员离开区域时间
     * \endif
     */
    public CFG_NET_TIME_EX					stuExitTime = new CFG_NET_TIME_EX();

}