package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief epidemic area experience
 * \else
 * @brief 疫区经历信息
 * \endif
 */
public class NET_EPIDEMIC_AREA_EXPERIENCE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  epidemic address
     * \else
     *  疫区地址
     * \endif
     */
    public byte					szAddress[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  epidemic time
     * \else
     *  在疫区时间
     * \endif
     */
    public NET_TIME					stuTime = new NET_TIME();

}
