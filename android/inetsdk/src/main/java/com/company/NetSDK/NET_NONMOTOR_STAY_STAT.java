package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief nonmotor stay state
 * \else
 * @brief 非机动车的滞留时间信息
 * \endif
 */
public class NET_NONMOTOR_STAY_STAT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Time for non-motorized vehicles to enter the area
     * \else
     *  非机动车进入区域的时间
     * \endif
     */
    public NET_TIME					stuEnterTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Time for non-motorized vehicles to exit the area
     * \else
     *  非机动车离开区域的时间
     * \endif
     */
    public NET_TIME					stuExitTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  reserved
     * \else
     *  保留字节
     * \endif
     */
    public byte					reserved[] = new byte[128];

}