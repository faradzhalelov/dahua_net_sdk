package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ patrol path config
 * \else
 *  云台巡航路径配置
 * \endif
 */
public class CFG_PTZTOUR_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * patrol path quantity
     * \else
     * 巡航路径数量
     * \endif
     */
    public int                         nCount;

    /**
     * \if ENGLISH_LANG
     * patrol path, each channel includes multiple patrol paths
     * \else
     * 巡航路径, 每个通道包含多条巡航路径
     * \endif
     */
    public CFG_PTZTOUR_SINGLE          stTours[] = new CFG_PTZTOUR_SINGLE[FinalVar.CFG_MAX_PTZTOUR_NUM];
    public CFG_PTZTOUR_INFO(){
        for(int i = 0; i < FinalVar.CFG_MAX_PTZTOUR_NUM; ++i)
        {
            stTours[i] = new CFG_PTZTOUR_SINGLE();
        }
    }
}
