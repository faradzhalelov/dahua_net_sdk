package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief CLIENT_GetAlarmRegionInfo NET_EM_GET_ALARMREGION_INFO_AREAZONES input param
 * \else
 * @brief 获取区域防区信息 输入参数。此时CLIENT_GetAlarmRegionInfo的emType参数为NET_EM_GET_ALARMREGION_INFO_AREAZONES
 * \endif
 */
public class NET_IN_GET_AREAZONES implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * area number
     * \else
     * 区域个数
     * \endif
     */
    public int nAreaNum;

    /**
     * \if ENGLISH_LANG
     * area id
     * \else
     * 区域号
     * \endif
     */
    public int arrArea[] = new int[FinalVar.MAX_AREA_NUMBER];

    /**
     * \if ENGLISH_LANG
     * area number extend
     * \else
     * 区域个数
     * \endif
     */
    public int nAreaNumEx;

    /**
     * \if ENGLISH_LANG
     * Area number extension Use this field if the number of areas exceeds 8
     * \else
     * 区域号扩展 区域个数超过8使用这个字段
     * \endif
     */
    public int arrAreaEx[] = new int[FinalVar.MAX_AREA_NUMBER_EX];

}