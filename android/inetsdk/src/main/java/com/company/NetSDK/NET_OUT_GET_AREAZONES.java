package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief CLIENT_GetAlarmRegionInfo NET_EM_GET_ALARMREGION_INFO_AREAZONES output param
 * \else
 * @brief 获取区域防区信息 输出参数。此时CLIENT_GetAlarmRegionInfo的emType参数为NET_EM_GET_ALARMREGION_INFO_AREAZONES
 * \endif
 */
public class NET_OUT_GET_AREAZONES implements Serializable {
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
    public int nAreaRet;

    /**
     * \if ENGLISH_LANG
     * area information
     * \else
     * 区域信息
     * \endif
     */
    public NET_AREA_INFO stuAreaInfo[] = new NET_AREA_INFO[FinalVar.MAX_AREA_NUMBER];

    /**
     * \if ENGLISH_LANG
     * area number extend
     * \else
     * 区域个数
     * \endif
     */
    public int nAreaRetEx;

    /**
     * \if ENGLISH_LANG
     * Area information expansion More than 8 zones use this field
     * \else
     * 区域信息扩展 超过8个防区使用此字段
     * \endif
     */
    public NET_AREA_INFO_EX stuAreaInfoEx[] = new NET_AREA_INFO_EX[FinalVar.MAX_AREA_NUMBER_EX];

    /**
     * \if ENGLISH_LANG
     * Area information extension supplementary field
     * \else
     * 区域信息扩展补充字段
     * \endif
     */
    public NET_AREA_INFO_EX_SUPPLEMENT stuAreaInfoExSupplement[] = new NET_AREA_INFO_EX_SUPPLEMENT[FinalVar.MAX_AREA_NUMBER_EX];

    public NET_OUT_GET_AREAZONES() {
        for(int i = 0; i < FinalVar.MAX_AREA_NUMBER; i ++){
            stuAreaInfo[i] = new NET_AREA_INFO();
        }
        for(int i = 0; i < FinalVar.MAX_AREA_NUMBER_EX; i ++){
            stuAreaInfoEx[i] = new NET_AREA_INFO_EX();
            stuAreaInfoExSupplement[i] = new NET_AREA_INFO_EX_SUPPLEMENT();
        }
    }
}