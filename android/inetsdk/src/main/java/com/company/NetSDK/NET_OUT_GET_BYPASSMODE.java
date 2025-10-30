package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief CLIENT_GetAlarmRegionInfo NET_EM_GET_ALARMREGION_INFO_BYPASSMODE output param
 * \else
 * @brief 获取旁路状态 输出参数。此时CLIENT_GetAlarmRegionInfo的emType参数为NET_EM_GET_ALARMREGION_INFO_BYPASSMODE
 * \endif
 */
public class NET_OUT_GET_BYPASSMODE implements Serializable {
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
    public int nZoneRet;

    /**
     * \if ENGLISH_LANG
     * bypass mode
     * \else
     * 防区工作模式
     * \endif
     */
    public int[] arrModes = new int[FinalVar.MAX_ZONE_NUMBER];

    /**
     * \if ENGLISH_LANG
     * Number of defense zones expanded
     * \else
     * 防区个数扩展
     * \endif
     */
    public int nZoneRetEx;

    /**
     * \if ENGLISH_LANG
     * Zone code extension Use this field for more than 72
     * \else
     * 防区号扩展  超过72使用这个字段
     * \endif
     */
    public int[] arrModesEx = new int[FinalVar.MAX_ZONE_NUMBER_EX];

}