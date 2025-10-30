package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Coaxial Light Config
 * \else
 * 白光灯视频通道配置
 * \endif
 */
public class NET_CFG_COAXIAL_LIGHT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * enable
     * \else
     * 联动使能
     * \endif
     */
    public boolean						bEnable;

    /**
     * \if ENGLISH_LANG
     * time section
     * \else
     * 白光灯联动时间段
     * \endif
     */
    public SDK_TSECT[][]					stuTimeSection = new SDK_TSECT[FinalVar.SDK_TSCHE_DAY_NUM][FinalVar.SDK_TSCHE_SEC_NUM];

    public NET_CFG_COAXIAL_LIGHT_INFO() {
        for(int i = 0; i < FinalVar.SDK_TSCHE_DAY_NUM; i++) {
            for(int j = 0; j < FinalVar.SDK_TSCHE_SEC_NUM; j++) {
                stuTimeSection[i][j] = new SDK_TSECT();
            }
        }
    }
}
