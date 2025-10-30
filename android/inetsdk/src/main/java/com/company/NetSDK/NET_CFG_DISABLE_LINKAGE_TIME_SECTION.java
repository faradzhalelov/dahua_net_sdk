package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Unable linkage time section configuration
 * \else
 * 周期撤防联动项功能总开关
 * \endif
 */
public class NET_CFG_DISABLE_LINKAGE_TIME_SECTION implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unable linkage switch
     * \else
     * 周期撤防联动项功能总开关
     * \endif
     */
    public boolean						   bEnable;


    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 第一维前7个元素对应每周7天，第8个元素对应节假日，每天最多6个时间段
     * \endif
     */
    public SDK_TSECT[][]			   stuTimeSection = new SDK_TSECT[FinalVar.SDK_N_SCHEDULE_TSECT][FinalVar.SDK_N_REC_TSECT];

    public NET_CFG_DISABLE_LINKAGE_TIME_SECTION() {
        for (int i = 0; i < FinalVar.SDK_N_SCHEDULE_TSECT; i++) {
            for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
                stuTimeSection[i][j] = new SDK_TSECT();
            }
        }
    }
}

