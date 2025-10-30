package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Temperature status
 * \else
 * 温度状态
 * \endif
 */
public class SDK_TEMPERATURE_STATUS implements Serializable {
    /**
     *
     */
    private static final long       serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * Search succeeded or not
     * \else
     * 查询是否成功
     * \endif
     */
    public boolean                  bEnable;
    /**
     * \if ENGLISH_LANG
     * Temperature  amount
     * \else
     * 温度数量
     * \endif
     */
    public int                      nCount;
    /**
     * \if ENGLISH_LANG
     * Temperature  info
     * \else
     * 温度信息
     * \endif
     */
    public SDK_TEMPERATURE_INFO stuTemps[] = new SDK_TEMPERATURE_INFO[256];

    public SDK_TEMPERATURE_STATUS() {
        for (int i = 0; i < 256; i++) {
            stuTemps[i] = new SDK_TEMPERATURE_INFO();
        }
    }
}
