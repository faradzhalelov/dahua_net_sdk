package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief CLIENT_GetAlarmRegionInfo NET_EM_GET_ALARMREGION_INFO_BYPASSMODE input param
 * \else
 * @brief 获取旁路状态 输入参数。此时CLIENT_GetAlarmRegionInfo的emType参数为NET_EM_GET_ALARMREGION_INFO_BYPASSMODE
 * \endif
 */
public class NET_IN_GET_BYPASSMODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * zone number
     * \else
     * 防区个数
     * \endif
     */
    public int nZoneNum;

    /**
     * \if ENGLISH_LANG
     * zone id, start from 1
     * \else
     * 防区号, 从1开始
     * \endif
     */
    public int arrZones[] = new int[FinalVar.MAX_ZONE_NUMBER];

    /**
     * \if ENGLISH_LANG
     * zone number extend
     * \else
     * 防区个数扩展
     * \endif
     */
    public int nZoneNumEx;

    /**
     * \if ENGLISH_LANG
     * Zone code extension, use this field when it exceeds 72
     * \else
     * 防区号扩展  超过72使用这个字段
     * \endif
     */
    public int arrZonesEx[] = new int[FinalVar.MAX_ZONE_NUMBER_EX];

}