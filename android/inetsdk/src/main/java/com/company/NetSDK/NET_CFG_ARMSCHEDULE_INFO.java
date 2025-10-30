package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * automatic arming schedule
 * \else
 * 自动布撤防时间段
 * \endif
 */
public class NET_CFG_ARMSCHEDULE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * valid enable
     * \else
     * 配置使能
     * \endif
     */
    public boolean                 bEnable;

    /**
     * \if ENGLISH_LANG
     * The first dimension of the first 7 elements corresponds to 7 days a week,the eighth element corresponds to the holiday,Up to 6 time periods per day
     * \else
     *  第一维前7个元素对应每周7天，第8个元素对应节假日，每天最多6个时间段
     * \endif
     */
    public SDK_TSECT[][]            stuTimeSection = new SDK_TSECT[FinalVar.SDK_N_SCHEDULE_TSECT][FinalVar.SDK_N_REC_TSECT];

    public NET_CFG_ARMSCHEDULE_INFO() {
        for(int i = 0; i < FinalVar.SDK_N_SCHEDULE_TSECT; i++) {
            for(int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
                stuTimeSection[i][j] = new SDK_TSECT();
            }
        }
    }
}
