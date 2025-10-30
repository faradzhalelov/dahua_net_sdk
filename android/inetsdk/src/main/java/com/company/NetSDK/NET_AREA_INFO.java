package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief area information
 * \else
 * @brief 区域信息
 * \endif
 */
public class NET_AREA_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * arae id
     * \else
     * 区域号
     * \endif
     */
    public int nArea;

    /**
     * \if ENGLISH_LANG
     * zone number
     * \else
     * 区域下的防区个数
     * \endif
     */
    public int nZoneRet;

    /**
     * \if ENGLISH_LANG
     * zone id
     * \else
     * 区域下的防区号
     * \endif
     */
    public int arrZones[] = new int[FinalVar.MAX_ZONE_NUMBER];

}