package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * representation channel file info
 * \else
 *  映射通道文件信息
 * \endif
 */
public class NET_CFG_TIME_SCHEDULE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 是否支持节假日配置，默认为不支持，除非获取配置后返回为TRUE，不要使能假日配置
     * \endif
     */
    public boolean                    bEnableHoliday;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 第一维前7个元素对应每周7天，第8个元素对应节假日，每天最多6个时间段
     * \endif
     */
    public SDK_TSECT[][]			   stuTimeSection = new SDK_TSECT[FinalVar.SDK_TSCHE_DAY_NUM][FinalVar.SDK_TSCHE_SEC_NUM];

    public NET_CFG_TIME_SCHEDULE() {
        for(int i = 0; i < FinalVar.SDK_TSCHE_DAY_NUM; i++) {
            for(int j = 0; j < FinalVar.SDK_TSCHE_SEC_NUM; j++) {
                stuTimeSection[i][j] = new SDK_TSECT();
            }
        }
    }
}
