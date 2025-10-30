package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief area information extend
 * \else
 * @brief 区域信息扩展字段
 * \endif
 */
public class NET_AREA_INFO_EX implements Serializable {
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
     * zone number extend
     * \else
     * 区域下的防区个数扩展
     * \endif
     */
    public int nZoneRetEx;

    /**
     * \if ENGLISH_LANG
     * zone id
     * \else
     * 区域下的防区号
     * \endif
     */
    public int arrZonesEx[] = new int[FinalVar.MAX_ZONE_NUMBER_EX];

}