package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief radiometry temper data
 * \else
 * @brief 测温温度数据
 * \endif
 */
public class NET_RADIOMETRY_TEMPER_DATA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  radiometry temper info number
     * \else
     *  测温温度信息个数
     * \endif
     */
    public int					nRadiometryTemperNum;

    /**
     * \if ENGLISH_LANG
     *  radiometry temper info
     * \else
     *  测温温度信息
     * \endif
     */
    public NET_RADIOMETRY_QUERY_INFO					stuRadiometryTemperInfo[] = new NET_RADIOMETRY_QUERY_INFO[FinalVar.MAX_RADIOMETRY_TEMPER_NUM];

    public NET_RADIOMETRY_TEMPER_DATA() {
        for(int i = 0; i < FinalVar.MAX_RADIOMETRY_TEMPER_NUM; i ++){
            this.stuRadiometryTemperInfo[i] = new NET_RADIOMETRY_QUERY_INFO();
        }
    }
}