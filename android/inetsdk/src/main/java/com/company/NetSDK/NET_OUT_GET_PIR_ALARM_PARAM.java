package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output parameter of interface {@link INetSDK#GetPirAlarmParam}
 * \else
 * 接口 {@link INetSDK#GetPirAlarmParam} 出参
 * \endif
 */
public class NET_OUT_GET_PIR_ALARM_PARAM implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * PIR config info
     * \else
     * PIR配置信息
     * \endif
     */
    public NET_PIR_ALARM_INFO	stPirAlarmInfo = new NET_PIR_ALARM_INFO();

    /**
     * \if ENGLISH_LANG
     * Pir Alarm Num
     * \else
     * 需要设置的个数
     * \endif
     */
    public int					 nPirAlarmNum;

    /**
     * \if ENGLISH_LANG
     * PIR config info Ex
     * \else
     * 用于有多个pir的设备
     * \endif
     */
    public NET_PIR_ALARM_INFO	[]stPirAlarmInfoEx = new NET_PIR_ALARM_INFO[FinalVar.MAX_PIRPARAM_NUM];

    public NET_OUT_GET_PIR_ALARM_PARAM() {

        for (int i = 0; i < stPirAlarmInfoEx.length; ++i) {
            stPirAlarmInfoEx[i] =  new NET_PIR_ALARM_INFO();
        }
    }
}
