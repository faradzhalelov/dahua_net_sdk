package com.company.NetSDK;


import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief Area information extension supplementary field  The set with NET_AREA_INFO_EX represents region information
 * \else
 * @brief 区域信息扩展字段补充字段 与 NET_AREA_INFO_EX 的合集表示区域信息
 * \endif
 */
public class NET_AREA_INFO_EX_SUPPLEMENT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Sector information
     * \else
     * 防区信息
     * \endif
     */
    public NET_ZONES_INFO stuZonesInfo[] = new NET_ZONES_INFO[FinalVar.MAX_ZONE_NUMBER_EX];

    /**
     * \if ENGLISH_LANG
     * Area name
     * \else
     * 区域名称
     * \endif
     */
    public byte szAreaName[] = new byte[128];

    public NET_AREA_INFO_EX_SUPPLEMENT() {
        for(int i = 0; i < FinalVar.MAX_ZONE_NUMBER_EX; i ++){
            stuZonesInfo[i] = new NET_ZONES_INFO();
        }
    }
}