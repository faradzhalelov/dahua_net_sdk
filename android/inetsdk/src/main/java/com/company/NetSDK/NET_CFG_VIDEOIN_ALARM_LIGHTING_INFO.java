package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Warning light configuration,Corresponding to {@link NET_EM_CFG_VIDEOIN_ALARM_LIGHTING}
 * \else
 * 警戒灯光配置,对应 {@link NET_EM_CFG_VIDEOIN_ALARM_LIGHTING}
 * \endif
 */
public class NET_CFG_VIDEOIN_ALARM_LIGHTING_INFO implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Effective number of stuDetail
     * \else
     * stuDetail有效个数
     * \endif
     */
    public int                                 nValidDetail;

    /**
     * \if ENGLISH_LANG
     * Detailed configuration of warning lights
     * \else
     * 警戒灯光详细配置
     * \endif
     */
    public NET_CFG_ALARM_LIGHTING_DETAIL_INFO[] stuDetail = new NET_CFG_ALARM_LIGHTING_DETAIL_INFO[8];

    public NET_CFG_VIDEOIN_ALARM_LIGHTING_INFO(){
        for (int i = 0; i < 8; i++){
            stuDetail[i] = new NET_CFG_ALARM_LIGHTING_DETAIL_INFO();
        }
    }
}
